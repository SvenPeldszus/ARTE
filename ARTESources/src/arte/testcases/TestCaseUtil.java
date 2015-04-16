package arte.testcases;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import arte.Arte;
import ttc.testdsl.tTCTest.Test_File;

public class TestCaseUtil {
	
	private Arte test_suite;

	public TestCaseUtil(Arte test_suite) {
		this.test_suite = test_suite;
	}

	public Test_File parseTestCase(File test_case_file) {
		XtextResourceSet resourceSet = test_suite.xtext.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createFileURI(test_case_file.getAbsolutePath()), true);
		return (Test_File) resource.getContents().get(0);
	}
}
