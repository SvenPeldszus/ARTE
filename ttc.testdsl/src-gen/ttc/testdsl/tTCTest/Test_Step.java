/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Test_Step#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Step()
 * @model
 * @generated
 */
public interface Test_Step extends Test_Step_Element
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Test_Step_Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Step_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Test_Step_Element> getElements();

} // Test_Step
