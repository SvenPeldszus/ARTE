package arte.shell.commands.impl.support;

import java.io.File;
import java.net.MalformedURLException;

import arte.Messages;
import arte.plugin.PluginLoader;
import arte.shell.Shell;
import arte.shell.Shell_Status;
import static org.fusesource.jansi.Ansi.*;

public class SolutionLoader {
	
	public static boolean loadSolution(Shell shell, File solution_path){
		PluginLoader loader = PluginLoader.getPluginLoader();
		try {
			if(solution_path.exists()){
				if(solution_path.isFile() && solution_path.getName().endsWith("jar")){ //$NON-NLS-1$
					if(!loader.setPlugin(solution_path, shell)){
						System.out.println(Messages.getString("error")+Messages.getString("error.load.solution")); //$NON-NLS-1$ //$NON-NLS-2$
						return false;
					}
					shell.getArte().timer = loader.timer;
					shell.setStatus(Shell_Status.Solution_Loaded);
					System.out.println( ansi().render(Messages.getString("success.sol"))); //$NON-NLS-1$
				}
				else{
					System.out.println( Messages.getString("error")+Messages.getString("error.file.ext", new String[]{"jar"})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				}
			}
			else{
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.skipped.path", new String[]{Messages.getString("sol_s"), solution_path.toString()}))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				return false;
			}
		} catch (MalformedURLException e) {
			System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.at.path",new String[]{solution_path.toString()}))); //$NON-NLS-1$ //$NON-NLS-2$
			e.printStackTrace();
			return false;
		}
		return true;

	}

}
