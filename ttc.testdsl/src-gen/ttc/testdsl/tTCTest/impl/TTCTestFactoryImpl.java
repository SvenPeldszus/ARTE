/**
 */
package ttc.testdsl.tTCTest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ttc.testdsl.tTCTest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TTCTestFactoryImpl extends EFactoryImpl implements TTCTestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TTCTestFactory init()
  {
    try
    {
      TTCTestFactory theTTCTestFactory = (TTCTestFactory)EPackage.Registry.INSTANCE.getEFactory(TTCTestPackage.eNS_URI);
      if (theTTCTestFactory != null)
      {
        return theTTCTestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TTCTestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTCTestFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TTCTestPackage.TEST_FILE: return createTest_File();
      case TTCTestPackage.JAVA_CLASS: return createJava_Class();
      case TTCTestPackage.CLASSES: return createClasses();
      case TTCTestPackage.JAVA_METHOD: return createJava_Method();
      case TTCTestPackage.METHODS: return createMethods();
      case TTCTestPackage.JAVA_FIELD: return createJava_Field();
      case TTCTestPackage.FIELDS: return createFields();
      case TTCTestPackage.TEST_CASE: return createTest_Case();
      case TTCTestPackage.REFACTORING_INSTANCE: return createRefactoring_Instance();
      case TTCTestPackage.REFACTORING: return createRefactoring();
      case TTCTestPackage.PULL_UP_REFACTORING: return createPull_Up_Refactoring();
      case TTCTestPackage.CREATE_SUPERCLASS_REFACTORING: return createCreate_Superclass_Refactoring();
      case TTCTestPackage.TEST_FLOW: return createTest_Flow();
      case TTCTestPackage.TEST_STEP: return createTest_Step();
      case TTCTestPackage.TEST_STEP_ELEMENT: return createTest_Step_Element();
      case TTCTestPackage.ASSERTION: return createAssertion();
      case TTCTestPackage.ASSERT_FALSE: return createAssert_False();
      case TTCTestPackage.ASSERT_TRUE: return createAssert_True();
      case TTCTestPackage.CONDITION: return createCondition();
      case TTCTestPackage.EXPECT_TRUE: return createExpect_True();
      case TTCTestPackage.EXPECT_FALSE: return createExpect_False();
      case TTCTestPackage.WARNING: return createWarning();
      case TTCTestPackage.COMPILE: return createCompile();
      case TTCTestPackage.SYNCHRONIZE: return createSynchronize();
      case TTCTestPackage.NO_REFACTORING: return createNo_Refactoring();
      case TTCTestPackage.PROPOSE_REFACTORING: return createPropose_Refactoring();
      case TTCTestPackage.PROPOSE_PULLUP_METHOD_REFACTORING: return createPropose_Pullup_Method_Refactoring();
      case TTCTestPackage.PROPOSE_CREATE_SUPERCLASS_REFACTORING: return createPropose_Create_Superclass_Refactoring();
      case TTCTestPackage.CONTAINMENT: return createContainment();
      case TTCTestPackage.CLASS_ELEMENT: return createClass_Element();
      case TTCTestPackage.CONTAINS: return createContains();
      case TTCTestPackage.CONTAINS_NOT: return createContains_Not();
      case TTCTestPackage.IMPLEMENTATION: return createImplementation();
      case TTCTestPackage.IMPLEMENTS: return createImplements();
      case TTCTestPackage.IMPLEMENTS_NOT: return createImplements_Not();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test_File createTest_File()
  {
    Test_FileImpl test_File = new Test_FileImpl();
    return test_File;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Class createJava_Class()
  {
    Java_ClassImpl java_Class = new Java_ClassImpl();
    return java_Class;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classes createClasses()
  {
    ClassesImpl classes = new ClassesImpl();
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Method createJava_Method()
  {
    Java_MethodImpl java_Method = new Java_MethodImpl();
    return java_Method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methods createMethods()
  {
    MethodsImpl methods = new MethodsImpl();
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Field createJava_Field()
  {
    Java_FieldImpl java_Field = new Java_FieldImpl();
    return java_Field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fields createFields()
  {
    FieldsImpl fields = new FieldsImpl();
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test_Case createTest_Case()
  {
    Test_CaseImpl test_Case = new Test_CaseImpl();
    return test_Case;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refactoring_Instance createRefactoring_Instance()
  {
    Refactoring_InstanceImpl refactoring_Instance = new Refactoring_InstanceImpl();
    return refactoring_Instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refactoring createRefactoring()
  {
    RefactoringImpl refactoring = new RefactoringImpl();
    return refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pull_Up_Refactoring createPull_Up_Refactoring()
  {
    Pull_Up_RefactoringImpl pull_Up_Refactoring = new Pull_Up_RefactoringImpl();
    return pull_Up_Refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Create_Superclass_Refactoring createCreate_Superclass_Refactoring()
  {
    Create_Superclass_RefactoringImpl create_Superclass_Refactoring = new Create_Superclass_RefactoringImpl();
    return create_Superclass_Refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test_Flow createTest_Flow()
  {
    Test_FlowImpl test_Flow = new Test_FlowImpl();
    return test_Flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test_Step createTest_Step()
  {
    Test_StepImpl test_Step = new Test_StepImpl();
    return test_Step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test_Step_Element createTest_Step_Element()
  {
    Test_Step_ElementImpl test_Step_Element = new Test_Step_ElementImpl();
    return test_Step_Element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assert_False createAssert_False()
  {
    Assert_FalseImpl assert_False = new Assert_FalseImpl();
    return assert_False;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assert_True createAssert_True()
  {
    Assert_TrueImpl assert_True = new Assert_TrueImpl();
    return assert_True;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expect_True createExpect_True()
  {
    Expect_TrueImpl expect_True = new Expect_TrueImpl();
    return expect_True;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expect_False createExpect_False()
  {
    Expect_FalseImpl expect_False = new Expect_FalseImpl();
    return expect_False;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Warning createWarning()
  {
    WarningImpl warning = new WarningImpl();
    return warning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compile createCompile()
  {
    CompileImpl compile = new CompileImpl();
    return compile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Synchronize createSynchronize()
  {
    SynchronizeImpl synchronize = new SynchronizeImpl();
    return synchronize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public No_Refactoring createNo_Refactoring()
  {
    No_RefactoringImpl no_Refactoring = new No_RefactoringImpl();
    return no_Refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Propose_Refactoring createPropose_Refactoring()
  {
    Propose_RefactoringImpl propose_Refactoring = new Propose_RefactoringImpl();
    return propose_Refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Propose_Pullup_Method_Refactoring createPropose_Pullup_Method_Refactoring()
  {
    Propose_Pullup_Method_RefactoringImpl propose_Pullup_Method_Refactoring = new Propose_Pullup_Method_RefactoringImpl();
    return propose_Pullup_Method_Refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Propose_Create_Superclass_Refactoring createPropose_Create_Superclass_Refactoring()
  {
    Propose_Create_Superclass_RefactoringImpl propose_Create_Superclass_Refactoring = new Propose_Create_Superclass_RefactoringImpl();
    return propose_Create_Superclass_Refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Containment createContainment()
  {
    ContainmentImpl containment = new ContainmentImpl();
    return containment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_Element createClass_Element()
  {
    Class_ElementImpl class_Element = new Class_ElementImpl();
    return class_Element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contains createContains()
  {
    ContainsImpl contains = new ContainsImpl();
    return contains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contains_Not createContains_Not()
  {
    Contains_NotImpl contains_Not = new Contains_NotImpl();
    return contains_Not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implementation createImplementation()
  {
    ImplementationImpl implementation = new ImplementationImpl();
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implements createImplements()
  {
    ImplementsImpl implements_ = new ImplementsImpl();
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implements_Not createImplements_Not()
  {
    Implements_NotImpl implements_Not = new Implements_NotImpl();
    return implements_Not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTCTestPackage getTTCTestPackage()
  {
    return (TTCTestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TTCTestPackage getPackage()
  {
    return TTCTestPackage.eINSTANCE;
  }

} //TTCTestFactoryImpl
