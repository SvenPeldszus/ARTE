/**
 */
package ttc.testdsl.tTCTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ttc.testdsl.tTCTest.TTCTestFactory
 * @model kind="package"
 * @generated
 */
public interface TTCTestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tTCTest";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.testdsl.ttc/TTCTest";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tTCTest";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TTCTestPackage eINSTANCE = ttc.testdsl.tTCTest.impl.TTCTestPackageImpl.init();

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Test_FileImpl <em>Test File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Test_FileImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_File()
   * @generated
   */
  int TEST_FILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Test cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FILE__TEST_CASES = 1;

  /**
   * The feature id for the '<em><b>Java class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FILE__JAVA_CLASS = 2;

  /**
   * The feature id for the '<em><b>Java classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FILE__JAVA_CLASSES = 3;

  /**
   * The feature id for the '<em><b>Java method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FILE__JAVA_METHOD = 4;

  /**
   * The feature id for the '<em><b>Refactorings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FILE__REFACTORINGS = 5;

  /**
   * The number of structural features of the '<em>Test File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FILE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Java_ClassImpl <em>Java Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Java_ClassImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getJava_Class()
   * @generated
   */
  int JAVA_CLASS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS__PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Class name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS__CLASS_NAME = 2;

  /**
   * The number of structural features of the '<em>Java Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.ClassesImpl <em>Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.ClassesImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getClasses()
   * @generated
   */
  int CLASSES = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSES__NAME = 0;

  /**
   * The feature id for the '<em><b>Classes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSES__CLASSES = 1;

  /**
   * The number of structural features of the '<em>Classes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Class_ElementImpl <em>Class Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Class_ElementImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getClass_Element()
   * @generated
   */
  int CLASS_ELEMENT = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Class Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Java_MethodImpl <em>Java Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Java_MethodImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getJava_Method()
   * @generated
   */
  int JAVA_METHOD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_METHOD__NAME = CLASS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Method name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_METHOD__METHOD_NAME = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_METHOD__PARAMS = CLASS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Java Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_METHOD_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.MethodsImpl <em>Methods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.MethodsImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getMethods()
   * @generated
   */
  int METHODS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODS__NAME = 0;

  /**
   * The feature id for the '<em><b>Methods</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODS__METHODS = 1;

  /**
   * The number of structural features of the '<em>Methods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Java_FieldImpl <em>Java Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Java_FieldImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getJava_Field()
   * @generated
   */
  int JAVA_FIELD = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FIELD__NAME = CLASS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Field name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FIELD__FIELD_NAME = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FIELD__TYPE = CLASS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Java Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FIELD_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.FieldsImpl <em>Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.FieldsImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getFields()
   * @generated
   */
  int FIELDS = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Test_CaseImpl <em>Test Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Test_CaseImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_Case()
   * @generated
   */
  int TEST_CASE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Java program</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__JAVA_PROGRAM = 2;

  /**
   * The feature id for the '<em><b>Test flow</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__TEST_FLOW = 3;

  /**
   * The number of structural features of the '<em>Test Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.RefactoringImpl <em>Refactoring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.RefactoringImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getRefactoring()
   * @generated
   */
  int REFACTORING = 9;

  /**
   * The number of structural features of the '<em>Refactoring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFACTORING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Refactoring_InstanceImpl <em>Refactoring Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Refactoring_InstanceImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getRefactoring_Instance()
   * @generated
   */
  int REFACTORING_INSTANCE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFACTORING_INSTANCE__NAME = REFACTORING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Refactoring Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFACTORING_INSTANCE_FEATURE_COUNT = REFACTORING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Pull_Up_RefactoringImpl <em>Pull Up Refactoring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Pull_Up_RefactoringImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getPull_Up_Refactoring()
   * @generated
   */
  int PULL_UP_REFACTORING = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PULL_UP_REFACTORING__NAME = REFACTORING_INSTANCE__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PULL_UP_REFACTORING__PARENT = REFACTORING_INSTANCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PULL_UP_REFACTORING__METHOD = REFACTORING_INSTANCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pull Up Refactoring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PULL_UP_REFACTORING_FEATURE_COUNT = REFACTORING_INSTANCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Create_Superclass_RefactoringImpl <em>Create Superclass Refactoring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Create_Superclass_RefactoringImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getCreate_Superclass_Refactoring()
   * @generated
   */
  int CREATE_SUPERCLASS_REFACTORING = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SUPERCLASS_REFACTORING__NAME = REFACTORING_INSTANCE__NAME;

  /**
   * The feature id for the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SUPERCLASS_REFACTORING__CHILD = REFACTORING_INSTANCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SUPERCLASS_REFACTORING__TARGET = REFACTORING_INSTANCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create Superclass Refactoring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SUPERCLASS_REFACTORING_FEATURE_COUNT = REFACTORING_INSTANCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Test_FlowImpl <em>Test Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Test_FlowImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_Flow()
   * @generated
   */
  int TEST_FLOW = 12;

  /**
   * The feature id for the '<em><b>Step</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FLOW__STEP = 0;

  /**
   * The number of structural features of the '<em>Test Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FLOW_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Test_Step_ElementImpl <em>Test Step Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Test_Step_ElementImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_Step_Element()
   * @generated
   */
  int TEST_STEP_ELEMENT = 14;

  /**
   * The number of structural features of the '<em>Test Step Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_STEP_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Test_StepImpl <em>Test Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Test_StepImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_Step()
   * @generated
   */
  int TEST_STEP = 13;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_STEP__ELEMENTS = TEST_STEP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Test Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_STEP_FEATURE_COUNT = TEST_STEP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.AssertionImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 15;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__INPUT = TEST_STEP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = TEST_STEP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Assert_FalseImpl <em>Assert False</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Assert_FalseImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getAssert_False()
   * @generated
   */
  int ASSERT_FALSE = 16;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FALSE__INPUT = ASSERTION__INPUT;

  /**
   * The number of structural features of the '<em>Assert False</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FALSE_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Assert_TrueImpl <em>Assert True</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Assert_TrueImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getAssert_True()
   * @generated
   */
  int ASSERT_TRUE = 17;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_TRUE__INPUT = ASSERTION__INPUT;

  /**
   * The number of structural features of the '<em>Assert True</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_TRUE_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.ConditionImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 18;

  /**
   * The feature id for the '<em><b>Refactoring</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__REFACTORING = TEST_STEP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>True steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__TRUE_STEPS = TEST_STEP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Warning</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__WARNING = TEST_STEP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>False steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__FALSE_STEPS = TEST_STEP_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = TEST_STEP_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Expect_TrueImpl <em>Expect True</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Expect_TrueImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getExpect_True()
   * @generated
   */
  int EXPECT_TRUE = 19;

  /**
   * The feature id for the '<em><b>Refactoring</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_TRUE__REFACTORING = CONDITION__REFACTORING;

  /**
   * The feature id for the '<em><b>True steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_TRUE__TRUE_STEPS = CONDITION__TRUE_STEPS;

  /**
   * The feature id for the '<em><b>Warning</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_TRUE__WARNING = CONDITION__WARNING;

  /**
   * The feature id for the '<em><b>False steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_TRUE__FALSE_STEPS = CONDITION__FALSE_STEPS;

  /**
   * The number of structural features of the '<em>Expect True</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_TRUE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Expect_FalseImpl <em>Expect False</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Expect_FalseImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getExpect_False()
   * @generated
   */
  int EXPECT_FALSE = 20;

  /**
   * The feature id for the '<em><b>Refactoring</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_FALSE__REFACTORING = CONDITION__REFACTORING;

  /**
   * The feature id for the '<em><b>True steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_FALSE__TRUE_STEPS = CONDITION__TRUE_STEPS;

  /**
   * The feature id for the '<em><b>Warning</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_FALSE__WARNING = CONDITION__WARNING;

  /**
   * The feature id for the '<em><b>False steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_FALSE__FALSE_STEPS = CONDITION__FALSE_STEPS;

  /**
   * The number of structural features of the '<em>Expect False</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPECT_FALSE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.WarningImpl <em>Warning</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.WarningImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getWarning()
   * @generated
   */
  int WARNING = 21;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARNING__MESSAGE = 0;

  /**
   * The number of structural features of the '<em>Warning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARNING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.CompileImpl <em>Compile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.CompileImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getCompile()
   * @generated
   */
  int COMPILE = 22;

  /**
   * The number of structural features of the '<em>Compile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILE_FEATURE_COUNT = TEST_STEP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.SynchronizeImpl <em>Synchronize</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.SynchronizeImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getSynchronize()
   * @generated
   */
  int SYNCHRONIZE = 23;

  /**
   * The number of structural features of the '<em>Synchronize</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZE_FEATURE_COUNT = TEST_STEP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.No_RefactoringImpl <em>No Refactoring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.No_RefactoringImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getNo_Refactoring()
   * @generated
   */
  int NO_REFACTORING = 24;

  /**
   * The number of structural features of the '<em>No Refactoring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_REFACTORING_FEATURE_COUNT = REFACTORING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Propose_RefactoringImpl <em>Propose Refactoring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Propose_RefactoringImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getPropose_Refactoring()
   * @generated
   */
  int PROPOSE_REFACTORING = 25;

  /**
   * The feature id for the '<em><b>Refactoring</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSE_REFACTORING__REFACTORING = 0;

  /**
   * The number of structural features of the '<em>Propose Refactoring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSE_REFACTORING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Propose_Pullup_Method_RefactoringImpl <em>Propose Pullup Method Refactoring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Propose_Pullup_Method_RefactoringImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getPropose_Pullup_Method_Refactoring()
   * @generated
   */
  int PROPOSE_PULLUP_METHOD_REFACTORING = 26;

  /**
   * The feature id for the '<em><b>Refactoring</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSE_PULLUP_METHOD_REFACTORING__REFACTORING = PROPOSE_REFACTORING__REFACTORING;

  /**
   * The number of structural features of the '<em>Propose Pullup Method Refactoring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSE_PULLUP_METHOD_REFACTORING_FEATURE_COUNT = PROPOSE_REFACTORING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Propose_Create_Superclass_RefactoringImpl <em>Propose Create Superclass Refactoring</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Propose_Create_Superclass_RefactoringImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getPropose_Create_Superclass_Refactoring()
   * @generated
   */
  int PROPOSE_CREATE_SUPERCLASS_REFACTORING = 27;

  /**
   * The feature id for the '<em><b>Refactoring</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSE_CREATE_SUPERCLASS_REFACTORING__REFACTORING = PROPOSE_REFACTORING__REFACTORING;

  /**
   * The number of structural features of the '<em>Propose Create Superclass Refactoring</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSE_CREATE_SUPERCLASS_REFACTORING_FEATURE_COUNT = PROPOSE_REFACTORING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.ContainmentImpl <em>Containment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.ContainmentImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getContainment()
   * @generated
   */
  int CONTAINMENT = 28;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT__CLASS = TEST_STEP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contains</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT__CONTAINS = TEST_STEP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Containment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_FEATURE_COUNT = TEST_STEP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.ContainsImpl <em>Contains</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.ContainsImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getContains()
   * @generated
   */
  int CONTAINS = 30;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS__CLASS = CONTAINMENT__CLASS;

  /**
   * The feature id for the '<em><b>Contains</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS__CONTAINS = CONTAINMENT__CONTAINS;

  /**
   * The number of structural features of the '<em>Contains</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS_FEATURE_COUNT = CONTAINMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Contains_NotImpl <em>Contains Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Contains_NotImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getContains_Not()
   * @generated
   */
  int CONTAINS_NOT = 31;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS_NOT__CLASS = CONTAINMENT__CLASS;

  /**
   * The feature id for the '<em><b>Contains</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS_NOT__CONTAINS = CONTAINMENT__CONTAINS;

  /**
   * The number of structural features of the '<em>Contains Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS_NOT_FEATURE_COUNT = CONTAINMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.ImplementationImpl <em>Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.ImplementationImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getImplementation()
   * @generated
   */
  int IMPLEMENTATION = 32;

  /**
   * The feature id for the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION__CHILD = TEST_STEP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION__PARENT = TEST_STEP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_FEATURE_COUNT = TEST_STEP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.ImplementsImpl <em>Implements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.ImplementsImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getImplements()
   * @generated
   */
  int IMPLEMENTS = 33;

  /**
   * The feature id for the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS__CHILD = IMPLEMENTATION__CHILD;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS__PARENT = IMPLEMENTATION__PARENT;

  /**
   * The number of structural features of the '<em>Implements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ttc.testdsl.tTCTest.impl.Implements_NotImpl <em>Implements Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ttc.testdsl.tTCTest.impl.Implements_NotImpl
   * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getImplements_Not()
   * @generated
   */
  int IMPLEMENTS_NOT = 34;

  /**
   * The feature id for the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_NOT__CHILD = IMPLEMENTATION__CHILD;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_NOT__PARENT = IMPLEMENTATION__PARENT;

  /**
   * The number of structural features of the '<em>Implements Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_NOT_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Test_File <em>Test File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test File</em>'.
   * @see ttc.testdsl.tTCTest.Test_File
   * @generated
   */
  EClass getTest_File();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Test_File#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ttc.testdsl.tTCTest.Test_File#getName()
   * @see #getTest_File()
   * @generated
   */
  EAttribute getTest_File_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Test_File#getTest_cases <em>Test cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Test cases</em>'.
   * @see ttc.testdsl.tTCTest.Test_File#getTest_cases()
   * @see #getTest_File()
   * @generated
   */
  EReference getTest_File_Test_cases();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Test_File#getJava_class <em>Java class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Java class</em>'.
   * @see ttc.testdsl.tTCTest.Test_File#getJava_class()
   * @see #getTest_File()
   * @generated
   */
  EReference getTest_File_Java_class();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Test_File#getJava_classes <em>Java classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Java classes</em>'.
   * @see ttc.testdsl.tTCTest.Test_File#getJava_classes()
   * @see #getTest_File()
   * @generated
   */
  EReference getTest_File_Java_classes();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Test_File#getJava_method <em>Java method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Java method</em>'.
   * @see ttc.testdsl.tTCTest.Test_File#getJava_method()
   * @see #getTest_File()
   * @generated
   */
  EReference getTest_File_Java_method();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Test_File#getRefactorings <em>Refactorings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refactorings</em>'.
   * @see ttc.testdsl.tTCTest.Test_File#getRefactorings()
   * @see #getTest_File()
   * @generated
   */
  EReference getTest_File_Refactorings();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Java_Class <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Class</em>'.
   * @see ttc.testdsl.tTCTest.Java_Class
   * @generated
   */
  EClass getJava_Class();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Java_Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ttc.testdsl.tTCTest.Java_Class#getName()
   * @see #getJava_Class()
   * @generated
   */
  EAttribute getJava_Class_Name();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Java_Class#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see ttc.testdsl.tTCTest.Java_Class#getPackage()
   * @see #getJava_Class()
   * @generated
   */
  EAttribute getJava_Class_Package();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Java_Class#getClass_name <em>Class name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class name</em>'.
   * @see ttc.testdsl.tTCTest.Java_Class#getClass_name()
   * @see #getJava_Class()
   * @generated
   */
  EAttribute getJava_Class_Class_name();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Classes <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classes</em>'.
   * @see ttc.testdsl.tTCTest.Classes
   * @generated
   */
  EClass getClasses();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Classes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ttc.testdsl.tTCTest.Classes#getName()
   * @see #getClasses()
   * @generated
   */
  EAttribute getClasses_Name();

  /**
   * Returns the meta object for the reference list '{@link ttc.testdsl.tTCTest.Classes#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Classes</em>'.
   * @see ttc.testdsl.tTCTest.Classes#getClasses()
   * @see #getClasses()
   * @generated
   */
  EReference getClasses_Classes();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Java_Method <em>Java Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Method</em>'.
   * @see ttc.testdsl.tTCTest.Java_Method
   * @generated
   */
  EClass getJava_Method();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Java_Method#getMethod_name <em>Method name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method name</em>'.
   * @see ttc.testdsl.tTCTest.Java_Method#getMethod_name()
   * @see #getJava_Method()
   * @generated
   */
  EAttribute getJava_Method_Method_name();

  /**
   * Returns the meta object for the reference list '{@link ttc.testdsl.tTCTest.Java_Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Params</em>'.
   * @see ttc.testdsl.tTCTest.Java_Method#getParams()
   * @see #getJava_Method()
   * @generated
   */
  EReference getJava_Method_Params();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Methods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methods</em>'.
   * @see ttc.testdsl.tTCTest.Methods
   * @generated
   */
  EClass getMethods();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Methods#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ttc.testdsl.tTCTest.Methods#getName()
   * @see #getMethods()
   * @generated
   */
  EAttribute getMethods_Name();

  /**
   * Returns the meta object for the reference list '{@link ttc.testdsl.tTCTest.Methods#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Methods</em>'.
   * @see ttc.testdsl.tTCTest.Methods#getMethods()
   * @see #getMethods()
   * @generated
   */
  EReference getMethods_Methods();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Java_Field <em>Java Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Field</em>'.
   * @see ttc.testdsl.tTCTest.Java_Field
   * @generated
   */
  EClass getJava_Field();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Java_Field#getField_name <em>Field name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field name</em>'.
   * @see ttc.testdsl.tTCTest.Java_Field#getField_name()
   * @see #getJava_Field()
   * @generated
   */
  EAttribute getJava_Field_Field_name();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Java_Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see ttc.testdsl.tTCTest.Java_Field#getType()
   * @see #getJava_Field()
   * @generated
   */
  EReference getJava_Field_Type();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Fields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fields</em>'.
   * @see ttc.testdsl.tTCTest.Fields
   * @generated
   */
  EClass getFields();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Fields#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ttc.testdsl.tTCTest.Fields#getName()
   * @see #getFields()
   * @generated
   */
  EAttribute getFields_Name();

  /**
   * Returns the meta object for the reference list '{@link ttc.testdsl.tTCTest.Fields#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Fields</em>'.
   * @see ttc.testdsl.tTCTest.Fields#getFields()
   * @see #getFields()
   * @generated
   */
  EReference getFields_Fields();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Test_Case <em>Test Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Case</em>'.
   * @see ttc.testdsl.tTCTest.Test_Case
   * @generated
   */
  EClass getTest_Case();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Test_Case#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ttc.testdsl.tTCTest.Test_Case#getName()
   * @see #getTest_Case()
   * @generated
   */
  EAttribute getTest_Case_Name();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Test_Case#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ttc.testdsl.tTCTest.Test_Case#getDescription()
   * @see #getTest_Case()
   * @generated
   */
  EAttribute getTest_Case_Description();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Test_Case#getJava_program <em>Java program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java program</em>'.
   * @see ttc.testdsl.tTCTest.Test_Case#getJava_program()
   * @see #getTest_Case()
   * @generated
   */
  EAttribute getTest_Case_Java_program();

  /**
   * Returns the meta object for the containment reference '{@link ttc.testdsl.tTCTest.Test_Case#getTest_flow <em>Test flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test flow</em>'.
   * @see ttc.testdsl.tTCTest.Test_Case#getTest_flow()
   * @see #getTest_Case()
   * @generated
   */
  EReference getTest_Case_Test_flow();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Refactoring_Instance <em>Refactoring Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refactoring Instance</em>'.
   * @see ttc.testdsl.tTCTest.Refactoring_Instance
   * @generated
   */
  EClass getRefactoring_Instance();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Refactoring_Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ttc.testdsl.tTCTest.Refactoring_Instance#getName()
   * @see #getRefactoring_Instance()
   * @generated
   */
  EAttribute getRefactoring_Instance_Name();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Refactoring <em>Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.Refactoring
   * @generated
   */
  EClass getRefactoring();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Pull_Up_Refactoring <em>Pull Up Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pull Up Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.Pull_Up_Refactoring
   * @generated
   */
  EClass getPull_Up_Refactoring();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Pull_Up_Refactoring#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see ttc.testdsl.tTCTest.Pull_Up_Refactoring#getParent()
   * @see #getPull_Up_Refactoring()
   * @generated
   */
  EReference getPull_Up_Refactoring_Parent();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Pull_Up_Refactoring#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see ttc.testdsl.tTCTest.Pull_Up_Refactoring#getMethod()
   * @see #getPull_Up_Refactoring()
   * @generated
   */
  EReference getPull_Up_Refactoring_Method();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Create_Superclass_Refactoring <em>Create Superclass Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Superclass Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.Create_Superclass_Refactoring
   * @generated
   */
  EClass getCreate_Superclass_Refactoring();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Create_Superclass_Refactoring#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Child</em>'.
   * @see ttc.testdsl.tTCTest.Create_Superclass_Refactoring#getChild()
   * @see #getCreate_Superclass_Refactoring()
   * @generated
   */
  EReference getCreate_Superclass_Refactoring_Child();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Create_Superclass_Refactoring#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see ttc.testdsl.tTCTest.Create_Superclass_Refactoring#getTarget()
   * @see #getCreate_Superclass_Refactoring()
   * @generated
   */
  EReference getCreate_Superclass_Refactoring_Target();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Test_Flow <em>Test Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Flow</em>'.
   * @see ttc.testdsl.tTCTest.Test_Flow
   * @generated
   */
  EClass getTest_Flow();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Test_Flow#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Step</em>'.
   * @see ttc.testdsl.tTCTest.Test_Flow#getStep()
   * @see #getTest_Flow()
   * @generated
   */
  EReference getTest_Flow_Step();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Test_Step <em>Test Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Step</em>'.
   * @see ttc.testdsl.tTCTest.Test_Step
   * @generated
   */
  EClass getTest_Step();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Test_Step#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see ttc.testdsl.tTCTest.Test_Step#getElements()
   * @see #getTest_Step()
   * @generated
   */
  EReference getTest_Step_Elements();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Test_Step_Element <em>Test Step Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Step Element</em>'.
   * @see ttc.testdsl.tTCTest.Test_Step_Element
   * @generated
   */
  EClass getTest_Step_Element();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see ttc.testdsl.tTCTest.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Assertion#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input</em>'.
   * @see ttc.testdsl.tTCTest.Assertion#getInput()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Input();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Assert_False <em>Assert False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert False</em>'.
   * @see ttc.testdsl.tTCTest.Assert_False
   * @generated
   */
  EClass getAssert_False();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Assert_True <em>Assert True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert True</em>'.
   * @see ttc.testdsl.tTCTest.Assert_True
   * @generated
   */
  EClass getAssert_True();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see ttc.testdsl.tTCTest.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Condition#getRefactoring <em>Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.Condition#getRefactoring()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Refactoring();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Condition#getTrue_steps <em>True steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>True steps</em>'.
   * @see ttc.testdsl.tTCTest.Condition#getTrue_steps()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_True_steps();

  /**
   * Returns the meta object for the containment reference '{@link ttc.testdsl.tTCTest.Condition#getWarning <em>Warning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Warning</em>'.
   * @see ttc.testdsl.tTCTest.Condition#getWarning()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Warning();

  /**
   * Returns the meta object for the containment reference list '{@link ttc.testdsl.tTCTest.Condition#getFalse_steps <em>False steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>False steps</em>'.
   * @see ttc.testdsl.tTCTest.Condition#getFalse_steps()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_False_steps();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Expect_True <em>Expect True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expect True</em>'.
   * @see ttc.testdsl.tTCTest.Expect_True
   * @generated
   */
  EClass getExpect_True();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Expect_False <em>Expect False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expect False</em>'.
   * @see ttc.testdsl.tTCTest.Expect_False
   * @generated
   */
  EClass getExpect_False();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Warning <em>Warning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Warning</em>'.
   * @see ttc.testdsl.tTCTest.Warning
   * @generated
   */
  EClass getWarning();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Warning#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see ttc.testdsl.tTCTest.Warning#getMessage()
   * @see #getWarning()
   * @generated
   */
  EAttribute getWarning_Message();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Compile <em>Compile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compile</em>'.
   * @see ttc.testdsl.tTCTest.Compile
   * @generated
   */
  EClass getCompile();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Synchronize <em>Synchronize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Synchronize</em>'.
   * @see ttc.testdsl.tTCTest.Synchronize
   * @generated
   */
  EClass getSynchronize();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.No_Refactoring <em>No Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.No_Refactoring
   * @generated
   */
  EClass getNo_Refactoring();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Propose_Refactoring <em>Propose Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Propose Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.Propose_Refactoring
   * @generated
   */
  EClass getPropose_Refactoring();

  /**
   * Returns the meta object for the containment reference '{@link ttc.testdsl.tTCTest.Propose_Refactoring#getRefactoring <em>Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.Propose_Refactoring#getRefactoring()
   * @see #getPropose_Refactoring()
   * @generated
   */
  EReference getPropose_Refactoring_Refactoring();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Propose_Pullup_Method_Refactoring <em>Propose Pullup Method Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Propose Pullup Method Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.Propose_Pullup_Method_Refactoring
   * @generated
   */
  EClass getPropose_Pullup_Method_Refactoring();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Propose_Create_Superclass_Refactoring <em>Propose Create Superclass Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Propose Create Superclass Refactoring</em>'.
   * @see ttc.testdsl.tTCTest.Propose_Create_Superclass_Refactoring
   * @generated
   */
  EClass getPropose_Create_Superclass_Refactoring();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Containment <em>Containment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Containment</em>'.
   * @see ttc.testdsl.tTCTest.Containment
   * @generated
   */
  EClass getContainment();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Containment#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class</em>'.
   * @see ttc.testdsl.tTCTest.Containment#getClass_()
   * @see #getContainment()
   * @generated
   */
  EReference getContainment_Class();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Containment#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Contains</em>'.
   * @see ttc.testdsl.tTCTest.Containment#getContains()
   * @see #getContainment()
   * @generated
   */
  EReference getContainment_Contains();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Class_Element <em>Class Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Element</em>'.
   * @see ttc.testdsl.tTCTest.Class_Element
   * @generated
   */
  EClass getClass_Element();

  /**
   * Returns the meta object for the attribute '{@link ttc.testdsl.tTCTest.Class_Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ttc.testdsl.tTCTest.Class_Element#getName()
   * @see #getClass_Element()
   * @generated
   */
  EAttribute getClass_Element_Name();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Contains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contains</em>'.
   * @see ttc.testdsl.tTCTest.Contains
   * @generated
   */
  EClass getContains();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Contains_Not <em>Contains Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contains Not</em>'.
   * @see ttc.testdsl.tTCTest.Contains_Not
   * @generated
   */
  EClass getContains_Not();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Implementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implementation</em>'.
   * @see ttc.testdsl.tTCTest.Implementation
   * @generated
   */
  EClass getImplementation();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Implementation#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Child</em>'.
   * @see ttc.testdsl.tTCTest.Implementation#getChild()
   * @see #getImplementation()
   * @generated
   */
  EReference getImplementation_Child();

  /**
   * Returns the meta object for the reference '{@link ttc.testdsl.tTCTest.Implementation#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see ttc.testdsl.tTCTest.Implementation#getParent()
   * @see #getImplementation()
   * @generated
   */
  EReference getImplementation_Parent();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Implements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements</em>'.
   * @see ttc.testdsl.tTCTest.Implements
   * @generated
   */
  EClass getImplements();

  /**
   * Returns the meta object for class '{@link ttc.testdsl.tTCTest.Implements_Not <em>Implements Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements Not</em>'.
   * @see ttc.testdsl.tTCTest.Implements_Not
   * @generated
   */
  EClass getImplements_Not();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TTCTestFactory getTTCTestFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Test_FileImpl <em>Test File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Test_FileImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_File()
     * @generated
     */
    EClass TEST_FILE = eINSTANCE.getTest_File();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_FILE__NAME = eINSTANCE.getTest_File_Name();

    /**
     * The meta object literal for the '<em><b>Test cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_FILE__TEST_CASES = eINSTANCE.getTest_File_Test_cases();

    /**
     * The meta object literal for the '<em><b>Java class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_FILE__JAVA_CLASS = eINSTANCE.getTest_File_Java_class();

    /**
     * The meta object literal for the '<em><b>Java classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_FILE__JAVA_CLASSES = eINSTANCE.getTest_File_Java_classes();

    /**
     * The meta object literal for the '<em><b>Java method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_FILE__JAVA_METHOD = eINSTANCE.getTest_File_Java_method();

    /**
     * The meta object literal for the '<em><b>Refactorings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_FILE__REFACTORINGS = eINSTANCE.getTest_File_Refactorings();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Java_ClassImpl <em>Java Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Java_ClassImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getJava_Class()
     * @generated
     */
    EClass JAVA_CLASS = eINSTANCE.getJava_Class();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CLASS__NAME = eINSTANCE.getJava_Class_Name();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CLASS__PACKAGE = eINSTANCE.getJava_Class_Package();

    /**
     * The meta object literal for the '<em><b>Class name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CLASS__CLASS_NAME = eINSTANCE.getJava_Class_Class_name();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.ClassesImpl <em>Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.ClassesImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getClasses()
     * @generated
     */
    EClass CLASSES = eINSTANCE.getClasses();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSES__NAME = eINSTANCE.getClasses_Name();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSES__CLASSES = eINSTANCE.getClasses_Classes();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Java_MethodImpl <em>Java Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Java_MethodImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getJava_Method()
     * @generated
     */
    EClass JAVA_METHOD = eINSTANCE.getJava_Method();

    /**
     * The meta object literal for the '<em><b>Method name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_METHOD__METHOD_NAME = eINSTANCE.getJava_Method_Method_name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JAVA_METHOD__PARAMS = eINSTANCE.getJava_Method_Params();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.MethodsImpl <em>Methods</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.MethodsImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getMethods()
     * @generated
     */
    EClass METHODS = eINSTANCE.getMethods();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHODS__NAME = eINSTANCE.getMethods_Name();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHODS__METHODS = eINSTANCE.getMethods_Methods();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Java_FieldImpl <em>Java Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Java_FieldImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getJava_Field()
     * @generated
     */
    EClass JAVA_FIELD = eINSTANCE.getJava_Field();

    /**
     * The meta object literal for the '<em><b>Field name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_FIELD__FIELD_NAME = eINSTANCE.getJava_Field_Field_name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JAVA_FIELD__TYPE = eINSTANCE.getJava_Field_Type();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.FieldsImpl <em>Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.FieldsImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getFields()
     * @generated
     */
    EClass FIELDS = eINSTANCE.getFields();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELDS__NAME = eINSTANCE.getFields_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELDS__FIELDS = eINSTANCE.getFields_Fields();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Test_CaseImpl <em>Test Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Test_CaseImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_Case()
     * @generated
     */
    EClass TEST_CASE = eINSTANCE.getTest_Case();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_CASE__NAME = eINSTANCE.getTest_Case_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_CASE__DESCRIPTION = eINSTANCE.getTest_Case_Description();

    /**
     * The meta object literal for the '<em><b>Java program</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_CASE__JAVA_PROGRAM = eINSTANCE.getTest_Case_Java_program();

    /**
     * The meta object literal for the '<em><b>Test flow</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE__TEST_FLOW = eINSTANCE.getTest_Case_Test_flow();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Refactoring_InstanceImpl <em>Refactoring Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Refactoring_InstanceImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getRefactoring_Instance()
     * @generated
     */
    EClass REFACTORING_INSTANCE = eINSTANCE.getRefactoring_Instance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFACTORING_INSTANCE__NAME = eINSTANCE.getRefactoring_Instance_Name();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.RefactoringImpl <em>Refactoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.RefactoringImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getRefactoring()
     * @generated
     */
    EClass REFACTORING = eINSTANCE.getRefactoring();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Pull_Up_RefactoringImpl <em>Pull Up Refactoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Pull_Up_RefactoringImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getPull_Up_Refactoring()
     * @generated
     */
    EClass PULL_UP_REFACTORING = eINSTANCE.getPull_Up_Refactoring();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PULL_UP_REFACTORING__PARENT = eINSTANCE.getPull_Up_Refactoring_Parent();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PULL_UP_REFACTORING__METHOD = eINSTANCE.getPull_Up_Refactoring_Method();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Create_Superclass_RefactoringImpl <em>Create Superclass Refactoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Create_Superclass_RefactoringImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getCreate_Superclass_Refactoring()
     * @generated
     */
    EClass CREATE_SUPERCLASS_REFACTORING = eINSTANCE.getCreate_Superclass_Refactoring();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_SUPERCLASS_REFACTORING__CHILD = eINSTANCE.getCreate_Superclass_Refactoring_Child();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_SUPERCLASS_REFACTORING__TARGET = eINSTANCE.getCreate_Superclass_Refactoring_Target();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Test_FlowImpl <em>Test Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Test_FlowImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_Flow()
     * @generated
     */
    EClass TEST_FLOW = eINSTANCE.getTest_Flow();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_FLOW__STEP = eINSTANCE.getTest_Flow_Step();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Test_StepImpl <em>Test Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Test_StepImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_Step()
     * @generated
     */
    EClass TEST_STEP = eINSTANCE.getTest_Step();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_STEP__ELEMENTS = eINSTANCE.getTest_Step_Elements();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Test_Step_ElementImpl <em>Test Step Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Test_Step_ElementImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getTest_Step_Element()
     * @generated
     */
    EClass TEST_STEP_ELEMENT = eINSTANCE.getTest_Step_Element();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.AssertionImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__INPUT = eINSTANCE.getAssertion_Input();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Assert_FalseImpl <em>Assert False</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Assert_FalseImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getAssert_False()
     * @generated
     */
    EClass ASSERT_FALSE = eINSTANCE.getAssert_False();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Assert_TrueImpl <em>Assert True</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Assert_TrueImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getAssert_True()
     * @generated
     */
    EClass ASSERT_TRUE = eINSTANCE.getAssert_True();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.ConditionImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Refactoring</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__REFACTORING = eINSTANCE.getCondition_Refactoring();

    /**
     * The meta object literal for the '<em><b>True steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__TRUE_STEPS = eINSTANCE.getCondition_True_steps();

    /**
     * The meta object literal for the '<em><b>Warning</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__WARNING = eINSTANCE.getCondition_Warning();

    /**
     * The meta object literal for the '<em><b>False steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__FALSE_STEPS = eINSTANCE.getCondition_False_steps();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Expect_TrueImpl <em>Expect True</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Expect_TrueImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getExpect_True()
     * @generated
     */
    EClass EXPECT_TRUE = eINSTANCE.getExpect_True();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Expect_FalseImpl <em>Expect False</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Expect_FalseImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getExpect_False()
     * @generated
     */
    EClass EXPECT_FALSE = eINSTANCE.getExpect_False();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.WarningImpl <em>Warning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.WarningImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getWarning()
     * @generated
     */
    EClass WARNING = eINSTANCE.getWarning();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WARNING__MESSAGE = eINSTANCE.getWarning_Message();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.CompileImpl <em>Compile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.CompileImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getCompile()
     * @generated
     */
    EClass COMPILE = eINSTANCE.getCompile();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.SynchronizeImpl <em>Synchronize</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.SynchronizeImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getSynchronize()
     * @generated
     */
    EClass SYNCHRONIZE = eINSTANCE.getSynchronize();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.No_RefactoringImpl <em>No Refactoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.No_RefactoringImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getNo_Refactoring()
     * @generated
     */
    EClass NO_REFACTORING = eINSTANCE.getNo_Refactoring();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Propose_RefactoringImpl <em>Propose Refactoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Propose_RefactoringImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getPropose_Refactoring()
     * @generated
     */
    EClass PROPOSE_REFACTORING = eINSTANCE.getPropose_Refactoring();

    /**
     * The meta object literal for the '<em><b>Refactoring</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPOSE_REFACTORING__REFACTORING = eINSTANCE.getPropose_Refactoring_Refactoring();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Propose_Pullup_Method_RefactoringImpl <em>Propose Pullup Method Refactoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Propose_Pullup_Method_RefactoringImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getPropose_Pullup_Method_Refactoring()
     * @generated
     */
    EClass PROPOSE_PULLUP_METHOD_REFACTORING = eINSTANCE.getPropose_Pullup_Method_Refactoring();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Propose_Create_Superclass_RefactoringImpl <em>Propose Create Superclass Refactoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Propose_Create_Superclass_RefactoringImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getPropose_Create_Superclass_Refactoring()
     * @generated
     */
    EClass PROPOSE_CREATE_SUPERCLASS_REFACTORING = eINSTANCE.getPropose_Create_Superclass_Refactoring();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.ContainmentImpl <em>Containment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.ContainmentImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getContainment()
     * @generated
     */
    EClass CONTAINMENT = eINSTANCE.getContainment();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINMENT__CLASS = eINSTANCE.getContainment_Class();

    /**
     * The meta object literal for the '<em><b>Contains</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINMENT__CONTAINS = eINSTANCE.getContainment_Contains();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Class_ElementImpl <em>Class Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Class_ElementImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getClass_Element()
     * @generated
     */
    EClass CLASS_ELEMENT = eINSTANCE.getClass_Element();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_ELEMENT__NAME = eINSTANCE.getClass_Element_Name();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.ContainsImpl <em>Contains</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.ContainsImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getContains()
     * @generated
     */
    EClass CONTAINS = eINSTANCE.getContains();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Contains_NotImpl <em>Contains Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Contains_NotImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getContains_Not()
     * @generated
     */
    EClass CONTAINS_NOT = eINSTANCE.getContains_Not();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.ImplementationImpl <em>Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.ImplementationImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getImplementation()
     * @generated
     */
    EClass IMPLEMENTATION = eINSTANCE.getImplementation();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION__CHILD = eINSTANCE.getImplementation_Child();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION__PARENT = eINSTANCE.getImplementation_Parent();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.ImplementsImpl <em>Implements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.ImplementsImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getImplements()
     * @generated
     */
    EClass IMPLEMENTS = eINSTANCE.getImplements();

    /**
     * The meta object literal for the '{@link ttc.testdsl.tTCTest.impl.Implements_NotImpl <em>Implements Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ttc.testdsl.tTCTest.impl.Implements_NotImpl
     * @see ttc.testdsl.tTCTest.impl.TTCTestPackageImpl#getImplements_Not()
     * @generated
     */
    EClass IMPLEMENTS_NOT = eINSTANCE.getImplements_Not();

  }

} //TTCTestPackage
