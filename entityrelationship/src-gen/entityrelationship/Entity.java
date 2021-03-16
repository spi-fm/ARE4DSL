/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entityrelationship.Entity#getName <em>Name</em>}</li>
 *   <li>{@link entityrelationship.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link entityrelationship.Entity#isIsWeak <em>Is Weak</em>}</li>
 * </ul>
 *
 * @see entityrelationship.EntityrelationshipPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entityrelationship.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Is Weak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Weak</em>' attribute.
	 * @see #setIsWeak(boolean)
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_IsWeak()
	 * @model
	 * @generated
	 */
	boolean isIsWeak();

	/**
	 * Sets the value of the '{@link entityrelationship.Entity#isIsWeak <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Weak</em>' attribute.
	 * @see #isIsWeak()
	 * @generated
	 */
	void setIsWeak(boolean value);

} // Entity
