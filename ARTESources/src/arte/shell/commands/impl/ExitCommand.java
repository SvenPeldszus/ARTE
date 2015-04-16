package arte.shell.commands.impl;

import java.util.List;

import static org.fusesource.jansi.Ansi.*;

import org.fusesource.jansi.AnsiConsole;

import arte.Messages;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.Command;

public class ExitCommand implements Command {

	@Override
	public Shell_Status getRequiredStatus() {
		return Shell_Status.Any;
	}

	@Override
	public void execute(List<String> args, Shell shell) {
		System.out.println( ansi().render(Messages.getString("exit"))); //$NON-NLS-1$
		shell.getArte().data_manager.cleanUpAll();
		AnsiConsole.systemUninstall();
		System.exit(0);
	}

}
