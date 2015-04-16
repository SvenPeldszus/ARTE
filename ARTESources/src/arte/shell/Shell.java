package arte.shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import arte.Messages;
import arte.Arte;
import arte.shell.commands.Command;
import arte.shell.commands.impl.ExecuteTestCommand;
import arte.shell.commands.impl.ExitCommand;
import arte.shell.commands.impl.HelpCommand;
import arte.shell.commands.impl.LoadCommand;
import arte.shell.commands.impl.ProgramCommand;
import arte.shell.commands.impl.SolutionCommand;
import arte.shell.commands.impl.TestCaseCommand;
import arte.shell.commands.impl.VersionCommand;
import static org.fusesource.jansi.Ansi.*;

public class Shell {
	private Shell_Status status = Shell_Status.No_Solution_Loaded;
	private Map<String, Command> commands = new HashMap<>();
	
	private Arte arte;
	
	public Shell(Arte arte) {
		this.arte = arte;
		
		commands.put(Messages.getString("Shell.load"), new LoadCommand()); //$NON-NLS-1$
		commands.put(Messages.getString("Shell.solution"), new SolutionCommand()); //$NON-NLS-1$
		commands.put(Messages.getString("Shell.execute"), new ExecuteTestCommand()); //$NON-NLS-1$
		commands.put(Messages.getString("Shell.testcases"), new TestCaseCommand()); //$NON-NLS-1$
		commands.put(Messages.getString("Shell.programs"), new ProgramCommand()); //$NON-NLS-1$
		commands.put(Messages.getString("Shell.help"), new HelpCommand()); //$NON-NLS-1$
		commands.put(Messages.getString("Shell.exit"), new ExitCommand()); //$NON-NLS-1$
		commands.put(Messages.getString("Shell.version"), new VersionCommand()); //$NON-NLS-1$
	}

	public void shell(String[] args) {
		System.out.println(Messages.getString("ascii.line.1")); //$NON-NLS-1$
		System.out.println(Messages.getString("ascii.arte", new String[]{arte.version})); //$NON-NLS-1$
		System.out.println(Messages.getString("ascii.line.2")); //$NON-NLS-1$
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = in.readLine()) != null) {
				if (line.trim().equals("")) //$NON-NLS-1$
					continue;
				String[] split = line.split(" "); //$NON-NLS-1$
				String command = split[0];
				List<String> arguments = Arrays.asList(Arrays.copyOfRange(split, 1, split.length));
				try {
					executeCommand(command, arguments);
				} catch (RuntimeException re) {
					System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.run.exept"))); //$NON-NLS-1$ //$NON-NLS-2$
					re.printStackTrace();
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(Messages.getString("error")+Messages.getString("error.io"), e); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	public boolean containsFlag(String flag, String[] args) {
		return Arrays.asList(args).contains(flag);
	}

	public String[] getArgValue(String argName, List<String> list) {
		int index_begin = list.indexOf(argName.trim());
		if (index_begin != -1 && list.size() > index_begin + 1) {
			int index_end = index_begin;
			for(String s: list.subList(index_begin+1, list.size())){
				index_end++;
				if(s.startsWith("--")){ //$NON-NLS-1$
					return list.subList(index_begin+1, index_end).toArray(new String[]{});
				}
				if(index_end+index_begin+1 >= list.size()){
					return list.subList(index_begin+1, index_end+1).toArray(new String[]{});
				}
			}
		}
		return new String[0];
	}
	
	public void executeCommand(String command, List<String> arguments) {
		Command c = commands.get(command);
		if (c == null) {
			System.out.println( ansi().render(Messages.getString("error") //$NON-NLS-1$
					+ Messages.getString("error.inval.cmd", new String[]{command}))); //$NON-NLS-1$
			return;
		}
		if (!status.isCompatible(c.getRequiredStatus())) {
			System.out.println( ansi().render(Messages.getString("error")+ Messages.getString("error.stat.match", new Object[]{status,c.getRequiredStatus()}))); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
		c.execute(arguments, this);
	}

	public Shell_Status getStatus() {
		return status;
	}

	public void setStatus(Shell_Status status) {
		this.status = status;
	}

	public Arte getArte() {
		return arte;
	}
}