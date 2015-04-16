package arte.execution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.eclipse.emf.common.util.EList;

import arte.Messages;
import arte.Arte;
import arte.Arte.OS;
import arte.data.DataManager;
import arte.data.PathManager;
import arte.data.RecursiveFileExtensionFinder;
import arte.testcases.TestCaseUtil;
import ttc.testdsl.tTCTest.Assert_False;
import ttc.testdsl.tTCTest.Assert_True;
import ttc.testdsl.tTCTest.Assertion;
import ttc.testdsl.tTCTest.Class_Element;
import ttc.testdsl.tTCTest.Compile;
import ttc.testdsl.tTCTest.Condition;
import ttc.testdsl.tTCTest.Containment;
import ttc.testdsl.tTCTest.Contains;
import ttc.testdsl.tTCTest.Contains_Not;
import ttc.testdsl.tTCTest.Expect_False;
import ttc.testdsl.tTCTest.Expect_True;
import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Implementation;
import ttc.testdsl.tTCTest.Implements;
import ttc.testdsl.tTCTest.Implements_Not;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Field;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testdsl.tTCTest.Refactoring;
import ttc.testdsl.tTCTest.Synchronize;
import ttc.testdsl.tTCTest.Test_Case;
import ttc.testdsl.tTCTest.Test_File;
import ttc.testdsl.tTCTest.Test_Step;
import ttc.testdsl.tTCTest.Test_Step_Element;

public class TestExecution {
	
	private DataManager data_manager;
	private TestCaseUtil test_case_util;
	private Arte arte;
	
	//Temporal storage for console content during test execution
	private List<String> output_lines;
	
	private Execution_Status status;
	private Hashtable<String, Test_Status> test_record;
	private PathManager path_manager;
	private final String password = "Wa32SShqA}*d)LN"; //$NON-NLS-1$
	
	public TestExecution(DataManager data_manager, TestCaseUtil test_case_util, Arte arte){
		this.test_case_util = test_case_util;
		this.data_manager = data_manager;
		this.arte = arte;
		this.path_manager = data_manager.paths;
		
		test_record = new Hashtable<String, Test_Status>();
		
		status = Execution_Status.Changed;
	}
	
	public boolean executeTestByName(String test_name, LogWriter log){
		File file;
		boolean specific;
		if(test_name.endsWith(".ttc") || test_name.endsWith("\\.(?=[^\\.]+$)"+"zip"+"ttc")){ //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			file = data_manager.getTestFile(test_name);
			specific = false;
		}
		else{
			file = data_manager.getTestFileForTestCase(test_name);
			specific = true;
		}
		if(!file.exists()){
			log.println_magenta((Messages.getString("error")+Messages.getString("error.tcf.exists.not", new String[]{file.toString()}))); //$NON-NLS-1$ //$NON-NLS-2$
			data_manager.reportNotExistingFile(file);
			return false;
		}
		Test_File test_file= test_case_util.parseTestCase(file);
		
		boolean success = true;
		for(Test_Case test_case : test_file.getTest_cases()){
			if(specific){
				if(test_case.getName().equals(test_name)){
					return executeTestCase(test_case, log);
				}
			}
			else{
				success&=executeTestCase(test_case, log);
			}
		}
		return success;
	}
	
