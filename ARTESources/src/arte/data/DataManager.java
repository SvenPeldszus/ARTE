package arte.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.text.ChoiceFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

import net.lingala.zip4j.exception.ZipException;
import static org.fusesource.jansi.Ansi.*;

import org.eclipse.emf.common.util.EList;

import arte.Messages;
import arte.Arte;
import arte.data.container.Pair;
import arte.shell.Colors;
import arte.testcases.TestCaseUtil;
import ttc.testdsl.tTCTest.Test_Case;
import ttc.testdsl.tTCTest.Test_File;

public class DataManager {
	
	private final static String password = "Wa32SShqA}*d)LN"; //$NON-NLS-1$
	
	private Hashtable<String, File> extracted_java_programs;
	private Hashtable<String, String> public_test_case_program_reference; //name of testcases -> File containing the testcase
	private Hashtable<String, File> public_test_cases; //name of testcases -> File containing the testcase
	private Hashtable<String, File> public_test_cases_files; //names of files containing single test cases -> Files 
	private Hashtable<String, File> public_sourcecode;
	private Hashtable<String, String> public_sourcecode_mainclases;
	
	public PathManager paths;

	private TestCaseUtil test_case_util;
	
	public DataManager(TestCaseUtil test_case_util, Arte arte){
		System.out.println( ansi().render(Messages.getString("init"))); //$NON-NLS-1$
		
		this.test_case_util = test_case_util;
		this.paths = new PathManager(arte);
		
		extracted_java_programs = new Hashtable<String, File>();
		
		//Search public sourcecode
		public_sourcecode = new Hashtable<String, File>();
		public_sourcecode_mainclases = new Hashtable<String, String>();
		try {
			reloadSources();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Search public test cases
		public_test_cases = new Hashtable<String, File>();
		public_test_cases_files = new Hashtable<String, File>();
		public_test_case_program_reference = new Hashtable<String, String>();
		
		File given_dir = new File(paths.ttc_public_testcases,"given_test_cases"); //$NON-NLS-1$
		if(given_dir.exists()){
			try{
				RecursiveFileExtensionFinder javaFileFinder = new RecursiveFileExtensionFinder("zip"); //$NON-NLS-1$
				Files.walkFileTree(given_dir.toPath(), javaFileFinder);
				Iterable<File> given_test_case_files = javaFileFinder.getFiles();
				
				for(File given : given_test_case_files){
					ZipTools.unzip(given, paths.ttc_public_testcases);
				}
			} catch( ZipException e){
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			RecursiveFileExtensionFinder javaFileFinder = new RecursiveFileExtensionFinder("ttc"); //$NON-NLS-1$
			Files.walkFileTree(paths.ttc_public_testcases.toPath(), javaFileFinder);
			Iterable<File> test_case_files = javaFileFinder.getFiles();
			addTestCases(test_case_files);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void reloadSources() throws IOException {
		RecursiveFileExtensionFinder javaFileFinder = new RecursiveFileExtensionFinder("zip"); //$NON-NLS-1$
		Files.walkFileTree(paths.ttc_public_sources.toPath(), javaFileFinder);
		for(File src : javaFileFinder.getFiles()){
			String src_name = src.getName();
			int index = src_name.lastIndexOf("\\.(?=[^\\.]+$)"+"zip"); //$NON-NLS-1$ //$NON-NLS-2$
			if(index==-1) index =src_name.lastIndexOf(".zip"); //$NON-NLS-1$
			src_name = src_name.substring(0, index);
			if(public_sourcecode.containsKey(src_name)){
				System.out.println( ansi().render(Messages.getString("error.skipped.exists", new String[]{Messages.getString("program_s"),src_name}))); //$NON-NLS-1$ //$NON-NLS-2$
			}
			else{
				File main_file = new File(src.getParent(),src_name+".main"); //$NON-NLS-1$
				if(main_file.exists()){
					BufferedReader reader;
					String main_name = null;
					try {
						reader = new BufferedReader( new FileReader (main_file));
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
						public_sourcecode.put(src_name, src);
				    	public_sourcecode_mainclases.put(src_name, main_name);
				    	System.out.println( ansi().render(Messages.getString("success.add", new String[]{Messages.getString("program_s"),src_name}))); //$NON-NLS-1$ //$NON-NLS-2$
				    }
				    else{
						System.out.println( ansi().render(Messages.getString("error.skipped.main", new String[]{src_name}))); //$NON-NLS-1$
					}
				}
				
				else{
					System.out.println( ansi().render(Messages.getString("error.skipped.main", new String[]{src_name}))); //$NON-NLS-1$
				}
			}
		}
	}

	public void addSources(Iterable<Pair<File, String>> src_file_main_pairs) {
		for(Pair<File, String> src : src_file_main_pairs){
			File program_file = src.getKey();
			String name = program_file.getName();
			if(!public_sourcecode.containsKey(name)){
				if((new File(program_file,"src")).exists()){ //$NON-NLS-1$
					try {
						//Write main class file
						BufferedWriter writer = new BufferedWriter(new FileWriter(new File(paths.ttc_public_sources, name+".main"))); //$NON-NLS-1$
						writer.write("# Autogenerated mainclass file"+System.getProperty("line.separator") //$NON-NLS-1$ //$NON-NLS-2$
								+ "# For java program \""+name+"\""+System.getProperty("line.separator") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								+src.getValue());
						writer.close();
						
						//Zip java program
						File output_file = new File(paths.ttc_public_sources,name+".zip"); //$NON-NLS-1$
						ZipTools.zipDir(program_file, output_file);
						public_sourcecode.put(name, output_file);
						public_sourcecode_mainclases.put(name, src.getValue());
						System.out.println( ansi().render(Messages.getString("success.add", new String[]{Messages.getString("program_s"),name}))); //$NON-NLS-1$ //$NON-NLS-2$
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				else{
					System.out.println( ansi().render(Messages.getString("no.src"))); //$NON-NLS-1$
				}
			}
			else{
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.skipped.exists", new String[]{Messages.getString("program_s"), name}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		}
	}
	
	public void addSource(Pair<String, String> src_file_main_pair) {
		HashSet<Pair<File, String>> resolved_pairs = new HashSet<Pair<File, String>>(1);
		String path = src_file_main_pair.getKey();
		File file = new File(path);
		if(file.exists()){
			resolved_pairs.add(new Pair<File, String>(file, src_file_main_pair.getValue()));
		}
		else{
			System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.skipped.path", new String[]{Messages.getString("program_s"),path}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		addSources(resolved_pairs);
	}


	public void removeSources(String[] argValue) {
		removeSources(Arrays.asList(argValue));	
	}
	
	public void removeSources(Iterable<String> src_names){
		for(String name : src_names){
			if(public_sourcecode.containsKey(name)){
				File program_zip = public_sourcecode.get(name);
				if(public_test_case_program_reference.containsValue(name)){
					int i=0;
					String[] messageArguments = new String[4];
					messageArguments[i++] = name;
					for(Map.Entry<String,String> entry: public_test_case_program_reference.entrySet()){
			            if(name.equals(entry.getValue())){
			            	messageArguments[i++] = entry.getKey();
			            }
			        }
					
					double[] limits = new double[] {1, 2, 3, 4};
					String[] choices = new String[] { Messages.getString("warn.program.rm.one"), Messages.getString("warn.program.rm.two"),  //$NON-NLS-1$ //$NON-NLS-2$
							Messages.getString("warn.program.rm.three"), Messages.getString("warn.program.rm.many")}; //$NON-NLS-1$ //$NON-NLS-2$
					ChoiceFormat choiceFormat = new ChoiceFormat(limits, choices);
					
					
					System.out.print(Messages.getString("warn")+Messages.applyPattern(choiceFormat.format(i-1), messageArguments)); //$NON-NLS-1$
				} //TODO: option to abort
				if(extracted_java_programs.containsKey(name)){
					cleanUp(name);
				}
				public_sourcecode.remove(name);
				public_sourcecode_mainclases.remove(name);
				new File(program_zip.getParentFile(), name+".main").delete(); //$NON-NLS-1$
				program_zip.delete();				
			}
			else{
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.skipped.exists.not", new String[]{Messages.getString("program_s"),name}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		}
	}

	public void addTestCases(String[] test_case_files) {
		HashSet<File> files = new HashSet<File>();
		for(String test_case : test_case_files){
			File file = new File(test_case);
			if(file.exists()){
				if(file.isFile()){
					files.add(file);
				}
				else{
					System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.skipped.dir", new String[]{Messages.getString("tcf_s"),test_case}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				}
			}
			else{
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.skipped.path", new String[]{Messages.getString("tcf_s"),test_case}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		}
		addTestCases(files);
	}
	
	public void addTestCases(Iterable<File> test_case_files) {
		for(File ttc : test_case_files){
			Test_File test_file = test_case_util.parseTestCase(ttc);
			String test_file_name = test_file.getName();
			String file_name = test_file_name+".ttc"; //$NON-NLS-1$
			if(!public_test_cases_files.containsKey(file_name)){
				File target = new File(paths.ttc_public_testcases, file_name);
				
				if(target.exists() && target.compareTo(ttc)!=0){
					System.out.println(Messages.getString("tcf.duplicate",new String[]{file_name})); //$NON-NLS-1$
					continue;
				}
				boolean added = false;
				
				EList<Test_Case> test_cases = test_file.getTest_cases();
				if(test_cases.size()==0){
					System.out.println( ansi().render(Messages.getString("no.tc.in.file", new String[]{test_file.getName()}))); //$NON-NLS-1$
					return;
				}
				for(Test_Case test_case : test_cases){
					if(public_test_cases.containsKey(test_case.getName())){
						System.out.println( ansi().render(Messages.getString("tc.exists", new String[]{test_case.getName(),public_test_cases.get(test_case.getName()).getName()}))); //$NON-NLS-1$
					}
					else{
						String java_program = test_case.getJava_program();
						if(java_program == null){
							System.out.println( ansi().render(Messages.getString("error.tc", new String[]{test_case.getName(), test_file_name}))); //$NON-NLS-1$ 
						}
						else {
							public_test_case_program_reference.put(test_case.getName(), java_program);
							
							public_test_cases.put(test_case.getName(), target);
							System.out.println( ansi().render(Messages.getString("success.add", new String[]{Messages.getString("tc_s"),test_case.getName()}))); //$NON-NLS-1$ //$NON-NLS-2$
							if(!public_sourcecode.containsKey(java_program)){
								System.out.println( ansi().render(Messages.getString("warn")+Messages.getString("warn.program.not",new String[]{java_program,test_case.getName()}))); //$NON-NLS-1$ //$NON-NLS-2$
							}
							added |= true;
						}
					}
				}
				if(added){
					try {
						if(target.compareTo(ttc)!=0){
							Files.copy(ttc.toPath(), target.toPath());
							System.out.println( ansi().render(Messages.getString("success.cp.file", new String[]{target.getName()}))); //$NON-NLS-1$
						}
						public_test_cases_files.put(file_name, target);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			else{
				System.out.println( ansi().render(Messages.getString("tcf.exists",new String[]{file_name}))); //$NON-NLS-1$
			}
		}
	}
	
	public void removeTestCases(String[] test_cases) {
		for(String tc : test_cases){
			if(tc.endsWith("\\.(?=[^\\.]+$)"+"ttc") || tc.endsWith(".ttc")){ //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				File test_case_file = public_test_cases_files.get(tc);
				if(test_case_file!=null && test_case_file.exists()){
					HashSet<String> to_remove = new HashSet<String>();
					for(Map.Entry<String,File> entry: public_test_cases.entrySet()){
			            if(test_case_file.equals(entry.getValue())){
			            	to_remove.add(entry.getKey());
			            }
			        }
					for(String key: to_remove){
						public_test_cases.remove(key);
		                public_test_case_program_reference.remove(key);
		                System.out.println( ansi().render(Messages.getString("success.rm", new String[]{Messages.getString("tcf_s"),key}))); //$NON-NLS-1$ //$NON-NLS-2$
					}
					try {
						deleteFile(test_case_file);
						public_test_cases_files.remove(tc);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}
				else{
					System.out.println( ansi().render(Messages.getString("no.tcs", new String[]{tc}))); //$NON-NLS-1$	
				}
			}
			else{
				File value = public_test_cases.remove(tc);
				if(value == null){
					System.out.println( ansi().render(Messages.getString("no.tc", new String[]{tc}))); //$NON-NLS-1$
				}
				else{
	                System.out.println( ansi().render(Messages.getString("success.rm", new String[]{Messages.getString("tc_s"),tc}))); //$NON-NLS-1$ //$NON-NLS-2$
					if(!public_test_cases.contains(value)){
						try {
							public_test_cases_files.remove(value.getName());
							deleteFile(value);
							System.out.println( ansi().render(Messages.getString("no.tc.in.ts", new String[]{value.getName()}))); //$NON-NLS-1$
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	public File extractJavaProgram(String program_id, boolean is_private) throws IOException{
		if(extracted_java_programs.containsKey(program_id)){
			cleanUp(program_id);
		}
		File test_folder;
		InputStream input;
		if(is_private){
			try {
				File zip_file = new File(paths.ttc_private_sources,program_id+".zip"); //$NON-NLS-1$
				if(zip_file.exists()){
					ZipTools.unzip(zip_file, paths.ttc_tmp , password);
					String name = zip_file.getName();
					if(name.endsWith(".zip")){ //$NON-NLS-1$
						name = name.substring(0, name.length()-4);
					}
					test_folder = new File(paths.ttc_tmp, name);
				}
				else{
					Colors.println_magenta(Messages.getString("error")); //$NON-NLS-1$
					System.out.println(Messages.getString("error.file",new String[]{zip_file.toString()})); //$NON-NLS-1$
					return null;
				}
			} catch (ZipException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
		}
		else{
			if(public_sourcecode.containsKey(program_id)){
				File file = public_sourcecode.get(program_id);
				input = new FileInputStream(file.toString());
			}
			else{
				return null;
			}
			test_folder = ZipTools.unzip(input, paths.ttc_tmp);
		}
		extracted_java_programs.put(program_id, test_folder);
		return test_folder;
	}
	
	public void cleanUpAllCases() {	
		if(paths.ttc_tmp.exists())
			try {
				deleteFile(paths.ttc_tmp);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void cleanUpAll(){
		try {
			if(paths.ttc_tmp.exists())	deleteFile(paths.ttc_tmp);
			if(paths.user_tmp.exists())	deleteFile(paths.user_tmp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			extracted_java_programs = new Hashtable<String, File>();
		}
	}
	
	public void cleanUp(String program_id) {
		if(extracted_java_programs.containsKey(program_id)){
			try {
				File file = extracted_java_programs.get(program_id);
				if(file.exists())deleteFile(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			extracted_java_programs.remove(program_id);
		}
	}

	static void deleteFile(File file) throws FileNotFoundException {
		if (file.isDirectory()) {
		    for (File child : file.listFiles()){
		    	deleteFile(child);
		    }
		}
		if (!file.delete()){
			System.out.println( ansi().render(Messages.getString("error") + Messages.getString("error.file.del", new String[]{file.toString()}))); //$NON-NLS-1$ //$NON-NLS-2$
			throw new FileNotFoundException();
		}
	}

	public void listTestCases(){
		
		double[] limits = new double[] {0, 1, 2};
		String plural = Messages.getString("tc_p"); //$NON-NLS-1$
		String[] choices = new String[] {plural, Messages.getString("tc_s"), plural}; //$NON-NLS-1$
		ChoiceFormat choiceFormat = new ChoiceFormat(limits, choices);
		
		int pub_amount = public_test_cases.keySet().size();
		System.out.println( ansi().render(Messages.getString("list.ts.elements", new Object[]{pub_amount,Messages.getString("pub"),choiceFormat.format(pub_amount)}))); //$NON-NLS-1$ //$NON-NLS-2$
		for(String key : public_test_cases.keySet()){
			System.out.println( ansi().render("\t"+Messages.getString("list.tc",new String[]{key, public_test_cases.get(key).getName()}))); //$NON-NLS-1$ //$NON-NLS-2$
		}
			
		int count_hidden = 0;
		for(Test_File test_file : getHiddenTestFiles(password)){
			count_hidden+=test_file.getTest_cases().size();
		}
		System.out.println( ansi().render(Messages.getString("list.ts.elements", new Object[]{count_hidden,Messages.getString("priv"),choiceFormat.format(count_hidden)}))); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	public void listJavaPrograms() {
		double[] limits = new double[] {1, 2};
		String[] choices = new String[] { Messages.getString("program_s"), Messages.getString("program_p")}; //$NON-NLS-1$ //$NON-NLS-2$
		ChoiceFormat choiceFormat = new ChoiceFormat(limits, choices);
		
		int pub_amount = public_test_cases.keySet().size();
		System.out.println( ansi().render(Messages.getString("list.ts.elements", new Object[]{pub_amount,Messages.getString("pub"),choiceFormat.format(pub_amount)}))); //$NON-NLS-1$ //$NON-NLS-2$
		for(String program : public_sourcecode.keySet()){
			System.out.println( ansi().render("\t\""+program+"\"")); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	public File getTestFile(String test_case_name) {
		return public_test_cases_files.get(test_case_name);
	}
	
	public File getTestFileForTestCase(String test_name) {
		return public_test_cases.get(test_name);
	}
	
	public File getPublicProgramForTestCase(Test_Case test_case) throws IOException{
		return getPublicProgramForTestCase(test_case.getName());
	}
	
	public File getPublicProgramForTestCase(String test_name) throws IOException{
		String program = public_test_case_program_reference.get(test_name);
		if(extracted_java_programs.containsKey(program)){
			return extracted_java_programs.get(program);
		}
		else{
			return extractJavaProgram(program, false);
		}
	}

	public void reportNotExistingFile(File file) {
		if(!file.exists()){
			if(extracted_java_programs.contains(file)){
				removeValue(extracted_java_programs, file);
			}
			if(public_sourcecode.contains(file)){
				removeValue(public_sourcecode, file);
			}
			if(public_test_cases.contains(file)){
				removeValue(public_test_cases, file);
			}
			if(public_test_cases_files.contains(file)){
				removeValue(public_test_cases_files, file);
			}
			System.out.println( ansi().render(Messages.getString("error.clean")+Messages.getString("error.clean"))); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	//Maybe a concurrent modification exception can occur
	private <T1, T2> void removeValue(Hashtable<T1, T2> table, T2 value) {
		for(Map.Entry<T1,T2> entry: table.entrySet()){
            if(value.equals(entry.getValue())){
               table.remove(entry.getKey());
            }
        }
		
	}

	public String getMainOfPublicProgram(String java_program) {
		return public_sourcecode_mainclases.get(java_program);
	}

	public Collection<File> getAllPublicTestFiles() {
		return public_test_cases_files.values();
	}

	public Iterable<Test_File> getHiddenTestFiles(String passphrase) {
		if(0==passphrase.compareTo(password)){
			try {
				RecursiveFileExtensionFinder javaFileFinder = new RecursiveFileExtensionFinder("zip"); //$NON-NLS-1$
				Files.walkFileTree((paths.ttc_private_testcases).toPath(), javaFileFinder);
				HashSet<Test_File> files = new HashSet<Test_File>();
				for(File hidden_file : javaFileFinder.getFiles()){
						ZipTools.unzip(hidden_file, paths.ttc_tmp , password);
						String name = hidden_file.getName();
						if(name.endsWith(".zip")){ //$NON-NLS-1$
							name = name.substring(0, name.length()-4);
						}
						File case_file = new File(paths.ttc_tmp, name+".ttc"); //$NON-NLS-1$
						files.add(test_case_util.parseTestCase(case_file));
						case_file.delete();
				}
				return files;
			} catch (ZipException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Collections.emptySet();
	}
}
