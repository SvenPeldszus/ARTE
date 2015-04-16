/**
 */
package ttc.testdsl.tTCTest.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ttc.testdsl.tTCTest.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ttc.testdsl.tTCTest.TTCTestPackage
 * @generated
 */
public class TTCTestSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TTCTestPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTCTestSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TTCTestPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TTCTestPackage.TEST_FILE:
      {
        Test_File test_File = (Test_File)theEObject;
        T result = caseTest_File(test_File);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.JAVA_CLASS:
      {
        Java_Class java_Class = (Java_Class)theEObject;
        T result = caseJava_Class(java_Class);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.CLASSES:
      {
        Classes classes = (Classes)theEObject;
        T result = caseClasses(classes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.JAVA_METHOD:
      {
        Java_Method java_Method = (Java_Method)theEObject;
        T result = caseJava_Method(java_Method);
        if (result == null) result = caseClass_Element(java_Method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.METHODS:
      {
        Methods methods = (Methods)theEObject;
        T result = caseMethods(methods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.JAVA_FIELD:
      {
        Java_Field java_Field = (Java_Field)theEObject;
        T result = caseJava_Field(java_Field);
        if (result == null) result = caseClass_Element(java_Field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.FIELDS:
      {
        Fields fields = (Fields)theEObject;
        T result = caseFields(fields);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.TEST_CASE:
      {
        Test_Case test_Case = (Test_Case)theEObject;
        T result = caseTest_Case(test_Case);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.REFACTORING_INSTANCE:
      {
        Refactoring_Instance refactoring_Instance = (Refactoring_Instance)theEObject;
        T result = caseRefactoring_Instance(refactoring_Instance);
        if (result == null) result = caseRefactoring(refactoring_Instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.REFACTORING:
      {
        Refactoring refactoring = (Refactoring)theEObject;
        T result = caseRefactoring(refactoring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.PULL_UP_REFACTORING:
      {
        Pull_Up_Refactoring pull_Up_Refactoring = (Pull_Up_Refactoring)theEObject;
        T result = casePull_Up_Refactoring(pull_Up_Refactoring);
        if (result == null) result = caseRefactoring_Instance(pull_Up_Refactoring);
        if (result == null) result = caseRefactoring(pull_Up_Refactoring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.CREATE_SUPERCLASS_REFACTORING:
      {
        Create_Superclass_Refactoring create_Superclass_Refactoring = (Create_Superclass_Refactoring)theEObject;
        T result = caseCreate_Superclass_Refactoring(create_Superclass_Refactoring);
        if (result == null) result = caseRefactoring_Instance(create_Superclass_Refactoring);
        if (result == null) result = caseRefactoring(create_Superclass_Refactoring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.TEST_FLOW:
      {
        Test_Flow test_Flow = (Test_Flow)theEObject;
        T result = caseTest_Flow(test_Flow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.TEST_STEP:
      {
        Test_Step test_Step = (Test_Step)theEObject;
        T result = caseTest_Step(test_Step);
        if (result == null) result = caseTest_Step_Element(test_Step);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.TEST_STEP_ELEMENT:
      {
        Test_Step_Element test_Step_Element = (Test_Step_Element)theEObject;
        T result = caseTest_Step_Element(test_Step_Element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        T result = caseAssertion(assertion);
        if (result == null) result = caseTest_Step_Element(assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.ASSERT_FALSE:
      {
        Assert_False assert_False = (Assert_False)theEObject;
        T result = caseAssert_False(assert_False);
        if (result == null) result = caseAssertion(assert_False);
        if (result == null) result = caseTest_Step_Element(assert_False);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.ASSERT_TRUE:
      {
        Assert_True assert_True = (Assert_True)theEObject;
        T result = caseAssert_True(assert_True);
        if (result == null) result = caseAssertion(assert_True);
        if (result == null) result = caseTest_Step_Element(assert_True);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = caseTest_Step_Element(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.EXPECT_TRUE:
      {
        Expect_True expect_True = (Expect_True)theEObject;
        T result = caseExpect_True(expect_True);
        if (result == null) result = caseCondition(expect_True);
        if (result == null) result = caseTest_Step_Element(expect_True);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.EXPECT_FALSE:
      {
        Expect_False expect_False = (Expect_False)theEObject;
        T result = caseExpect_False(expect_False);
        if (result == null) result = caseCondition(expect_False);
        if (result == null) result = caseTest_Step_Element(expect_False);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.WARNING:
      {
        Warning warning = (Warning)theEObject;
        T result = caseWarning(warning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.COMPILE:
      {
        Compile compile = (Compile)theEObject;
        T result = caseCompile(compile);
        if (result == null) result = caseTest_Step_Element(compile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.SYNCHRONIZE:
      {
        Synchronize synchronize = (Synchronize)theEObject;
        T result = caseSynchronize(synchronize);
        if (result == null) result = caseTest_Step_Element(synchronize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.NO_REFACTORING:
      {
        No_Refactoring no_Refactoring = (No_Refactoring)theEObject;
        T result = caseNo_Refactoring(no_Refactoring);
        if (result == null) result = caseRefactoring(no_Refactoring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.PROPOSE_REFACTORING:
      {
        Propose_Refactoring propose_Refactoring = (Propose_Refactoring)theEObject;
        T result = casePropose_Refactoring(propose_Refactoring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.PROPOSE_PULLUP_METHOD_REFACTORING:
      {
        Propose_Pullup_Method_Refactoring propose_Pullup_Method_Refactoring = (Propose_Pullup_Method_Refactoring)theEObject;
        T result = casePropose_Pullup_Method_Refactoring(propose_Pullup_Method_Refactoring);
        if (result == null) result = casePropose_Refactoring(propose_Pullup_Method_Refactoring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.PROPOSE_CREATE_SUPERCLASS_REFACTORING:
      {
        Propose_Create_Superclass_Refactoring propose_Create_Superclass_Refactoring = (Propose_Create_Superclass_Refactoring)theEObject;
        T result = casePropose_Create_Superclass_Refactoring(propose_Create_Superclass_Refactoring);
        if (result == null) result = casePropose_Refactoring(propose_Create_Superclass_Refactoring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.CONTAINMENT:
      {
        Containment containment = (Containment)theEObject;
        T result = caseContainment(containment);
        if (result == null) result = caseTest_Step_Element(containment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.CLASS_ELEMENT:
      {
        Class_Element class_Element = (Class_Element)theEObject;
        T result = caseClass_Element(class_Element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.CONTAINS:
      {
        Contains contains = (Contains)theEObject;
        T result = caseContains(contains);
        if (result == null) result = caseContainment(contains);
        if (result == null) result = caseTest_Step_Element(contains);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.CONTAINS_NOT:
      {
        Contains_Not contains_Not = (Contains_Not)theEObject;
        T result = caseContains_Not(contains_Not);
        if (result == null) result = caseContainment(contains_Not);
        if (result == null) result = caseTest_Step_Element(contains_Not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.IMPLEMENTATION:
      {
        Implementation implementation = (Implementation)theEObject;
        T result = caseImplementation(implementation);
        if (result == null) result = caseTest_Step_Element(implementation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.IMPLEMENTS:
      {
        Implements implements_ = (Implements)theEObject;
        T result = caseImplements(implements_);
        if (result == null) result = caseImplementation(implements_);
        if (result == null) result = caseTest_Step_Element(implements_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TTCTestPackage.IMPLEMENTS_NOT:
      {
        Implements_Not implements_Not = (Implements_Not)theEObject;
        T result = caseImplements_Not(implements_Not);
        if (result == null) result = caseImplementation(implements_Not);
        if (result == null) result = caseTest_Step_Element(implements_Not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTest_File(Test_File object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJava_Class(Java_Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClasses(Classes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJava_Method(Java_Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Methods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Methods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethods(Methods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJava_Field(Java_Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fields</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fields</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFields(Fields object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTest_Case(Test_Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refactoring Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refactoring Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefactoring_Instance(Refactoring_Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refactoring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refactoring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefactoring(Refactoring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pull Up Refactoring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pull Up Refactoring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePull_Up_Refactoring(Pull_Up_Refactoring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Superclass Refactoring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Superclass Refactoring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreate_Superclass_Refactoring(Create_Superclass_Refactoring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTest_Flow(Test_Flow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTest_Step(Test_Step object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Step Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Step Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTest_Step_Element(Test_Step_Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertion(Assertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert False</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert False</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssert_False(Assert_False object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert True</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert True</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssert_True(Assert_True object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expect True</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expect True</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpect_True(Expect_True object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expect False</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expect False</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpect_False(Expect_False object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Warning</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Warning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWarning(Warning object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compile</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compile</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompile(Compile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Synchronize</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Synchronize</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSynchronize(Synchronize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Refactoring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Refactoring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNo_Refactoring(No_Refactoring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Propose Refactoring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Propose Refactoring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropose_Refactoring(Propose_Refactoring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Propose Pullup Method Refactoring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Propose Pullup Method Refactoring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropose_Pullup_Method_Refactoring(Propose_Pullup_Method_Refactoring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Propose Create Superclass Refactoring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Propose Create Superclass Refactoring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropose_Create_Superclass_Refactoring(Propose_Create_Superclass_Refactoring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Containment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Containment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainment(Containment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass_Element(Class_Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContains(Contains object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contains Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contains Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContains_Not(Contains_Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementation(Implementation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplements(Implements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implements Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implements Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplements_Not(Implements_Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TTCTestSwitch
