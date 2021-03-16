/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ER Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entityrelationship.ERModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link entityrelationship.ERModel#getRelantionships <em>Relantionships</em>}</li>
 *   <li>{@link entityrelationship.ERModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see entityrelationship.EntityrelationshipPackage#getERModel()
 * @model
 * @generated
 */
public interface ERModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getERModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Relantionships</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Relantionship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relantionships</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getERModel_Relantionships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relantionship> getRelantionships();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see entityrelationship.EntityrelationshipPackage#getERModel_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entityrelationship.ERModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ERModel
