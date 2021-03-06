/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.impl;

import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.FilterMigrator;
import it.univaq.coevolution.emfmigrate.emig.MigratorDX;
import it.univaq.coevolution.emfmigrate.emig.RewritingRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migrator DX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorDXImpl#getElementDX <em>Element DX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorDXImpl#getFilterDX <em>Filter DX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorDXImpl#getRewritingRule <em>Rewriting Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MigratorDXImpl extends MigratorImpl implements MigratorDX
{
  /**
   * The cached value of the '{@link #getElementDX() <em>Element DX</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementDX()
   * @generated
   * @ordered
   */
  protected EClass elementDX;

  /**
   * The cached value of the '{@link #getFilterDX() <em>Filter DX</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterDX()
   * @generated
   * @ordered
   */
  protected EList<FilterMigrator> filterDX;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MigratorDXImpl()
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
    return EmigPackage.Literals.MIGRATOR_DX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementDX()
  {
    if (elementDX != null && elementDX.eIsProxy())
    {
      InternalEObject oldElementDX = (InternalEObject)elementDX;
      elementDX = (EClass)eResolveProxy(oldElementDX);
      if (elementDX != oldElementDX)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmigPackage.MIGRATOR_DX__ELEMENT_DX, oldElementDX, elementDX));
      }
    }
    return elementDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetElementDX()
  {
    return elementDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementDX(EClass newElementDX)
  {
    EClass oldElementDX = elementDX;
    elementDX = newElementDX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATOR_DX__ELEMENT_DX, oldElementDX, elementDX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FilterMigrator> getFilterDX()
  {
    if (filterDX == null)
    {
      filterDX = new EObjectContainmentEList<FilterMigrator>(FilterMigrator.class, this, EmigPackage.MIGRATOR_DX__FILTER_DX);
    }
    return filterDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RewritingRule getRewritingRule()
  {
    if (eContainerFeatureID() != EmigPackage.MIGRATOR_DX__REWRITING_RULE) return null;
    return (RewritingRule)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRewritingRule(RewritingRule newRewritingRule, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newRewritingRule, EmigPackage.MIGRATOR_DX__REWRITING_RULE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRewritingRule(RewritingRule newRewritingRule)
  {
    if (newRewritingRule != eInternalContainer() || (eContainerFeatureID() != EmigPackage.MIGRATOR_DX__REWRITING_RULE && newRewritingRule != null))
    {
      if (EcoreUtil.isAncestor(this, newRewritingRule))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRewritingRule != null)
        msgs = ((InternalEObject)newRewritingRule).eInverseAdd(this, EmigPackage.REWRITING_RULE__MIGRATOR_DX, RewritingRule.class, msgs);
      msgs = basicSetRewritingRule(newRewritingRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATOR_DX__REWRITING_RULE, newRewritingRule, newRewritingRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EmigPackage.MIGRATOR_DX__REWRITING_RULE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetRewritingRule((RewritingRule)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case EmigPackage.MIGRATOR_DX__FILTER_DX:
        return ((InternalEList<?>)getFilterDX()).basicRemove(otherEnd, msgs);
      case EmigPackage.MIGRATOR_DX__REWRITING_RULE:
        return basicSetRewritingRule(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case EmigPackage.MIGRATOR_DX__REWRITING_RULE:
        return eInternalContainer().eInverseRemove(this, EmigPackage.REWRITING_RULE__MIGRATOR_DX, RewritingRule.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case EmigPackage.MIGRATOR_DX__ELEMENT_DX:
        if (resolve) return getElementDX();
        return basicGetElementDX();
      case EmigPackage.MIGRATOR_DX__FILTER_DX:
        return getFilterDX();
      case EmigPackage.MIGRATOR_DX__REWRITING_RULE:
        return getRewritingRule();
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
      case EmigPackage.MIGRATOR_DX__ELEMENT_DX:
        setElementDX((EClass)newValue);
        return;
      case EmigPackage.MIGRATOR_DX__FILTER_DX:
        getFilterDX().clear();
        getFilterDX().addAll((Collection<? extends FilterMigrator>)newValue);
        return;
      case EmigPackage.MIGRATOR_DX__REWRITING_RULE:
        setRewritingRule((RewritingRule)newValue);
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
      case EmigPackage.MIGRATOR_DX__ELEMENT_DX:
        setElementDX((EClass)null);
        return;
      case EmigPackage.MIGRATOR_DX__FILTER_DX:
        getFilterDX().clear();
        return;
      case EmigPackage.MIGRATOR_DX__REWRITING_RULE:
        setRewritingRule((RewritingRule)null);
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
      case EmigPackage.MIGRATOR_DX__ELEMENT_DX:
        return elementDX != null;
      case EmigPackage.MIGRATOR_DX__FILTER_DX:
        return filterDX != null && !filterDX.isEmpty();
      case EmigPackage.MIGRATOR_DX__REWRITING_RULE:
        return getRewritingRule() != null;
    }
    return super.eIsSet(featureID);
  }

} //MigratorDXImpl
