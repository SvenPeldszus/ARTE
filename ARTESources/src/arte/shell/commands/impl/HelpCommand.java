package arte.shell.commands.impl;

import java.util.List;

import arte.Messages;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.Command;
import static org.fusesource.jansi.Ansi.*;

public class HelpCommand implements Command {

	@Override
	public Shell_Status getRequiredStatus() {
		return Shell_Status.Any;
	}

	@Override
	public void execute(List<String> args_list, Shell shell) {
		boolean contains_command = false;
		
		if(args_list.contains(Messages.getString("Shell.solution"))){ //$NON-NLS-1$
			System.out.println( ansi().render(Messages.getString("help.solution"))); //$NON-NLS-1$
			contains_command |= true;
		}
		
		if(args_list.contains(Messages.getString("Shell.testcases"))){ //$NON-NLS-1$
			System.out.println( ansi().render(Messages.getString("felp.testcases"))); //$NON-NLS-1$
			contains_command |= true;
		}
		
		if(args_list.contains(Messages.getString("Shell.programs"))){ //$NON-NLS-1$
			System.out.println( ansi().render(Messages.getString("help.programs"))); //$NON-NLS-1$
			contains_command |= true;
		}

		if(args_list.contains(Messages.getString("Shell.execute"))){ //$NON-NLS-1$
			System.out.println( ansi().render(Messages.getString("help.execute"))); //$NON-NLS-1$
			contains_command |= true;
		}
		
		if(args_list.contains(Messages.getString("Shell.sourcecode"))){ //$NON-NLS-1$
			System.out.println( ansi().render(Messages.getString("help.sourcecode"))); //$NON-NLS-1$
			contains_command |= true;
		}
				
		if(!contains_command){
			System.out.println( ansi().render(Messages.getString("no.args.help"))); //$NON-NLS-1$
		}
	}

}
