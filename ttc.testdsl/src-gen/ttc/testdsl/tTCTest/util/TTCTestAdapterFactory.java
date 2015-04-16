/**
 */
package ttc.testdsl.tTCTest.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ttc.testdsl.tTCTest.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ttc.testdsl.tTCTest.TTCTestPackage
 * @generated
 */
public class TTCTestAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TTCTestPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTCTestAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TTCTestPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TTCTestSwitch<Adapter> modelSwitch =
    new TTCTestSwitch<Adapter>()
    {
      @Override
      public Adapter caseTest_File(Test_File object)
      {
        return createTest_FileAdapter();
      }
      @Override
      public Adapter caseJava_Class(Java_Class object)
      {
        return createJava_ClassAdapter();
      }
      @Override
      public Adapter caseClasses(Classes object)
      {
        return createClassesAdapter();
      }
      @Override
      public Adapter caseJava_Method(Java_Method object)
      {
        return createJava_MethodAdapter();
      }
      @Override
      public Adapter caseMethods(Methods object)
      {
        return createMethodsAdapter();
      }
      @Override
      public Adapter caseJava_Field(Java_Field object)
      {
        return createJava_FieldAdapter();
      }
      @Override
      public Adapter caseFields(Fields object)
      {
        return createFieldsAdapter();
      }
      @Override
      public Adapter caseTest_Case(Test_Case object)
      {
        return createTest_CaseAdapter();
      }
      @Override
      public Adapter caseRefactoring_Instance(Refactoring_Instance object)
      {
        return createRefactoring_InstanceAdapter();
      }
      @Override
      public Adapter caseRefactoring(Refactoring object)
      {
        return createRefactoringAdapter();
      }
      @Override
      public Adapter casePull_Up_Refactoring(Pull_Up_Refactoring object)
      {
        return createPull_Up_RefactoringAdapter();
      }
      @Override
      public Adapter caseCreate_Superclass_Refactoring(Create_Superclass_Refactoring object)
      {
        return createCreate_Superclass_RefactoringAdapter();
      }
      @Override
      public Adapter caseTest_Flow(Test_Flow object)
      {
        return createTest_FlowAdapter();
      }
      @Override
      public Adapter caseTest_Step(Test_Step object)
      {
        return createTest_StepAdapter();
      }
      @Override
      public Adapter caseTest_Step_Element(Test_Step_Element object)
      {
        return createTest_Step_ElementAdapter();
      }
      @Override
      public Adapter caseAssertion(Assertion object)
      {
        return createAssertionAdapter();
      }
      @Override
      public Adapter caseAssert_False(Assert_False object)
      {
        return createAssert_FalseAdapter();
      }
      @Override
      public Adapter caseAssert_True(Assert_True object)
      {
        return createAssert_TrueAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseExpect_True(Expect_True object)
      {
        return createExpect_TrueAdapter();
      }
      @Override
      public Adapter caseExpect_False(Expect_False object)
      {
        return createExpect_FalseAdapter();
      }
      @Override
      public Adapter caseWarning(Warning object)
      {
        return createWarningAdapter();
      }
      @Override
      public Adapter caseCompile(Compile object)
      {
        return createCompileAdapter();
      }
      @Override
      public Adapter caseSynchronize(Synchronize object)
      {
        return createSynchronizeAdapter();
      }
      @Override
      public Adapter caseNo_Refactoring(No_Refactoring object)
      {
        return createNo_RefactoringAdapter();
      }
      @Override
      public Adapter casePropose_Refactoring(Propose_Refactoring object)
      {
        return createPropose_RefactoringAdapter();
      }
      @Override
      public Adapter casePropose_Pullup_Method_Refactoring(Propose_Pullup_Method_Refactoring object)
      {
        return createPropose_Pullup_Method_RefactoringAdapter();
      }
      @Override
      public Adapter casePropose_Create_Superclass_Refactoring(Propose_Create_Superclass_Refactoring object)
      {
        return createPropose_Create_Superclass_RefactoringAdapter();
      }
      @Override
      public Adapter caseContainment(Containment object)
      {
        return createContainmentAdapter();
      }
      @Override
      public Adapter caseClass_Element(Class_Element object)
      {
        return createClass_ElementAdapter();
      }
      @Override
      public Adapter caseContains(Contains object)
      {
        return createContainsAdapter();
      }
      @Override
      public Adapter caseContains_Not(Contains_Not object)
      {
        return createContains_NotAdapter();
      }
      @Override
      public Adapter caseImplementation(Implementation object)
      {
        return createImplementationAdapter();
      }
      @Override
      public Adapter caseImplements(Implements object)
      {
        return createImplementsAdapter();
      }
      @Override
      public Adapter caseImplements_Not(Implements_Not object)
      {
        return createImplements_NotAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Test_File <em>Test File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Test_File
   * @generated
   */
  public Adapter createTest_FileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Java_Class <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Java_Class
   * @generated
   */
  public Adapter createJava_ClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Classes <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Classes
   * @generated
   */
  public Adapter createClassesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Java_Method <em>Java Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Java_Method
   * @generated
   */
  public Adapter createJava_MethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Methods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Methods
   * @generated
   */
  public Adapter createMethodsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Java_Field <em>Java Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Java_Field
   * @generated
   */
  public Adapter createJava_FieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Fields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Fields
   * @generated
   */
  public Adapter createFieldsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Test_Case <em>Test Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Test_Case
   * @generated
   */
  public Adapter createTest_CaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Refactoring_Instance <em>Refactoring Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Refactoring_Instance
   * @generated
   */
  public Adapter createRefactoring_InstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Refactoring <em>Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Refactoring
   * @generated
   */
  public Adapter createRefactoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Pull_Up_Refactoring <em>Pull Up Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Pull_Up_Refactoring
   * @generated
   */
  public Adapter createPull_Up_RefactoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Create_Superclass_Refactoring <em>Create Superclass Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Create_Superclass_Refactoring
   * @generated
   */
  public Adapter createCreate_Superclass_RefactoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Test_Flow <em>Test Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Test_Flow
   * @generated
   */
  public Adapter createTest_FlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Test_Step <em>Test Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Test_Step
   * @generated
   */
  public Adapter createTest_StepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Test_Step_Element <em>Test Step Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Test_Step_Element
   * @generated
   */
  public Adapter createTest_Step_ElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Assertion
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Assert_False <em>Assert False</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Assert_False
   * @generated
   */
  public Adapter createAssert_FalseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Assert_True <em>Assert True</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Assert_True
   * @generated
   */
  public Adapter createAssert_TrueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Expect_True <em>Expect True</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Expect_True
   * @generated
   */
  public Adapter createExpect_TrueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Expect_False <em>Expect False</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Expect_False
   * @generated
   */
  public Adapter createExpect_FalseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Warning <em>Warning</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Warning
   * @generated
   */
  public Adapter createWarningAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Compile <em>Compile</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Compile
   * @generated
   */
  public Adapter createCompileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Synchronize <em>Synchronize</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Synchronize
   * @generated
   */
  public Adapter createSynchronizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.No_Refactoring <em>No Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.No_Refactoring
   * @generated
   */
  public Adapter createNo_RefactoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Propose_Refactoring <em>Propose Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Propose_Refactoring
   * @generated
   */
  public Adapter createPropose_RefactoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Propose_Pullup_Method_Refactoring <em>Propose Pullup Method Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Propose_Pullup_Method_Refactoring
   * @generated
   */
  public Adapter createPropose_Pullup_Method_RefactoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Propose_Create_Superclass_Refactoring <em>Propose Create Superclass Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Propose_Create_Superclass_Refactoring
   * @generated
   */
  public Adapter createPropose_Create_Superclass_RefactoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Containment <em>Containment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Containment
   * @generated
   */
  public Adapter createContainmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Class_Element <em>Class Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Class_Element
   * @generated
   */
  public Adapter createClass_ElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Contains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Contains
   * @generated
   */
  public Adapter createContainsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Contains_Not <em>Contains Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Contains_Not
   * @generated
   */
  public Adapter createContains_NotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Implementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Implementation
   * @generated
   */
  public Adapter createImplementationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Implements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Implements
   * @generated
   */
  public Adapter createImplementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ttc.testdsl.tTCTest.Implements_Not <em>Implements Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ttc.testdsl.tTCTest.Implements_Not
   * @generated
   */
  public Adapter createImplements_NotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TTCTestAdapterFactory
