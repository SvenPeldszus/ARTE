/**
 */
package ttc.testdsl.tTCTest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ttc.testdsl.tTCTest.Classes;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Refactoring_Instance;
import ttc.testdsl.tTCTest.TTCTestPackage;
import ttc.testdsl.tTCTest.Test_Case;
import ttc.testdsl.tTCTest.Test_File;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_FileImpl#getName <em>Name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_FileImpl#getTest_cases <em>Test cases</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_FileImpl#getJava_class <em>Java class</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_FileImpl#getJava_classes <em>Java classes</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_FileImpl#getJava_method <em>Java method</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_FileImpl#getRefactorings <em>Refactorings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Test_FileImpl extends MinimalEObjectImpl.Container implements Test_File
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTest_cases() <em>Test cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest_cases()
   * @generated
   * @ordered
   */
  protected EList<Test_Case> test_cases;

  /**
   * The cached value of the '{@link #getJava_class() <em>Java class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJava_class()
   * @generated
   * @ordered
   */
  protected EList<Java_Class> java_class;

  /**
   * The cached value of the '{@link #getJava_classes() <em>Java classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJava_classes()
   * @generated
   * @ordered
   */
  protected EList<Classes> java_classes;

  /**
   * The cached value of the '{@link #getJava_method() <em>Java method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJava_method()
   * @generated
   * @ordered
   */
  protected EList<Java_Method> java_method;

  /**
   * The cached value of the '{@link #getRefactorings() <em>Refactorings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefactorings()
   * @generated
   * @ordered
   */
  protected EList<Refactoring_Instance> refactorings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Test_FileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TTCTestPackage.Literals.TEST_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.TEST_FILE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Test_Case> getTest_cases()
  {
    if (test_cases == null)
    {
      test_cases = new EObjectContainmentEList<Test_Case>(Test_Case.class, this, TTCTestPackage.TEST_FILE__TEST_CASES);
    }
    return test_cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Java_Class> getJava_class()
  {
    if (java_class == null)
    {
      java_class = new EObjectContainmentEList<Java_Class>(Java_Class.class, this, TTCTestPackage.TEST_FILE__JAVA_CLASS);
    }
    return java_class;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Classes> getJava_classes()
  {
    if (java_classes == null)
    {
      java_classes = new EObjectContainmentEList<Classes>(Classes.class, this, TTCTestPackage.TEST_FILE__JAVA_CLASSES);
    }
    return java_classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Java_Method> getJava_method()
  {
    if (java_method == null)
    {
      java_method = new EObjectContainmentEList<Java_Method>(Java_Method.class, this, TTCTestPackage.TEST_FILE__JAVA_METHOD);
    }
    return java_method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Refactoring_Instance> getRefactorings()
  {
    if (refactorings == null)
    {
      refactorings = new EObjectContainmentEList<Refactoring_Instance>(Refactoring_Instance.class, this, TTCTestPackage.TEST_FILE__REFACTORINGS);
    }
    return refactorings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TTCTestPackage.TEST_FILE__TEST_CASES:
        return ((InternalEList<?>)getTest_cases()).basicRemove(otherEnd, msgs);
      case TTCTestPackage.TEST_FILE__JAVA_CLASS:
        return ((InternalEList<?>)getJava_class()).basicRemove(otherEnd, msgs);
      case TTCTestPackage.TEST_FILE__JAVA_CLASSES:
        return ((InternalEList<?>)getJava_classes()).basicRemove(otherEnd, msgs);
      case TTCTestPackage.TEST_FILE__JAVA_METHOD:
        return ((InternalEList<?>)getJava_method()).basicRemove(otherEnd, msgs);
      case TTCTestPackage.TEST_FILE__REFACTORINGS:
        return ((InternalEList<?>)getRefactorings()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TTCTestPackage.TEST_FILE__NAME:
        return getName();
      case TTCTestPackage.TEST_FILE__TEST_CASES:
        return getTest_cases();
      case TTCTestPackage.TEST_FILE__JAVA_CLASS:
        return getJava_class();
      case TTCTestPackage.TEST_FILE__JAVA_CLASSES:
        return getJava_classes();
      case TTCTestPackage.TEST_FILE__JAVA_METHOD:
        return getJava_method();
      case TTCTestPackage.TEST_FILE__REFACTORINGS:
        return getRefactorings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TTCTestPackage.TEST_FILE__NAME:
        setName((String)newValue);
        return;
      case TTCTestPackage.TEST_FILE__TEST_CASES:
        getTest_cases().clear();
        getTest_cases().addAll((Collection<? extends Test_Case>)newValue);
        return;
      case TTCTestPackage.TEST_FILE__JAVA_CLASS:
        getJava_class().clear();
        getJava_class().addAll((Collection<? extends Java_Class>)newValue);
        return;
      case TTCTestPackage.TEST_FILE__JAVA_CLASSES:
        getJava_classes().clear();
        getJava_classes().addAll((Collection<? extends Classes>)newValue);
        return;
      case TTCTestPackage.TEST_FILE__JAVA_METHOD:
        getJava_method().clear();
        getJava_method().addAll((Collection<? extends Java_Method>)newValue);
        return;
      case TTCTestPackage.TEST_FILE__REFACTORINGS:
        getRefactorings().clear();
        getRefactorings().addAll((Collection<? extends Refactoring_Instance>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TTCTestPackage.TEST_FILE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TTCTestPackage.TEST_FILE__TEST_CASES:
        getTest_cases().clear();
        return;
      case TTCTestPackage.TEST_FILE__JAVA_CLASS:
        getJava_class().clear();
        return;
      case TTCTestPackage.TEST_FILE__JAVA_CLASSES:
        getJava_classes().clear();
        return;
      case TTCTestPackage.TEST_FILE__JAVA_METHOD:
        getJava_method().clear();
        return;
      case TTCTestPackage.TEST_FILE__REFACTORINGS:
        getRefactorings().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TTCTestPackage.TEST_FILE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TTCTestPackage.TEST_FILE__TEST_CASES:
        return test_cases != null && !test_cases.isEmpty();
      case TTCTestPackage.TEST_FILE__JAVA_CLASS:
        return java_class != null && !java_class.isEmpty();
      case TTCTestPackage.TEST_FILE__JAVA_CLASSES:
        return java_classes != null && !java_classes.isEmpty();
      case TTCTestPackage.TEST_FILE__JAVA_METHOD:
        return java_method != null && !java_method.isEmpty();
      case TTCTestPackage.TEST_FILE__REFACTORINGS:
        return refactorings != null && !refactorings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //Test_FileImpl
