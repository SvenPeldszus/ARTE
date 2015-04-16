package arte;

import java.io.File;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.*;
import arte.data.DataManager;
import arte.execution.TestExecution;
import arte.execution.Timer;
import arte.shell.Colors;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.impl.support.SolutionLoader;
import arte.testcases.TestCaseUtil;

import com.google.inject.Injector;

import ttc.testdsl.TTCTestStandaloneSetup;

public class Arte {

	public final String version = "1.0"; //$NON-NLS-1$
	
	//Private classes
	private static Shell shell;
	
	//Accessible classes
	public Timer timer;
	public TestExecution test_execution;
	public DataManager data_manager;
	public Injector xtext;
	public TestCaseUtil test_case_util;

	
	public OS os;
	public boolean bash;

	public boolean close_error = false;
	
	private Arte(){
		//Determine OS
		String os_name = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
				
		if(os_name.startsWith("win")){ //$NON-NLS-1$
			os = OS.windows;
			bash = false;
		}else if(os_name.endsWith("nux")){ //$NON-NLS-1$
			os = OS.linux;
			bash = true;
		}else if(os_name.startsWith("mac")){ //$NON-NLS-1$
			os = OS.mac;
			bash = true;
		}else{
			os = OS.other;
			bash = true;
		}
		
		
		//Setup Xtext
		//new StandaloneSetup().setPlatformUri("../"); //$NON-NLS-1$
		xtext = new TTCTestStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	private void init(Arte test_suite){
		test_case_util = new TestCaseUtil(test_suite);	
		data_manager = new DataManager(test_case_util, test_suite);
		test_execution = new TestExecution(data_manager, test_case_util, test_suite);
		shell = new Shell(test_suite);	
		
		reloadSolution(test_suite);
		
	}

	private void reloadSolution(Arte test_suite) {
		//Reload solution
		File solution = new File(data_manager.paths.user_data, "Solution.jar"); //$NON-NLS-1$
		if(solution.exists()){
			if(SolutionLoader.loadSolution(shell, solution)){
				shell.setStatus(Shell_Status.Solution_Loaded);
			}
		}
	}

	public static void main(String[] args) {
		AnsiConsole.systemInstall();
		
		Arte 	suite = new Arte();
				suite.init(suite);
		
		if(suite.close_error){
			Colors.println_magenta(Messages.getString("error")+Messages.getString("error.close")); //$NON-NLS-1$ //$NON-NLS-2$
		}
		System.out.println( ansi().render(Messages.getString("ready"))); //$NON-NLS-1$

		shell.shell(args);
		
	}
	
	public String getVersion() {
		return version;
	}

	public enum OS{
		windows,
		linux,
		mac,
		other
	}
	
}
