/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.packageSetters;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>package Setters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.packageSettersImpl#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.packageSettersImpl#getValue <em>Value</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.packageSettersImpl#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class packageSettersImpl extends MinimalEObjectImpl.Container implements packageSetters
{
  /**
   * The cached value of the '{@link #getMetafeature() <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetafeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature metafeature;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueRef()
   * @generated
   * @ordered
   */
  protected EList<EObject> valueRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected packageSettersImpl()
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
    return MigrationPackage.Literals.PACKAGE_SETTERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getMetafeature()
  {
    if (metafeature != null && metafeature.eIsProxy())
    {
      InternalEObject oldMetafeature = (InternalEObject)metafeature;
      metafeature = (EStructuralFeature)eResolveProxy(oldMetafeature);
      if (metafeature != oldMetafeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.PACKAGE_SETTERS__METAFEATURE, oldMetafeature, metafeature));
      }
    }
    return metafeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetMetafeature()
  {
    return metafeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetafeature(EStructuralFeature newMetafeature)
  {
    EStructuralFeature oldMetafeature = metafeature;
    metafeature = newMetafeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.PACKAGE_SETTERS__METAFEATURE, oldMetafeature, metafeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.PACKAGE_SETTERS__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getValueRef()
  {
    if (valueRef == null)
    {
      valueRef = new EObjectResolvingEList<EObject>(EObject.class, this, MigrationPackage.PACKAGE_SETTERS__VALUE_REF);
    }
    return valueRef;
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
      case MigrationPackage.PACKAGE_SETTERS__METAFEATURE:
        if (resolve) return getMetafeature();
        return basicGetMetafeature();
      case MigrationPackage.PACKAGE_SETTERS__VALUE:
        return getValue();
      case MigrationPackage.PACKAGE_SETTERS__VALUE_REF:
        return getValueRef();
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
      case MigrationPackage.PACKAGE_SETTERS__METAFEATURE:
        setMetafeature((EStructuralFeature)newValue);
        return;
      case MigrationPackage.PACKAGE_SETTERS__VALUE:
        setValue((String)newValue);
        return;
      case MigrationPackage.PACKAGE_SETTERS__VALUE_REF:
        getValueRef().clear();
        getValueRef().addAll((Collection<? extends EObject>)newValue);
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
      case MigrationPackage.PACKAGE_SETTERS__METAFEATURE:
        setMetafeature((EStructuralFeature)null);
        return;
      case MigrationPackage.PACKAGE_SETTERS__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MigrationPackage.PACKAGE_SETTERS__VALUE_REF:
        getValueRef().clear();
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
      case MigrationPackage.PACKAGE_SETTERS__METAFEATURE:
        return metafeature != null;
      case MigrationPackage.PACKAGE_SETTERS__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case MigrationPackage.PACKAGE_SETTERS__VALUE_REF:
        return valueRef != null && !valueRef.isEmpty();
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //packageSettersImpl
