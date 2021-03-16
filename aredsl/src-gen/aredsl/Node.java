/**
 */
package aredsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.Node#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.Node#getSemanticExpression <em>Semantic Expression</em>}</li>
 *   <li>{@link aredsl.Node#getNodestyles <em>Nodestyles</em>}</li>
 *   <li>{@link aredsl.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link aredsl.Node#getContaimentKind <em>Contaiment Kind</em>}</li>
 *   <li>{@link aredsl.Node#getContentNodes <em>Content Nodes</em>}</li>
 *   <li>{@link aredsl.Node#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
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
	 * @see aredsl.AredslPackage#getNode_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link aredsl.Node#getId <em>Id</em>}' attribute.
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
	 * @see aredsl.AredslPackage#getNode_SemanticExpression()
	 * @model
	 * @generated
	 */
	String getSemanticExpression();

	/**
	 * Sets the value of the '{@link aredsl.Node#getSemanticExpression <em>Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Expression</em>' attribute.
	 * @see #getSemanticExpression()
	 * @generated
	 */
	void setSemanticExpression(String value);

	/**
	 * Returns the value of the '<em><b>Nodestyles</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.NodeStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodestyles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodestyles</em>' containment reference list.
	 * @see aredsl.AredslPackage#getNode_Nodestyles()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeStyle> getNodestyles();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see aredsl.AredslPackage#getNode_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link aredsl.Node#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Contaiment Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link aredsl.ContainmentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contaiment Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contaiment Kind</em>' attribute.
	 * @see aredsl.ContainmentKind
	 * @see #setContaimentKind(ContainmentKind)
	 * @see aredsl.AredslPackage#getNode_ContaimentKind()
	 * @model
	 * @generated
	 */
	ContainmentKind getContaimentKind();

	/**
	 * Sets the value of the '{@link aredsl.Node#getContaimentKind <em>Contaiment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contaiment Kind</em>' attribute.
	 * @see aredsl.ContainmentKind
	 * @see #getContaimentKind()
	 * @generated
	 */
	void setContaimentKind(ContainmentKind value);

	/**
	 * Returns the value of the '<em><b>Content Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Nodes</em>' containment reference list.
	 * @see aredsl.AredslPackage#getNode_ContentNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getContentNodes();

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
	 * @see aredsl.AredslPackage#getNode_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link aredsl.Node#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Node
