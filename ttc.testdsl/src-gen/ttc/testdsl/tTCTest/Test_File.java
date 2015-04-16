/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.Test_File#getName <em>Name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Test_File#getTest_cases <em>Test cases</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Test_File#getJava_class <em>Java class</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Test_File#getJava_classes <em>Java classes</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Test_File#getJava_method <em>Java method</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.Test_File#getRefactorings <em>Refactorings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_File()
 * @model
 * @generated
 */
public interface Test_File extends EObject
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
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_File_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ttc.testdsl.tTCTest.Test_File#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Test cases</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Test_Case}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test cases</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_File_Test_cases()
   * @model containment="true"
   * @generated
   */
  EList<Test_Case> getTest_cases();

  /**
   * Returns the value of the '<em><b>Java class</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Java_Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java class</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_File_Java_class()
   * @model containment="true"
   * @generated
   */
  EList<Java_Class> getJava_class();

  /**
   * Returns the value of the '<em><b>Java classes</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Classes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java classes</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_File_Java_classes()
   * @model containment="true"
   * @generated
   */
  EList<Classes> getJava_classes();

  /**
   * Returns the value of the '<em><b>Java method</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Java_Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java method</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_File_Java_method()
   * @model containment="true"
   * @generated
   */
  EList<Java_Method> getJava_method();

  /**
   * Returns the value of the '<em><b>Refactorings</b></em>' containment reference list.
   * The list contents are of type {@link ttc.testdsl.tTCTest.Refactoring_Instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refactorings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refactorings</em>' containment reference list.
   * @see ttc.testdsl.tTCTest.TTCTestPackage#getTest_File_Refactorings()
   * @model containment="true"
   * @generated
   */
  EList<Refactoring_Instance> getRefactorings();

} // Test_File
