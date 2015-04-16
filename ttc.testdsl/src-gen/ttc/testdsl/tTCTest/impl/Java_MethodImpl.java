/**
 */
package ttc.testdsl.tTCTest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.TTCTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Java_MethodImpl#getMethod_name <em>Method name</em>}</li>
 *   <li>{@link ttc.testdsl.tTCTest.impl.Java_MethodImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Java_MethodImpl extends Class_ElementImpl implements Java_Method
{
  /**
   * The default value of the '{@link #getMethod_name() <em>Method name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod_name()
   * @generated
   * @ordered
   */
  protected static final String METHOD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod_name() <em>Method name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod_name()
   * @generated
   * @ordered
   */
  protected String method_name = METHOD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Java_Class> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Java_MethodImpl()
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
    return TTCTestPackage.Literals.JAVA_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethod_name()
  {
    return method_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod_name(String newMethod_name)
  {
    String oldMethod_name = method_name;
    method_name = newMethod_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TTCTestPackage.JAVA_METHOD__METHOD_NAME, oldMethod_name, method_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Java_Class> getParams()
  {
    if (params == null)
    {
      params = new EObjectResolvingEList<Java_Class>(Java_Class.class, this, TTCTestPackage.JAVA_METHOD__PARAMS);
    }
    return params;
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
      case TTCTestPackage.JAVA_METHOD__METHOD_NAME:
        return getMethod_name();
      case TTCTestPackage.JAVA_METHOD__PARAMS:
        return getParams();
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
      case TTCTestPackage.JAVA_METHOD__METHOD_NAME:
        setMethod_name((String)newValue);
        return;
      case TTCTestPackage.JAVA_METHOD__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Java_Class>)newValue);
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
      case TTCTestPackage.JAVA_METHOD__METHOD_NAME:
        setMethod_name(METHOD_NAME_EDEFAULT);
        return;
      case TTCTestPackage.JAVA_METHOD__PARAMS:
        getParams().clear();
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
      case TTCTestPackage.JAVA_METHOD__METHOD_NAME:
        return METHOD_NAME_EDEFAULT == null ? method_name != null : !METHOD_NAME_EDEFAULT.equals(method_name);
      case TTCTestPackage.JAVA_METHOD__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (method_name: ");
    result.append(method_name);
    result.append(')');
    return result.toString();
  }

} //Java_MethodImpl
