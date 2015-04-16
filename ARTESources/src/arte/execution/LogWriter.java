package arte.execution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import arte.data.PathManager;
import arte.shell.Colors;

public class LogWriter{
	
	FileWriter writer;
	
	private PathManager paths;

	public LogWriter(PathManager paths, String log_name) throws IOException{
		this.paths = paths;
		newLog(log_name);
	}
	
	public void newLog(String name) throws IOException{
		if(writer!=null){
			writer.close();
		}
		boolean exists = true;
		File log;
		do{
			log = new File(paths.log,name+System.currentTimeMillis()+".txt"); //$NON-NLS-1$
			exists = log.exists();
		}while(exists);
		log.createNewFile();
		writer = new FileWriter(log);
	}
	
	public void closeLog() throws IOException{
		if(writer!=null){
			writer.close();
		}
	}
	
	public void println(String ansi){
		System.out.println(ansi);
		try {
			writer.append(ansi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void println_yellow(String ansi){
		Colors.println_yellow(ansi);
		try {
			writer.append(ansi+'\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void println_green(String ansi){
		Colors.println_green(ansi);
		try {
			writer.append(ansi+'\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void println_red(String ansi){
		Colors.println_red(ansi);
		try {
			writer.append(ansi+'\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void println_magenta(String ansi){
		Colors.println_magenta(ansi);
		try {
			writer.append(ansi+'\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Print without starting new line
	
	public void print(String ansi){
		System.out.print(ansi);
		try {
			writer.append(ansi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print_yellow(String ansi){
		Colors.print_yellow(ansi);
		try {
			writer.append(ansi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print_green(String ansi){
		Colors.print_green(ansi);
		try {
			writer.append(ansi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print_red(String ansi){
		Colors.print_red(ansi);
		try {
			writer.append(ansi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print_magenta(String ansi){
		Colors.print_magenta(ansi);
		try {
			writer.append(ansi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
