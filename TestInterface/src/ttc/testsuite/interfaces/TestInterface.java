package ttc.testsuite.interfaces;

import java.io.File;

import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;

/**
 * Interface to the automatic test suite for ttc2015
 * 
 * @version 1.0
 * 
 * @author sven.peldszus
 *
 */

public interface TestInterface {
	
	/**
	 * A solution should have a unique name. 
	 * 
	 * @return the name of the solution
	 */
	public String getPluginName();
	
	/**
	 * Returns weather the solution is realizing the basic case or the extended case. 
	 * In the extended case the given type graph has to be used as intermediate representation on which the refactorings will be applied. 
	 * 
	 * @return {@code true} iff the solution the solution uses the given Type graph as intermediate representation, otherwise {@code false}.
	 */
	
	public boolean usesProgramGraph();
	
	/**
	 * Reads the java program located at the given path and creates the according program graph.
	 * 
	 * This method will be only called on the extended case. On the basic case {@code setProgramLocation(String)}.
	 * 
	 * @param path Absolute path to a java programs main folder
	 * @return	{@code true} iff the type graph has successful been created, otherwise {@code false}.
	 */
	public boolean createProgramGraph(String path);
		
	/**
	 * Gives the location of the java program on which refactorings will be applied to a solution.
	 * 
	 * This method will only be called in the basic case. In the extended case {@code createProgramGraph(String)} will be called instead.
	 * 
	 * @see createProgramGraph
	 * 
	 * @param path Absolute path to a java programs main folder
	 */
	public void setProgramLocation(String path);
	
	/**
	 * Applies pull up method on the generated type graph according to the values in the given refactoring instance.
	 * 
	 * @param refactoring A instance of a pull-up method refactoring described in the ttc dsl.
	 * @return {@code true} iff the application of pull-up method was successful, otherwise {@code false}.
	 */
	
	public boolean applyPullUpMethod(Pull_Up_Refactoring refactoring);
	
	/**
	 * Applies create superclass on the program graph according to the values in the given refactoring instance.
	 * 
	 * @param refactoring A instance of a create superclass refactoring described in the ttc dsl.
	 * @return {@code true} iff the application of extract superclass was successful, otherwise {@code false}.
	 */
	public boolean applyCreateSuperclass(Create_Superclass_Refactoring refactoring);
	
	/**
	 * Hands a File representation of a folder to the solution where data can be stored permanent.
	 *
	 * @param path a File representation of the path
	 */
	public void setPermanentStoragePath(File path);
	
	/**
	 * Hands a File representation of a folder to the solution where logs can be stored permanent. 
	 * 
	 * @param path a File representation of the path
	 */
	public void setLogPath(File path);
	
	/**
	 * Hands a File representation of a folder to the solution where data can be stored temporal. 
	 * 
	 * The folder is automatically cleaned up when the test toll is closed.
	 * 
	 * @param path a File representation of the path
	 */
	public void setTmpPath(File path);
	
	
	/**
	 * Synchronizes the java code with the program graph and propagates all changes made in the program graph to the java source code.
	 * Synchronizing the program graph with the source code is only allowed when this method s called.
	 * 
	 * This method will be only called in the extended case. In the basic case there is no equivalent method.
	 * 
	 * @return {@code true} iff all changes have success full be synchronized with the java code, otherwise {@code false}.
	 */
	public boolean synchronizeChanges();

}
