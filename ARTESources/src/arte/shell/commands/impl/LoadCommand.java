package arte.shell.commands.impl;

import java.io.File;

import static org.fusesource.jansi.Ansi.*;

import java.util.LinkedList;
import java.util.List;

import arte.Messages;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.Command;
import arte.shell.commands.impl.support.JavaProgramLoader;
import arte.shell.commands.impl.support.SolutionLoader;

public class LoadCommand implements Command {

	@Override
	public Shell_Status getRequiredStatus() {
		return Shell_Status.Any;
	}

	@Override
	public void execute(List<String> args, Shell shell) {
		boolean contains_command = false;
		
		List<String> args_modifiable = new LinkedList<String>(args);
		
		//Load a solution
		if(args_modifiable.contains(Messages.getString("Shell.args.solution"))){  //$NON-NLS-1$
			String[] solution = shell.getArgValue(Messages.getString("Shell.args.solution"), args); //$NON-NLS-1$
			if(solution.length == 1){
				SolutionLoader.loadSolution(shell, new File(solution[0]));
			}
			else{
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.amount", new String[]{Messages.getString("Shell.args.solution")}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}	
			contains_command |= true; 
		}
		
		//Add a java program
		contains_command |= JavaProgramLoader.javaProgramLoadCommand(shell, args_modifiable);
		
		
		//Add testcases
		if(args_modifiable.contains(Messages.getString("Shell.args.test"))){ //$NON-NLS-1$
			String[] test = shell.getArgValue(Messages.getString("Shell.args.test"), args); //$NON-NLS-1$
			if(test.length > 0){
				shell.getArte().data_manager.addTestCases(test);
			}
			else {
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.no.path", new String[]{Messages.getString("tc_p")}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
			contains_command |= true; 
		}
		
		if(!contains_command){
			System.out.println( ansi().render(Messages.getString("no.args.load"))); //$NON-NLS-1$
		}
	}

}
