/**
 */
package ttc.testdsl.tTCTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Java_Field#getField_name <em>Field name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Java_Field#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getJava_Field()
 * @model
 * @generated
 */
public interface Java_Field extends Class_Element
{
  /**
   * Returns the value of the '<em><b>Field name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field name</em>' attribute.
   * @see #setField_name(String)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getJava_Field_Field_name()
   * @model
   * @generated
   */
  String getField_name();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Java_Field#getField_name <em>Field name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field name</em>' attribute.
   * @see #getField_name()
   * @generated
   */
  void setField_name(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Java_Class)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getJava_Field_Type()
   * @model
   * @generated
   */
  Java_Class getType();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Java_Field#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Java_Class value);

} // Java_Field
