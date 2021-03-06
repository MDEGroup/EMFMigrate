/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import OCLinEmig.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migrator SX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getElementSX <em>Element SX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getFilterSX <em>Filter SX</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorSX()
 * @model
 * @generated
 */
public interface MigratorSX extends Migrator
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(VariableDeclaration)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorSX_Name()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getName();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Element SX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element SX</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element SX</em>' reference.
   * @see #setElementSX(EClass)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorSX_ElementSX()
   * @model
   * @generated
   */
  EClass getElementSX();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getElementSX <em>Element SX</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element SX</em>' reference.
   * @see #getElementSX()
   * @generated
   */
  void setElementSX(EClass value);

  /**
   * Returns the value of the '<em><b>Filter SX</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter SX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter SX</em>' containment reference list.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorSX_FilterSX()
   * @model containment="true"
   * @generated
   */
  EList<FilterMigrator> getFilterSX();

} // MigratorSX
