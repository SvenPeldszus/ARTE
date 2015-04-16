package arte.shell.commands.impl;

import java.util.List;

import arte.Messages;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.Command;

public class VersionCommand implements Command {

	@Override
	public Shell_Status getRequiredStatus() {
		return Shell_Status.Any;
	}

	@Override
	public void execute(List<String> args_list, Shell shell) {
		System.out.println(Messages.getString("version", new String[]{shell.getArte().version})); //$NON-NLS-1$
	}

}
