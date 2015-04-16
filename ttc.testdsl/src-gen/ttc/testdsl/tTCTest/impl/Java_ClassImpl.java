/**
 */
package ttc.testdsl.tTCTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.TTCTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Java_ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Java_ClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Java_ClassImpl#getClass_name <em>Class name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Java_ClassImpl extends MinimalEObjectImpl.Container implements Java_Class
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
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getClass_name() <em>Class name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_name()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_name() <em>Class name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_name()
   * @generated
   * @ordered
   */
  protected String class_name = CLASS_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Java_ClassImpl()
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
    return TTCTestPackage.Literals.JAVA_CLASS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.JAVA_CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.JAVA_CLASS__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_name()
  {
    return class_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass_name(String newClass_name)
  {
    String oldClass_name = class_name;
    class_name = newClass_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.JAVA_CLASS__CLASS_NAME, oldClass_name, class_name));
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
      case TTCTestPackage.JAVA_CLASS__NAME:
        return getName();
      case TTCTestPackage.JAVA_CLASS__PACKAGE:
        return getPackage();
      case TTCTestPackage.JAVA_CLASS__CLASS_NAME:
        return getClass_name();
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
      case TTCTestPackage.JAVA_CLASS__NAME:
        setName((String)newValue);
        return;
      case TTCTestPackage.JAVA_CLASS__PACKAGE:
        setPackage((String)newValue);
        return;
      case TTCTestPackage.JAVA_CLASS__CLASS_NAME:
        setClass_name((String)newValue);
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
      case TTCTestPackage.JAVA_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TTCTestPackage.JAVA_CLASS__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case TTCTestPackage.JAVA_CLASS__CLASS_NAME:
        setClass_name(CLASS_NAME_EDEFAULT);
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
      case TTCTestPackage.JAVA_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TTCTestPackage.JAVA_CLASS__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case TTCTestPackage.JAVA_CLASS__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? class_name != null : !CLASS_NAME_EDEFAULT.equals(class_name);
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
    result.append(", package: ");
    result.append(package_);
    result.append(", class_name: ");
    result.append(class_name);
    result.append(')');
    return result.toString();
  }

} //Java_ClassImpl
