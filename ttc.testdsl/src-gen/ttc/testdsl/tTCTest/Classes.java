/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Classes#getName <em>Name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Classes#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getClasses()
 * @model
 * @generated
 */
public interface Classes extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getClasses_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Classes#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Classes</b></em>' reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Java_Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getClasses_Classes()
   * @model
   * @generated
   */
  EList<Java_Class> getClasses();

} // Classes
