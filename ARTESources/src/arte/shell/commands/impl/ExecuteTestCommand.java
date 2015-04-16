package arte.shell.commands.impl;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import arte.Messages;
import arte.execution.LogWriter;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import arte.shell.commands.Command;
import arte.shell.commands.impl.support.JavaProgramLoader;
import static org.fusesource.jansi.Ansi.*;

public class ExecuteTestCommand implements Command {

	@Override
	public Shell_Status getRequiredStatus() {
		return Shell_Status.Solution_Loaded;
	}

	@Override
	public void execute(List<String> args, Shell shell) {
		List<String> args_modifiable = new LinkedList<String>(args);
		
		boolean contains_command = JavaProgramLoader.javaProgramLoadCommand(shell, args_modifiable);
		
		shell.getArte().test_execution.resetRecords();
		
		if(args.contains(Messages.getString("Shell.args.all"))){ //$NON-NLS-1$
			
			try {
				LogWriter log = new LogWriter(shell.getArte().data_manager.paths, "testexec"); //$NON-NLS-1$
			
				log.println(Messages.getString("ascii.line.1")); //$NON-NLS-1$
				log.println(Messages.getString("ascii.pub.tc")); //$NON-NLS-1$
				log.println(Messages.getString("ascii.line.2")); //$NON-NLS-1$
				shell.getArte().test_execution.executePublic(log);
				
				log.println(Messages.getString("ascii.line.1")); //$NON-NLS-1$
				log.println(Messages.getString("ascii.hid.tc")); //$NON-NLS-1$
				log.println(Messages.getString("ascii.line.2")); //$NON-NLS-1$
				shell.getArte().test_execution.runHidden(log);
				
				log.println(Messages.getString("ascii.line.1")); //$NON-NLS-1$
				log.println(Messages.getString("ascii.res.tc")); //$NON-NLS-1$
				log.println(Messages.getString("ascii.line.2")); //$NON-NLS-1$
				
				shell.getArte().test_execution.printTestResults(log);
				
				log.closeLog();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			contains_command |= true;
		}
		else {
			try {
				LogWriter log = new LogWriter(shell.getArte().data_manager.paths, "testexec"); //$NON-NLS-1$
				
				if(args.contains(Messages.getString("Shell.args.hidden"))){ //$NON-NLS-1$
					args_modifiable.remove(args_modifiable.indexOf(Messages.getString("Shell.args.hidden"))); //$NON-NLS-1$
				
					log.println(Messages.getString("ascii.line.1")); //$NON-NLS-1$
					log.println(Messages.getString("ascii.hid.tc")); //$NON-NLS-1$
					log.println(Messages.getString("ascii.line.2")); //$NON-NLS-1$
					shell.getArte().test_execution.runHidden(log);
					
					log.println(Messages.getString("ascii.line.1")); //$NON-NLS-1$
					log.println(Messages.getString("ascii.res.tc")); //$NON-NLS-1$
					log.println(Messages.getString("ascii.line.2")); //$NON-NLS-1$
					
					shell.getArte().test_execution.printTestResults(log);
				
					contains_command |= true;			
				}
				
				if(args.contains(Messages.getString("Shell.args.test"))){ //$NON-NLS-1$
					log.println(Messages.getString("ascii.line.1")); //$NON-NLS-1$
					log.println(Messages.getString("ascii.pub.tc")); //$NON-NLS-1$
					log.println(Messages.getString("ascii.line.2")); //$NON-NLS-1$
					
					String[] names = shell.getArgValue(Messages.getString("Shell.args.test"), args_modifiable); //$NON-NLS-1$
					if(names.length>0){
						for(String entered_name : names){
							shell.getArte().test_execution.executeTestByName(entered_name, log);
							contains_command |= true;
						}
					}
					else{
						log.println(Messages.getString("no.exec")); //$NON-NLS-1$
					}
						
					log.println(Messages.getString("ascii.line.1")); //$NON-NLS-1$
					log.println(Messages.getString("ascii.res.tc")); //$NON-NLS-1$
					log.println(Messages.getString("ascii.line.2")); //$NON-NLS-1$
						
					shell.getArte().test_execution.printTestResults(log);
						
				}
				
				log.closeLog();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(!contains_command){
			System.out.println( ansi().render(Messages.getString("no.args.exec"))); //$NON-NLS-1$
		}
	}

}
