/**
 */
package aredsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.Layer#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.Layer#getSemanticExpression <em>Semantic Expression</em>}</li>
 *   <li>{@link aredsl.Layer#getNodes <em>Nodes</em>}</li>
 *   <li>{@link aredsl.Layer#getEdges <em>Edges</em>}</li>
 *   <li>{@link aredsl.Layer#getDescription <em>Description</em>}</li>
 *   <li>{@link aredsl.Layer#getReferenceAction <em>Reference Action</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"DefaultLayer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see aredsl.AredslPackage#getLayer_Id()
	 * @model default="DefaultLayer" id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link aredsl.Layer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Expression</em>' attribute.
	 * @see #setSemanticExpression(String)
	 * @see aredsl.AredslPackage#getLayer_SemanticExpression()
	 * @model
	 * @generated
	 */
	String getSemanticExpression();

	/**
	 * Sets the value of the '{@link aredsl.Layer#getSemanticExpression <em>Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Expression</em>' attribute.
	 * @see #getSemanticExpression()
	 * @generated
	 */
	void setSemanticExpression(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see aredsl.AredslPackage#getLayer_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see aredsl.AredslPackage#getLayer_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

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
	 * @see aredsl.AredslPackage#getLayer_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link aredsl.Layer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Reference Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Action</em>' containment reference.
	 * @see #setReferenceAction(TrackerAction)
	 * @see aredsl.AredslPackage#getLayer_ReferenceAction()
	 * @model containment="true"
	 * @generated
	 */
	TrackerAction getReferenceAction();

	/**
	 * Sets the value of the '{@link aredsl.Layer#getReferenceAction <em>Reference Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Action</em>' containment reference.
	 * @see #getReferenceAction()
	 * @generated
	 */
	void setReferenceAction(TrackerAction value);

} // Layer
