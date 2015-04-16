/**
 */
package ttc.testdsl.tTCTest.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ttc.testdsl.tTCTest.Propose_Refactoring;
import ttc.testdsl.tTCTest.Refactoring;
import ttc.testdsl.tTCTest.TTCTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propose Refactoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Propose_RefactoringImpl#getRefactoring <em>Refactoring</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Propose_RefactoringImpl extends MinimalEObjectImpl.Container implements Propose_Refactoring
{
  /**
   * The cached value of the '{@link #getRefactoring() <em>Refactoring</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefactoring()
   * @generated
   * @ordered
   */
  protected Refactoring refactoring;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Propose_RefactoringImpl()
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
    return TTCTestPackage.Literals.PROPOSE_REFACTORING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refactoring getRefactoring()
  {
    return refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefactoring(Refactoring newRefactoring, NotificationChain msgs)
  {
    Refactoring oldRefactoring = refactoring;
    refactoring = newRefactoring;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTCTestPackage.PROPOSE_REFACTORING__REFACTORING, oldRefactoring, newRefactoring);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefactoring(Refactoring newRefactoring)
  {
    if (newRefactoring != refactoring)
    {
      NotificationChain msgs = null;
      if (refactoring != null)
        msgs = ((InternalEObject)refactoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTCTestPackage.PROPOSE_REFACTORING__REFACTORING, null, msgs);
      if (newRefactoring != null)
        msgs = ((InternalEObject)newRefactoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTCTestPackage.PROPOSE_REFACTORING__REFACTORING, null, msgs);
      msgs = basicSetRefactoring(newRefactoring, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.PROPOSE_REFACTORING__REFACTORING, newRefactoring, newRefactoring));
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
      case TTCTestPackage.PROPOSE_REFACTORING__REFACTORING:
        return basicSetRefactoring(null, msgs);
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
      case TTCTestPackage.PROPOSE_REFACTORING__REFACTORING:
        return getRefactoring();
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
      case TTCTestPackage.PROPOSE_REFACTORING__REFACTORING:
        setRefactoring((Refactoring)newValue);
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
      case TTCTestPackage.PROPOSE_REFACTORING__REFACTORING:
        setRefactoring((Refactoring)null);
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
      case TTCTestPackage.PROPOSE_REFACTORING__REFACTORING:
        return refactoring != null;
    }
    return super.eIsSet(featureID);
  }

} //Propose_RefactoringImpl
