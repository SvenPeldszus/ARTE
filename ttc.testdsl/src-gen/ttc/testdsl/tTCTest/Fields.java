/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Fields#getName <em>Name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Fields#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getFields()
 * @model
 * @generated
 */
public interface Fields extends EObject
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
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getFields_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Fields#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Java_Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getFields_Fields()
   * @model
   * @generated
   */
  EList<Java_Field> getFields();

} // Fields
