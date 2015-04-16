package arte.shell.commands.impl;

import java.util.LinkedList;

import static org.fusesource.jansi.Ansi.*;

import java.util.List;

import arte.Messages;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.Command;
import arte.shell.commands.impl.support.JavaProgramLoader;

public class ProgramCommand implements Command {

	@Override
	public Shell_Status getRequiredStatus() {
		return Shell_Status.Any;
	}

	@Override
	public void execute(List<String> args, Shell shell) {
		
		List<String> args_modifiable = new LinkedList<String>(args);
		
		boolean contains_command = JavaProgramLoader.javaProgramLoadCommand(shell, args_modifiable);
		
		contains_command |= JavaProgramLoader.javaProgramListCommand(shell, args_modifiable);
		
		contains_command |= JavaProgramLoader.javaProgramRemoveCommand(shell, args_modifiable);
		
		if(!contains_command){
			System.out.println( ansi().render(Messages.getString("no.args.program"))); //$NON-NLS-1$
		}

	}

}
