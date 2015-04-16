/**
 */
package ttc.testdsl.tTCTest.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ttc.testdsl.tTCTest.TTCTestPackage;
import ttc.testdsl.tTCTest.Test_Case;
import ttc.testdsl.tTCTest.Test_Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_CaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_CaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_CaseImpl#getJava_program <em>Java program</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Test_CaseImpl#getTest_flow <em>Test flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Test_CaseImpl extends MinimalEObjectImpl.Container implements Test_Case
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getJava_program() <em>Java program</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJava_program()
   * @generated
   * @ordered
   */
  protected static final String JAVA_PROGRAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJava_program() <em>Java program</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJava_program()
   * @generated
   * @ordered
   */
  protected String java_program = JAVA_PROGRAM_EDEFAULT;

  /**
   * The cached value of the '{@link #getTest_flow() <em>Test flow</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest_flow()
   * @generated
   * @ordered
   */
  protected Test_Flow test_flow;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Test_CaseImpl()
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
    return TTCTestPackage.Literals.TEST_CASE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.TEST_CASE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.TEST_CASE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJava_program()
  {
    return java_program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJava_program(String newJava_program)
  {
    String oldJava_program = java_program;
    java_program = newJava_program;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.TEST_CASE__JAVA_PROGRAM, oldJava_program, java_program));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test_Flow getTest_flow()
  {
    return test_flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTest_flow(Test_Flow newTest_flow, NotificationChain msgs)
  {
    Test_Flow oldTest_flow = test_flow;
    test_flow = newTest_flow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTCTestPackage.TEST_CASE__TEST_FLOW, oldTest_flow, newTest_flow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest_flow(Test_Flow newTest_flow)
  {
    if (newTest_flow != test_flow)
    {
      NotificationChain msgs = null;
      if (test_flow != null)
        msgs = ((InternalEObject)test_flow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTCTestPackage.TEST_CASE__TEST_FLOW, null, msgs);
      if (newTest_flow != null)
        msgs = ((InternalEObject)newTest_flow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTCTestPackage.TEST_CASE__TEST_FLOW, null, msgs);
      msgs = basicSetTest_flow(newTest_flow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.TEST_CASE__TEST_FLOW, newTest_flow, newTest_flow));
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
      case TTCTestPackage.TEST_CASE__TEST_FLOW:
        return basicSetTest_flow(null, msgs);
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
      case TTCTestPackage.TEST_CASE__NAME:
        return getName();
      case TTCTestPackage.TEST_CASE__DESCRIPTION:
        return getDescription();
      case TTCTestPackage.TEST_CASE__JAVA_PROGRAM:
        return getJava_program();
      case TTCTestPackage.TEST_CASE__TEST_FLOW:
        return getTest_flow();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TTCTestPackage.TEST_CASE__NAME:
        setName((String)newValue);
        return;
      case TTCTestPackage.TEST_CASE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case TTCTestPackage.TEST_CASE__JAVA_PROGRAM:
        setJava_program((String)newValue);
        return;
      case TTCTestPackage.TEST_CASE__TEST_FLOW:
        setTest_flow((Test_Flow)newValue);
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
      case TTCTestPackage.TEST_CASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TTCTestPackage.TEST_CASE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TTCTestPackage.TEST_CASE__JAVA_PROGRAM:
        setJava_program(JAVA_PROGRAM_EDEFAULT);
        return;
      case TTCTestPackage.TEST_CASE__TEST_FLOW:
        setTest_flow((Test_Flow)null);
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
      case TTCTestPackage.TEST_CASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TTCTestPackage.TEST_CASE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case TTCTestPackage.TEST_CASE__JAVA_PROGRAM:
        return JAVA_PROGRAM_EDEFAULT == null ? java_program != null : !JAVA_PROGRAM_EDEFAULT.equals(java_program);
      case TTCTestPackage.TEST_CASE__TEST_FLOW:
        return test_flow != null;
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
    result.append(", description: ");
    result.append(description);
    result.append(", java_program: ");
    result.append(java_program);
    result.append(')');
    return result.toString();
  }

} //Test_CaseImpl
