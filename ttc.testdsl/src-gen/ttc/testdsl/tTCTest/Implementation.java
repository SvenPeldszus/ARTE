/**
 */
package ttc.testdsl.tTCTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Implementation#getChild <em>Child</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Implementation#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends Test_Step_Element
{
  /**
   * Returns the value of the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' reference.
   * @see #setChild(Java_Class)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getImplementation_Child()
   * @model
   * @generated
   */
  Java_Class getChild();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Implementation#getChild <em>Child</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' reference.
   * @see #getChild()
   * @generated
   */
  void setChild(Java_Class value);

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
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getImplementation_Parent()
   * @model
   * @generated
   */
  Java_Class getParent();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Implementation#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Java_Class value);

} // Implementation
