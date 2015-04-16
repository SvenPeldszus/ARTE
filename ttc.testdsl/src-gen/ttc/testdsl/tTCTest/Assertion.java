/**
 */
package ttc.testdsl.tTCTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Assertion#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends Test_Step_Element
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' reference.
   * @see #setInput(Refactoring)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getAssertion_Input()
   * @model
   * @generated
   */
  Refactoring getInput();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Assertion#getInput <em>Input</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Refactoring value);

} // Assertion