	private boolean executeTestCase(Test_Case test_case, LogWriter log){
		
		log.println(Messages.getString("exec.tc", new String[]{test_case.getName()})); //$NON-NLS-1$
		log.println("\t"+Messages.getString("desc_S")+':'); //$NON-NLS-1$ //$NON-NLS-2$ 
		log.println("\t\t"+test_case.getDescription()+"\n");   //$NON-NLS-1$ //$NON-NLS-2$
		
		arte.timer.resetTimer();
		
		File test_folder = null;
		String java_program = test_case.getJava_program();
		try {
			test_folder = data_manager.extractJavaProgram(java_program, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(test_folder==null){
			data_manager.cleanUp(java_program);
			return false;
		}
		else{
			String main_class = data_manager.getMainOfPublicProgram(java_program);
			if(executeTestCase(test_folder, main_class, test_case, log)){
				log.println_green(('\n'+Messages.getString("ascii.line.+"))); //$NON-NLS-1$
				log.print_green(Messages.getString("success")); //$NON-NLS-1$
				log.println(Messages.getString("success.exec", new Object[]{test_case.getName(), ((double)arte.timer.getTime())/1000})); //$NON-NLS-1$ 
				log.println_green((Messages.getString("ascii.line.+")+'\n')); //$NON-NLS-1$
			}
			else{
				log.println_red(('\n'+Messages.getString("ascii.line.-"))); //$NON-NLS-1$
				log.print_red(Messages.getString("fail")); //$NON-NLS-1$
				log.println(Messages.getString("fail.exec", new Object[]{test_case.getName(), ((double)arte.timer.getTime())/1000})); //$NON-NLS-1$ 
				log.println_red((Messages.getString("ascii.line.-")+'\n')); //$NON-NLS-1$
			}
		}

		arte.timer.resetTimer();
		data_manager.cleanUpAllCases();
		return true;
	}

	private boolean executeTestCase(File program_folder, String main_class, Test_Case test_case, LogWriter log) {
		
		arte.timer.resetTimer();
		
		if(!program_folder.exists()){
			log.print_red(Messages.getString("fail")); //$NON-NLS-1$
			log.println(Messages.getString("error.unknown",new String[]{Messages.getString("program_s")}));  //$NON-NLS-1$//$NON-NLS-2$
			test_record.put(test_case.getName(), Test_Status.FAILURE);
			return false;
		}
		else{
			
			test_record.put(test_case.getName(), Test_Status.SUCCESS);
			
			try {
				if(!compileJavaProgram(program_folder, log)){
					log.println_magenta((Messages.getString("error")+Messages.getString("error.compilation", new Object[]{test_case.getJava_program()}))); //$NON-NLS-1$ //$NON-NLS-2$
					test_record.put(test_case.getName(), test_record.get(test_case.getName()).getApplicationOf(Test_Status.FAILURE));
					data_manager.cleanUp(test_case.getJava_program());
					return false;
				}
				else{
					log.print_green(Messages.getString("success")); //$NON-NLS-1$
					log.println(Messages.getString("success.compile")); //$NON-NLS-1$ 
					
					log.println("\n\t"+Messages.getString("out.before")); //$NON-NLS-1$ //$NON-NLS-2$
					if(executeJavaProgram(program_folder, main_class, test_case.getJava_program(),log)){
						List<String> store_output = new LinkedList<String>(output_lines);
						
						//Generate TypeGraph
						System.out.println(Messages.getString("ascii.line.s.pg")); //$NON-NLS-1$
						boolean success = arte.timer.setProgram(program_folder.toString());
			
						System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
						
						if(success){
							Test_Status test_status = Test_Status.SUCCESS;
							//Process all test steps
							for(Test_Step_Element step : test_case.getTest_flow().getStep()){
								test_status = test_status.getApplicationOf(handleTestStepElement(step,program_folder,log));
								if(Test_Status.FAILURE == test_status){
									break;
								}
							}
							
							//If the changes heven't been synchronized sync them
							if(!status.isCompatible(Execution_Status.Synchronized)){
								System.out.println(Messages.getString("ascii.line.s.sync")); //$NON-NLS-1$
								boolean synchronizeChanges = true;
								if(arte.timer.extended_case){
									synchronizeChanges = arte.timer.synchronizeChanges();
								}
								System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
								if(!synchronizeChanges){
									test_record.put(test_case.getName(), test_status = test_status.getApplicationOf(Test_Status.FAILURE));
									log.print_red(Messages.getString("fail")); //$NON-NLS-1$
									log.println(Messages.getString("fail.sync")); //$NON-NLS-1$ 
									return false;
								}
								else{
									status = Execution_Status.Synchronized;
								}
							}
							
							//If the program isn't still compiled, compile it
							if(!status.isCompatible(Execution_Status.Compiled)){
								if(!compileJavaProgram(program_folder, log)){
									log.println_magenta((Messages.getString("error")+Messages.getString("error.compilation", new Object[]{test_case.getJava_program()}))); //$NON-NLS-1$ //$NON-NLS-2$
									test_record.put(test_case.getName(), test_status = test_status.getApplicationOf(Test_Status.FAILURE));
									data_manager.cleanUp(test_case.getJava_program());
									return false;
								}
							}
							
							//Execute program and compare console output with records
							log.println("\n\t"+Messages.getString("out.after")); //$NON-NLS-1$ //$NON-NLS-2$
							boolean compare_lines = true;
							if(executeJavaProgram(program_folder, main_class, test_case.getJava_program(), log)){
								if(compare_lines &= (store_output.size() == output_lines.size())){
									for(int i=0; i<store_output.size(); i++){
										compare_lines &= 0==(store_output.get(i).compareTo(output_lines.get(i)));										
									}
								}
								if(!compare_lines){
									test_record.put(test_case.getName(), test_status = test_status.getApplicationOf(Test_Status.FAILURE));
									log.print_red(Messages.getString("fail")); //$NON-NLS-1$
									log.println(Messages.getString("fail.change.behav")); //$NON-NLS-1$ 
									return false;
								}
								log.print_green(Messages.getString("success")); //$NON-NLS-1$
								log.println(Messages.getString("success.out.eq")); //$NON-NLS-1$ 
							}
							else{
								test_record.put(test_case.getName(), test_status = test_status.getApplicationOf(Test_Status.FAILURE));
								log.print_red(Messages.getString("fail")); //$NON-NLS-1$
								log.println(Messages.getString("fail.run")); //$NON-NLS-1$ 
								return false;
							}
							test_record.put(test_case.getName(), test_status = test_status.getApplicationOf(Test_Status.SUCCESS));
							return test_status != Test_Status.FAILURE;
							
						}
						else{
							test_record.put(test_case.getName(), test_record.get(test_case.getName()).getApplicationOf(Test_Status.FAILURE));
							log.print_red(Messages.getString("fail")); //$NON-NLS-1$
							log.println(Messages.getString("fail.pg")); //$NON-NLS-1$ 
							return false;
						}
					}
					else{
						test_record.put(test_case.getName(), test_record.get(test_case.getName()).getApplicationOf(Test_Status.FAILURE));
						log.println_magenta((Messages.getString("error")+Messages.getString("fail.run"))); //$NON-NLS-1$ //$NON-NLS-2$
						return false;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
	}

	private Test_Status handleTestStepElement(Test_Step_Element step, File java_program, LogWriter log) {
		Test_Status test_status = Test_Status.SUCCESS;
		if(step instanceof Test_Step){
			for(Test_Step_Element element : ((Test_Step) step).getElements()){
				test_status = test_status.getApplicationOf(handleTestStepElement(element, java_program, log));
				if(Test_Status.FAILURE == test_status){
					return test_status;
				}
			}			
		}
		else if(step instanceof Assertion){
			test_status = test_status.getApplicationOf(handleAssertion((Assertion) step, log));
		}
		else if(step instanceof Containment){
			test_status = test_status.getApplicationOf(handleContainment(java_program, (Containment) step, log));
		}
		else if(step instanceof Implementation){
			test_status = test_status.getApplicationOf(handleImplementation(java_program, (Implementation) step, log));
		}
		else if(step instanceof Condition){
			test_status = test_status.getApplicationOf(handleCondition(java_program, (Condition) step, log));
		}
/*		else if(step instanceof Propose_Refactoring){
			test_status = test_status.getApplicationOf(handleProposal(java_program, (Propose_Refactoring) step));
		}
*/
		else if(step instanceof Synchronize){
			System.out.println(Messages.getString("ascii.line.s.sync")); //$NON-NLS-1$
			boolean synchronizeChanges = true;
			if(arte.timer.extended_case){
				synchronizeChanges = arte.timer.synchronizeChanges();
			}
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			if(!synchronizeChanges){
				log.print_red(Messages.getString("fail")); //$NON-NLS-1$
				log.println(Messages.getString("fail.sync")); //$NON-NLS-1$ 
				return Test_Status.FAILURE;
			}
			else{
				status = Execution_Status.Synchronized;
				return test_status;
			}
		}
		else if(step instanceof Compile){
			try {
				if(compileJavaProgram(java_program, log)){
					return test_status;
				}
				else{
					return Test_Status.FAILURE;
				}
			} catch (IOException e) {
				e.printStackTrace();
				return Test_Status.FAILURE;
			}
		}
		else{
			log.println_magenta((Messages.getString("error")+Messages.getString("error.unknown", new String[]{Messages.getString("tse_s")}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			return Test_Status.FAILURE;
		}
		return test_status;
	}

	private Test_Status handleImplementation(File java_program,	Implementation implementation, LogWriter log) {
		boolean implementation_expected;
		if(implementation instanceof Implements){
			implementation_expected = true;
		}
		else if(implementation instanceof Implements_Not){
			implementation_expected = false;
		}
		else{
			log.println_magenta((Messages.getString("error")+Messages.getString("error.u.impl"))); //$NON-NLS-1$ //$NON-NLS-2$
			return Test_Status.FAILURE;
		}
		
		if(!status.isCompatible(Execution_Status.Synchronized)){
			if(arte.timer.extended_case){
				boolean synchronizeChanges;
				System.out.println(Messages.getString("ascii.line.s.sync")); //$NON-NLS-1$
				synchronizeChanges = arte.timer.synchronizeChanges();
				System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
				if(synchronizeChanges){
					status = Execution_Status.Synchronized;
				}
				else{
					log.print_red(Messages.getString("fail")+Messages.getString("fail.sync")); //$NON-NLS-1$ //$NON-NLS-2$
					return Test_Status.FAILURE;
				}
			}
		}
		
		if(!status.isCompatible(Execution_Status.Compiled)){
			try {
				compileJavaProgram(java_program, log);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String path = "src"+File.separator; //$NON-NLS-1$
		Java_Class child_class = implementation.getChild();
		try {
			String expected_class_name = child_class.getClass_name();
			File class_file = new File(java_program, path);
			URLClassLoader ucl = new URLClassLoader(new URL[]{class_file.toURI().toURL()});
			Class<?> child_class_instance = ucl.loadClass(child_class.getPackage()+"."+expected_class_name); //$NON-NLS-1$
			Java_Class parent_class = implementation.getParent();
			
			Class<?> parent_class_instance = child_class_instance.getSuperclass();
			
			boolean implement = parent_class_instance.getTypeName().compareTo(parent_class.getName()) == 0;
			
			if(implement != implementation_expected){
				if(implementation_expected){
					log.print_red(Messages.getString("fail")); //$NON-NLS-1$
					log.println(Messages.getString("impl.e.fn")); //$NON-NLS-1$ 
				}
				else{
					log.print_red(Messages.getString("fail")); //$NON-NLS-1$
					log.println(Messages.getString("impl.e.fn")); //$NON-NLS-1$ 
				}
				ucl.close();
				return Test_Status.FAILURE;
			}
			ucl.close();
			return Test_Status.SUCCESS;
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Test_Status.FAILURE;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Test_Status.FAILURE;
		}
	}

	private Test_Status handleCondition(File java_program, Condition condition, LogWriter log) {
		Test_Status test_status = Test_Status.SUCCESS;
		if(handleRefactoring(condition.getRefactoring(),log)){
			if(condition.getWarning()!=null){
				if(condition instanceof Expect_False){
					log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
					log.println(condition.getWarning().getMessage());
				}
			}
			
			for(Test_Step_Element step : condition.getTrue_steps()){
				test_status = test_status.getApplicationOf(handleTestStepElement(step, java_program, log));
				if(test_status == Test_Status.FAILURE){
					return test_status;
				}
			}
		}
		else{
			if(condition.getWarning()!=null){
				if(condition instanceof Expect_True){
					log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
					log.println(condition.getWarning().getMessage());
				}
			}
			
			for(Test_Step_Element step : condition.getFalse_steps()){
				test_status = test_status.getApplicationOf(handleTestStepElement(step, java_program, log));
				if(test_status == Test_Status.FAILURE){
					return test_status;
				}
			}
		}
		return test_status;
	}

/*	private Test_Status handleProposal(File java_program, Propose_Refactoring reference_refactoring) {
		
		//Check kind of requested proposal
		if(reference_refactoring instanceof Propose_Pullup_Method_Refactoring){
			Refactoring reference = (Refactoring) ((Propose_Pullup_Method_Refactoring) reference_refactoring).getRefactoring();
			System.out.println(Messages.getString("ascii.line.s.prop")); //$NON-NLS-1$
			Refactoring proposal = test_suite.test_interface.proposePullUpRefactoring();
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			
			log.println("PROPOSAL:"+proposal +" isno_r:" +(proposal instanceof No_Refactoring));
			log.println("REFERENCE:"+reference +" isno_r:" +(reference instanceof No_Refactoring));
			if(proposal==null){
				log.println_magenta((Messages.getString("error")+Messages.getString("error.ref"))); //$NON-NLS-1$ //$NON-NLS-2$
				return Test_Status.FAILURE;
			}
			
			//Check kind of expected refactoring
			if(reference instanceof No_Refactoring || reference instanceof No_RefactoringImpl){
				
				//Check proposed refactoring
				if(proposal instanceof No_Refactoring){
					return Test_Status.SUCCESS;
				}
				else if(proposal instanceof Pull_Up_Refactoring) {
					log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
					log.println(Messages.getString("warn.prop", new String[]{Messages.getString("non"),Messages.getString("pum")})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ 
					return Test_Status.WARNING;
				}
				else{
					log.println_magenta((Messages.getString("error")+Messages.getString("error.ref"))); //$NON-NLS-1$ //$NON-NLS-2$
					return Test_Status.FAILURE;
				}
			}
			else if(reference instanceof Pull_Up_Refactoring){
				log.println("REF IS PUM");
				if(proposal instanceof No_Refactoring){
					log.println("PROP IS NONE");
					log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
					log.println(Messages.getString("warn.prop", new String[]{Messages.getString("pum"),Messages.getString("non")})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ 
					return Test_Status.SUCCESS;
				}
				else if(proposal instanceof Pull_Up_Refactoring) {
					Test_Status test_status = Test_Status.SUCCESS;
					
					Pull_Up_Refactoring pum_proposal = (Pull_Up_Refactoring) proposal;
					Pull_Up_Refactoring pum_reference = (Pull_Up_Refactoring) reference;
					
					Java_Class proposed_parent = pum_proposal.getParent();
					Java_Class reference_parent = pum_reference.getParent();
					
					if(!Compare.compareJavaClass(proposed_parent,reference_parent)){
						test_status = test_status.getApplicationOf(Test_Status.WARNING);
						log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
						log.println(Messages.getString("warn.prop.cn")); //$NON-NLS-1$ 
					}
					
					Java_Method proposed_method = pum_proposal.getMethod();
					Java_Method reference_method = pum_reference.getMethod();
					if(!Compare.compareJavaMethod(proposed_method, reference_method)){
						test_status = test_status.getApplicationOf(Test_Status.WARNING);
						log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
						log.println(Messages.getString("warn.prop.dif.m")); //$NON-NLS-1$ 
					}
					
					if(test_status == Test_Status.SUCCESS){
						log.print_green(Messages.getString("success")); //$NON-NLS-1$
						log.println(Messages.getString("success.prop")); //$NON-NLS-1$
					}
					return test_status;
				}
			}
			else{
				log.println_red((Messages.getString("error")+Messages.getString("error.prop.fatal"))); //$NON-NLS-1$ //$NON-NLS-2$
				return Test_Status.FAILURE;
			}
		}
		else if (reference_refactoring instanceof Propose_Create_Superclass_Refactoring){
			System.out.println(Messages.getString("ascii.line.s.prop")); //$NON-NLS-1$
			Refactoring reference = (Refactoring) ((Propose_Create_Superclass_Refactoring) reference_refactoring).getRefactoring();
			Refactoring proposal = test_suite.test_interface.proposeExtractSuperClassRefactoring();
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			if(reference instanceof No_Refactoring){
				if(proposal instanceof No_Refactoring){
					return Test_Status.SUCCESS;
				}
				else if(proposal instanceof Create_Superclass_Refactoring) {
					log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
					log.println(Messages.getString("warn.prop", new String[]{Messages.getString("non"),Messages.getString("exs")})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ 
					return Test_Status.WARNING;
				}
				else{
					log.println_magenta((Messages.getString("error")+Messages.getString("error.ref"))); //$NON-NLS-1$ //$NON-NLS-2$
					return Test_Status.FAILURE;
				}
			}
			else if(reference instanceof Create_Superclass_Refactoring){
				if(proposal instanceof No_Refactoring){
					log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
					log.println(Messages.getString("warn.prop", new String[]{Messages.getString("exs"),Messages.getString("non")})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ 
					return Test_Status.WARNING;
				}
				else if(proposal instanceof Create_Superclass_Refactoring) {
					Test_Status test_status = Test_Status.SUCCESS;
					
					Create_Superclass_Refactoring exs_proposal = (Create_Superclass_Refactoring) proposal;
					Create_Superclass_Refactoring exs_reference = (Create_Superclass_Refactoring) reference;
					
					EList<Java_Class> proposed_child = exs_proposal.getChild().getClasses();
					EList<Java_Class> reference_child = exs_reference.getChild().getClasses();
					if(!Compare.compareJavaClasses(proposed_child,reference_child)){
						test_status = test_status.getApplicationOf(Test_Status.WARNING);
						log.print_yellow(Messages.getString("warn")); //$NON-NLS-1$
						log.println(Messages.getString("warn.prop.cn")); //$NON-NLS-1$ 
					}
					
					if(test_status==Test_Status.SUCCESS){
						log.print_green(Messages.getString("success")); //$NON-NLS-1$
						log.println(Messages.getString("success.ref")); //$NON-NLS-1$
					}
					return test_status;
				}
			}
			else{
				log.println_magenta((Messages.getString("error")+Messages.getString("error.prop.fatal"))); //$NON-NLS-1$ //$NON-NLS-2$
				return Test_Status.FAILURE;
			}
		}	
		else{
			log.println_magenta((Messages.getString("error")+Messages.getString("error.prop.fatal"))); //$NON-NLS-1$ //$NON-NLS-2$
			return Test_Status.FAILURE;
		}
		return Test_Status.FAILURE;
	}
*/

	private Test_Status handleContainment(File java_program, Containment containment, LogWriter log) {
		boolean containment_expected;
		if(containment instanceof Contains){
			containment_expected = true;
		}
		else if(containment instanceof Contains_Not){
			containment_expected = false;
		}
		else{
			log.println_magenta((Messages.getString("error")+Messages.getString("u.cont"))); //$NON-NLS-1$ //$NON-NLS-2$
			return Test_Status.FAILURE;
		}
		
		if(!status.isCompatible(Execution_Status.Synchronized)){
			if(arte.timer.extended_case){
				boolean synchronizeChanges;
				System.out.println(Messages.getString("ascii.line.s.sync")); //$NON-NLS-1$
				synchronizeChanges = arte.timer.synchronizeChanges();
				System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
				if(synchronizeChanges){
					status = Execution_Status.Synchronized;
				}
				else{
					log.print_red(Messages.getString("fail")+Messages.getString("fail.sync")); //$NON-NLS-1$ //$NON-NLS-2$
					return Test_Status.FAILURE;
				}
			}
		}
		
		if(!status.isCompatible(Execution_Status.Compiled)){
			try {
				compileJavaProgram(java_program, log);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String path = "src"+File.separator; //$NON-NLS-1$
		Java_Class expected_class = containment.getClass_();
		try {
			String expected_class_name = expected_class.getClass_name();
			File class_file = new File(java_program, path);
			URLClassLoader ucl = new URLClassLoader(new URL[]{class_file.toURI().toURL()});
			Class<?> class_instance = ucl.loadClass(expected_class.getPackage()+"."+expected_class_name); //$NON-NLS-1$
			Class_Element element = containment.getContains();
			
			boolean contains;
			if(element instanceof Java_Method){
				contains = isMethodContainedInClass(class_instance, (Java_Method) element);
			}
			else if(element instanceof Java_Field){
				contains = isFieldContainedInClass(class_instance, (Java_Field) element);
			}
			else{
				log.println_magenta((Messages.getString(Messages.getString("error")+Messages.getString("u.je")))); //$NON-NLS-1$ //$NON-NLS-2$
				ucl.close();
				return Test_Status.FAILURE;
			}
			
			if(contains != containment_expected){
				if(containment_expected){
					log.print_red(Messages.getString("fail")); //$NON-NLS-1$
					log.println(Messages.getString("cont.e.fn")); //$NON-NLS-1$ 
				}
				else{
					log.print_red(Messages.getString("fail")); //$NON-NLS-1$
					log.println(Messages.getString("cont.e.fn")); //$NON-NLS-1$ 
				}
				ucl.close();
				return Test_Status.FAILURE;
			}
			else{
				ucl.close();
				log.print_green(Messages.getString("success")); //$NON-NLS-1$
				log.println(Messages.getString("success.cont")); //$NON-NLS-1$
				return Test_Status.SUCCESS;
			}
			
	    } catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			log.print_red(Messages.getString("fail")); //$NON-NLS-1$
			log.println(Messages.getString("fail.class", new String[]{expected_class.getClass_name()})); //$NON-NLS-1$
		}
		
		return Test_Status.FAILURE;
	}

	private boolean isFieldContainedInClass(Class<?> class_instance, Java_Field expected_field) {
		String expected_type_name = expected_field.getType().getClass_name();
		String expected_field_name = expected_field.getField_name();
		for(Field field : class_instance.getFields()){
			if(0==field.getType().getName().compareTo(expected_type_name)){
				if(0==field.getName().compareTo(expected_field_name)){
					return true;
				}
			}
		}
		return false;
	}

	private boolean isMethodContainedInClass(Class<?> class_instance, Java_Method expected_method) {
		
		for(Method existing_method : class_instance.getDeclaredMethods()){
			
			String existing_method_name = existing_method.getName();
			String expected_method_name = expected_method.getMethod_name();
			if(0==existing_method_name.compareTo(expected_method_name)){
			
				EList<Java_Class> expected_params = expected_method.getParams();
				if(existing_method.getParameterCount() == expected_params.size()){
					
					Parameter[] existing_params = existing_method.getParameters();
					for(int i=0; i<existing_method.getParameterCount(); i++){
						
						String expected_type_name = expected_params.get(i).getClass_name();
						String existing_type_name = existing_params[i].getParameterizedType().getTypeName();
						if(0!=existing_type_name.compareTo(expected_type_name)){
							break;
						}
						
					}
					return true;
				}
			}
		}
		return false;
	}

	private Test_Status handleAssertion(Assertion element, LogWriter log) {

		Assertion assertion = (Assertion) element;
		boolean expect;
		
		if(assertion instanceof Assert_True){
			expect = true;
		}else if(assertion instanceof Assert_False){
			expect = false;
		}else{
			log.println_magenta((Messages.getString("error")+Messages.getString("u.ass"))); //$NON-NLS-1$ //$NON-NLS-2$
			return Test_Status.FAILURE;
		}
		
		if(expect!=handleRefactoring(assertion.getInput(), log)){
			log.print_red(Messages.getString("fail")); //$NON-NLS-1$
			if(expect){
				log.println(Messages.getString("ref.e.fn")); //$NON-NLS-1$
			}
			else{
				log.println(Messages.getString("ref.e.fp")); //$NON-NLS-1$
			}
			return Test_Status.FAILURE;
		}
		return Test_Status.SUCCESS;
	}

	private boolean handleRefactoring(Refactoring refactoring, LogWriter log) {
		
		status = Execution_Status.Changed;
		
		if(refactoring instanceof Pull_Up_Refactoring){
			System.out.println(Messages.getString("ascii.line.s.pum")); //$NON-NLS-1$
			boolean applyPullUpMethod = arte.timer.applyPullUpMethod((Pull_Up_Refactoring) refactoring);
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			return applyPullUpMethod;
		}
		
		else if(refactoring instanceof Create_Superclass_Refactoring){
			System.out.println(Messages.getString("ascii.line.s.exs")); //$NON-NLS-1$
			boolean applyExtractSuperclass = arte.timer.applyCreateSuperclass((Create_Superclass_Refactoring) refactoring);
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			return applyExtractSuperclass;
		}
		
		else{
			log.println_magenta((Messages.getString("error")+Messages.getString("u.ref")+Messages.getString("skip.tc"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			return false;
		}
	}

	private boolean compileJavaProgram(File program_folder, LogWriter log) throws IOException {
		RecursiveFileExtensionFinder classFileFinder = new RecursiveFileExtensionFinder("class"); //$NON-NLS-1$
		Files.walkFileTree(program_folder.toPath(), classFileFinder);
		Iterator<File> classFiles = classFileFinder.getFiles().iterator();
		while(classFiles.hasNext()){
			File delete = classFiles.next();
			delete.delete();
		}
		
		RecursiveFileExtensionFinder javaFileFinder = new RecursiveFileExtensionFinder("java"); //$NON-NLS-1$
		Files.walkFileTree(program_folder.toPath(), javaFileFinder);
		
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		if (compiler == null) {
	       log.println_magenta((Messages.getString("error")+Messages.getString("error.sys.compiler"))); //$NON-NLS-1$ //$NON-NLS-2$
	        return false;
	    }
		
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
		Iterable<File> java_files = javaFileFinder.getFiles();
		if(java_files.iterator().hasNext()){
			Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(java_files);
			JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnostics, null, null, compilationUnits);
			boolean success = task.call();
			fileManager.close();
			
			status = Execution_Status.Compiled;
			return success;
		}
		else{
			status = Execution_Status.Changed;
			log.println_magenta((Messages.getString("error")+Messages.getString("error.no.java", new String[]{program_folder.getName()}))); //$NON-NLS-1$ //$NON-NLS-2$ 
			return false;
		}
	}

	private boolean executeJavaProgram(File program_folder, String main_class, String program_name, LogWriter log) throws IOException {
		Runtime runtime = Runtime.getRuntime();
		Process process;
		if(arte.os == OS.windows){
			process = runtime.exec("\""+path_manager.java.toString()+"\" -cp "+new File(program_folder,"src").toString()+" "+main_class); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		}
		else{
			process = runtime.exec(path_manager.java.toString()+" -cp "+new File(program_folder,"src").toString()+" "+main_class); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		
		String line;
		boolean error = false;
		
		BufferedReader errorStream = new BufferedReader(new InputStreamReader(process.getErrorStream()));
		while((line = errorStream.readLine()) != null){
			error = true;
		    log.println(line);
		}
		errorStream.close();
		
		BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
		output_lines = new LinkedList<String>();
		while ((line = inputStream.readLine()) != null) {
	    	output_lines.add(line);
			log.println("\t\t"+line); //$NON-NLS-1$
		}
		inputStream.close();
		log.println("");	//Begin new line after output of program //$NON-NLS-1$
		return !error;
	}

	public void runHidden(LogWriter log) {
		try {
			for(Test_File test_file : data_manager.getHiddenTestFiles(password)){
				for(Test_Case test_case : test_file.getTest_cases()){
					log.println(Messages.getString("exec.hid.tc", new String[]{test_case.getName()})); //$NON-NLS-1$
					log.println("\t"+Messages.getString("desc_S")+':'); //$NON-NLS-1$ //$NON-NLS-2$ 
					log.println("\t\t"+test_case.getDescription()+"\n");   //$NON-NLS-1$ //$NON-NLS-2$
					
					File program = data_manager.extractJavaProgram(test_case.getJava_program(), true);
					BufferedReader reader;
					String main_name = null;
					try {
						reader = new BufferedReader(new FileReader(new File(program,test_case.getJava_program()+".main"))); //$NON-NLS-1$
						String line = null;
					    while((line = reader.readLine())!=null) {
					       if(!line.trim().startsWith("#") && line.trim().length()>0){ //$NON-NLS-1$
					    	   main_name = line.trim();
						       break;
					       }
					    }
					    reader.close();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					if(main_name!=null){
						if(executeTestCase(program, main_name, test_case,log)){
							log.println_green('\n'+Messages.getString("ascii.line.+")); //$NON-NLS-1$
							log.print_green(Messages.getString("success")); //$NON-NLS-1$
							log.println(Messages.getString("success.exec", new Object[]{test_case.getName(), ((double)arte.timer.getTime())/1000})); //$NON-NLS-1$
							log.print_green(Messages.getString("ascii.line.+")+'\n'); //$NON-NLS-1$
						}
						else{
							log.println_red('\n'+Messages.getString("ascii.line.-")); //$NON-NLS-1$
							log.print_red(Messages.getString("fail")); //$NON-NLS-1$
							log.println(Messages.getString("fail.exec", new Object[]{test_case.getName(), ((double)arte.timer.getTime())/1000})); //$NON-NLS-1$
							log.println_red(Messages.getString("ascii.line.-")+'\n'); //$NON-NLS-1$
						}
					}
					data_manager.cleanUp(test_case.getJava_program());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void executePublic(LogWriter log) {
		for(File file : data_manager.getAllPublicTestFiles()){
			for(Test_Case test_case : test_case_util.parseTestCase(file).getTest_cases()){
				executeTestCase(test_case, log);
			}
		}
	}

	public void resetRecords() {
		test_record = new Hashtable<String, Test_Status>();
	}
	
	public void printTestResults(LogWriter log){
		Set<String> records = test_record.keySet();
		int success = 0;
		int failure = 0;
		int warning = 0;
		for(String test_name : records){
			Test_Status test_status = test_record.get(test_name);
			switch(test_status){
				case SUCCESS: 
					success++;
					log.println_green(Messages.getString("list.test.res", new String[]{test_name,test_status.toString()})); //$NON-NLS-1$
					break;
				case WARNING: 
					warning++;
					log.println_yellow(Messages.getString("list.test.res", new String[]{test_name,test_status.toString()})); //$NON-NLS-1$
					break;
				case FAILURE: 
					failure++;
					log.println_red(Messages.getString("list.test.res", new String[]{test_name,test_status.toString()})); //$NON-NLS-1$
					break;	
			}
		}	
		Double p_success = new Double(((double) success)/records.size());
		Double p_warning = new Double(((double) warning)/records.size());
		Double p_failure = new Double(((double) failure)/records.size());
		log.println(Messages.getString("list.test.sum", new Object[]{p_success, p_warning, p_failure})); //$NON-NLS-1$	
	}
	
}
