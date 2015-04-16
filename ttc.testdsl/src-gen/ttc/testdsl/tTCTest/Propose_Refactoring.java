/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propose Refactoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Propose_Refactoring#getRefactoring <em>Refactoring</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getPropose_Refactoring()
 * @model
 * @generated
 */
public interface Propose_Refactoring extends EObject
{
  /**
   * Returns the value of the '<em><b>Refactoring</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refactoring</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refactoring</em>' containment reference.
   * @see #setRefactoring(Refactoring)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getPropose_Refactoring_Refactoring()
   * @model containment="true"
   * @generated
   */
  Refactoring getRefactoring();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Propose_Refactoring#getRefactoring <em>Refactoring</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refactoring</em>' containment reference.
   * @see #getRefactoring()
   * @generated
   */
  void setRefactoring(Refactoring value);

} // Propose_Refactoring
