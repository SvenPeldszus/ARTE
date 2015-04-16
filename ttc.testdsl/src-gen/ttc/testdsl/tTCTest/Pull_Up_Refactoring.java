/**
 */
package ttc.testdsl.tTCTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pull Up Refactoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Pull_Up_Refactoring#getParent <em>Parent</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Pull_Up_Refactoring#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getPull_Up_Refactoring()
 * @model
 * @generated
 */
public interface Pull_Up_Refactoring extends Refactoring_Instance
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Java_Class)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getPull_Up_Refactoring_Parent()
   * @model
   * @generated
   */
  Java_Class getParent();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Pull_Up_Refactoring#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Java_Class value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(Java_Method)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getPull_Up_Refactoring_Method()
   * @model
   * @generated
   */
  Java_Method getMethod();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Pull_Up_Refactoring#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Java_Method value);

} // Pull_Up_Refactoring
