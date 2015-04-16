/**
 */
package ttc.testdsl.tTCTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testdsl.tTCTest.TTCTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pull Up Refactoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Pull_Up_RefactoringImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Pull_Up_RefactoringImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Pull_Up_RefactoringImpl extends Refactoring_InstanceImpl implements Pull_Up_Refactoring
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Java_Class parent;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Java_Method method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Pull_Up_RefactoringImpl()
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
    return TTCTestPackage.Literals.PULL_UP_REFACTORING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Class getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (Java_Class)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TTCTestPackage.PULL_UP_REFACTORING__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Class basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Java_Class newParent)
  {
    Java_Class oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.PULL_UP_REFACTORING__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Method getMethod()
  {
    if (method != null && method.eIsProxy())
    {
      InternalEObject oldMethod = (InternalEObject)method;
      method = (Java_Method)eResolveProxy(oldMethod);
      if (method != oldMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TTCTestPackage.PULL_UP_REFACTORING__METHOD, oldMethod, method));
      }
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Method basicGetMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Java_Method newMethod)
  {
    Java_Method oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.PULL_UP_REFACTORING__METHOD, oldMethod, method));
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
      case TTCTestPackage.PULL_UP_REFACTORING__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case TTCTestPackage.PULL_UP_REFACTORING__METHOD:
        if (resolve) return getMethod();
        return basicGetMethod();
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
      case TTCTestPackage.PULL_UP_REFACTORING__PARENT:
        setParent((Java_Class)newValue);
        return;
      case TTCTestPackage.PULL_UP_REFACTORING__METHOD:
        setMethod((Java_Method)newValue);
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
      case TTCTestPackage.PULL_UP_REFACTORING__PARENT:
        setParent((Java_Class)null);
        return;
      case TTCTestPackage.PULL_UP_REFACTORING__METHOD:
        setMethod((Java_Method)null);
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
      case TTCTestPackage.PULL_UP_REFACTORING__PARENT:
        return parent != null;
      case TTCTestPackage.PULL_UP_REFACTORING__METHOD:
        return method != null;
    }
    return super.eIsSet(featureID);
  }

} //Pull_Up_RefactoringImpl
