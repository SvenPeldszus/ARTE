package arte.shell.commands;

import java.util.List;

import arte.shell.Shell;
import arte.shell.Shell_Status;

public interface Command {
	
	public Shell_Status getRequiredStatus();

	public void execute(List<String> arguments, Shell shell);
}