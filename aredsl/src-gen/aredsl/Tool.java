/**
 */
package aredsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.Tool#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.Tool#getDescription <em>Description</em>}</li>
 *   <li>{@link aredsl.Tool#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link aredsl.Tool#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link aredsl.Tool#getTargetPrecondition <em>Target Precondition</em>}</li>
 *   <li>{@link aredsl.Tool#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends EObject {
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
	 * @see aredsl.AredslPackage#getTool_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link aredsl.Tool#getId <em>Id</em>}' attribute.
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
	 * @see aredsl.AredslPackage#getTool_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link aredsl.Tool#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see aredsl.AredslPackage#getTool_Behaviours()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see aredsl.AredslPackage#getTool_Precondition()
	 * @model default="None"
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link aredsl.Tool#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

	/**
	 * Returns the value of the '<em><b>Target Precondition</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Precondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Precondition</em>' attribute.
	 * @see #setTargetPrecondition(String)
	 * @see aredsl.AredslPackage#getTool_TargetPrecondition()
	 * @model default="None"
	 * @generated
	 */
	String getTargetPrecondition();

	/**
	 * Sets the value of the '{@link aredsl.Tool#getTargetPrecondition <em>Target Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Precondition</em>' attribute.
	 * @see #getTargetPrecondition()
	 * @generated
	 */
	void setTargetPrecondition(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see aredsl.AredslPackage#getTool_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Tool
