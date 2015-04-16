/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methods</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Methods#getName <em>Name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Methods#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getMethods()
 * @model
 * @generated
 */
public interface Methods extends EObject
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
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getMethods_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Methods#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Java_Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getMethods_Methods()
   * @model
   * @generated
   */
  EList<Java_Method> getMethods();

} // Methods
