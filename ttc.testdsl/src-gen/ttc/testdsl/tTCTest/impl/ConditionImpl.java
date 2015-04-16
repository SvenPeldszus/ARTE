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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ttc.testdsl.tTCTest.Condition;
import ttc.testdsl.tTCTest.Refactoring;
import ttc.testdsl.tTCTest.TTCTestPackage;
import ttc.testdsl.tTCTest.Test_Step_Element;
import ttc.testdsl.tTCTest.Warning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.ConditionImpl#getRefactoring <em>Refactoring</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.ConditionImpl#getTrue_steps <em>True steps</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.ConditionImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.ConditionImpl#getFalse_steps <em>False steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends Test_Step_ElementImpl implements Condition
{
  /**
   * The cached value of the '{@link #getRefactoring() <em>Refactoring</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefactoring()
   * @generated
   * @ordered
   */
  protected Refactoring refactoring;

  /**
   * The cached value of the '{@link #getTrue_steps() <em>True steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue_steps()
   * @generated
   * @ordered
   */
  protected EList<Test_Step_Element> true_steps;

  /**
   * The cached value of the '{@link #getWarning() <em>Warning</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarning()
   * @generated
   * @ordered
   */
  protected Warning warning;

  /**
   * The cached value of the '{@link #getFalse_steps() <em>False steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse_steps()
   * @generated
   * @ordered
   */
  protected EList<Test_Step_Element> false_steps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return TTCTestPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refactoring getRefactoring()
  {
    if (refactoring != null && refactoring.eIsProxy())
    {
      InternalEObject oldRefactoring = (InternalEObject)refactoring;
      refactoring = (Refactoring)eResolveProxy(oldRefactoring);
      if (refactoring != oldRefactoring)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TTCTestPackage.CONDITION__REFACTORING, oldRefactoring, refactoring));
      }
    }
    return refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refactoring basicGetRefactoring()
  {
    return refactoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefactoring(Refactoring newRefactoring)
  {
    Refactoring oldRefactoring = refactoring;
    refactoring = newRefactoring;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.CONDITION__REFACTORING, oldRefactoring, refactoring));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Test_Step_Element> getTrue_steps()
  {
    if (true_steps == null)
    {
      true_steps = new EObjectContainmentEList<Test_Step_Element>(Test_Step_Element.class, this, TTCTestPackage.CONDITION__TRUE_STEPS);
    }
    return true_steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Warning getWarning()
  {
    return warning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWarning(Warning newWarning, NotificationChain msgs)
  {
    Warning oldWarning = warning;
    warning = newWarning;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTCTestPackage.CONDITION__WARNING, oldWarning, newWarning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWarning(Warning newWarning)
  {
    if (newWarning != warning)
    {
      NotificationChain msgs = null;
      if (warning != null)
        msgs = ((InternalEObject)warning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTCTestPackage.CONDITION__WARNING, null, msgs);
      if (newWarning != null)
        msgs = ((InternalEObject)newWarning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTCTestPackage.CONDITION__WARNING, null, msgs);
      msgs = basicSetWarning(newWarning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.CONDITION__WARNING, newWarning, newWarning));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Test_Step_Element> getFalse_steps()
  {
    if (false_steps == null)
    {
      false_steps = new EObjectContainmentEList<Test_Step_Element>(Test_Step_Element.class, this, TTCTestPackage.CONDITION__FALSE_STEPS);
    }
    return false_steps;
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
      case TTCTestPackage.CONDITION__TRUE_STEPS:
        return ((InternalEList<?>)getTrue_steps()).basicRemove(otherEnd, msgs);
      case TTCTestPackage.CONDITION__WARNING:
        return basicSetWarning(null, msgs);
      case TTCTestPackage.CONDITION__FALSE_STEPS:
        return ((InternalEList<?>)getFalse_steps()).basicRemove(otherEnd, msgs);
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
      case TTCTestPackage.CONDITION__REFACTORING:
        if (resolve) return getRefactoring();
        return basicGetRefactoring();
      case TTCTestPackage.CONDITION__TRUE_STEPS:
        return getTrue_steps();
      case TTCTestPackage.CONDITION__WARNING:
        return getWarning();
      case TTCTestPackage.CONDITION__FALSE_STEPS:
        return getFalse_steps();
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
      case TTCTestPackage.CONDITION__REFACTORING:
        setRefactoring((Refactoring)newValue);
        return;
      case TTCTestPackage.CONDITION__TRUE_STEPS:
        getTrue_steps().clear();
        getTrue_steps().addAll((Collection<? extends Test_Step_Element>)newValue);
        return;
      case TTCTestPackage.CONDITION__WARNING:
        setWarning((Warning)newValue);
        return;
      case TTCTestPackage.CONDITION__FALSE_STEPS:
        getFalse_steps().clear();
        getFalse_steps().addAll((Collection<? extends Test_Step_Element>)newValue);
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
      case TTCTestPackage.CONDITION__REFACTORING:
        setRefactoring((Refactoring)null);
        return;
      case TTCTestPackage.CONDITION__TRUE_STEPS:
        getTrue_steps().clear();
        return;
      case TTCTestPackage.CONDITION__WARNING:
        setWarning((Warning)null);
        return;
      case TTCTestPackage.CONDITION__FALSE_STEPS:
        getFalse_steps().clear();
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
      case TTCTestPackage.CONDITION__REFACTORING:
        return refactoring != null;
      case TTCTestPackage.CONDITION__TRUE_STEPS:
        return true_steps != null && !true_steps.isEmpty();
      case TTCTestPackage.CONDITION__WARNING:
        return warning != null;
      case TTCTestPackage.CONDITION__FALSE_STEPS:
        return false_steps != null && !false_steps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
