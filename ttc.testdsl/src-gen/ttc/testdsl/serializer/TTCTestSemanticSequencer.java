/*
 * generated by Xtext
 */
package ttc.testdsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ttc.testdsl.services.TTCTestGrammarAccess;
import ttc.testdsl.tTCTest.Assert_False;
import ttc.testdsl.tTCTest.Assert_True;
import ttc.testdsl.tTCTest.Classes;
import ttc.testdsl.tTCTest.Compile;
import ttc.testdsl.tTCTest.Contains;
import ttc.testdsl.tTCTest.Contains_Not;
import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Expect_False;
import ttc.testdsl.tTCTest.Expect_True;
import ttc.testdsl.tTCTest.Fields;
import ttc.testdsl.tTCTest.Implements;
import ttc.testdsl.tTCTest.Implements_Not;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Field;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Methods;
import ttc.testdsl.tTCTest.No_Refactoring;
import ttc.testdsl.tTCTest.Propose_Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Propose_Pullup_Method_Refactoring;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testdsl.tTCTest.Synchronize;
import ttc.testdsl.tTCTest.TTCTestPackage;
import ttc.testdsl.tTCTest.Test_Case;
import ttc.testdsl.tTCTest.Test_File;
import ttc.testdsl.tTCTest.Test_Flow;
import ttc.testdsl.tTCTest.Test_Step;
import ttc.testdsl.tTCTest.Warning;

