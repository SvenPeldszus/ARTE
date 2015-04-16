/**
 */
package ttc.testdsl.tTCTest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ttc.testdsl.tTCTest.Assert_False;
import ttc.testdsl.tTCTest.Assert_True;
import ttc.testdsl.tTCTest.Assertion;
import ttc.testdsl.tTCTest.Class_Element;
import ttc.testdsl.tTCTest.Classes;
import ttc.testdsl.tTCTest.Compile;
import ttc.testdsl.tTCTest.Condition;
import ttc.testdsl.tTCTest.Containment;
import ttc.testdsl.tTCTest.Contains;
import ttc.testdsl.tTCTest.Contains_Not;
import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Expect_False;
import ttc.testdsl.tTCTest.Expect_True;
import ttc.testdsl.tTCTest.Fields;
import ttc.testdsl.tTCTest.Implementation;
import ttc.testdsl.tTCTest.Implements;
import ttc.testdsl.tTCTest.Implements_Not;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Field;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Methods;
import ttc.testdsl.tTCTest.No_Refactoring;
import ttc.testdsl.tTCTest.Propose_Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Propose_Pullup_Method_Refactoring;
import ttc.testdsl.tTCTest.Propose_Refactoring;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testdsl.tTCTest.Refactoring;
import ttc.testdsl.tTCTest.Refactoring_Instance;
import ttc.testdsl.tTCTest.Synchronize;
import ttc.testdsl.tTCTest.TTCTestFactory;
import ttc.testdsl.tTCTest.TTCTestPackage;
import ttc.testdsl.tTCTest.Test_Case;
import ttc.testdsl.tTCTest.Test_File;
import ttc.testdsl.tTCTest.Test_Flow;
import ttc.testdsl.tTCTest.Test_Step;
import ttc.testdsl.tTCTest.Test_Step_Element;
import ttc.testdsl.tTCTest.Warning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TTCTestPackageImpl extends EPackageImpl implements TTCTestPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass test_FileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass java_ClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass java_MethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass java_FieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass test_CaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refactoring_InstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refactoringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pull_Up_RefactoringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass create_Superclass_RefactoringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass test_FlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass test_StepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass test_Step_ElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assert_FalseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assert_TrueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expect_TrueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expect_FalseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass warningEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass synchronizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass no_RefactoringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propose_RefactoringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propose_Pullup_Method_RefactoringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propose_Create_Superclass_RefactoringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass class_ElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contains_NotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implements_NotEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ttc.testdsl.tTCTest.TTCTestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TTCTestPackageImpl()
  {
    super(eNS_URI, TTCTestFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TTCTestPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TTCTestPackage init()
  {
    if (isInited) return (TTCTestPackage)EPackage.Registry.INSTANCE.getEPackage(TTCTestPackage.eNS_URI);

    // Obtain or create and register package
    TTCTestPackageImpl theTTCTestPackage = (TTCTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TTCTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TTCTestPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTTCTestPackage.createPackageContents();

    // Initialize created meta-data
    theTTCTestPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTTCTestPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TTCTestPackage.eNS_URI, theTTCTestPackage);
    return theTTCTestPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTest_File()
  {
    return test_FileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTest_File_Name()
  {
    return (EAttribute)test_FileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_File_Test_cases()
  {
    return (EReference)test_FileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_File_Java_class()
  {
    return (EReference)test_FileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_File_Java_classes()
  {
    return (EReference)test_FileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_File_Java_method()
  {
    return (EReference)test_FileEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_File_Refactorings()
  {
    return (EReference)test_FileEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJava_Class()
  {
    return java_ClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJava_Class_Name()
  {
    return (EAttribute)java_ClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJava_Class_Package()
  {
    return (EAttribute)java_ClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJava_Class_Class_name()
  {
    return (EAttribute)java_ClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClasses()
  {
    return classesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClasses_Name()
  {
    return (EAttribute)classesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClasses_Classes()
  {
    return (EReference)classesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJava_Method()
  {
    return java_MethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJava_Method_Method_name()
  {
    return (EAttribute)java_MethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJava_Method_Params()
  {
    return (EReference)java_MethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethods()
  {
    return methodsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethods_Name()
  {
    return (EAttribute)methodsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethods_Methods()
  {
    return (EReference)methodsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJava_Field()
  {
    return java_FieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJava_Field_Field_name()
  {
    return (EAttribute)java_FieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJava_Field_Type()
  {
    return (EReference)java_FieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFields()
  {
    return fieldsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFields_Name()
  {
    return (EAttribute)fieldsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFields_Fields()
  {
    return (EReference)fieldsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTest_Case()
  {
    return test_CaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTest_Case_Name()
  {
    return (EAttribute)test_CaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTest_Case_Description()
  {
    return (EAttribute)test_CaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTest_Case_Java_program()
  {
    return (EAttribute)test_CaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_Case_Test_flow()
  {
    return (EReference)test_CaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefactoring_Instance()
  {
    return refactoring_InstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefactoring_Instance_Name()
  {
    return (EAttribute)refactoring_InstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefactoring()
  {
    return refactoringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPull_Up_Refactoring()
  {
    return pull_Up_RefactoringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPull_Up_Refactoring_Parent()
  {
    return (EReference)pull_Up_RefactoringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPull_Up_Refactoring_Method()
  {
    return (EReference)pull_Up_RefactoringEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreate_Superclass_Refactoring()
  {
    return create_Superclass_RefactoringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreate_Superclass_Refactoring_Child()
  {
    return (EReference)create_Superclass_RefactoringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreate_Superclass_Refactoring_Target()
  {
    return (EReference)create_Superclass_RefactoringEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTest_Flow()
  {
    return test_FlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_Flow_Step()
  {
    return (EReference)test_FlowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTest_Step()
  {
    return test_StepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTest_Step_Elements()
  {
    return (EReference)test_StepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTest_Step_Element()
  {
    return test_Step_ElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertion()
  {
    return assertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertion_Input()
  {
    return (EReference)assertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssert_False()
  {
    return assert_FalseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssert_True()
  {
    return assert_TrueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Refactoring()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_True_steps()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Warning()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_False_steps()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpect_True()
  {
    return expect_TrueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpect_False()
  {
    return expect_FalseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWarning()
  {
    return warningEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWarning_Message()
  {
    return (EAttribute)warningEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompile()
  {
    return compileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSynchronize()
  {
    return synchronizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNo_Refactoring()
  {
    return no_RefactoringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropose_Refactoring()
  {
    return propose_RefactoringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropose_Refactoring_Refactoring()
  {
    return (EReference)propose_RefactoringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropose_Pullup_Method_Refactoring()
  {
    return propose_Pullup_Method_RefactoringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropose_Create_Superclass_Refactoring()
  {
    return propose_Create_Superclass_RefactoringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainment()
  {
    return containmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainment_Class()
  {
    return (EReference)containmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainment_Contains()
  {
    return (EReference)containmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_Element()
  {
    return class_ElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Element_Name()
  {
    return (EAttribute)class_ElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContains()
  {
    return containsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContains_Not()
  {
    return contains_NotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplementation()
  {
    return implementationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementation_Child()
  {
    return (EReference)implementationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementation_Parent()
  {
    return (EReference)implementationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplements()
  {
    return implementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplements_Not()
  {
    return implements_NotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTCTestFactory getTTCTestFactory()
  {
    return (TTCTestFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    test_FileEClass = createEClass(TEST_FILE);
    createEAttribute(test_FileEClass, TEST_FILE__NAME);
    createEReference(test_FileEClass, TEST_FILE__TEST_CASES);
    createEReference(test_FileEClass, TEST_FILE__JAVA_CLASS);
    createEReference(test_FileEClass, TEST_FILE__JAVA_CLASSES);
    createEReference(test_FileEClass, TEST_FILE__JAVA_METHOD);
    createEReference(test_FileEClass, TEST_FILE__REFACTORINGS);

    java_ClassEClass = createEClass(JAVA_CLASS);
    createEAttribute(java_ClassEClass, JAVA_CLASS__NAME);
    createEAttribute(java_ClassEClass, JAVA_CLASS__PACKAGE);
    createEAttribute(java_ClassEClass, JAVA_CLASS__CLASS_NAME);

    classesEClass = createEClass(CLASSES);
    createEAttribute(classesEClass, CLASSES__NAME);
    createEReference(classesEClass, CLASSES__CLASSES);

    java_MethodEClass = createEClass(JAVA_METHOD);
    createEAttribute(java_MethodEClass, JAVA_METHOD__METHOD_NAME);
    createEReference(java_MethodEClass, JAVA_METHOD__PARAMS);

    methodsEClass = createEClass(METHODS);
    createEAttribute(methodsEClass, METHODS__NAME);
    createEReference(methodsEClass, METHODS__METHODS);

    java_FieldEClass = createEClass(JAVA_FIELD);
    createEAttribute(java_FieldEClass, JAVA_FIELD__FIELD_NAME);
    createEReference(java_FieldEClass, JAVA_FIELD__TYPE);

    fieldsEClass = createEClass(FIELDS);
    createEAttribute(fieldsEClass, FIELDS__NAME);
    createEReference(fieldsEClass, FIELDS__FIELDS);

    test_CaseEClass = createEClass(TEST_CASE);
    createEAttribute(test_CaseEClass, TEST_CASE__NAME);
    createEAttribute(test_CaseEClass, TEST_CASE__DESCRIPTION);
    createEAttribute(test_CaseEClass, TEST_CASE__JAVA_PROGRAM);
    createEReference(test_CaseEClass, TEST_CASE__TEST_FLOW);

    refactoring_InstanceEClass = createEClass(REFACTORING_INSTANCE);
    createEAttribute(refactoring_InstanceEClass, REFACTORING_INSTANCE__NAME);

    refactoringEClass = createEClass(REFACTORING);

    pull_Up_RefactoringEClass = createEClass(PULL_UP_REFACTORING);
    createEReference(pull_Up_RefactoringEClass, PULL_UP_REFACTORING__PARENT);
    createEReference(pull_Up_RefactoringEClass, PULL_UP_REFACTORING__METHOD);

    create_Superclass_RefactoringEClass = createEClass(CREATE_SUPERCLASS_REFACTORING);
    createEReference(create_Superclass_RefactoringEClass, CREATE_SUPERCLASS_REFACTORING__CHILD);
    createEReference(create_Superclass_RefactoringEClass, CREATE_SUPERCLASS_REFACTORING__TARGET);

    test_FlowEClass = createEClass(TEST_FLOW);
    createEReference(test_FlowEClass, TEST_FLOW__STEP);

    test_StepEClass = createEClass(TEST_STEP);
    createEReference(test_StepEClass, TEST_STEP__ELEMENTS);

    test_Step_ElementEClass = createEClass(TEST_STEP_ELEMENT);

    assertionEClass = createEClass(ASSERTION);
    createEReference(assertionEClass, ASSERTION__INPUT);

    assert_FalseEClass = createEClass(ASSERT_FALSE);

    assert_TrueEClass = createEClass(ASSERT_TRUE);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__REFACTORING);
    createEReference(conditionEClass, CONDITION__TRUE_STEPS);
    createEReference(conditionEClass, CONDITION__WARNING);
    createEReference(conditionEClass, CONDITION__FALSE_STEPS);

    expect_TrueEClass = createEClass(EXPECT_TRUE);

    expect_FalseEClass = createEClass(EXPECT_FALSE);

    warningEClass = createEClass(WARNING);
    createEAttribute(warningEClass, WARNING__MESSAGE);

    compileEClass = createEClass(COMPILE);

    synchronizeEClass = createEClass(SYNCHRONIZE);

    no_RefactoringEClass = createEClass(NO_REFACTORING);

    propose_RefactoringEClass = createEClass(PROPOSE_REFACTORING);
    createEReference(propose_RefactoringEClass, PROPOSE_REFACTORING__REFACTORING);

    propose_Pullup_Method_RefactoringEClass = createEClass(PROPOSE_PULLUP_METHOD_REFACTORING);

    propose_Create_Superclass_RefactoringEClass = createEClass(PROPOSE_CREATE_SUPERCLASS_REFACTORING);

    containmentEClass = createEClass(CONTAINMENT);
    createEReference(containmentEClass, CONTAINMENT__CLASS);
    createEReference(containmentEClass, CONTAINMENT__CONTAINS);

    class_ElementEClass = createEClass(CLASS_ELEMENT);
    createEAttribute(class_ElementEClass, CLASS_ELEMENT__NAME);

    containsEClass = createEClass(CONTAINS);

    contains_NotEClass = createEClass(CONTAINS_NOT);

    implementationEClass = createEClass(IMPLEMENTATION);
    createEReference(implementationEClass, IMPLEMENTATION__CHILD);
    createEReference(implementationEClass, IMPLEMENTATION__PARENT);

    implementsEClass = createEClass(IMPLEMENTS);

    implements_NotEClass = createEClass(IMPLEMENTS_NOT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    java_MethodEClass.getESuperTypes().add(this.getClass_Element());
    java_FieldEClass.getESuperTypes().add(this.getClass_Element());
    refactoring_InstanceEClass.getESuperTypes().add(this.getRefactoring());
    pull_Up_RefactoringEClass.getESuperTypes().add(this.getRefactoring_Instance());
    create_Superclass_RefactoringEClass.getESuperTypes().add(this.getRefactoring_Instance());
    test_StepEClass.getESuperTypes().add(this.getTest_Step_Element());
    assertionEClass.getESuperTypes().add(this.getTest_Step_Element());
    assert_FalseEClass.getESuperTypes().add(this.getAssertion());
    assert_TrueEClass.getESuperTypes().add(this.getAssertion());
    conditionEClass.getESuperTypes().add(this.getTest_Step_Element());
    expect_TrueEClass.getESuperTypes().add(this.getCondition());
    expect_FalseEClass.getESuperTypes().add(this.getCondition());
    compileEClass.getESuperTypes().add(this.getTest_Step_Element());
    synchronizeEClass.getESuperTypes().add(this.getTest_Step_Element());
    no_RefactoringEClass.getESuperTypes().add(this.getRefactoring());
    propose_Pullup_Method_RefactoringEClass.getESuperTypes().add(this.getPropose_Refactoring());
    propose_Create_Superclass_RefactoringEClass.getESuperTypes().add(this.getPropose_Refactoring());
    containmentEClass.getESuperTypes().add(this.getTest_Step_Element());
    containsEClass.getESuperTypes().add(this.getContainment());
    contains_NotEClass.getESuperTypes().add(this.getContainment());
    implementationEClass.getESuperTypes().add(this.getTest_Step_Element());
    implementsEClass.getESuperTypes().add(this.getImplementation());
    implements_NotEClass.getESuperTypes().add(this.getImplementation());

    // Initialize classes and features; add operations and parameters
    initEClass(test_FileEClass, Test_File.class, "Test_File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTest_File_Name(), ecorePackage.getEString(), "name", null, 0, 1, Test_File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTest_File_Test_cases(), this.getTest_Case(), null, "test_cases", null, 0, -1, Test_File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTest_File_Java_class(), this.getJava_Class(), null, "java_class", null, 0, -1, Test_File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTest_File_Java_classes(), this.getClasses(), null, "java_classes", null, 0, -1, Test_File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTest_File_Java_method(), this.getJava_Method(), null, "java_method", null, 0, -1, Test_File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTest_File_Refactorings(), this.getRefactoring_Instance(), null, "refactorings", null, 0, -1, Test_File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(java_ClassEClass, Java_Class.class, "Java_Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJava_Class_Name(), ecorePackage.getEString(), "name", null, 0, 1, Java_Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJava_Class_Package(), ecorePackage.getEString(), "package", null, 0, 1, Java_Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJava_Class_Class_name(), ecorePackage.getEString(), "class_name", null, 0, 1, Java_Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classesEClass, Classes.class, "Classes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClasses_Name(), ecorePackage.getEString(), "name", null, 0, 1, Classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClasses_Classes(), this.getJava_Class(), null, "classes", null, 0, -1, Classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(java_MethodEClass, Java_Method.class, "Java_Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJava_Method_Method_name(), ecorePackage.getEString(), "method_name", null, 0, 1, Java_Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJava_Method_Params(), this.getJava_Class(), null, "params", null, 0, -1, Java_Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodsEClass, Methods.class, "Methods", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethods_Name(), ecorePackage.getEString(), "name", null, 0, 1, Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethods_Methods(), this.getJava_Method(), null, "methods", null, 0, -1, Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(java_FieldEClass, Java_Field.class, "Java_Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJava_Field_Field_name(), ecorePackage.getEString(), "field_name", null, 0, 1, Java_Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJava_Field_Type(), this.getJava_Class(), null, "type", null, 0, 1, Java_Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldsEClass, Fields.class, "Fields", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFields_Name(), ecorePackage.getEString(), "name", null, 0, 1, Fields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFields_Fields(), this.getJava_Field(), null, "fields", null, 0, -1, Fields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(test_CaseEClass, Test_Case.class, "Test_Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTest_Case_Name(), ecorePackage.getEString(), "name", null, 0, 1, Test_Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTest_Case_Description(), ecorePackage.getEString(), "description", null, 0, 1, Test_Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTest_Case_Java_program(), ecorePackage.getEString(), "java_program", null, 0, 1, Test_Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTest_Case_Test_flow(), this.getTest_Flow(), null, "test_flow", null, 0, 1, Test_Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refactoring_InstanceEClass, Refactoring_Instance.class, "Refactoring_Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRefactoring_Instance_Name(), ecorePackage.getEString(), "name", null, 0, 1, Refactoring_Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refactoringEClass, Refactoring.class, "Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pull_Up_RefactoringEClass, Pull_Up_Refactoring.class, "Pull_Up_Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPull_Up_Refactoring_Parent(), this.getJava_Class(), null, "parent", null, 0, 1, Pull_Up_Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPull_Up_Refactoring_Method(), this.getJava_Method(), null, "method", null, 0, 1, Pull_Up_Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(create_Superclass_RefactoringEClass, Create_Superclass_Refactoring.class, "Create_Superclass_Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreate_Superclass_Refactoring_Child(), this.getClasses(), null, "child", null, 0, 1, Create_Superclass_Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreate_Superclass_Refactoring_Target(), this.getJava_Class(), null, "target", null, 0, 1, Create_Superclass_Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(test_FlowEClass, Test_Flow.class, "Test_Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTest_Flow_Step(), this.getTest_Step_Element(), null, "step", null, 0, -1, Test_Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(test_StepEClass, Test_Step.class, "Test_Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTest_Step_Elements(), this.getTest_Step_Element(), null, "elements", null, 0, -1, Test_Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(test_Step_ElementEClass, Test_Step_Element.class, "Test_Step_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssertion_Input(), this.getRefactoring(), null, "input", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assert_FalseEClass, Assert_False.class, "Assert_False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assert_TrueEClass, Assert_True.class, "Assert_True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_Refactoring(), this.getRefactoring(), null, "refactoring", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_True_steps(), this.getTest_Step_Element(), null, "true_steps", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Warning(), this.getWarning(), null, "warning", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_False_steps(), this.getTest_Step_Element(), null, "false_steps", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expect_TrueEClass, Expect_True.class, "Expect_True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expect_FalseEClass, Expect_False.class, "Expect_False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(warningEClass, Warning.class, "Warning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWarning_Message(), ecorePackage.getEString(), "message", null, 0, 1, Warning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compileEClass, Compile.class, "Compile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(synchronizeEClass, Synchronize.class, "Synchronize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(no_RefactoringEClass, No_Refactoring.class, "No_Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propose_RefactoringEClass, Propose_Refactoring.class, "Propose_Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropose_Refactoring_Refactoring(), this.getRefactoring(), null, "refactoring", null, 0, 1, Propose_Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propose_Pullup_Method_RefactoringEClass, Propose_Pullup_Method_Refactoring.class, "Propose_Pullup_Method_Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propose_Create_Superclass_RefactoringEClass, Propose_Create_Superclass_Refactoring.class, "Propose_Create_Superclass_Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(containmentEClass, Containment.class, "Containment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainment_Class(), this.getJava_Class(), null, "class", null, 0, 1, Containment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainment_Contains(), this.getClass_Element(), null, "contains", null, 0, 1, Containment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_ElementEClass, Class_Element.class, "Class_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Element_Name(), ecorePackage.getEString(), "name", null, 0, 1, Class_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(contains_NotEClass, Contains_Not.class, "Contains_Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplementation_Child(), this.getJava_Class(), null, "child", null, 0, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplementation_Parent(), this.getJava_Class(), null, "parent", null, 0, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implementsEClass, Implements.class, "Implements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(implements_NotEClass, Implements_Not.class, "Implements_Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //TTCTestPackageImpl
