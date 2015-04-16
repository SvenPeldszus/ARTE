package arte.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import arte.Messages;
import arte.Arte;
import arte.Arte.OS;
import static org.fusesource.jansi.Ansi.*;

public class PathManager {

	private static final String TTC_PRIVATE_SOURCECODE = "data_private/sourcecode/"; //$NON-NLS-1$
	private static final String TTC_PRIVATE_TESTCASES = "data_private/testcases/"; //$NON-NLS-1$
	
	File ttc_tmp;
	Path ttc_tmp_path;

	public File ttc_install;

	public File ttc_public_testcases;
	public File ttc_public_sources;
	
	File ttc_private_testcases;
	File ttc_private_sources;
	
	public File java;
	
	public File log;
	public File user_data;
	public File user_tmp;
	
	protected PathManager(Arte arte){
		//Set java installation path
		File java_home = new File(System.getProperty("java.home")); //$NON-NLS-1$
		if(!java_home.exists()){
			System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.java.inst", new String[]{java_home.toString()})));  //$NON-NLS-1$//$NON-NLS-2$
			System.exit(1);
		}
		else{
			File java_home_bin = new File(java_home, "bin"); //$NON-NLS-1$
			if(!java_home_bin.exists()){
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.java.inst", new String[]{java_home_bin.toString()})));  //$NON-NLS-1$//$NON-NLS-2$
				System.exit(1);
			}
			else{
				if(arte.os == OS.windows){
					java = new File(java_home_bin, "java.exe"); //$NON-NLS-1$
				}
				else{
					java = new File(java_home_bin, "java"); //$NON-NLS-1$
				}
				if(!java.exists()){
					System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.java.inst", new String[]{java.toString()})));  //$NON-NLS-1$//$NON-NLS-2$
					System.exit(1);
				}
			}
		}
		
		//Set tmp dir
		File tmp_system = new File(System.getProperty("java.io.tmpdir")); //$NON-NLS-1$
		if(!tmp_system.exists()){
			System.exit(1);
		}
		ttc_tmp = new File(tmp_system, "tmp_ttc"); //$NON-NLS-1$
		if(ttc_tmp.exists()){
			try {
				DataManager.deleteFile(ttc_tmp);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			arte.close_error = true;
		}
		ttc_tmp.mkdir();
		ttc_tmp_path = Paths.get(ttc_tmp.toString());
		
		//public testcases dir
		try {
			ttc_install = new File(Arte.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile();
			if(!ttc_install.exists()){
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.install"))); //$NON-NLS-1$ //$NON-NLS-2$
				System.exit(1);
			}
			File data = new File(ttc_install, "data"); //$NON-NLS-1$
			if(!data.exists()){
				data.mkdir();
			}
			ttc_public_testcases = new File(data, "testcases"); //$NON-NLS-1$
			if(!ttc_public_testcases.exists()){
				ttc_public_testcases.mkdir();
			}
			ttc_public_sources = new File(data, "sourcecode"); //$NON-NLS-1$
			if(!ttc_public_sources.exists()){
				ttc_public_sources.mkdir();
			}
			
			//private testcases dir
			ttc_private_testcases = new File(ttc_install, TTC_PRIVATE_TESTCASES);
			if(!ttc_private_testcases.exists()){
				System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.access.htc"))); //$NON-NLS-1$ //$NON-NLS-2$
			}
			else{
				ttc_private_sources = new File(ttc_install, TTC_PRIVATE_SOURCECODE);
				if(!ttc_private_sources.exists()){
					System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.access.htc"))); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
			
		} catch (URISyntaxException e) {
			System.out.println( ansi().render(Messages.getString("error")+Messages.getString("error.install"))); //$NON-NLS-1$ //$NON-NLS-2$
			System.exit(1);
		}
		 
		//Set log dir
		log = new File(ttc_install, "log");  //$NON-NLS-1$
		if(!log.exists()){
			log.mkdir();
		}
		
		//Set user_data dir
		user_data = new File(ttc_install, "user_data");  //$NON-NLS-1$
		if(!user_data.exists()){
			user_data.mkdir();
		}
		
		//Set user_tmp dir
		user_tmp = new File(ttc_install, "user_tmp");  //$NON-NLS-1$
		if(user_tmp.exists()){
			arte.close_error = true;
			try {
				DataManager.deleteFile(user_tmp);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		user_tmp.mkdir();
	}	
}
