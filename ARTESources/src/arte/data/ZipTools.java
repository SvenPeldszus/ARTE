package arte.data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class ZipTools {

	private static final int BUFFER_SIZE = 4096;
	
	public static void zipDir(File in, File out) throws FileNotFoundException,IOException {
		FileOutputStream destination = new FileOutputStream(out);
		ZipOutputStream zip_out_stream = new ZipOutputStream(new BufferedOutputStream(destination));
		
		zipSubDir(zip_out_stream, in, in.getParentFile());
		
		zip_out_stream.flush();
		zip_out_stream.close();
	}

	private static void zipSubDir(ZipOutputStream zip_out_stream, File subdir_file, File relative_to)
			throws FileNotFoundException, IOException {
		byte data[] = new byte[BUFFER_SIZE];
		if(subdir_file.isDirectory()){
			ZipEntry entry = new ZipEntry(subdir_file.getAbsolutePath().replace(relative_to.getAbsolutePath(), "")+File.separator); //$NON-NLS-1$
		    zip_out_stream.putNextEntry(entry);
			for(File list : subdir_file.listFiles()){
				zipSubDir(zip_out_stream, list,relative_to);
			}
		}
		else {
			FileInputStream file_in_stream = new FileInputStream(subdir_file);
		    BufferedInputStream origin = new BufferedInputStream(file_in_stream, BUFFER_SIZE);
		    ZipEntry entry = new ZipEntry(subdir_file.getAbsolutePath().replace(relative_to.getAbsolutePath(), "")); //$NON-NLS-1$
		    zip_out_stream.putNextEntry(entry);
		    int count;
		    while ((count = origin.read(data, 0, BUFFER_SIZE)) != -1) {
		 		zip_out_stream.write(data, 0, count);
		        zip_out_stream.flush();
		    }
			origin.close();
		}
	}
	
	public static File unzip(InputStream input, File out_path) throws IOException, FileNotFoundException {
		File test_folder;
		ZipInputStream zip = new ZipInputStream(input);
		ZipEntry entry = zip.getNextEntry();
		test_folder = new File(out_path + File.separator + entry.getName());
		while(entry!=null){
			File filePath = new File(out_path + File.separator + entry.getName());
			if (!entry.isDirectory()) {
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
		        byte[] bytesIn = new byte[BUFFER_SIZE];
		        int read = 0;
		        while ((read = zip.read(bytesIn)) != -1) {
		        	bos.write(bytesIn, 0, read);
		        }
		        bos.close();
		    } else {
		        if(!filePath.exists()) filePath.mkdirs();
		    }
			zip.closeEntry();
			entry = zip.getNextEntry();
		}
		zip.close();
		input.close();
		return test_folder;
	}
	
	public static void unzip(File in_path, File out_path, String password) throws ZipException {
		ZipFile zipFile = new ZipFile(in_path);
		zipFile.setPassword(password);
				
		zipFile.extractAll(out_path.toString());
	}
	
	public static void unzip(File in_path, File out_path) throws ZipException {
		ZipFile zipFile = new ZipFile(in_path);
				
		zipFile.extractAll(out_path.toString());
	}
	
}
