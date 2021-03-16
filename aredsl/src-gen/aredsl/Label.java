/**
 */
package aredsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.Label#getLabelstyles <em>Labelstyles</em>}</li>
 *   <li>{@link aredsl.Label#getSemanticExpression <em>Semantic Expression</em>}</li>
 *   <li>{@link aredsl.Label#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.Label#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends EObject {
	/**
	 * Returns the value of the '<em><b>Labelstyles</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.LabelStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labelstyles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelstyles</em>' containment reference list.
	 * @see aredsl.AredslPackage#getLabel_Labelstyles()
	 * @model containment="true"
	 * @generated
	 */
	EList<LabelStyle> getLabelstyles();

	/**
	 * Returns the value of the '<em><b>Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Expression</em>' attribute.
	 * @see #setSemanticExpression(String)
	 * @see aredsl.AredslPackage#getLabel_SemanticExpression()
	 * @model
	 * @generated
	 */
	String getSemanticExpression();

	/**
	 * Sets the value of the '{@link aredsl.Label#getSemanticExpression <em>Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Expression</em>' attribute.
	 * @see #getSemanticExpression()
	 * @generated
	 */
	void setSemanticExpression(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see aredsl.AredslPackage#getLabel_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link aredsl.Label#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see aredsl.AredslPackage#getLabel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link aredsl.Label#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Label
