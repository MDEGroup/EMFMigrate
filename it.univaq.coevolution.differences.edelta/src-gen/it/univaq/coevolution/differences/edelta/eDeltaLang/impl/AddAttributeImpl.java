/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang.impl;

import it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.STRING;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddAttributeImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddAttributeImpl#getNew <em>New</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddAttributeImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddAttributeImpl extends MinimalEObjectImpl.Container implements AddAttribute
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The default value of the '{@link #getNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected static final String NEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected String new_ = NEW_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected STRING ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddAttributeImpl()
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
    return EDeltaLangPackage.Literals.ADD_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.ADD_ATTRIBUTE__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNew()
  {
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNew(String newNew)
  {
    String oldNew = new_;
    new_ = newNew;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.ADD_ATTRIBUTE__NEW, oldNew, new_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (STRING)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDeltaLangPackage.ADD_ATTRIBUTE__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(STRING newRef)
  {
    STRING oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.ADD_ATTRIBUTE__REF, oldRef, ref));
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
      case EDeltaLangPackage.ADD_ATTRIBUTE__OP:
        return getOp();
      case EDeltaLangPackage.ADD_ATTRIBUTE__NEW:
        return getNew();
      case EDeltaLangPackage.ADD_ATTRIBUTE__REF:
        if (resolve) return getRef();
        return basicGetRef();
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
      case EDeltaLangPackage.ADD_ATTRIBUTE__OP:
        setOp((String)newValue);
        return;
      case EDeltaLangPackage.ADD_ATTRIBUTE__NEW:
        setNew((String)newValue);
        return;
      case EDeltaLangPackage.ADD_ATTRIBUTE__REF:
        setRef((STRING)newValue);
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
      case EDeltaLangPackage.ADD_ATTRIBUTE__OP:
        setOp(OP_EDEFAULT);
        return;
      case EDeltaLangPackage.ADD_ATTRIBUTE__NEW:
        setNew(NEW_EDEFAULT);
        return;
      case EDeltaLangPackage.ADD_ATTRIBUTE__REF:
        setRef((STRING)null);
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
      case EDeltaLangPackage.ADD_ATTRIBUTE__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EDeltaLangPackage.ADD_ATTRIBUTE__NEW:
        return NEW_EDEFAULT == null ? new_ != null : !NEW_EDEFAULT.equals(new_);
      case EDeltaLangPackage.ADD_ATTRIBUTE__REF:
        return ref != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(", new: ");
    result.append(new_);
    result.append(')');
    return result.toString();
  }

} //AddAttributeImpl
