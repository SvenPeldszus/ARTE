/**
 */
package ttc.testdsl.tTCTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ttc.testdsl.tTCTest.Class_Element;
import ttc.testdsl.tTCTest.Containment;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.TTCTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.ContainmentImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.ContainmentImpl#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainmentImpl extends Test_Step_ElementImpl implements Containment
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected Java_Class class_;

  /**
   * The cached value of the '{@link #getContains() <em>Contains</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContains()
   * @generated
   * @ordered
   */
  protected Class_Element contains;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainmentImpl()
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
    return TTCTestPackage.Literals.CONTAINMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Class getClass_()
  {
    if (class_ != null && class_.eIsProxy())
    {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (Java_Class)eResolveProxy(oldClass);
      if (class_ != oldClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TTCTestPackage.CONTAINMENT__CLASS, oldClass, class_));
      }
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Class basicGetClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(Java_Class newClass)
  {
    Java_Class oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.CONTAINMENT__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_Element getContains()
  {
    if (contains != null && contains.eIsProxy())
    {
      InternalEObject oldContains = (InternalEObject)contains;
      contains = (Class_Element)eResolveProxy(oldContains);
      if (contains != oldContains)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TTCTestPackage.CONTAINMENT__CONTAINS, oldContains, contains));
      }
    }
    return contains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_Element basicGetContains()
  {
    return contains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContains(Class_Element newContains)
  {
    Class_Element oldContains = contains;
    contains = newContains;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.CONTAINMENT__CONTAINS, oldContains, contains));
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
      case TTCTestPackage.CONTAINMENT__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
      case TTCTestPackage.CONTAINMENT__CONTAINS:
        if (resolve) return getContains();
        return basicGetContains();
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
      case TTCTestPackage.CONTAINMENT__CLASS:
        setClass((Java_Class)newValue);
        return;
      case TTCTestPackage.CONTAINMENT__CONTAINS:
        setContains((Class_Element)newValue);
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
      case TTCTestPackage.CONTAINMENT__CLASS:
        setClass((Java_Class)null);
        return;
      case TTCTestPackage.CONTAINMENT__CONTAINS:
        setContains((Class_Element)null);
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
      case TTCTestPackage.CONTAINMENT__CLASS:
        return class_ != null;
      case TTCTestPackage.CONTAINMENT__CONTAINS:
        return contains != null;
    }
    return super.eIsSet(featureID);
  }

} //ContainmentImpl
