/**
 */
package ttc.testdsl.tTCTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Field;
import ttc.testdsl.tTCTest.TTCTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Java_FieldImpl#getField_name <em>Field name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Java_FieldImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Java_FieldImpl extends Class_ElementImpl implements Java_Field
{
  /**
   * The default value of the '{@link #getField_name() <em>Field name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField_name()
   * @generated
   * @ordered
   */
  protected static final String FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getField_name() <em>Field name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField_name()
   * @generated
   * @ordered
   */
  protected String field_name = FIELD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Java_Class type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Java_FieldImpl()
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
    return TTCTestPackage.Literals.JAVA_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getField_name()
  {
    return field_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField_name(String newField_name)
  {
    String oldField_name = field_name;
    field_name = newField_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.JAVA_FIELD__FIELD_NAME, oldField_name, field_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Class getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Java_Class)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TTCTestPackage.JAVA_FIELD__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Java_Class basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Java_Class newType)
  {
    Java_Class oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.JAVA_FIELD__TYPE, oldType, type));
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
      case TTCTestPackage.JAVA_FIELD__FIELD_NAME:
        return getField_name();
      case TTCTestPackage.JAVA_FIELD__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case TTCTestPackage.JAVA_FIELD__FIELD_NAME:
        setField_name((String)newValue);
        return;
      case TTCTestPackage.JAVA_FIELD__TYPE:
        setType((Java_Class)newValue);
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
      case TTCTestPackage.JAVA_FIELD__FIELD_NAME:
        setField_name(FIELD_NAME_EDEFAULT);
        return;
      case TTCTestPackage.JAVA_FIELD__TYPE:
        setType((Java_Class)null);
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
      case TTCTestPackage.JAVA_FIELD__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? field_name != null : !FIELD_NAME_EDEFAULT.equals(field_name);
      case TTCTestPackage.JAVA_FIELD__TYPE:
        return type != null;
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
    result.append(" (field_name: ");
    result.append(field_name);
    result.append(')');
    return result.toString();
  }

} //Java_FieldImpl
