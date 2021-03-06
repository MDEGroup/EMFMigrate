/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Feature Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCLinEmig.OclFeatureDefinition#getFeature <em>Feature</em>}</li>
 *   <li>{@link OCLinEmig.OclFeatureDefinition#getContext_ <em>Context </em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLinEmig.OCLinEmigPackage#getOclFeatureDefinition()
 * @model
 * @generated
 */
public interface OclFeatureDefinition extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclFeature#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(OclFeature)
	 * @see OCLinEmig.OCLinEmigPackage#getOclFeatureDefinition_Feature()
	 * @see OCLinEmig.OclFeature#getDefinition
	 * @model opposite="definition" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclFeature getFeature();

	/**
	 * Sets the value of the '{@link OCLinEmig.OclFeatureDefinition#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(OclFeature value);

	/**
	 * Returns the value of the '<em><b>Context </b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclContextDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context </em>' containment reference.
	 * @see #setContext_(OclContextDefinition)
	 * @see OCLinEmig.OCLinEmigPackage#getOclFeatureDefinition_Context_()
	 * @see OCLinEmig.OclContextDefinition#getDefinition
	 * @model opposite="definition" containment="true" ordered="false"
	 * @generated
	 */
	OclContextDefinition getContext_();

	/**
	 * Sets the value of the '{@link OCLinEmig.OclFeatureDefinition#getContext_ <em>Context </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context </em>' containment reference.
	 * @see #getContext_()
	 * @generated
	 */
	void setContext_(OclContextDefinition value);

} // OclFeatureDefinition
