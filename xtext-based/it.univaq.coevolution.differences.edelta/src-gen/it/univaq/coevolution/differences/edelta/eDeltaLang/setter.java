/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getOperator <em>Operator</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getValue <em>Value</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getCard <em>Card</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getsetter()
 * @model
 * @generated
 */
public interface setter extends EObject
{
  /**
   * Returns the value of the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metafeature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metafeature</em>' reference.
   * @see #setMetafeature(EStructuralFeature)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getsetter_Metafeature()
   * @model
   * @generated
   */
  EStructuralFeature getMetafeature();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getMetafeature <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metafeature</em>' reference.
   * @see #getMetafeature()
   * @generated
   */
  void setMetafeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getsetter_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getsetter_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Card</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Card</em>' attribute.
   * @see #setCard(int)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getsetter_Card()
   * @model
   * @generated
   */
  int getCard();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getCard <em>Card</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card</em>' attribute.
   * @see #getCard()
   * @generated
   */
  void setCard(int value);

  /**
   * Returns the value of the '<em><b>Value Ref</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Ref</em>' reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getsetter_ValueRef()
   * @model
   * @generated
   */
  EList<EObject> getValueRef();

} // setter
