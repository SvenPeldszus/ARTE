package ttc.testdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ttc.testdsl.services.TTCTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTTCTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_FLOAT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TestFile'", "'{'", "'}'", "'class'", "'package'", "'name'", "'classes'", "','", "'method'", "'params'", "'field'", "'type'", "'case'", "'description'", "'program'", "'pullup_method'", "'parent'", "'create_superclass'", "'child'", "'target'", "'testflow'", "'step'", "'assertFalse'", "'('", "')'", "'assertTrue'", "'expectTrue'", "'else'", "'expectFalse'", "'warning'", "'compile'", "'synchronize'", "'none'", "'proposePullUpRefactoring'", "'proposeCreateSuperclassRefactoring'", "'contains'", "'~contains'", "'extends'", "'~extends'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=9;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTTCTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTTCTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTTCTestParser.tokenNames; }
    public String getGrammarFileName() { return "../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g"; }



     	private TTCTestGrammarAccess grammarAccess;
     	
        public InternalTTCTestParser(TokenStream input, TTCTestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Test_File";	
       	}
       	
       	@Override
       	protected TTCTestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTest_File"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:67:1: entryRuleTest_File returns [EObject current=null] : iv_ruleTest_File= ruleTest_File EOF ;
    public final EObject entryRuleTest_File() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest_File = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:68:2: (iv_ruleTest_File= ruleTest_File EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:69:2: iv_ruleTest_File= ruleTest_File EOF
            {
             newCompositeNode(grammarAccess.getTest_FileRule()); 
            pushFollow(FOLLOW_ruleTest_File_in_entryRuleTest_File75);
            iv_ruleTest_File=ruleTest_File();

            state._fsp--;

             current =iv_ruleTest_File; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest_File85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest_File"


    // $ANTLR start "ruleTest_File"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:76:1: ruleTest_File returns [EObject current=null] : (otherlv_0= 'TestFile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_test_cases_3_0= ruleTest_Case ) ) | ( (lv_java_class_4_0= ruleJava_Class ) ) | ( (lv_java_classes_5_0= ruleClasses ) ) | ( (lv_java_method_6_0= ruleJava_Method ) ) | ( (lv_refactorings_7_0= ruleRefactoring_Instance ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleTest_File() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_test_cases_3_0 = null;

        EObject lv_java_class_4_0 = null;

        EObject lv_java_classes_5_0 = null;

        EObject lv_java_method_6_0 = null;

        EObject lv_refactorings_7_0 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:79:28: ( (otherlv_0= 'TestFile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_test_cases_3_0= ruleTest_Case ) ) | ( (lv_java_class_4_0= ruleJava_Class ) ) | ( (lv_java_classes_5_0= ruleClasses ) ) | ( (lv_java_method_6_0= ruleJava_Method ) ) | ( (lv_refactorings_7_0= ruleRefactoring_Instance ) ) )* otherlv_8= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:80:1: (otherlv_0= 'TestFile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_test_cases_3_0= ruleTest_Case ) ) | ( (lv_java_class_4_0= ruleJava_Class ) ) | ( (lv_java_classes_5_0= ruleClasses ) ) | ( (lv_java_method_6_0= ruleJava_Method ) ) | ( (lv_refactorings_7_0= ruleRefactoring_Instance ) ) )* otherlv_8= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:80:1: (otherlv_0= 'TestFile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_test_cases_3_0= ruleTest_Case ) ) | ( (lv_java_class_4_0= ruleJava_Class ) ) | ( (lv_java_classes_5_0= ruleClasses ) ) | ( (lv_java_method_6_0= ruleJava_Method ) ) | ( (lv_refactorings_7_0= ruleRefactoring_Instance ) ) )* otherlv_8= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:80:3: otherlv_0= 'TestFile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_test_cases_3_0= ruleTest_Case ) ) | ( (lv_java_class_4_0= ruleJava_Class ) ) | ( (lv_java_classes_5_0= ruleClasses ) ) | ( (lv_java_method_6_0= ruleJava_Method ) ) | ( (lv_refactorings_7_0= ruleRefactoring_Instance ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTest_File122); 

                	newLeafNode(otherlv_0, grammarAccess.getTest_FileAccess().getTestFileKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:85:1: (lv_name_1_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTest_File139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTest_FileAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTest_FileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTest_File156); 

                	newLeafNode(otherlv_2, grammarAccess.getTest_FileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:106:1: ( ( (lv_test_cases_3_0= ruleTest_Case ) ) | ( (lv_java_class_4_0= ruleJava_Class ) ) | ( (lv_java_classes_5_0= ruleClasses ) ) | ( (lv_java_method_6_0= ruleJava_Method ) ) | ( (lv_refactorings_7_0= ruleRefactoring_Instance ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                    {
                    alt1=2;
                    }
                    break;
                case 20:
                    {
                    alt1=3;
                    }
                    break;
                case 22:
                    {
                    alt1=4;
                    }
                    break;
                case 29:
                case 31:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:106:2: ( (lv_test_cases_3_0= ruleTest_Case ) )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:106:2: ( (lv_test_cases_3_0= ruleTest_Case ) )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:107:1: (lv_test_cases_3_0= ruleTest_Case )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:107:1: (lv_test_cases_3_0= ruleTest_Case )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:108:3: lv_test_cases_3_0= ruleTest_Case
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTest_FileAccess().getTest_casesTest_CaseParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_Case_in_ruleTest_File178);
            	    lv_test_cases_3_0=ruleTest_Case();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTest_FileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"test_cases",
            	            		lv_test_cases_3_0, 
            	            		"Test_Case");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:125:6: ( (lv_java_class_4_0= ruleJava_Class ) )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:125:6: ( (lv_java_class_4_0= ruleJava_Class ) )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:126:1: (lv_java_class_4_0= ruleJava_Class )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:126:1: (lv_java_class_4_0= ruleJava_Class )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:127:3: lv_java_class_4_0= ruleJava_Class
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTest_FileAccess().getJava_classJava_ClassParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJava_Class_in_ruleTest_File205);
            	    lv_java_class_4_0=ruleJava_Class();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTest_FileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"java_class",
            	            		lv_java_class_4_0, 
            	            		"Java_Class");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:144:6: ( (lv_java_classes_5_0= ruleClasses ) )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:144:6: ( (lv_java_classes_5_0= ruleClasses ) )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:145:1: (lv_java_classes_5_0= ruleClasses )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:145:1: (lv_java_classes_5_0= ruleClasses )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:146:3: lv_java_classes_5_0= ruleClasses
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTest_FileAccess().getJava_classesClassesParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClasses_in_ruleTest_File232);
            	    lv_java_classes_5_0=ruleClasses();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTest_FileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"java_classes",
            	            		lv_java_classes_5_0, 
            	            		"Classes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:163:6: ( (lv_java_method_6_0= ruleJava_Method ) )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:163:6: ( (lv_java_method_6_0= ruleJava_Method ) )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:164:1: (lv_java_method_6_0= ruleJava_Method )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:164:1: (lv_java_method_6_0= ruleJava_Method )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:165:3: lv_java_method_6_0= ruleJava_Method
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTest_FileAccess().getJava_methodJava_MethodParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJava_Method_in_ruleTest_File259);
            	    lv_java_method_6_0=ruleJava_Method();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTest_FileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"java_method",
            	            		lv_java_method_6_0, 
            	            		"Java_Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:182:6: ( (lv_refactorings_7_0= ruleRefactoring_Instance ) )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:182:6: ( (lv_refactorings_7_0= ruleRefactoring_Instance ) )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:183:1: (lv_refactorings_7_0= ruleRefactoring_Instance )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:183:1: (lv_refactorings_7_0= ruleRefactoring_Instance )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:184:3: lv_refactorings_7_0= ruleRefactoring_Instance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTest_FileAccess().getRefactoringsRefactoring_InstanceParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefactoring_Instance_in_ruleTest_File286);
            	    lv_refactorings_7_0=ruleRefactoring_Instance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTest_FileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refactorings",
            	            		lv_refactorings_7_0, 
            	            		"Refactoring_Instance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTest_File300); 

                	newLeafNode(otherlv_8, grammarAccess.getTest_FileAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest_File"


    // $ANTLR start "entryRuleJava_Class"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:212:1: entryRuleJava_Class returns [EObject current=null] : iv_ruleJava_Class= ruleJava_Class EOF ;
    public final EObject entryRuleJava_Class() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJava_Class = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:213:2: (iv_ruleJava_Class= ruleJava_Class EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:214:2: iv_ruleJava_Class= ruleJava_Class EOF
            {
             newCompositeNode(grammarAccess.getJava_ClassRule()); 
            pushFollow(FOLLOW_ruleJava_Class_in_entryRuleJava_Class336);
            iv_ruleJava_Class=ruleJava_Class();

            state._fsp--;

             current =iv_ruleJava_Class; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJava_Class346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJava_Class"


    // $ANTLR start "ruleJava_Class"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:221:1: ruleJava_Class returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'package' ( (lv_package_4_0= RULE_STRING ) ) )? otherlv_5= 'name' ( (lv_class_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleJava_Class() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_package_4_0=null;
        Token otherlv_5=null;
        Token lv_class_name_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:224:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'package' ( (lv_package_4_0= RULE_STRING ) ) )? otherlv_5= 'name' ( (lv_class_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:225:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'package' ( (lv_package_4_0= RULE_STRING ) ) )? otherlv_5= 'name' ( (lv_class_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:225:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'package' ( (lv_package_4_0= RULE_STRING ) ) )? otherlv_5= 'name' ( (lv_class_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:225:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'package' ( (lv_package_4_0= RULE_STRING ) ) )? otherlv_5= 'name' ( (lv_class_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleJava_Class383); 

                	newLeafNode(otherlv_0, grammarAccess.getJava_ClassAccess().getClassKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:229:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:230:1: (lv_name_1_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:230:1: (lv_name_1_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:231:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJava_Class400); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJava_ClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJava_ClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleJava_Class417); 

                	newLeafNode(otherlv_2, grammarAccess.getJava_ClassAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:251:1: (otherlv_3= 'package' ( (lv_package_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:251:3: otherlv_3= 'package' ( (lv_package_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleJava_Class430); 

                        	newLeafNode(otherlv_3, grammarAccess.getJava_ClassAccess().getPackageKeyword_3_0());
                        
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:255:1: ( (lv_package_4_0= RULE_STRING ) )
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:256:1: (lv_package_4_0= RULE_STRING )
                    {
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:256:1: (lv_package_4_0= RULE_STRING )
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:257:3: lv_package_4_0= RULE_STRING
                    {
                    lv_package_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJava_Class447); 

                    			newLeafNode(lv_package_4_0, grammarAccess.getJava_ClassAccess().getPackageSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJava_ClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"package",
                            		lv_package_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleJava_Class466); 

                	newLeafNode(otherlv_5, grammarAccess.getJava_ClassAccess().getNameKeyword_4());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:277:1: ( (lv_class_name_6_0= RULE_STRING ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:278:1: (lv_class_name_6_0= RULE_STRING )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:278:1: (lv_class_name_6_0= RULE_STRING )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:279:3: lv_class_name_6_0= RULE_STRING
            {
            lv_class_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJava_Class483); 

            			newLeafNode(lv_class_name_6_0, grammarAccess.getJava_ClassAccess().getClass_nameSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJava_ClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class_name",
                    		lv_class_name_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleJava_Class500); 

                	newLeafNode(otherlv_7, grammarAccess.getJava_ClassAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJava_Class"


    // $ANTLR start "entryRuleClasses"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:307:1: entryRuleClasses returns [EObject current=null] : iv_ruleClasses= ruleClasses EOF ;
    public final EObject entryRuleClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasses = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:308:2: (iv_ruleClasses= ruleClasses EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:309:2: iv_ruleClasses= ruleClasses EOF
            {
             newCompositeNode(grammarAccess.getClassesRule()); 
            pushFollow(FOLLOW_ruleClasses_in_entryRuleClasses536);
            iv_ruleClasses=ruleClasses();

            state._fsp--;

             current =iv_ruleClasses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClasses546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClasses"


    // $ANTLR start "ruleClasses"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:316:1: ruleClasses returns [EObject current=null] : (otherlv_0= 'classes' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleClasses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:319:28: ( (otherlv_0= 'classes' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:320:1: (otherlv_0= 'classes' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:320:1: (otherlv_0= 'classes' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:320:3: otherlv_0= 'classes' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleClasses583); 

                	newLeafNode(otherlv_0, grammarAccess.getClassesAccess().getClassesKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:324:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:325:1: (lv_name_1_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:325:1: (lv_name_1_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:326:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClasses600); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleClasses617); 

                	newLeafNode(otherlv_2, grammarAccess.getClassesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:346:1: ( (otherlv_3= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:347:1: (otherlv_3= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:347:1: (otherlv_3= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:348:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassesRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClasses637); 

            		newLeafNode(otherlv_3, grammarAccess.getClassesAccess().getClassesJava_ClassCrossReference_3_0()); 
            	

            }


            }

            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:359:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:359:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleClasses650); 

            	        	newLeafNode(otherlv_4, grammarAccess.getClassesAccess().getCommaKeyword_4_0());
            	        
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:363:1: ( (otherlv_5= RULE_ID ) )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:364:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:364:1: (otherlv_5= RULE_ID )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:365:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getClassesRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClasses670); 

            	    		newLeafNode(otherlv_5, grammarAccess.getClassesAccess().getClassesJava_ClassCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleClasses684); 

                	newLeafNode(otherlv_6, grammarAccess.getClassesAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClasses"


    // $ANTLR start "entryRuleJava_Method"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:388:1: entryRuleJava_Method returns [EObject current=null] : iv_ruleJava_Method= ruleJava_Method EOF ;
    public final EObject entryRuleJava_Method() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJava_Method = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:389:2: (iv_ruleJava_Method= ruleJava_Method EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:390:2: iv_ruleJava_Method= ruleJava_Method EOF
            {
             newCompositeNode(grammarAccess.getJava_MethodRule()); 
            pushFollow(FOLLOW_ruleJava_Method_in_entryRuleJava_Method720);
            iv_ruleJava_Method=ruleJava_Method();

            state._fsp--;

             current =iv_ruleJava_Method; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJava_Method730); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJava_Method"


    // $ANTLR start "ruleJava_Method"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:397:1: ruleJava_Method returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_method_name_4_0= RULE_STRING ) ) (otherlv_5= 'params' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleJava_Method() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_method_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:400:28: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_method_name_4_0= RULE_STRING ) ) (otherlv_5= 'params' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:401:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_method_name_4_0= RULE_STRING ) ) (otherlv_5= 'params' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:401:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_method_name_4_0= RULE_STRING ) ) (otherlv_5= 'params' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:401:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_method_name_4_0= RULE_STRING ) ) (otherlv_5= 'params' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleJava_Method767); 

                	newLeafNode(otherlv_0, grammarAccess.getJava_MethodAccess().getMethodKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:405:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:406:1: (lv_name_1_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:406:1: (lv_name_1_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:407:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJava_Method784); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJava_MethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJava_MethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleJava_Method801); 

                	newLeafNode(otherlv_2, grammarAccess.getJava_MethodAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleJava_Method813); 

                	newLeafNode(otherlv_3, grammarAccess.getJava_MethodAccess().getNameKeyword_3());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:431:1: ( (lv_method_name_4_0= RULE_STRING ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:432:1: (lv_method_name_4_0= RULE_STRING )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:432:1: (lv_method_name_4_0= RULE_STRING )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:433:3: lv_method_name_4_0= RULE_STRING
            {
            lv_method_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJava_Method830); 

            			newLeafNode(lv_method_name_4_0, grammarAccess.getJava_MethodAccess().getMethod_nameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJava_MethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"method_name",
                    		lv_method_name_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:449:2: (otherlv_5= 'params' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:449:4: otherlv_5= 'params' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleJava_Method848); 

                        	newLeafNode(otherlv_5, grammarAccess.getJava_MethodAccess().getParamsKeyword_5_0());
                        
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:453:1: ( (otherlv_6= RULE_ID ) )
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:454:1: (otherlv_6= RULE_ID )
                    {
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:454:1: (otherlv_6= RULE_ID )
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:455:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getJava_MethodRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJava_Method868); 

                    		newLeafNode(otherlv_6, grammarAccess.getJava_MethodAccess().getParamsJava_ClassCrossReference_5_1_0()); 
                    	

                    }


                    }

                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:466:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:466:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleJava_Method881); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getJava_MethodAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:470:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:471:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:471:1: (otherlv_8= RULE_ID )
                    	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:472:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getJava_MethodRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJava_Method901); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getJava_MethodAccess().getParamsJava_ClassCrossReference_5_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleJava_Method917); 

                	newLeafNode(otherlv_9, grammarAccess.getJava_MethodAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJava_Method"


    // $ANTLR start "entryRuleJava_Field"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:497:1: entryRuleJava_Field returns [EObject current=null] : iv_ruleJava_Field= ruleJava_Field EOF ;
    public final EObject entryRuleJava_Field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJava_Field = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:498:2: (iv_ruleJava_Field= ruleJava_Field EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:499:2: iv_ruleJava_Field= ruleJava_Field EOF
            {
             newCompositeNode(grammarAccess.getJava_FieldRule()); 
            pushFollow(FOLLOW_ruleJava_Field_in_entryRuleJava_Field955);
            iv_ruleJava_Field=ruleJava_Field();

            state._fsp--;

             current =iv_ruleJava_Field; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJava_Field965); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJava_Field"


    // $ANTLR start "ruleJava_Field"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:506:1: ruleJava_Field returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_field_name_4_0= RULE_STRING ) ) otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
    public final EObject ruleJava_Field() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_field_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:509:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_field_name_4_0= RULE_STRING ) ) otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:510:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_field_name_4_0= RULE_STRING ) ) otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:510:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_field_name_4_0= RULE_STRING ) ) otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:510:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_field_name_4_0= RULE_STRING ) ) otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleJava_Field1002); 

                	newLeafNode(otherlv_0, grammarAccess.getJava_FieldAccess().getFieldKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:514:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:515:1: (lv_name_1_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:515:1: (lv_name_1_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:516:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJava_Field1019); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJava_FieldAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJava_FieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleJava_Field1036); 

                	newLeafNode(otherlv_2, grammarAccess.getJava_FieldAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleJava_Field1048); 

                	newLeafNode(otherlv_3, grammarAccess.getJava_FieldAccess().getNameKeyword_3());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:540:1: ( (lv_field_name_4_0= RULE_STRING ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:541:1: (lv_field_name_4_0= RULE_STRING )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:541:1: (lv_field_name_4_0= RULE_STRING )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:542:3: lv_field_name_4_0= RULE_STRING
            {
            lv_field_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJava_Field1065); 

            			newLeafNode(lv_field_name_4_0, grammarAccess.getJava_FieldAccess().getField_nameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJava_FieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"field_name",
                    		lv_field_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJava_Field1082); 

                	newLeafNode(otherlv_5, grammarAccess.getJava_FieldAccess().getTypeKeyword_5());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:562:1: ( (otherlv_6= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:563:1: (otherlv_6= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:563:1: (otherlv_6= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:564:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJava_FieldRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJava_Field1102); 

            		newLeafNode(otherlv_6, grammarAccess.getJava_FieldAccess().getTypeJava_ClassCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleJava_Field1114); 

                	newLeafNode(otherlv_7, grammarAccess.getJava_FieldAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJava_Field"


    // $ANTLR start "entryRuleTest_Case"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:589:1: entryRuleTest_Case returns [EObject current=null] : iv_ruleTest_Case= ruleTest_Case EOF ;
    public final EObject entryRuleTest_Case() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest_Case = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:590:2: (iv_ruleTest_Case= ruleTest_Case EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:591:2: iv_ruleTest_Case= ruleTest_Case EOF
            {
             newCompositeNode(grammarAccess.getTest_CaseRule()); 
            pushFollow(FOLLOW_ruleTest_Case_in_entryRuleTest_Case1152);
            iv_ruleTest_Case=ruleTest_Case();

            state._fsp--;

             current =iv_ruleTest_Case; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest_Case1162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest_Case"


    // $ANTLR start "ruleTest_Case"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:598:1: ruleTest_Case returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'program' ( (lv_java_program_6_0= RULE_STRING ) ) ( (lv_test_flow_7_0= ruleTest_Flow ) ) otherlv_8= '}' ) ;
    public final EObject ruleTest_Case() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_java_program_6_0=null;
        Token otherlv_8=null;
        EObject lv_test_flow_7_0 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:601:28: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'program' ( (lv_java_program_6_0= RULE_STRING ) ) ( (lv_test_flow_7_0= ruleTest_Flow ) ) otherlv_8= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:602:1: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'program' ( (lv_java_program_6_0= RULE_STRING ) ) ( (lv_test_flow_7_0= ruleTest_Flow ) ) otherlv_8= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:602:1: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'program' ( (lv_java_program_6_0= RULE_STRING ) ) ( (lv_test_flow_7_0= ruleTest_Flow ) ) otherlv_8= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:602:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'program' ( (lv_java_program_6_0= RULE_STRING ) ) ( (lv_test_flow_7_0= ruleTest_Flow ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTest_Case1199); 

                	newLeafNode(otherlv_0, grammarAccess.getTest_CaseAccess().getCaseKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:606:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:607:1: (lv_name_1_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:607:1: (lv_name_1_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:608:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTest_Case1216); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTest_CaseAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTest_CaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTest_Case1233); 

                	newLeafNode(otherlv_2, grammarAccess.getTest_CaseAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleTest_Case1245); 

                	newLeafNode(otherlv_3, grammarAccess.getTest_CaseAccess().getDescriptionKeyword_3());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:632:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:633:1: (lv_description_4_0= RULE_STRING )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:633:1: (lv_description_4_0= RULE_STRING )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:634:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTest_Case1262); 

            			newLeafNode(lv_description_4_0, grammarAccess.getTest_CaseAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTest_CaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleTest_Case1279); 

                	newLeafNode(otherlv_5, grammarAccess.getTest_CaseAccess().getProgramKeyword_5());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:654:1: ( (lv_java_program_6_0= RULE_STRING ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:655:1: (lv_java_program_6_0= RULE_STRING )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:655:1: (lv_java_program_6_0= RULE_STRING )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:656:3: lv_java_program_6_0= RULE_STRING
            {
            lv_java_program_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTest_Case1296); 

            			newLeafNode(lv_java_program_6_0, grammarAccess.getTest_CaseAccess().getJava_programSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTest_CaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"java_program",
                    		lv_java_program_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:672:2: ( (lv_test_flow_7_0= ruleTest_Flow ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:673:1: (lv_test_flow_7_0= ruleTest_Flow )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:673:1: (lv_test_flow_7_0= ruleTest_Flow )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:674:3: lv_test_flow_7_0= ruleTest_Flow
            {
             
            	        newCompositeNode(grammarAccess.getTest_CaseAccess().getTest_flowTest_FlowParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTest_Flow_in_ruleTest_Case1322);
            lv_test_flow_7_0=ruleTest_Flow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTest_CaseRule());
            	        }
                   		set(
                   			current, 
                   			"test_flow",
                    		lv_test_flow_7_0, 
                    		"Test_Flow");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTest_Case1334); 

                	newLeafNode(otherlv_8, grammarAccess.getTest_CaseAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest_Case"


    // $ANTLR start "entryRuleRefactoring_Instance"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:702:1: entryRuleRefactoring_Instance returns [EObject current=null] : iv_ruleRefactoring_Instance= ruleRefactoring_Instance EOF ;
    public final EObject entryRuleRefactoring_Instance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefactoring_Instance = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:703:2: (iv_ruleRefactoring_Instance= ruleRefactoring_Instance EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:704:2: iv_ruleRefactoring_Instance= ruleRefactoring_Instance EOF
            {
             newCompositeNode(grammarAccess.getRefactoring_InstanceRule()); 
            pushFollow(FOLLOW_ruleRefactoring_Instance_in_entryRuleRefactoring_Instance1370);
            iv_ruleRefactoring_Instance=ruleRefactoring_Instance();

            state._fsp--;

             current =iv_ruleRefactoring_Instance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefactoring_Instance1380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefactoring_Instance"


    // $ANTLR start "ruleRefactoring_Instance"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:711:1: ruleRefactoring_Instance returns [EObject current=null] : (this_Pull_Up_Refactoring_0= rulePull_Up_Refactoring | this_Create_Superclass_Refactoring_1= ruleCreate_Superclass_Refactoring ) ;
    public final EObject ruleRefactoring_Instance() throws RecognitionException {
        EObject current = null;

        EObject this_Pull_Up_Refactoring_0 = null;

        EObject this_Create_Superclass_Refactoring_1 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:714:28: ( (this_Pull_Up_Refactoring_0= rulePull_Up_Refactoring | this_Create_Superclass_Refactoring_1= ruleCreate_Superclass_Refactoring ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:715:1: (this_Pull_Up_Refactoring_0= rulePull_Up_Refactoring | this_Create_Superclass_Refactoring_1= ruleCreate_Superclass_Refactoring )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:715:1: (this_Pull_Up_Refactoring_0= rulePull_Up_Refactoring | this_Create_Superclass_Refactoring_1= ruleCreate_Superclass_Refactoring )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:716:5: this_Pull_Up_Refactoring_0= rulePull_Up_Refactoring
                    {
                     
                            newCompositeNode(grammarAccess.getRefactoring_InstanceAccess().getPull_Up_RefactoringParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePull_Up_Refactoring_in_ruleRefactoring_Instance1427);
                    this_Pull_Up_Refactoring_0=rulePull_Up_Refactoring();

                    state._fsp--;

                     
                            current = this_Pull_Up_Refactoring_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:726:5: this_Create_Superclass_Refactoring_1= ruleCreate_Superclass_Refactoring
                    {
                     
                            newCompositeNode(grammarAccess.getRefactoring_InstanceAccess().getCreate_Superclass_RefactoringParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCreate_Superclass_Refactoring_in_ruleRefactoring_Instance1454);
                    this_Create_Superclass_Refactoring_1=ruleCreate_Superclass_Refactoring();

                    state._fsp--;

                     
                            current = this_Create_Superclass_Refactoring_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefactoring_Instance"


    // $ANTLR start "entryRulePull_Up_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:744:1: entryRulePull_Up_Refactoring returns [EObject current=null] : iv_rulePull_Up_Refactoring= rulePull_Up_Refactoring EOF ;
    public final EObject entryRulePull_Up_Refactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull_Up_Refactoring = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:745:2: (iv_rulePull_Up_Refactoring= rulePull_Up_Refactoring EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:746:2: iv_rulePull_Up_Refactoring= rulePull_Up_Refactoring EOF
            {
             newCompositeNode(grammarAccess.getPull_Up_RefactoringRule()); 
            pushFollow(FOLLOW_rulePull_Up_Refactoring_in_entryRulePull_Up_Refactoring1491);
            iv_rulePull_Up_Refactoring=rulePull_Up_Refactoring();

            state._fsp--;

             current =iv_rulePull_Up_Refactoring; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePull_Up_Refactoring1501); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePull_Up_Refactoring"


    // $ANTLR start "rulePull_Up_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:753:1: rulePull_Up_Refactoring returns [EObject current=null] : (otherlv_0= 'pullup_method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parent' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'method' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
    public final EObject rulePull_Up_Refactoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:756:28: ( (otherlv_0= 'pullup_method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parent' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'method' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:757:1: (otherlv_0= 'pullup_method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parent' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'method' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:757:1: (otherlv_0= 'pullup_method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parent' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'method' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:757:3: otherlv_0= 'pullup_method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parent' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'method' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulePull_Up_Refactoring1538); 

                	newLeafNode(otherlv_0, grammarAccess.getPull_Up_RefactoringAccess().getPullup_methodKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:761:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:762:1: (lv_name_1_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:762:1: (lv_name_1_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:763:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePull_Up_Refactoring1555); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPull_Up_RefactoringAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPull_Up_RefactoringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePull_Up_Refactoring1572); 

                	newLeafNode(otherlv_2, grammarAccess.getPull_Up_RefactoringAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_rulePull_Up_Refactoring1584); 

                	newLeafNode(otherlv_3, grammarAccess.getPull_Up_RefactoringAccess().getParentKeyword_3());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:787:1: ( (otherlv_4= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:788:1: (otherlv_4= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:788:1: (otherlv_4= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:789:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPull_Up_RefactoringRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePull_Up_Refactoring1604); 

            		newLeafNode(otherlv_4, grammarAccess.getPull_Up_RefactoringAccess().getParentJava_ClassCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_rulePull_Up_Refactoring1616); 

                	newLeafNode(otherlv_5, grammarAccess.getPull_Up_RefactoringAccess().getMethodKeyword_5());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:804:1: ( (otherlv_6= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:805:1: (otherlv_6= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:805:1: (otherlv_6= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:806:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPull_Up_RefactoringRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePull_Up_Refactoring1636); 

            		newLeafNode(otherlv_6, grammarAccess.getPull_Up_RefactoringAccess().getMethodJava_MethodCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_rulePull_Up_Refactoring1648); 

                	newLeafNode(otherlv_7, grammarAccess.getPull_Up_RefactoringAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePull_Up_Refactoring"


    // $ANTLR start "entryRuleCreate_Superclass_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:829:1: entryRuleCreate_Superclass_Refactoring returns [EObject current=null] : iv_ruleCreate_Superclass_Refactoring= ruleCreate_Superclass_Refactoring EOF ;
    public final EObject entryRuleCreate_Superclass_Refactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate_Superclass_Refactoring = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:830:2: (iv_ruleCreate_Superclass_Refactoring= ruleCreate_Superclass_Refactoring EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:831:2: iv_ruleCreate_Superclass_Refactoring= ruleCreate_Superclass_Refactoring EOF
            {
             newCompositeNode(grammarAccess.getCreate_Superclass_RefactoringRule()); 
            pushFollow(FOLLOW_ruleCreate_Superclass_Refactoring_in_entryRuleCreate_Superclass_Refactoring1684);
            iv_ruleCreate_Superclass_Refactoring=ruleCreate_Superclass_Refactoring();

            state._fsp--;

             current =iv_ruleCreate_Superclass_Refactoring; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate_Superclass_Refactoring1694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreate_Superclass_Refactoring"


    // $ANTLR start "ruleCreate_Superclass_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:838:1: ruleCreate_Superclass_Refactoring returns [EObject current=null] : (otherlv_0= 'create_superclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'child' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
    public final EObject ruleCreate_Superclass_Refactoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:841:28: ( (otherlv_0= 'create_superclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'child' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:842:1: (otherlv_0= 'create_superclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'child' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:842:1: (otherlv_0= 'create_superclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'child' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:842:3: otherlv_0= 'create_superclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'child' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCreate_Superclass_Refactoring1731); 

                	newLeafNode(otherlv_0, grammarAccess.getCreate_Superclass_RefactoringAccess().getCreate_superclassKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:846:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:847:1: (lv_name_1_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:847:1: (lv_name_1_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:848:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreate_Superclass_Refactoring1748); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCreate_Superclass_RefactoringAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreate_Superclass_RefactoringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleCreate_Superclass_Refactoring1765); 

                	newLeafNode(otherlv_2, grammarAccess.getCreate_Superclass_RefactoringAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleCreate_Superclass_Refactoring1777); 

                	newLeafNode(otherlv_3, grammarAccess.getCreate_Superclass_RefactoringAccess().getChildKeyword_3());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:872:1: ( (otherlv_4= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:873:1: (otherlv_4= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:873:1: (otherlv_4= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:874:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreate_Superclass_RefactoringRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreate_Superclass_Refactoring1797); 

            		newLeafNode(otherlv_4, grammarAccess.getCreate_Superclass_RefactoringAccess().getChildClassesCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleCreate_Superclass_Refactoring1809); 

                	newLeafNode(otherlv_5, grammarAccess.getCreate_Superclass_RefactoringAccess().getTargetKeyword_5());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:889:1: ( (otherlv_6= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:890:1: (otherlv_6= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:890:1: (otherlv_6= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:891:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreate_Superclass_RefactoringRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreate_Superclass_Refactoring1829); 

            		newLeafNode(otherlv_6, grammarAccess.getCreate_Superclass_RefactoringAccess().getTargetJava_ClassCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCreate_Superclass_Refactoring1841); 

                	newLeafNode(otherlv_7, grammarAccess.getCreate_Superclass_RefactoringAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreate_Superclass_Refactoring"


    // $ANTLR start "entryRuleTest_Flow"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:914:1: entryRuleTest_Flow returns [EObject current=null] : iv_ruleTest_Flow= ruleTest_Flow EOF ;
    public final EObject entryRuleTest_Flow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest_Flow = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:915:2: (iv_ruleTest_Flow= ruleTest_Flow EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:916:2: iv_ruleTest_Flow= ruleTest_Flow EOF
            {
             newCompositeNode(grammarAccess.getTest_FlowRule()); 
            pushFollow(FOLLOW_ruleTest_Flow_in_entryRuleTest_Flow1877);
            iv_ruleTest_Flow=ruleTest_Flow();

            state._fsp--;

             current =iv_ruleTest_Flow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest_Flow1887); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest_Flow"


    // $ANTLR start "ruleTest_Flow"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:923:1: ruleTest_Flow returns [EObject current=null] : (otherlv_0= 'testflow' otherlv_1= '{' ( (lv_step_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTest_Flow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_step_2_0 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:926:28: ( (otherlv_0= 'testflow' otherlv_1= '{' ( (lv_step_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:927:1: (otherlv_0= 'testflow' otherlv_1= '{' ( (lv_step_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:927:1: (otherlv_0= 'testflow' otherlv_1= '{' ( (lv_step_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:927:3: otherlv_0= 'testflow' otherlv_1= '{' ( (lv_step_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTest_Flow1924); 

                	newLeafNode(otherlv_0, grammarAccess.getTest_FlowAccess().getTestflowKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTest_Flow1936); 

                	newLeafNode(otherlv_1, grammarAccess.getTest_FlowAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:935:1: ( (lv_step_2_0= ruleTest_Step_Element ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=35 && LA7_0<=36)||(LA7_0>=39 && LA7_0<=40)||LA7_0==42||(LA7_0>=44 && LA7_0<=45)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:936:1: (lv_step_2_0= ruleTest_Step_Element )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:936:1: (lv_step_2_0= ruleTest_Step_Element )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:937:3: lv_step_2_0= ruleTest_Step_Element
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTest_FlowAccess().getStepTest_Step_ElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_Step_Element_in_ruleTest_Flow1957);
            	    lv_step_2_0=ruleTest_Step_Element();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTest_FlowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"step",
            	            		lv_step_2_0, 
            	            		"Test_Step_Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTest_Flow1970); 

                	newLeafNode(otherlv_3, grammarAccess.getTest_FlowAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest_Flow"


    // $ANTLR start "entryRuleTest_Step"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:965:1: entryRuleTest_Step returns [EObject current=null] : iv_ruleTest_Step= ruleTest_Step EOF ;
    public final EObject entryRuleTest_Step() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest_Step = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:966:2: (iv_ruleTest_Step= ruleTest_Step EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:967:2: iv_ruleTest_Step= ruleTest_Step EOF
            {
             newCompositeNode(grammarAccess.getTest_StepRule()); 
            pushFollow(FOLLOW_ruleTest_Step_in_entryRuleTest_Step2006);
            iv_ruleTest_Step=ruleTest_Step();

            state._fsp--;

             current =iv_ruleTest_Step; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest_Step2016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest_Step"


    // $ANTLR start "ruleTest_Step"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:974:1: ruleTest_Step returns [EObject current=null] : (otherlv_0= 'step' otherlv_1= '{' ( (lv_elements_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTest_Step() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:977:28: ( (otherlv_0= 'step' otherlv_1= '{' ( (lv_elements_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:978:1: (otherlv_0= 'step' otherlv_1= '{' ( (lv_elements_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:978:1: (otherlv_0= 'step' otherlv_1= '{' ( (lv_elements_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:978:3: otherlv_0= 'step' otherlv_1= '{' ( (lv_elements_2_0= ruleTest_Step_Element ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTest_Step2053); 

                	newLeafNode(otherlv_0, grammarAccess.getTest_StepAccess().getStepKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTest_Step2065); 

                	newLeafNode(otherlv_1, grammarAccess.getTest_StepAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:986:1: ( (lv_elements_2_0= ruleTest_Step_Element ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=35 && LA8_0<=36)||(LA8_0>=39 && LA8_0<=40)||LA8_0==42||(LA8_0>=44 && LA8_0<=45)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:987:1: (lv_elements_2_0= ruleTest_Step_Element )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:987:1: (lv_elements_2_0= ruleTest_Step_Element )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:988:3: lv_elements_2_0= ruleTest_Step_Element
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTest_StepAccess().getElementsTest_Step_ElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_Step_Element_in_ruleTest_Step2086);
            	    lv_elements_2_0=ruleTest_Step_Element();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTest_StepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"Test_Step_Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTest_Step2099); 

                	newLeafNode(otherlv_3, grammarAccess.getTest_StepAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest_Step"


    // $ANTLR start "entryRuleTest_Step_Element"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1016:1: entryRuleTest_Step_Element returns [EObject current=null] : iv_ruleTest_Step_Element= ruleTest_Step_Element EOF ;
    public final EObject entryRuleTest_Step_Element() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest_Step_Element = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1017:2: (iv_ruleTest_Step_Element= ruleTest_Step_Element EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1018:2: iv_ruleTest_Step_Element= ruleTest_Step_Element EOF
            {
             newCompositeNode(grammarAccess.getTest_Step_ElementRule()); 
            pushFollow(FOLLOW_ruleTest_Step_Element_in_entryRuleTest_Step_Element2135);
            iv_ruleTest_Step_Element=ruleTest_Step_Element();

            state._fsp--;

             current =iv_ruleTest_Step_Element; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest_Step_Element2145); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest_Step_Element"


    // $ANTLR start "ruleTest_Step_Element"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1025:1: ruleTest_Step_Element returns [EObject current=null] : (this_Assertion_0= ruleAssertion | this_Containment_1= ruleContainment | this_Test_Step_2= ruleTest_Step | this_Compile_3= ruleCompile | this_Synchronize_4= ruleSynchronize | this_Condition_5= ruleCondition | this_Implementation_6= ruleImplementation ) ;
    public final EObject ruleTest_Step_Element() throws RecognitionException {
        EObject current = null;

        EObject this_Assertion_0 = null;

        EObject this_Containment_1 = null;

        EObject this_Test_Step_2 = null;

        EObject this_Compile_3 = null;

        EObject this_Synchronize_4 = null;

        EObject this_Condition_5 = null;

        EObject this_Implementation_6 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1028:28: ( (this_Assertion_0= ruleAssertion | this_Containment_1= ruleContainment | this_Test_Step_2= ruleTest_Step | this_Compile_3= ruleCompile | this_Synchronize_4= ruleSynchronize | this_Condition_5= ruleCondition | this_Implementation_6= ruleImplementation ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1029:1: (this_Assertion_0= ruleAssertion | this_Containment_1= ruleContainment | this_Test_Step_2= ruleTest_Step | this_Compile_3= ruleCompile | this_Synchronize_4= ruleSynchronize | this_Condition_5= ruleCondition | this_Implementation_6= ruleImplementation )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1029:1: (this_Assertion_0= ruleAssertion | this_Containment_1= ruleContainment | this_Test_Step_2= ruleTest_Step | this_Compile_3= ruleCompile | this_Synchronize_4= ruleSynchronize | this_Condition_5= ruleCondition | this_Implementation_6= ruleImplementation )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 36:
            case 39:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( ((LA9_2>=49 && LA9_2<=50)) ) {
                    alt9=2;
                }
                else if ( ((LA9_2>=51 && LA9_2<=52)) ) {
                    alt9=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 44:
                {
                alt9=4;
                }
                break;
            case 45:
                {
                alt9=5;
                }
                break;
            case 40:
            case 42:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1030:5: this_Assertion_0= ruleAssertion
                    {
                     
                            newCompositeNode(grammarAccess.getTest_Step_ElementAccess().getAssertionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAssertion_in_ruleTest_Step_Element2192);
                    this_Assertion_0=ruleAssertion();

                    state._fsp--;

                     
                            current = this_Assertion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1040:5: this_Containment_1= ruleContainment
                    {
                     
                            newCompositeNode(grammarAccess.getTest_Step_ElementAccess().getContainmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContainment_in_ruleTest_Step_Element2219);
                    this_Containment_1=ruleContainment();

                    state._fsp--;

                     
                            current = this_Containment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1050:5: this_Test_Step_2= ruleTest_Step
                    {
                     
                            newCompositeNode(grammarAccess.getTest_Step_ElementAccess().getTest_StepParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTest_Step_in_ruleTest_Step_Element2246);
                    this_Test_Step_2=ruleTest_Step();

                    state._fsp--;

                     
                            current = this_Test_Step_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1060:5: this_Compile_3= ruleCompile
                    {
                     
                            newCompositeNode(grammarAccess.getTest_Step_ElementAccess().getCompileParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCompile_in_ruleTest_Step_Element2273);
                    this_Compile_3=ruleCompile();

                    state._fsp--;

                     
                            current = this_Compile_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1070:5: this_Synchronize_4= ruleSynchronize
                    {
                     
                            newCompositeNode(grammarAccess.getTest_Step_ElementAccess().getSynchronizeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSynchronize_in_ruleTest_Step_Element2300);
                    this_Synchronize_4=ruleSynchronize();

                    state._fsp--;

                     
                            current = this_Synchronize_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1080:5: this_Condition_5= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getTest_Step_ElementAccess().getConditionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleTest_Step_Element2327);
                    this_Condition_5=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1090:5: this_Implementation_6= ruleImplementation
                    {
                     
                            newCompositeNode(grammarAccess.getTest_Step_ElementAccess().getImplementationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleImplementation_in_ruleTest_Step_Element2354);
                    this_Implementation_6=ruleImplementation();

                    state._fsp--;

                     
                            current = this_Implementation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest_Step_Element"


    // $ANTLR start "entryRuleAssertion"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1106:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1107:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1108:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion2389);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion2399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1115:1: ruleAssertion returns [EObject current=null] : (this_Assert_False_0= ruleAssert_False | this_Assert_True_1= ruleAssert_True ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        EObject this_Assert_False_0 = null;

        EObject this_Assert_True_1 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1118:28: ( (this_Assert_False_0= ruleAssert_False | this_Assert_True_1= ruleAssert_True ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1119:1: (this_Assert_False_0= ruleAssert_False | this_Assert_True_1= ruleAssert_True )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1119:1: (this_Assert_False_0= ruleAssert_False | this_Assert_True_1= ruleAssert_True )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1120:5: this_Assert_False_0= ruleAssert_False
                    {
                     
                            newCompositeNode(grammarAccess.getAssertionAccess().getAssert_FalseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAssert_False_in_ruleAssertion2446);
                    this_Assert_False_0=ruleAssert_False();

                    state._fsp--;

                     
                            current = this_Assert_False_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1130:5: this_Assert_True_1= ruleAssert_True
                    {
                     
                            newCompositeNode(grammarAccess.getAssertionAccess().getAssert_TrueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssert_True_in_ruleAssertion2473);
                    this_Assert_True_1=ruleAssert_True();

                    state._fsp--;

                     
                            current = this_Assert_True_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleAssert_False"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1146:1: entryRuleAssert_False returns [EObject current=null] : iv_ruleAssert_False= ruleAssert_False EOF ;
    public final EObject entryRuleAssert_False() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert_False = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1147:2: (iv_ruleAssert_False= ruleAssert_False EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1148:2: iv_ruleAssert_False= ruleAssert_False EOF
            {
             newCompositeNode(grammarAccess.getAssert_FalseRule()); 
            pushFollow(FOLLOW_ruleAssert_False_in_entryRuleAssert_False2508);
            iv_ruleAssert_False=ruleAssert_False();

            state._fsp--;

             current =iv_ruleAssert_False; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert_False2518); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssert_False"


    // $ANTLR start "ruleAssert_False"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1155:1: ruleAssert_False returns [EObject current=null] : (otherlv_0= 'assertFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleAssert_False() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1158:28: ( (otherlv_0= 'assertFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1159:1: (otherlv_0= 'assertFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1159:1: (otherlv_0= 'assertFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1159:3: otherlv_0= 'assertFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleAssert_False2555); 

                	newLeafNode(otherlv_0, grammarAccess.getAssert_FalseAccess().getAssertFalseKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAssert_False2567); 

                	newLeafNode(otherlv_1, grammarAccess.getAssert_FalseAccess().getLeftParenthesisKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1167:1: ( (otherlv_2= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1168:1: (otherlv_2= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1168:1: (otherlv_2= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1169:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssert_FalseRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssert_False2587); 

            		newLeafNode(otherlv_2, grammarAccess.getAssert_FalseAccess().getInputRefactoringCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleAssert_False2599); 

                	newLeafNode(otherlv_3, grammarAccess.getAssert_FalseAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssert_False"


    // $ANTLR start "entryRuleAssert_True"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1192:1: entryRuleAssert_True returns [EObject current=null] : iv_ruleAssert_True= ruleAssert_True EOF ;
    public final EObject entryRuleAssert_True() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert_True = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1193:2: (iv_ruleAssert_True= ruleAssert_True EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1194:2: iv_ruleAssert_True= ruleAssert_True EOF
            {
             newCompositeNode(grammarAccess.getAssert_TrueRule()); 
            pushFollow(FOLLOW_ruleAssert_True_in_entryRuleAssert_True2635);
            iv_ruleAssert_True=ruleAssert_True();

            state._fsp--;

             current =iv_ruleAssert_True; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert_True2645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssert_True"


    // $ANTLR start "ruleAssert_True"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1201:1: ruleAssert_True returns [EObject current=null] : (otherlv_0= 'assertTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleAssert_True() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1204:28: ( (otherlv_0= 'assertTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1205:1: (otherlv_0= 'assertTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1205:1: (otherlv_0= 'assertTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1205:3: otherlv_0= 'assertTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleAssert_True2682); 

                	newLeafNode(otherlv_0, grammarAccess.getAssert_TrueAccess().getAssertTrueKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAssert_True2694); 

                	newLeafNode(otherlv_1, grammarAccess.getAssert_TrueAccess().getLeftParenthesisKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1213:1: ( (otherlv_2= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1214:1: (otherlv_2= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1214:1: (otherlv_2= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1215:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssert_TrueRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssert_True2714); 

            		newLeafNode(otherlv_2, grammarAccess.getAssert_TrueAccess().getInputRefactoringCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleAssert_True2726); 

                	newLeafNode(otherlv_3, grammarAccess.getAssert_TrueAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssert_True"


    // $ANTLR start "entryRuleCondition"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1238:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1239:2: (iv_ruleCondition= ruleCondition EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1240:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2762);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2772); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1247:1: ruleCondition returns [EObject current=null] : (this_Expect_True_0= ruleExpect_True | this_Expect_False_1= ruleExpect_False ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Expect_True_0 = null;

        EObject this_Expect_False_1 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1250:28: ( (this_Expect_True_0= ruleExpect_True | this_Expect_False_1= ruleExpect_False ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1251:1: (this_Expect_True_0= ruleExpect_True | this_Expect_False_1= ruleExpect_False )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1251:1: (this_Expect_True_0= ruleExpect_True | this_Expect_False_1= ruleExpect_False )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            else if ( (LA11_0==42) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1252:5: this_Expect_True_0= ruleExpect_True
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getExpect_TrueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpect_True_in_ruleCondition2819);
                    this_Expect_True_0=ruleExpect_True();

                    state._fsp--;

                     
                            current = this_Expect_True_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1262:5: this_Expect_False_1= ruleExpect_False
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getExpect_FalseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpect_False_in_ruleCondition2846);
                    this_Expect_False_1=ruleExpect_False();

                    state._fsp--;

                     
                            current = this_Expect_False_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpect_True"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1278:1: entryRuleExpect_True returns [EObject current=null] : iv_ruleExpect_True= ruleExpect_True EOF ;
    public final EObject entryRuleExpect_True() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpect_True = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1279:2: (iv_ruleExpect_True= ruleExpect_True EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1280:2: iv_ruleExpect_True= ruleExpect_True EOF
            {
             newCompositeNode(grammarAccess.getExpect_TrueRule()); 
            pushFollow(FOLLOW_ruleExpect_True_in_entryRuleExpect_True2881);
            iv_ruleExpect_True=ruleExpect_True();

            state._fsp--;

             current =iv_ruleExpect_True; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpect_True2891); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpect_True"


    // $ANTLR start "ruleExpect_True"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1287:1: ruleExpect_True returns [EObject current=null] : (otherlv_0= 'expectTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_true_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_false_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}' ) ;
    public final EObject ruleExpect_True() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_true_steps_5_0 = null;

        EObject lv_warning_9_0 = null;

        EObject lv_false_steps_10_0 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1290:28: ( (otherlv_0= 'expectTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_true_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_false_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1291:1: (otherlv_0= 'expectTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_true_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_false_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1291:1: (otherlv_0= 'expectTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_true_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_false_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1291:3: otherlv_0= 'expectTrue' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_true_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_false_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleExpect_True2928); 

                	newLeafNode(otherlv_0, grammarAccess.getExpect_TrueAccess().getExpectTrueKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleExpect_True2940); 

                	newLeafNode(otherlv_1, grammarAccess.getExpect_TrueAccess().getLeftParenthesisKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1299:1: ( (otherlv_2= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1300:1: (otherlv_2= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1300:1: (otherlv_2= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1301:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpect_TrueRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpect_True2960); 

            		newLeafNode(otherlv_2, grammarAccess.getExpect_TrueAccess().getRefactoringRefactoringCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleExpect_True2972); 

                	newLeafNode(otherlv_3, grammarAccess.getExpect_TrueAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExpect_True2984); 

                	newLeafNode(otherlv_4, grammarAccess.getExpect_TrueAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1320:1: ( (lv_true_steps_5_0= ruleTest_Step_Element ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=35 && LA12_0<=36)||(LA12_0>=39 && LA12_0<=40)||LA12_0==42||(LA12_0>=44 && LA12_0<=45)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1321:1: (lv_true_steps_5_0= ruleTest_Step_Element )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1321:1: (lv_true_steps_5_0= ruleTest_Step_Element )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1322:3: lv_true_steps_5_0= ruleTest_Step_Element
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpect_TrueAccess().getTrue_stepsTest_Step_ElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_Step_Element_in_ruleExpect_True3005);
            	    lv_true_steps_5_0=ruleTest_Step_Element();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpect_TrueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"true_steps",
            	            		lv_true_steps_5_0, 
            	            		"Test_Step_Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleExpect_True3018); 

                	newLeafNode(otherlv_6, grammarAccess.getExpect_TrueAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleExpect_True3030); 

                	newLeafNode(otherlv_7, grammarAccess.getExpect_TrueAccess().getElseKeyword_7());
                
            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleExpect_True3042); 

                	newLeafNode(otherlv_8, grammarAccess.getExpect_TrueAccess().getLeftCurlyBracketKeyword_8());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1350:1: ( (lv_warning_9_0= ruleWarning ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1351:1: (lv_warning_9_0= ruleWarning )
                    {
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1351:1: (lv_warning_9_0= ruleWarning )
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1352:3: lv_warning_9_0= ruleWarning
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpect_TrueAccess().getWarningWarningParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWarning_in_ruleExpect_True3063);
                    lv_warning_9_0=ruleWarning();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpect_TrueRule());
                    	        }
                           		set(
                           			current, 
                           			"warning",
                            		lv_warning_9_0, 
                            		"Warning");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1368:3: ( (lv_false_steps_10_0= ruleTest_Step_Element ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=35 && LA14_0<=36)||(LA14_0>=39 && LA14_0<=40)||LA14_0==42||(LA14_0>=44 && LA14_0<=45)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1369:1: (lv_false_steps_10_0= ruleTest_Step_Element )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1369:1: (lv_false_steps_10_0= ruleTest_Step_Element )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1370:3: lv_false_steps_10_0= ruleTest_Step_Element
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpect_TrueAccess().getFalse_stepsTest_Step_ElementParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_Step_Element_in_ruleExpect_True3085);
            	    lv_false_steps_10_0=ruleTest_Step_Element();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpect_TrueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"false_steps",
            	            		lv_false_steps_10_0, 
            	            		"Test_Step_Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleExpect_True3098); 

                	newLeafNode(otherlv_11, grammarAccess.getExpect_TrueAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpect_True"


    // $ANTLR start "entryRuleExpect_False"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1398:1: entryRuleExpect_False returns [EObject current=null] : iv_ruleExpect_False= ruleExpect_False EOF ;
    public final EObject entryRuleExpect_False() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpect_False = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1399:2: (iv_ruleExpect_False= ruleExpect_False EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1400:2: iv_ruleExpect_False= ruleExpect_False EOF
            {
             newCompositeNode(grammarAccess.getExpect_FalseRule()); 
            pushFollow(FOLLOW_ruleExpect_False_in_entryRuleExpect_False3134);
            iv_ruleExpect_False=ruleExpect_False();

            state._fsp--;

             current =iv_ruleExpect_False; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpect_False3144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpect_False"


    // $ANTLR start "ruleExpect_False"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1407:1: ruleExpect_False returns [EObject current=null] : (otherlv_0= 'expectFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_false_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_true_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}' ) ;
    public final EObject ruleExpect_False() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_false_steps_5_0 = null;

        EObject lv_warning_9_0 = null;

        EObject lv_true_steps_10_0 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1410:28: ( (otherlv_0= 'expectFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_false_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_true_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1411:1: (otherlv_0= 'expectFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_false_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_true_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1411:1: (otherlv_0= 'expectFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_false_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_true_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1411:3: otherlv_0= 'expectFalse' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_false_steps_5_0= ruleTest_Step_Element ) )+ otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_warning_9_0= ruleWarning ) )? ( (lv_true_steps_10_0= ruleTest_Step_Element ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleExpect_False3181); 

                	newLeafNode(otherlv_0, grammarAccess.getExpect_FalseAccess().getExpectFalseKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleExpect_False3193); 

                	newLeafNode(otherlv_1, grammarAccess.getExpect_FalseAccess().getLeftParenthesisKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1419:1: ( (otherlv_2= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1420:1: (otherlv_2= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1420:1: (otherlv_2= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1421:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpect_FalseRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpect_False3213); 

            		newLeafNode(otherlv_2, grammarAccess.getExpect_FalseAccess().getRefactoringRefactoringCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleExpect_False3225); 

                	newLeafNode(otherlv_3, grammarAccess.getExpect_FalseAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExpect_False3237); 

                	newLeafNode(otherlv_4, grammarAccess.getExpect_FalseAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1440:1: ( (lv_false_steps_5_0= ruleTest_Step_Element ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=35 && LA15_0<=36)||(LA15_0>=39 && LA15_0<=40)||LA15_0==42||(LA15_0>=44 && LA15_0<=45)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1441:1: (lv_false_steps_5_0= ruleTest_Step_Element )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1441:1: (lv_false_steps_5_0= ruleTest_Step_Element )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1442:3: lv_false_steps_5_0= ruleTest_Step_Element
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpect_FalseAccess().getFalse_stepsTest_Step_ElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_Step_Element_in_ruleExpect_False3258);
            	    lv_false_steps_5_0=ruleTest_Step_Element();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpect_FalseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"false_steps",
            	            		lv_false_steps_5_0, 
            	            		"Test_Step_Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleExpect_False3271); 

                	newLeafNode(otherlv_6, grammarAccess.getExpect_FalseAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleExpect_False3283); 

                	newLeafNode(otherlv_7, grammarAccess.getExpect_FalseAccess().getElseKeyword_7());
                
            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleExpect_False3295); 

                	newLeafNode(otherlv_8, grammarAccess.getExpect_FalseAccess().getLeftCurlyBracketKeyword_8());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1470:1: ( (lv_warning_9_0= ruleWarning ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1471:1: (lv_warning_9_0= ruleWarning )
                    {
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1471:1: (lv_warning_9_0= ruleWarning )
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1472:3: lv_warning_9_0= ruleWarning
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpect_FalseAccess().getWarningWarningParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWarning_in_ruleExpect_False3316);
                    lv_warning_9_0=ruleWarning();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpect_FalseRule());
                    	        }
                           		set(
                           			current, 
                           			"warning",
                            		lv_warning_9_0, 
                            		"Warning");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1488:3: ( (lv_true_steps_10_0= ruleTest_Step_Element ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=35 && LA17_0<=36)||(LA17_0>=39 && LA17_0<=40)||LA17_0==42||(LA17_0>=44 && LA17_0<=45)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1489:1: (lv_true_steps_10_0= ruleTest_Step_Element )
            	    {
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1489:1: (lv_true_steps_10_0= ruleTest_Step_Element )
            	    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1490:3: lv_true_steps_10_0= ruleTest_Step_Element
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpect_FalseAccess().getTrue_stepsTest_Step_ElementParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_Step_Element_in_ruleExpect_False3338);
            	    lv_true_steps_10_0=ruleTest_Step_Element();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpect_FalseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"true_steps",
            	            		lv_true_steps_10_0, 
            	            		"Test_Step_Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleExpect_False3351); 

                	newLeafNode(otherlv_11, grammarAccess.getExpect_FalseAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpect_False"


    // $ANTLR start "entryRuleWarning"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1518:1: entryRuleWarning returns [EObject current=null] : iv_ruleWarning= ruleWarning EOF ;
    public final EObject entryRuleWarning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarning = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1519:2: (iv_ruleWarning= ruleWarning EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1520:2: iv_ruleWarning= ruleWarning EOF
            {
             newCompositeNode(grammarAccess.getWarningRule()); 
            pushFollow(FOLLOW_ruleWarning_in_entryRuleWarning3387);
            iv_ruleWarning=ruleWarning();

            state._fsp--;

             current =iv_ruleWarning; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWarning3397); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWarning"


    // $ANTLR start "ruleWarning"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1527:1: ruleWarning returns [EObject current=null] : (otherlv_0= 'warning' ( (lv_message_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWarning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_message_1_0=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1530:28: ( (otherlv_0= 'warning' ( (lv_message_1_0= RULE_STRING ) ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1531:1: (otherlv_0= 'warning' ( (lv_message_1_0= RULE_STRING ) ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1531:1: (otherlv_0= 'warning' ( (lv_message_1_0= RULE_STRING ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1531:3: otherlv_0= 'warning' ( (lv_message_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleWarning3434); 

                	newLeafNode(otherlv_0, grammarAccess.getWarningAccess().getWarningKeyword_0());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1535:1: ( (lv_message_1_0= RULE_STRING ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1536:1: (lv_message_1_0= RULE_STRING )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1536:1: (lv_message_1_0= RULE_STRING )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1537:3: lv_message_1_0= RULE_STRING
            {
            lv_message_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWarning3451); 

            			newLeafNode(lv_message_1_0, grammarAccess.getWarningAccess().getMessageSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWarningRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWarning"


    // $ANTLR start "entryRuleCompile"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1561:1: entryRuleCompile returns [EObject current=null] : iv_ruleCompile= ruleCompile EOF ;
    public final EObject entryRuleCompile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompile = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1562:2: (iv_ruleCompile= ruleCompile EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1563:2: iv_ruleCompile= ruleCompile EOF
            {
             newCompositeNode(grammarAccess.getCompileRule()); 
            pushFollow(FOLLOW_ruleCompile_in_entryRuleCompile3492);
            iv_ruleCompile=ruleCompile();

            state._fsp--;

             current =iv_ruleCompile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompile3502); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompile"


    // $ANTLR start "ruleCompile"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1570:1: ruleCompile returns [EObject current=null] : ( () otherlv_1= 'compile' ) ;
    public final EObject ruleCompile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1573:28: ( ( () otherlv_1= 'compile' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1574:1: ( () otherlv_1= 'compile' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1574:1: ( () otherlv_1= 'compile' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1574:2: () otherlv_1= 'compile'
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1574:2: ()
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1575:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompileAccess().getCompileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleCompile3548); 

                	newLeafNode(otherlv_1, grammarAccess.getCompileAccess().getCompileKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompile"


    // $ANTLR start "entryRuleSynchronize"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1592:1: entryRuleSynchronize returns [EObject current=null] : iv_ruleSynchronize= ruleSynchronize EOF ;
    public final EObject entryRuleSynchronize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronize = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1593:2: (iv_ruleSynchronize= ruleSynchronize EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1594:2: iv_ruleSynchronize= ruleSynchronize EOF
            {
             newCompositeNode(grammarAccess.getSynchronizeRule()); 
            pushFollow(FOLLOW_ruleSynchronize_in_entryRuleSynchronize3584);
            iv_ruleSynchronize=ruleSynchronize();

            state._fsp--;

             current =iv_ruleSynchronize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSynchronize3594); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSynchronize"


    // $ANTLR start "ruleSynchronize"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1601:1: ruleSynchronize returns [EObject current=null] : ( () otherlv_1= 'synchronize' ) ;
    public final EObject ruleSynchronize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1604:28: ( ( () otherlv_1= 'synchronize' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1605:1: ( () otherlv_1= 'synchronize' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1605:1: ( () otherlv_1= 'synchronize' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1605:2: () otherlv_1= 'synchronize'
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1605:2: ()
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1606:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSynchronizeAccess().getSynchronizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleSynchronize3640); 

                	newLeafNode(otherlv_1, grammarAccess.getSynchronizeAccess().getSynchronizeKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSynchronize"


    // $ANTLR start "entryRuleNo_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1623:1: entryRuleNo_Refactoring returns [EObject current=null] : iv_ruleNo_Refactoring= ruleNo_Refactoring EOF ;
    public final EObject entryRuleNo_Refactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNo_Refactoring = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1624:2: (iv_ruleNo_Refactoring= ruleNo_Refactoring EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1625:2: iv_ruleNo_Refactoring= ruleNo_Refactoring EOF
            {
             newCompositeNode(grammarAccess.getNo_RefactoringRule()); 
            pushFollow(FOLLOW_ruleNo_Refactoring_in_entryRuleNo_Refactoring3676);
            iv_ruleNo_Refactoring=ruleNo_Refactoring();

            state._fsp--;

             current =iv_ruleNo_Refactoring; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNo_Refactoring3686); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNo_Refactoring"


    // $ANTLR start "ruleNo_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1632:1: ruleNo_Refactoring returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
    public final EObject ruleNo_Refactoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1635:28: ( ( () otherlv_1= 'none' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1636:1: ( () otherlv_1= 'none' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1636:1: ( () otherlv_1= 'none' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1636:2: () otherlv_1= 'none'
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1636:2: ()
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1637:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNo_RefactoringAccess().getNo_RefactoringAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleNo_Refactoring3732); 

                	newLeafNode(otherlv_1, grammarAccess.getNo_RefactoringAccess().getNoneKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNo_Refactoring"


    // $ANTLR start "entryRulePropose_Pullup_Method_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1656:1: entryRulePropose_Pullup_Method_Refactoring returns [EObject current=null] : iv_rulePropose_Pullup_Method_Refactoring= rulePropose_Pullup_Method_Refactoring EOF ;
    public final EObject entryRulePropose_Pullup_Method_Refactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropose_Pullup_Method_Refactoring = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1657:2: (iv_rulePropose_Pullup_Method_Refactoring= rulePropose_Pullup_Method_Refactoring EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1658:2: iv_rulePropose_Pullup_Method_Refactoring= rulePropose_Pullup_Method_Refactoring EOF
            {
             newCompositeNode(grammarAccess.getPropose_Pullup_Method_RefactoringRule()); 
            pushFollow(FOLLOW_rulePropose_Pullup_Method_Refactoring_in_entryRulePropose_Pullup_Method_Refactoring3770);
            iv_rulePropose_Pullup_Method_Refactoring=rulePropose_Pullup_Method_Refactoring();

            state._fsp--;

             current =iv_rulePropose_Pullup_Method_Refactoring; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropose_Pullup_Method_Refactoring3780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropose_Pullup_Method_Refactoring"


    // $ANTLR start "rulePropose_Pullup_Method_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1665:1: rulePropose_Pullup_Method_Refactoring returns [EObject current=null] : (otherlv_0= 'proposePullUpRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')' ) ;
    public final EObject rulePropose_Pullup_Method_Refactoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_refactoring_2_4 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1668:28: ( (otherlv_0= 'proposePullUpRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1669:1: (otherlv_0= 'proposePullUpRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1669:1: (otherlv_0= 'proposePullUpRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1669:3: otherlv_0= 'proposePullUpRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_rulePropose_Pullup_Method_Refactoring3817); 

                	newLeafNode(otherlv_0, grammarAccess.getPropose_Pullup_Method_RefactoringAccess().getProposePullUpRefactoringKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_rulePropose_Pullup_Method_Refactoring3829); 

                	newLeafNode(otherlv_1, grammarAccess.getPropose_Pullup_Method_RefactoringAccess().getLeftParenthesisKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1677:1: ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1678:1: ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1678:1: ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1679:1: (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1679:1: (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==46) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1680:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropose_Pullup_Method_RefactoringRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropose_Pullup_Method_Refactoring3851); 

                    		newLeafNode(otherlv_2, grammarAccess.getPropose_Pullup_Method_RefactoringAccess().getRefactoringPull_Up_RefactoringCrossReference_2_0_0()); 
                    	

                    }
                    break;
                case 2 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1690:8: lv_refactoring_2_4= ruleNo_Refactoring
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropose_Pullup_Method_RefactoringAccess().getRefactoringNo_RefactoringParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleNo_Refactoring_in_rulePropose_Pullup_Method_Refactoring3870);
                    lv_refactoring_2_4=ruleNo_Refactoring();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropose_Pullup_Method_RefactoringRule());
                    	        }
                           		set(
                           			current, 
                           			"refactoring",
                            		lv_refactoring_2_4, 
                            		"No_Refactoring");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_rulePropose_Pullup_Method_Refactoring3885); 

                	newLeafNode(otherlv_3, grammarAccess.getPropose_Pullup_Method_RefactoringAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropose_Pullup_Method_Refactoring"


    // $ANTLR start "entryRulePropose_Create_Superclass_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1720:1: entryRulePropose_Create_Superclass_Refactoring returns [EObject current=null] : iv_rulePropose_Create_Superclass_Refactoring= rulePropose_Create_Superclass_Refactoring EOF ;
    public final EObject entryRulePropose_Create_Superclass_Refactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropose_Create_Superclass_Refactoring = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1721:2: (iv_rulePropose_Create_Superclass_Refactoring= rulePropose_Create_Superclass_Refactoring EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1722:2: iv_rulePropose_Create_Superclass_Refactoring= rulePropose_Create_Superclass_Refactoring EOF
            {
             newCompositeNode(grammarAccess.getPropose_Create_Superclass_RefactoringRule()); 
            pushFollow(FOLLOW_rulePropose_Create_Superclass_Refactoring_in_entryRulePropose_Create_Superclass_Refactoring3921);
            iv_rulePropose_Create_Superclass_Refactoring=rulePropose_Create_Superclass_Refactoring();

            state._fsp--;

             current =iv_rulePropose_Create_Superclass_Refactoring; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropose_Create_Superclass_Refactoring3931); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropose_Create_Superclass_Refactoring"


    // $ANTLR start "rulePropose_Create_Superclass_Refactoring"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1729:1: rulePropose_Create_Superclass_Refactoring returns [EObject current=null] : (otherlv_0= 'proposeCreateSuperclassRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')' ) ;
    public final EObject rulePropose_Create_Superclass_Refactoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_refactoring_2_4 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1732:28: ( (otherlv_0= 'proposeCreateSuperclassRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')' ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1733:1: (otherlv_0= 'proposeCreateSuperclassRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')' )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1733:1: (otherlv_0= 'proposeCreateSuperclassRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')' )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1733:3: otherlv_0= 'proposeCreateSuperclassRefactoring' otherlv_1= '(' ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulePropose_Create_Superclass_Refactoring3968); 

                	newLeafNode(otherlv_0, grammarAccess.getPropose_Create_Superclass_RefactoringAccess().getProposeCreateSuperclassRefactoringKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_rulePropose_Create_Superclass_Refactoring3980); 

                	newLeafNode(otherlv_1, grammarAccess.getPropose_Create_Superclass_RefactoringAccess().getLeftParenthesisKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1741:1: ( ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1742:1: ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1742:1: ( (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1743:1: (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1743:1: (otherlv_2= RULE_ID | lv_refactoring_2_4= ruleNo_Refactoring )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==46) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1744:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropose_Create_Superclass_RefactoringRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropose_Create_Superclass_Refactoring4002); 

                    		newLeafNode(otherlv_2, grammarAccess.getPropose_Create_Superclass_RefactoringAccess().getRefactoringCreate_Superclass_RefactoringCrossReference_2_0_0()); 
                    	

                    }
                    break;
                case 2 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1754:8: lv_refactoring_2_4= ruleNo_Refactoring
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropose_Create_Superclass_RefactoringAccess().getRefactoringNo_RefactoringParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleNo_Refactoring_in_rulePropose_Create_Superclass_Refactoring4021);
                    lv_refactoring_2_4=ruleNo_Refactoring();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropose_Create_Superclass_RefactoringRule());
                    	        }
                           		set(
                           			current, 
                           			"refactoring",
                            		lv_refactoring_2_4, 
                            		"No_Refactoring");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_rulePropose_Create_Superclass_Refactoring4036); 

                	newLeafNode(otherlv_3, grammarAccess.getPropose_Create_Superclass_RefactoringAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropose_Create_Superclass_Refactoring"


    // $ANTLR start "entryRuleContainment"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1784:1: entryRuleContainment returns [EObject current=null] : iv_ruleContainment= ruleContainment EOF ;
    public final EObject entryRuleContainment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainment = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1785:2: (iv_ruleContainment= ruleContainment EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1786:2: iv_ruleContainment= ruleContainment EOF
            {
             newCompositeNode(grammarAccess.getContainmentRule()); 
            pushFollow(FOLLOW_ruleContainment_in_entryRuleContainment4072);
            iv_ruleContainment=ruleContainment();

            state._fsp--;

             current =iv_ruleContainment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainment4082); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainment"


    // $ANTLR start "ruleContainment"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1793:1: ruleContainment returns [EObject current=null] : (this_Contains_0= ruleContains | this_Contains_Not_1= ruleContains_Not ) ;
    public final EObject ruleContainment() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Contains_Not_1 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1796:28: ( (this_Contains_0= ruleContains | this_Contains_Not_1= ruleContains_Not ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1797:1: (this_Contains_0= ruleContains | this_Contains_Not_1= ruleContains_Not )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1797:1: (this_Contains_0= ruleContains | this_Contains_Not_1= ruleContains_Not )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==49) ) {
                    alt20=1;
                }
                else if ( (LA20_1==50) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1798:5: this_Contains_0= ruleContains
                    {
                     
                            newCompositeNode(grammarAccess.getContainmentAccess().getContainsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleContains_in_ruleContainment4129);
                    this_Contains_0=ruleContains();

                    state._fsp--;

                     
                            current = this_Contains_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1808:5: this_Contains_Not_1= ruleContains_Not
                    {
                     
                            newCompositeNode(grammarAccess.getContainmentAccess().getContains_NotParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContains_Not_in_ruleContainment4156);
                    this_Contains_Not_1=ruleContains_Not();

                    state._fsp--;

                     
                            current = this_Contains_Not_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainment"


    // $ANTLR start "entryRuleContains"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1826:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1827:2: (iv_ruleContains= ruleContains EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1828:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_ruleContains_in_entryRuleContains4193);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContains4203); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1835:1: ruleContains returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'contains' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1838:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'contains' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1839:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'contains' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1839:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'contains' ( (otherlv_2= RULE_ID ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1839:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'contains' ( (otherlv_2= RULE_ID ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1839:2: ( (otherlv_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1840:1: (otherlv_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1840:1: (otherlv_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1841:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainsRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContains4248); 

            		newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getClassJava_ClassCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleContains4260); 

                	newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getContainsKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1856:1: ( (otherlv_2= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1857:1: (otherlv_2= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1857:1: (otherlv_2= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1858:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainsRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContains4280); 

            		newLeafNode(otherlv_2, grammarAccess.getContainsAccess().getContainsClass_ElementCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleContains_Not"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1877:1: entryRuleContains_Not returns [EObject current=null] : iv_ruleContains_Not= ruleContains_Not EOF ;
    public final EObject entryRuleContains_Not() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains_Not = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1878:2: (iv_ruleContains_Not= ruleContains_Not EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1879:2: iv_ruleContains_Not= ruleContains_Not EOF
            {
             newCompositeNode(grammarAccess.getContains_NotRule()); 
            pushFollow(FOLLOW_ruleContains_Not_in_entryRuleContains_Not4316);
            iv_ruleContains_Not=ruleContains_Not();

            state._fsp--;

             current =iv_ruleContains_Not; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContains_Not4326); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContains_Not"


    // $ANTLR start "ruleContains_Not"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1886:1: ruleContains_Not returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '~contains' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleContains_Not() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1889:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '~contains' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1890:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '~contains' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1890:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '~contains' ( (otherlv_2= RULE_ID ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1890:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '~contains' ( (otherlv_2= RULE_ID ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1890:2: ( (otherlv_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1891:1: (otherlv_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1891:1: (otherlv_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1892:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContains_NotRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContains_Not4371); 

            		newLeafNode(otherlv_0, grammarAccess.getContains_NotAccess().getClassJava_ClassCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleContains_Not4383); 

                	newLeafNode(otherlv_1, grammarAccess.getContains_NotAccess().getContainsKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1907:1: ( (otherlv_2= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1908:1: (otherlv_2= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1908:1: (otherlv_2= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1909:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContains_NotRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContains_Not4403); 

            		newLeafNode(otherlv_2, grammarAccess.getContains_NotAccess().getContainsClass_ElementCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContains_Not"


    // $ANTLR start "entryRuleImplementation"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1928:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1929:2: (iv_ruleImplementation= ruleImplementation EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1930:2: iv_ruleImplementation= ruleImplementation EOF
            {
             newCompositeNode(grammarAccess.getImplementationRule()); 
            pushFollow(FOLLOW_ruleImplementation_in_entryRuleImplementation4439);
            iv_ruleImplementation=ruleImplementation();

            state._fsp--;

             current =iv_ruleImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementation4449); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementation"


    // $ANTLR start "ruleImplementation"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1937:1: ruleImplementation returns [EObject current=null] : (this_Implements_0= ruleImplements | this_Implements_Not_1= ruleImplements_Not ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        EObject this_Implements_0 = null;

        EObject this_Implements_Not_1 = null;


         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1940:28: ( (this_Implements_0= ruleImplements | this_Implements_Not_1= ruleImplements_Not ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1941:1: (this_Implements_0= ruleImplements | this_Implements_Not_1= ruleImplements_Not )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1941:1: (this_Implements_0= ruleImplements | this_Implements_Not_1= ruleImplements_Not )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==51) ) {
                    alt21=1;
                }
                else if ( (LA21_1==52) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1942:5: this_Implements_0= ruleImplements
                    {
                     
                            newCompositeNode(grammarAccess.getImplementationAccess().getImplementsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleImplements_in_ruleImplementation4496);
                    this_Implements_0=ruleImplements();

                    state._fsp--;

                     
                            current = this_Implements_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1952:5: this_Implements_Not_1= ruleImplements_Not
                    {
                     
                            newCompositeNode(grammarAccess.getImplementationAccess().getImplements_NotParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleImplements_Not_in_ruleImplementation4523);
                    this_Implements_Not_1=ruleImplements_Not();

                    state._fsp--;

                     
                            current = this_Implements_Not_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementation"


    // $ANTLR start "entryRuleImplements"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1968:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1969:2: (iv_ruleImplements= ruleImplements EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1970:2: iv_ruleImplements= ruleImplements EOF
            {
             newCompositeNode(grammarAccess.getImplementsRule()); 
            pushFollow(FOLLOW_ruleImplements_in_entryRuleImplements4558);
            iv_ruleImplements=ruleImplements();

            state._fsp--;

             current =iv_ruleImplements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplements4568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplements"


    // $ANTLR start "ruleImplements"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1977:1: ruleImplements returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleImplements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1980:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1981:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1981:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1981:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1981:2: ( (otherlv_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1982:1: (otherlv_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1982:1: (otherlv_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1983:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImplementsRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplements4613); 

            		newLeafNode(otherlv_0, grammarAccess.getImplementsAccess().getChildJava_ClassCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleImplements4625); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getExtendsKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1998:1: ( (otherlv_2= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1999:1: (otherlv_2= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:1999:1: (otherlv_2= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2000:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImplementsRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplements4645); 

            		newLeafNode(otherlv_2, grammarAccess.getImplementsAccess().getParentJava_ClassCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplements"


    // $ANTLR start "entryRuleImplements_Not"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2019:1: entryRuleImplements_Not returns [EObject current=null] : iv_ruleImplements_Not= ruleImplements_Not EOF ;
    public final EObject entryRuleImplements_Not() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements_Not = null;


        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2020:2: (iv_ruleImplements_Not= ruleImplements_Not EOF )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2021:2: iv_ruleImplements_Not= ruleImplements_Not EOF
            {
             newCompositeNode(grammarAccess.getImplements_NotRule()); 
            pushFollow(FOLLOW_ruleImplements_Not_in_entryRuleImplements_Not4681);
            iv_ruleImplements_Not=ruleImplements_Not();

            state._fsp--;

             current =iv_ruleImplements_Not; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplements_Not4691); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplements_Not"


    // $ANTLR start "ruleImplements_Not"
    // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2028:1: ruleImplements_Not returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '~extends' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleImplements_Not() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2031:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '~extends' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2032:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '~extends' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2032:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '~extends' ( (otherlv_2= RULE_ID ) ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2032:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '~extends' ( (otherlv_2= RULE_ID ) )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2032:2: ( (otherlv_0= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2033:1: (otherlv_0= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2033:1: (otherlv_0= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2034:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImplements_NotRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplements_Not4736); 

            		newLeafNode(otherlv_0, grammarAccess.getImplements_NotAccess().getChildJava_ClassCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleImplements_Not4748); 

                	newLeafNode(otherlv_1, grammarAccess.getImplements_NotAccess().getExtendsKeyword_1());
                
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2049:1: ( (otherlv_2= RULE_ID ) )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2050:1: (otherlv_2= RULE_ID )
            {
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2050:1: (otherlv_2= RULE_ID )
            // ../ttc.testdsl/src-gen/ttc/testdsl/parser/antlr/internal/InternalTTCTest.g:2051:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImplements_NotRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplements_Not4768); 

            		newLeafNode(otherlv_2, grammarAccess.getImplements_NotAccess().getParentJava_ClassCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplements_Not"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTest_File_in_entryRuleTest_File75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest_File85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTest_File122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTest_File139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTest_File156 = new BitSet(new long[]{0x00000000A4530000L});
    public static final BitSet FOLLOW_ruleTest_Case_in_ruleTest_File178 = new BitSet(new long[]{0x00000000A4530000L});
    public static final BitSet FOLLOW_ruleJava_Class_in_ruleTest_File205 = new BitSet(new long[]{0x00000000A4530000L});
    public static final BitSet FOLLOW_ruleClasses_in_ruleTest_File232 = new BitSet(new long[]{0x00000000A4530000L});
    public static final BitSet FOLLOW_ruleJava_Method_in_ruleTest_File259 = new BitSet(new long[]{0x00000000A4530000L});
    public static final BitSet FOLLOW_ruleRefactoring_Instance_in_ruleTest_File286 = new BitSet(new long[]{0x00000000A4530000L});
    public static final BitSet FOLLOW_16_in_ruleTest_File300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJava_Class_in_entryRuleJava_Class336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJava_Class346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleJava_Class383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJava_Class400 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJava_Class417 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleJava_Class430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJava_Class447 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleJava_Class466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJava_Class483 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJava_Class500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClasses_in_entryRuleClasses536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClasses546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleClasses583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClasses600 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClasses617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClasses637 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleClasses650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClasses670 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleClasses684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJava_Method_in_entryRuleJava_Method720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJava_Method730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleJava_Method767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJava_Method784 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJava_Method801 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleJava_Method813 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJava_Method830 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleJava_Method848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJava_Method868 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleJava_Method881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJava_Method901 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleJava_Method917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJava_Field_in_entryRuleJava_Field955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJava_Field965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleJava_Field1002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJava_Field1019 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJava_Field1036 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleJava_Field1048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJava_Field1065 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleJava_Field1082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJava_Field1102 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJava_Field1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_Case_in_entryRuleTest_Case1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest_Case1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTest_Case1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTest_Case1216 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTest_Case1233 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTest_Case1245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTest_Case1262 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTest_Case1279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTest_Case1296 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleTest_Flow_in_ruleTest_Case1322 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTest_Case1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefactoring_Instance_in_entryRuleRefactoring_Instance1370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefactoring_Instance1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePull_Up_Refactoring_in_ruleRefactoring_Instance1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_Superclass_Refactoring_in_ruleRefactoring_Instance1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePull_Up_Refactoring_in_entryRulePull_Up_Refactoring1491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePull_Up_Refactoring1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePull_Up_Refactoring1538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePull_Up_Refactoring1555 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePull_Up_Refactoring1572 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePull_Up_Refactoring1584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePull_Up_Refactoring1604 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePull_Up_Refactoring1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePull_Up_Refactoring1636 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePull_Up_Refactoring1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_Superclass_Refactoring_in_entryRuleCreate_Superclass_Refactoring1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate_Superclass_Refactoring1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCreate_Superclass_Refactoring1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreate_Superclass_Refactoring1748 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCreate_Superclass_Refactoring1765 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCreate_Superclass_Refactoring1777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreate_Superclass_Refactoring1797 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCreate_Superclass_Refactoring1809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreate_Superclass_Refactoring1829 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCreate_Superclass_Refactoring1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_Flow_in_entryRuleTest_Flow1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest_Flow1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTest_Flow1924 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTest_Flow1936 = new BitSet(new long[]{0x0000359800000010L});
    public static final BitSet FOLLOW_ruleTest_Step_Element_in_ruleTest_Flow1957 = new BitSet(new long[]{0x0000359800010010L});
    public static final BitSet FOLLOW_16_in_ruleTest_Flow1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_Step_in_entryRuleTest_Step2006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest_Step2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTest_Step2053 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTest_Step2065 = new BitSet(new long[]{0x0000359800000010L});
    public static final BitSet FOLLOW_ruleTest_Step_Element_in_ruleTest_Step2086 = new BitSet(new long[]{0x0000359800010010L});
    public static final BitSet FOLLOW_16_in_ruleTest_Step2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_Step_Element_in_entryRuleTest_Step_Element2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest_Step_Element2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleTest_Step_Element2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_ruleTest_Step_Element2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_Step_in_ruleTest_Step_Element2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompile_in_ruleTest_Step_Element2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynchronize_in_ruleTest_Step_Element2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleTest_Step_Element2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementation_in_ruleTest_Step_Element2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion2389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_False_in_ruleAssertion2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_True_in_ruleAssertion2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_False_in_entryRuleAssert_False2508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert_False2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAssert_False2555 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAssert_False2567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssert_False2587 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAssert_False2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_True_in_entryRuleAssert_True2635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert_True2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAssert_True2682 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAssert_True2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssert_True2714 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAssert_True2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpect_True_in_ruleCondition2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpect_False_in_ruleCondition2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpect_True_in_entryRuleExpect_True2881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpect_True2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpect_True2928 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleExpect_True2940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpect_True2960 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExpect_True2972 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExpect_True2984 = new BitSet(new long[]{0x0000359800000010L});
    public static final BitSet FOLLOW_ruleTest_Step_Element_in_ruleExpect_True3005 = new BitSet(new long[]{0x0000359800010010L});
    public static final BitSet FOLLOW_16_in_ruleExpect_True3018 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExpect_True3030 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExpect_True3042 = new BitSet(new long[]{0x00003D9800000010L});
    public static final BitSet FOLLOW_ruleWarning_in_ruleExpect_True3063 = new BitSet(new long[]{0x0000359800000010L});
    public static final BitSet FOLLOW_ruleTest_Step_Element_in_ruleExpect_True3085 = new BitSet(new long[]{0x0000359800010010L});
    public static final BitSet FOLLOW_16_in_ruleExpect_True3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpect_False_in_entryRuleExpect_False3134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpect_False3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleExpect_False3181 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleExpect_False3193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpect_False3213 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExpect_False3225 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExpect_False3237 = new BitSet(new long[]{0x0000359800000010L});
    public static final BitSet FOLLOW_ruleTest_Step_Element_in_ruleExpect_False3258 = new BitSet(new long[]{0x0000359800010010L});
    public static final BitSet FOLLOW_16_in_ruleExpect_False3271 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExpect_False3283 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExpect_False3295 = new BitSet(new long[]{0x00003D9800000010L});
    public static final BitSet FOLLOW_ruleWarning_in_ruleExpect_False3316 = new BitSet(new long[]{0x0000359800000010L});
    public static final BitSet FOLLOW_ruleTest_Step_Element_in_ruleExpect_False3338 = new BitSet(new long[]{0x0000359800010010L});
    public static final BitSet FOLLOW_16_in_ruleExpect_False3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWarning_in_entryRuleWarning3387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWarning3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWarning3434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWarning3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompile_in_entryRuleCompile3492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompile3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCompile3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynchronize_in_entryRuleSynchronize3584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSynchronize3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSynchronize3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNo_Refactoring_in_entryRuleNo_Refactoring3676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNo_Refactoring3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleNo_Refactoring3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropose_Pullup_Method_Refactoring_in_entryRulePropose_Pullup_Method_Refactoring3770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropose_Pullup_Method_Refactoring3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePropose_Pullup_Method_Refactoring3817 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePropose_Pullup_Method_Refactoring3829 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropose_Pullup_Method_Refactoring3851 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleNo_Refactoring_in_rulePropose_Pullup_Method_Refactoring3870 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePropose_Pullup_Method_Refactoring3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropose_Create_Superclass_Refactoring_in_entryRulePropose_Create_Superclass_Refactoring3921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropose_Create_Superclass_Refactoring3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePropose_Create_Superclass_Refactoring3968 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePropose_Create_Superclass_Refactoring3980 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropose_Create_Superclass_Refactoring4002 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleNo_Refactoring_in_rulePropose_Create_Superclass_Refactoring4021 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePropose_Create_Superclass_Refactoring4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_entryRuleContainment4072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainment4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_ruleContainment4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_Not_in_ruleContainment4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_entryRuleContains4193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContains4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContains4248 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleContains4260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContains4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_Not_in_entryRuleContains_Not4316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContains_Not4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContains_Not4371 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleContains_Not4383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContains_Not4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementation_in_entryRuleImplementation4439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementation4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_in_ruleImplementation4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_Not_in_ruleImplementation4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_in_entryRuleImplements4558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplements4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplements4613 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleImplements4625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplements4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplements_Not_in_entryRuleImplements_Not4681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplements_Not4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplements_Not4736 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleImplements_Not4748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplements_Not4768 = new BitSet(new long[]{0x0000000000000002L});

}