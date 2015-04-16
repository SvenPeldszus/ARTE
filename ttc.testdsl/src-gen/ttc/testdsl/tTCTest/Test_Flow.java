/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Test_Flow#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Flow()
 * @model
 * @generated
 */
public interface Test_Flow extends EObject
{
  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Test_Step_Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Flow_Step()
   * @model containment="true"
   * @generated
   */
  EList<Test_Step_Element> getStep();

} // Test_Flow
