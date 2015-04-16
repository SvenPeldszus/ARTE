package arte.shell.commands.impl;

import java.util.List;

import arte.Messages;
import arte.shell.Colors;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.Command;

public class TestCaseCommand implements Command {

	@Override
	public Shell_Status getRequiredStatus() {
		return Shell_Status.Any;
	}

	@Override
	public void execute(List<String> args_list, Shell shell) {
		boolean contains_command = false;
		
		if(args_list.contains(Messages.getString("Shell.args.list"))){ //$NON-NLS-1$
			shell.getArte().data_manager.listTestCases();
			contains_command |= true;
		}
		
		if(args_list.contains(Messages.getString("Shell.args.rm"))){ //$NON-NLS-1$
			shell.getArte().data_manager.removeTestCases(shell.getArgValue(Messages.getString("Shell.args.rm"), args_list)); //$NON-NLS-1$
			contains_command |= true;
		}
		
		if(args_list.contains(Messages.getString("Shell.args.add"))){ //$NON-NLS-1$
			shell.getArte().data_manager.addTestCases(shell.getArgValue(Messages.getString("Shell.args.add"), args_list)); //$NON-NLS-1$
			contains_command |= true;
		}
		
		if(!contains_command){
			Colors.println_magenta(Messages.getString("error")+Messages.getString("no.args.tc")); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

}
