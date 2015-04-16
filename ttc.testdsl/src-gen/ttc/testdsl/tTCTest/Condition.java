/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Condition#getRefactoring <em>Refactoring</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Condition#getTrue_steps <em>True steps</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Condition#getWarning <em>Warning</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Condition#getFalse_steps <em>False steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Test_Step_Element
{
  /**
   * Returns the value of the '<em><b>Refactoring</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refactoring</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refactoring</em>' reference.
   * @see #setRefactoring(Refactoring)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getCondition_Refactoring()
   * @model
   * @generated
   */
  Refactoring getRefactoring();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Condition#getRefactoring <em>Refactoring</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refactoring</em>' reference.
   * @see #getRefactoring()
   * @generated
   */
  void setRefactoring(Refactoring value);

  /**
   * Returns the value of the '<em><b>True steps</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Test_Step_Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True steps</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getCondition_True_steps()
   * @model containment="true"
   * @generated
   */
  EList<Test_Step_Element> getTrue_steps();

  /**
   * Returns the value of the '<em><b>Warning</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Warning</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Warning</em>' containment reference.
   * @see #setWarning(Warning)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getCondition_Warning()
   * @model containment="true"
   * @generated
   */
  Warning getWarning();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Condition#getWarning <em>Warning</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Warning</em>' containment reference.
   * @see #getWarning()
   * @generated
   */
  void setWarning(Warning value);

  /**
   * Returns the value of the '<em><b>False steps</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Test_Step_Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False steps</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getCondition_False_steps()
   * @model containment="true"
   * @generated
   */
  EList<Test_Step_Element> getFalse_steps();

} // Condition
