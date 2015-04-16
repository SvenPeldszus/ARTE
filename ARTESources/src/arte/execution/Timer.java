package arte.execution;

import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testsuite.interfaces.TestInterface;

public class Timer {
	
	private TestInterface test_interface;
	
	private long time = 0;

	public boolean extended_case;

	public Timer(TestInterface test_interface) {
		this.test_interface = test_interface;
		this.extended_case = test_interface.usesProgramGraph();
	}

	public boolean createTypeGraph(String path){
		long start_time = System.currentTimeMillis();
		 boolean success = test_interface.createProgramGraph(path);
		time += System.currentTimeMillis()-start_time;
		return success;
	}
	
	public boolean applyPullUpMethod(Pull_Up_Refactoring refactoring){
		long start_time = System.currentTimeMillis();
		boolean success = test_interface.applyPullUpMethod(refactoring);
		time += System.currentTimeMillis()-start_time;
		return success;
	}
	
	public boolean applyCreateSuperclass(Create_Superclass_Refactoring refactoring){
		long start_time = System.currentTimeMillis();
		boolean success = test_interface.applyCreateSuperclass(refactoring);
		time += System.currentTimeMillis()-start_time;
		return success;
	}
	
	public boolean synchronizeChanges(){
		long start_time = System.currentTimeMillis();
		boolean success = test_interface.synchronizeChanges();
		time += System.currentTimeMillis()-start_time;
		return success;
	}
	
	public long getTime(){
		return time;
	}
	
	public void resetTimer(){
		time = 0;
	}

	public String getPluginName() {
		return test_interface.getPluginName();
	}
	
	public boolean setProgram(String path){
		if(extended_case){
			return test_interface.createProgramGraph(path);
		}
		else{
			test_interface.setProgramLocation(path);
			return true;
		}
	}
}
