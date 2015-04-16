/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Test_Case#getName <em>Name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Test_Case#getDescription <em>Description</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Test_Case#getJava_program <em>Java program</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Test_Case#getTest_flow <em>Test flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Case()
 * @model
 * @generated
 */
public interface Test_Case extends EObject
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
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Case_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Test_Case#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Case_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Test_Case#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Java program</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java program</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java program</em>' attribute.
   * @see #setJava_program(String)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Case_Java_program()
   * @model
   * @generated
   */
  String getJava_program();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Test_Case#getJava_program <em>Java program</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java program</em>' attribute.
   * @see #getJava_program()
   * @generated
   */
  void setJava_program(String value);

  /**
   * Returns the value of the '<em><b>Test flow</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test flow</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test flow</em>' containment reference.
   * @see #setTest_flow(Test_Flow)
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_Case_Test_flow()
   * @model containment="true"
   * @generated
   */
  Test_Flow getTest_flow();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Test_Case#getTest_flow <em>Test flow</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test flow</em>' containment reference.
   * @see #getTest_flow()
   * @generated
   */
  void setTest_flow(Test_Flow value);

} // Test_Case
