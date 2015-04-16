package arte.plugin;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.ServiceLoader;

import arte.Messages;
import arte.Arte;
import arte.data.PathManager;
import arte.execution.Timer;
import arte.shell.Colors;
import arte.shell.Shell;
import ttc.testsuite.interfaces.TestInterface;

public class PluginLoader {
	
	public Timer timer;

	private static PluginLoader plugin_loader = null;
	
	private PluginLoader(){	}
	
	public static PluginLoader getPluginLoader(){
		if(plugin_loader == null){
			plugin_loader = new PluginLoader();
		}
		return plugin_loader;
	}
	
	public boolean setPlugin(File path, Shell shell) throws MalformedURLException, NullPointerException {
		return setPlugin(path, shell.getArte());
	}

	public boolean setPlugin(File path, Arte test_suite) throws MalformedURLException {
		URL pluginURL = path.toURI().toURL();
		ClassLoader contextLoader = Thread.currentThread().getContextClassLoader();
		URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{pluginURL}, contextLoader);
		Thread.currentThread().setContextClassLoader(urlClassLoader);

		ServiceLoader<TestInterface> serviceLoader = ServiceLoader.load(TestInterface.class,urlClassLoader);
		Iterator<TestInterface> iterator = serviceLoader.iterator();

		Thread.currentThread().setContextClassLoader(contextLoader);
		if(iterator.hasNext()){
			TestInterface test_interface = serviceLoader.iterator().next();
			try {
				test_interface.getClass().getMethod("usesProgramGraph"); //$NON-NLS-1$
					
			} catch (NoSuchMethodException e1) {
				Colors.print_red(Messages.getString("error")); //$NON-NLS-1$
				System.out.println(Messages.getString("error.old.sol")); //$NON-NLS-1$
				return false;
			} catch (SecurityException e1) {
				e1.printStackTrace();
				System.out.println(Messages.getString("error.unknown")); //$NON-NLS-1$
				return false;
			}
			PathManager paths = test_suite.data_manager.paths;

			System.out.println(Messages.getString("ascii.line.s.paths")); //$NON-NLS-1$
			test_interface.setLogPath(paths.log);
			test_interface.setPermanentStoragePath(paths.user_data);
			test_interface.setTmpPath(paths.user_tmp);
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			
			timer = new Timer(test_interface);
			
			File plugin = new File(paths.user_data, "Solution.jar"); //$NON-NLS-1$
			if(!plugin.equals(path)){
				if(plugin.exists()){
					plugin.delete();
				}
				try {
					Files.copy(path.toPath(), plugin.toPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return true;
		}
		else{
			throw new NullPointerException(Messages.getString("error.testinterface")); //$NON-NLS-1$
		}
	}
}
