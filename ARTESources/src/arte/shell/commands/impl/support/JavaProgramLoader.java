package arte.shell.commands.impl.support;

import java.util.List;

import arte.Messages;
import arte.data.container.Pair;
import arte.shell.Shell;
import static org.fusesource.jansi.Ansi.*;

public class JavaProgramLoader {
	public static boolean javaProgramLoadCommand(Shell shell, List<String> args_modifiable) {
		boolean contains_command = false;
		while(args_modifiable.contains(Messages.getString("Shell.args.src"))){ //$NON-NLS-1$
			if(args_modifiable.contains(Messages.getString("Shell.args.main"))){ //$NON-NLS-1$
				String[] src = shell.getArgValue(Messages.getString("Shell.args.src"), args_modifiable); //$NON-NLS-1$
				String[] name = shell.getArgValue(Messages.getString("Shell.args.main"), args_modifiable); //$NON-NLS-1$
				if(name.length == 1 && src.length == 1){
					shell.getArte().data_manager.addSource(new Pair<String, String>(src[0], name[0]));
				}
				else{
					System.out.println( ansi().render(Messages.getString("no.args.src.main"))); //$NON-NLS-1$
					break;
				}
				int src_index = args_modifiable.indexOf(Messages.getString("Shell.args.src")); //$NON-NLS-1$
				if(!args_modifiable.remove(src_index).equals(Messages.getString("Shell.args.src"))){ //$NON-NLS-1$
					System.out.println( ansi().render(Messages.getString("error.process.cmd"))); //$NON-NLS-1$
					break;
				}
				if(!args_modifiable.remove(src_index).equals(src[0])){
					System.out.println( ansi().render(Messages.getString("error.process.cmd"))); //$NON-NLS-1$
					break;
				}
				int main_index = args_modifiable.indexOf(Messages.getString("Shell.args.main")); //$NON-NLS-1$
				if(!args_modifiable.remove(main_index).equals(Messages.getString("Shell.args.main"))){ //$NON-NLS-1$
					System.out.println( ansi().render(Messages.getString("error.process.cmd"))); //$NON-NLS-1$
					break;
				}
				if(!args_modifiable.remove(main_index).equals(name[0])){
					System.out.println( ansi().render(Messages.getString("error.process.cmd"))); //$NON-NLS-1$
					break;
				}
			}
			else{
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("no.args.main"))); //$NON-NLS-1$ //$NON-NLS-2$
				contains_command |= true;
				break;
			}
			contains_command  |= true; 
		}
		return contains_command;
	}
	
	public static boolean javaProgramListCommand(Shell shell, List<String> args_modifiable){
		if(args_modifiable.contains(Messages.getString("Shell.args.list"))){ //$NON-NLS-1$
			shell.getArte().data_manager.listJavaPrograms();
			return true;
		}
		return false;
	}

	public static boolean javaProgramRemoveCommand(Shell shell,	List<String> args_modifiable) {
		if(args_modifiable.contains(Messages.getString("Shell.args.rm"))){ //$NON-NLS-1$
			shell.getArte().data_manager.removeSources(shell.getArgValue(Messages.getString("Shell.args.rm"), args_modifiable)); //$NON-NLS-1$
			return true;
		}
		return false;
	}
}
