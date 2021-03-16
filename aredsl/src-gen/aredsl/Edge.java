/**
 */
package aredsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.Edge#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.Edge#getOriginSemanticExpression <em>Origin Semantic Expression</em>}</li>
 *   <li>{@link aredsl.Edge#getDestinationSemanticExpression <em>Destination Semantic Expression</em>}</li>
 *   <li>{@link aredsl.Edge#getEdgestyles <em>Edgestyles</em>}</li>
 *   <li>{@link aredsl.Edge#getMiddleLabel <em>Middle Label</em>}</li>
 *   <li>{@link aredsl.Edge#getOriginNode <em>Origin Node</em>}</li>
 *   <li>{@link aredsl.Edge#getDestinationNode <em>Destination Node</em>}</li>
 *   <li>{@link aredsl.Edge#getOriginLabel <em>Origin Label</em>}</li>
 *   <li>{@link aredsl.Edge#getDestinationLabel <em>Destination Label</em>}</li>
 *   <li>{@link aredsl.Edge#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see aredsl.AredslPackage#getEdge_Id()
	 * @model default="" id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Origin Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Semantic Expression</em>' attribute.
	 * @see #setOriginSemanticExpression(String)
	 * @see aredsl.AredslPackage#getEdge_OriginSemanticExpression()
	 * @model
	 * @generated
	 */
	String getOriginSemanticExpression();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getOriginSemanticExpression <em>Origin Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Semantic Expression</em>' attribute.
	 * @see #getOriginSemanticExpression()
	 * @generated
	 */
	void setOriginSemanticExpression(String value);

	/**
	 * Returns the value of the '<em><b>Destination Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Semantic Expression</em>' attribute.
	 * @see #setDestinationSemanticExpression(String)
	 * @see aredsl.AredslPackage#getEdge_DestinationSemanticExpression()
	 * @model
	 * @generated
	 */
	String getDestinationSemanticExpression();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getDestinationSemanticExpression <em>Destination Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Semantic Expression</em>' attribute.
	 * @see #getDestinationSemanticExpression()
	 * @generated
	 */
	void setDestinationSemanticExpression(String value);

	/**
	 * Returns the value of the '<em><b>Edgestyles</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.EdgeStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edgestyles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edgestyles</em>' containment reference list.
	 * @see aredsl.AredslPackage#getEdge_Edgestyles()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdgeStyle> getEdgestyles();

	/**
	 * Returns the value of the '<em><b>Middle Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Label</em>' containment reference.
	 * @see #setMiddleLabel(Label)
	 * @see aredsl.AredslPackage#getEdge_MiddleLabel()
	 * @model containment="true"
	 * @generated
	 */
	Label getMiddleLabel();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getMiddleLabel <em>Middle Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Label</em>' containment reference.
	 * @see #getMiddleLabel()
	 * @generated
	 */
	void setMiddleLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Origin Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Node</em>' reference.
	 * @see #setOriginNode(Node)
	 * @see aredsl.AredslPackage#getEdge_OriginNode()
	 * @model required="true"
	 * @generated
	 */
	Node getOriginNode();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getOriginNode <em>Origin Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Node</em>' reference.
	 * @see #getOriginNode()
	 * @generated
	 */
	void setOriginNode(Node value);

	/**
	 * Returns the value of the '<em><b>Destination Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Node</em>' reference.
	 * @see #setDestinationNode(Node)
	 * @see aredsl.AredslPackage#getEdge_DestinationNode()
	 * @model required="true"
	 * @generated
	 */
	Node getDestinationNode();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getDestinationNode <em>Destination Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Node</em>' reference.
	 * @see #getDestinationNode()
	 * @generated
	 */
	void setDestinationNode(Node value);

	/**
	 * Returns the value of the '<em><b>Origin Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Label</em>' containment reference.
	 * @see #setOriginLabel(Label)
	 * @see aredsl.AredslPackage#getEdge_OriginLabel()
	 * @model containment="true"
	 * @generated
	 */
	Label getOriginLabel();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getOriginLabel <em>Origin Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Label</em>' containment reference.
	 * @see #getOriginLabel()
	 * @generated
	 */
	void setOriginLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Destination Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Label</em>' containment reference.
	 * @see #setDestinationLabel(Label)
	 * @see aredsl.AredslPackage#getEdge_DestinationLabel()
	 * @model containment="true"
	 * @generated
	 */
	Label getDestinationLabel();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getDestinationLabel <em>Destination Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Label</em>' containment reference.
	 * @see #getDestinationLabel()
	 * @generated
	 */
	void setDestinationLabel(Label value);

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
	 * @see aredsl.AredslPackage#getEdge_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link aredsl.Edge#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Edge
