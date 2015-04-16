package arte.shell.commands.impl;

import java.io.File;

import static org.fusesource.jansi.Ansi.*;

import java.util.List;

import arte.Messages;
import arte.execution.Timer;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.Command;
import arte.shell.commands.impl.support.SolutionLoader;

public class SolutionCommand implements Command {

	@Override
	public Shell_Status getRequiredStatus() {
		return Shell_Status.Any;
	}

	@Override
	public void execute(List<String> args_list, Shell shell) {
		boolean contains_command = false;
		
		if(args_list.contains(Messages.getString("Shell.args.load"))){ //$NON-NLS-1$
			String[] solutions = shell.getArgValue(Messages.getString("Shell.args.load"), args_list); //$NON-NLS-1$
			if(solutions.length == 1){
				if(!SolutionLoader.loadSolution(shell, new File(solutions[0]))){
					System.out.println(Messages.getString("error")); //$NON-NLS-1$
				}
			}
			else{
				System.out.println( ansi().render(Messages.getString("error.sol.amount"))); //$NON-NLS-1$
			}
			contains_command |= true; 
		}
		if(args_list.contains(Messages.getString("Shell.args.list"))){ //$NON-NLS-1$
			Timer timer = shell.getArte().timer;
			if(timer == null) {
				System.out.println( ansi().render(Messages.getString("no.sol"))); //$NON-NLS-1$
			}
			else {
				System.out.println(Messages.getString("ascii.line.s.plugin")); //$NON-NLS-1$
				System.out.println( ansi().render(Messages.getString("list.sol", new String[]{timer.getPluginName()}))); //$NON-NLS-1$
				System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			}
			contains_command |= true; 
		}
		if(!contains_command){
			System.out.println( ansi().render(Messages.getString("no.args.sol"))); //$NON-NLS-1$
		}
	}

}