@SuppressWarnings("all")
public class TTCTestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TTCTestGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TTCTestPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TTCTestPackage.ASSERT_FALSE:
				sequence_Assert_False(context, (Assert_False) semanticObject); 
				return; 
			case TTCTestPackage.ASSERT_TRUE:
				sequence_Assert_True(context, (Assert_True) semanticObject); 
				return; 
			case TTCTestPackage.CLASSES:
				sequence_Classes(context, (Classes) semanticObject); 
				return; 
			case TTCTestPackage.COMPILE:
				sequence_Compile(context, (Compile) semanticObject); 
				return; 
			case TTCTestPackage.CONTAINS:
				sequence_Contains(context, (Contains) semanticObject); 
				return; 
			case TTCTestPackage.CONTAINS_NOT:
				sequence_Contains_Not(context, (Contains_Not) semanticObject); 
				return; 
			case TTCTestPackage.CREATE_SUPERCLASS_REFACTORING:
				sequence_Create_Superclass_Refactoring(context, (Create_Superclass_Refactoring) semanticObject); 
				return; 
			case TTCTestPackage.EXPECT_FALSE:
				sequence_Expect_False(context, (Expect_False) semanticObject); 
				return; 
			case TTCTestPackage.EXPECT_TRUE:
				sequence_Expect_True(context, (Expect_True) semanticObject); 
				return; 
			case TTCTestPackage.FIELDS:
				sequence_Fields(context, (Fields) semanticObject); 
				return; 
			case TTCTestPackage.IMPLEMENTS:
				sequence_Implements(context, (Implements) semanticObject); 
				return; 
			case TTCTestPackage.IMPLEMENTS_NOT:
				sequence_Implements_Not(context, (Implements_Not) semanticObject); 
				return; 
			case TTCTestPackage.JAVA_CLASS:
				sequence_Java_Class(context, (Java_Class) semanticObject); 
				return; 
			case TTCTestPackage.JAVA_FIELD:
				sequence_Java_Field(context, (Java_Field) semanticObject); 
				return; 
			case TTCTestPackage.JAVA_METHOD:
				sequence_Java_Method(context, (Java_Method) semanticObject); 
				return; 
			case TTCTestPackage.METHODS:
				sequence_Methods(context, (Methods) semanticObject); 
				return; 
			case TTCTestPackage.NO_REFACTORING:
				sequence_No_Refactoring(context, (No_Refactoring) semanticObject); 
				return; 
			case TTCTestPackage.PROPOSE_CREATE_SUPERCLASS_REFACTORING:
				sequence_Propose_Create_Superclass_Refactoring(context, (Propose_Create_Superclass_Refactoring) semanticObject); 
				return; 
			case TTCTestPackage.PROPOSE_PULLUP_METHOD_REFACTORING:
				sequence_Propose_Pullup_Method_Refactoring(context, (Propose_Pullup_Method_Refactoring) semanticObject); 
				return; 
			case TTCTestPackage.PULL_UP_REFACTORING:
				sequence_Pull_Up_Refactoring(context, (Pull_Up_Refactoring) semanticObject); 
				return; 
			case TTCTestPackage.SYNCHRONIZE:
				sequence_Synchronize(context, (Synchronize) semanticObject); 
				return; 
			case TTCTestPackage.TEST_CASE:
				sequence_Test_Case(context, (Test_Case) semanticObject); 
				return; 
			case TTCTestPackage.TEST_FILE:
				sequence_Test_File(context, (Test_File) semanticObject); 
				return; 
			case TTCTestPackage.TEST_FLOW:
				sequence_Test_Flow(context, (Test_Flow) semanticObject); 
				return; 
			case TTCTestPackage.TEST_STEP:
				sequence_Test_Step(context, (Test_Step) semanticObject); 
				return; 
			case TTCTestPackage.WARNING:
				sequence_Warning(context, (Warning) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     input=[Refactoring|ID]
	 */
	protected void sequence_Assert_False(EObject context, Assert_False semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.ASSERTION__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.ASSERTION__INPUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssert_FalseAccess().getInputRefactoringIDTerminalRuleCall_2_0_1(), semanticObject.getInput());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     input=[Refactoring|ID]
	 */
	protected void sequence_Assert_True(EObject context, Assert_True semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.ASSERTION__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.ASSERTION__INPUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssert_TrueAccess().getInputRefactoringIDTerminalRuleCall_2_0_1(), semanticObject.getInput());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID classes+=[Java_Class|ID] classes+=[Java_Class|ID]*)
	 */
	protected void sequence_Classes(EObject context, Classes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Compile}
	 */
	protected void sequence_Compile(EObject context, Compile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (class=[Java_Class|ID] contains=[Class_Element|ID])
	 */
	protected void sequence_Contains(EObject context, Contains semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.CONTAINMENT__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.CONTAINMENT__CLASS));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.CONTAINMENT__CONTAINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.CONTAINMENT__CONTAINS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContainsAccess().getClassJava_ClassIDTerminalRuleCall_0_0_1(), semanticObject.getClass_());
		feeder.accept(grammarAccess.getContainsAccess().getContainsClass_ElementIDTerminalRuleCall_2_0_1(), semanticObject.getContains());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (class=[Java_Class|ID] contains=[Class_Element|ID])
	 */
	protected void sequence_Contains_Not(EObject context, Contains_Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.CONTAINMENT__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.CONTAINMENT__CLASS));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.CONTAINMENT__CONTAINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.CONTAINMENT__CONTAINS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContains_NotAccess().getClassJava_ClassIDTerminalRuleCall_0_0_1(), semanticObject.getClass_());
		feeder.accept(grammarAccess.getContains_NotAccess().getContainsClass_ElementIDTerminalRuleCall_2_0_1(), semanticObject.getContains());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID child=[Classes|ID] target=[Java_Class|ID])
	 */
	protected void sequence_Create_Superclass_Refactoring(EObject context, Create_Superclass_Refactoring semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.REFACTORING_INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.REFACTORING_INSTANCE__NAME));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.CREATE_SUPERCLASS_REFACTORING__CHILD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.CREATE_SUPERCLASS_REFACTORING__CHILD));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.CREATE_SUPERCLASS_REFACTORING__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.CREATE_SUPERCLASS_REFACTORING__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCreate_Superclass_RefactoringAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCreate_Superclass_RefactoringAccess().getChildClassesIDTerminalRuleCall_4_0_1(), semanticObject.getChild());
		feeder.accept(grammarAccess.getCreate_Superclass_RefactoringAccess().getTargetJava_ClassIDTerminalRuleCall_6_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (refactoring=[Refactoring|ID] false_steps+=Test_Step_Element+ warning=Warning? true_steps+=Test_Step_Element+)
	 */
	protected void sequence_Expect_False(EObject context, Expect_False semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refactoring=[Refactoring|ID] true_steps+=Test_Step_Element+ warning=Warning? false_steps+=Test_Step_Element+)
	 */
	protected void sequence_Expect_True(EObject context, Expect_True semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=[Java_Field|ID]*)
	 */
	protected void sequence_Fields(EObject context, Fields semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (child=[Java_Class|ID] parent=[Java_Class|ID])
	 */
	protected void sequence_Implements(EObject context, Implements semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.IMPLEMENTATION__CHILD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.IMPLEMENTATION__CHILD));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.IMPLEMENTATION__PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.IMPLEMENTATION__PARENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImplementsAccess().getChildJava_ClassIDTerminalRuleCall_0_0_1(), semanticObject.getChild());
		feeder.accept(grammarAccess.getImplementsAccess().getParentJava_ClassIDTerminalRuleCall_2_0_1(), semanticObject.getParent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (child=[Java_Class|ID] parent=[Java_Class|ID])
	 */
	protected void sequence_Implements_Not(EObject context, Implements_Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.IMPLEMENTATION__CHILD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.IMPLEMENTATION__CHILD));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.IMPLEMENTATION__PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.IMPLEMENTATION__PARENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImplements_NotAccess().getChildJava_ClassIDTerminalRuleCall_0_0_1(), semanticObject.getChild());
		feeder.accept(grammarAccess.getImplements_NotAccess().getParentJava_ClassIDTerminalRuleCall_2_0_1(), semanticObject.getParent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID package=STRING? class_name=STRING)
	 */
	protected void sequence_Java_Class(EObject context, Java_Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID field_name=STRING type=[Java_Class|ID])
	 */
	protected void sequence_Java_Field(EObject context, Java_Field semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.CLASS_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.CLASS_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.JAVA_FIELD__FIELD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.JAVA_FIELD__FIELD_NAME));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.JAVA_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.JAVA_FIELD__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJava_FieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getJava_FieldAccess().getField_nameSTRINGTerminalRuleCall_4_0(), semanticObject.getField_name());
		feeder.accept(grammarAccess.getJava_FieldAccess().getTypeJava_ClassIDTerminalRuleCall_6_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID method_name=STRING (params+=[Java_Class|ID] params+=[Java_Class|ID]*)?)
	 */
	protected void sequence_Java_Method(EObject context, Java_Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID methods+=[Java_Method|ID]*)
	 */
	protected void sequence_Methods(EObject context, Methods semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {No_Refactoring}
	 */
	protected void sequence_No_Refactoring(EObject context, No_Refactoring semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refactoring=[Create_Superclass_Refactoring|ID] | refactoring=No_Refactoring)
	 */
	protected void sequence_Propose_Create_Superclass_Refactoring(EObject context, Propose_Create_Superclass_Refactoring semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refactoring=[Pull_Up_Refactoring|ID] | refactoring=No_Refactoring)
	 */
	protected void sequence_Propose_Pullup_Method_Refactoring(EObject context, Propose_Pullup_Method_Refactoring semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[Java_Class|ID] method=[Java_Method|ID])
	 */
	protected void sequence_Pull_Up_Refactoring(EObject context, Pull_Up_Refactoring semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.REFACTORING_INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.REFACTORING_INSTANCE__NAME));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.PULL_UP_REFACTORING__PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.PULL_UP_REFACTORING__PARENT));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.PULL_UP_REFACTORING__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.PULL_UP_REFACTORING__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPull_Up_RefactoringAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPull_Up_RefactoringAccess().getParentJava_ClassIDTerminalRuleCall_4_0_1(), semanticObject.getParent());
		feeder.accept(grammarAccess.getPull_Up_RefactoringAccess().getMethodJava_MethodIDTerminalRuleCall_6_0_1(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Synchronize}
	 */
	protected void sequence_Synchronize(EObject context, Synchronize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING java_program=STRING test_flow=Test_Flow)
	 */
	protected void sequence_Test_Case(EObject context, Test_Case semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.TEST_CASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.TEST_CASE__NAME));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.TEST_CASE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.TEST_CASE__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.TEST_CASE__JAVA_PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.TEST_CASE__JAVA_PROGRAM));
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.TEST_CASE__TEST_FLOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.TEST_CASE__TEST_FLOW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTest_CaseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTest_CaseAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getTest_CaseAccess().getJava_programSTRINGTerminalRuleCall_6_0(), semanticObject.getJava_program());
		feeder.accept(grammarAccess.getTest_CaseAccess().getTest_flowTest_FlowParserRuleCall_7_0(), semanticObject.getTest_flow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (test_cases+=Test_Case | java_class+=Java_Class | java_classes+=Classes | java_method+=Java_Method | refactorings+=Refactoring_Instance)*
	 *     )
	 */
	protected void sequence_Test_File(EObject context, Test_File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     step+=Test_Step_Element+
	 */
	protected void sequence_Test_Flow(EObject context, Test_Flow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Test_Step_Element+
	 */
	protected void sequence_Test_Step(EObject context, Test_Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_Warning(EObject context, Warning semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TTCTestPackage.Literals.WARNING__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TTCTestPackage.Literals.WARNING__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWarningAccess().getMessageSTRINGTerminalRuleCall_1_0(), semanticObject.getMessage());
		feeder.finish();
	}
}
