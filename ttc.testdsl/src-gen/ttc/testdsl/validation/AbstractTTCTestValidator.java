/*
 * generated by Xtext
 */
package ttc.testdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractTTCTestValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(ttc.testdsl.tTCTest.TTCTestPackage.eINSTANCE);
		return result;
	}
}
