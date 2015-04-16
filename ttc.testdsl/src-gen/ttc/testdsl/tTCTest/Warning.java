/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Warning#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getWarning()
 * @model
 * @generated
 */
public interface Warning extends EObject
{
  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getWarning_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Warning#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // Warning
