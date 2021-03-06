/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getSetters <em>Setters</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getReferences <em>References</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEClassOperation()
 * @model
 * @generated
 */
public interface EClassOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(EClass)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEClassOperation_Var()
   * @model containment="true"
   * @generated
   */
  EClass getVar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EClass value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(EObject)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEClassOperation_Op()
   * @model containment="true"
   * @generated
   */
  EObject getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(EObject value);

  /**
   * Returns the value of the '<em><b>Setters</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setters</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEClassOperation_Setters()
   * @model containment="true"
   * @generated
   */
  EList<setter> getSetters();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEClassOperation_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<EAttributeOperation> getAttributes();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEClassOperation_References()
   * @model containment="true"
   * @generated
   */
  EList<EReferenceOperation> getReferences();

  /**
   * Returns the value of the '<em><b>Complex</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complex</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEClassOperation_Complex()
   * @model containment="true"
   * @generated
   */
  EList<ComplexOperator> getComplex();

} // EClassOperation
