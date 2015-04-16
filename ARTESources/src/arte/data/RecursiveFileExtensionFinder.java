package arte.data;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecursiveFileExtensionFinder extends SimpleFileVisitor<Path> {
	
	private Set<File> java = new HashSet<File>();
	private List<String> extensions;
	
	public RecursiveFileExtensionFinder(String... extensions){
		this.extensions = Arrays.asList(extensions);
	}
	
	@Override public FileVisitResult visitFile(Path aFile, BasicFileAttributes aAttrs) throws IOException {
		String[] split = aFile.toString().split("\\.(?=[^\\.]+$)"); //$NON-NLS-1$
		if(split.length == 0 || extensions.contains(split[split.length-1])){
			java.add(aFile.toFile());
		}
		return FileVisitResult.CONTINUE;
	}
		    
	@Override  public FileVisitResult preVisitDirectory(Path aDir, BasicFileAttributes aAttrs) throws IOException {
		return FileVisitResult.CONTINUE;
	}
	
	public Iterable<File> getFiles(){
		return java;
	}
}
