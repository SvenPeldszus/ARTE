/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Java_Method#getMethod_name <em>Method name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Java_Method#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getJava_Method()
 * @model
 * @generated
 */
public interface Java_Method extends Class_Element
{
  /**
   * Returns the value of the '<em><b>Method name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method name</em>' attribute.
   * @see #setMethod_name(String)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getJava_Method_Method_name()
   * @model
   * @generated
   */
  String getMethod_name();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Java_Method#getMethod_name <em>Method name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method name</em>' attribute.
   * @see #getMethod_name()
   * @generated
   */
  void setMethod_name(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Java_Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getJava_Method_Params()
   * @model
   * @generated
   */
  EList<Java_Class> getParams();

} // Java_Method
