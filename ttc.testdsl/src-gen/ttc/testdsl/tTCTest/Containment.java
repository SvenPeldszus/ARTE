/**
 */
package ttc.testdsl.tTCTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Containment#getClass_ <em>Class</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Containment#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getContainment()
 * @model
 * @generated
 */
public interface Containment extends Test_Step_Element
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(Java_Class)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getContainment_Class()
   * @model
   * @generated
   */
  Java_Class getClass_();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Containment#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(Java_Class value);

  /**
   * Returns the value of the '<em><b>Contains</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contains</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contains</em>' reference.
   * @see #setContains(Class_Element)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getContainment_Contains()
   * @model
   * @generated
   */
  Class_Element getContains();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Containment#getContains <em>Contains</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contains</em>' reference.
   * @see #getContains()
   * @generated
   */
  void setContains(Class_Element value);

} // Containment
