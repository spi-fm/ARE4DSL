/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relantionship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entityrelationship.Relantionship#getName <em>Name</em>}</li>
 *   <li>{@link entityrelationship.Relantionship#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link entityrelationship.Relantionship#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link entityrelationship.Relantionship#getSource <em>Source</em>}</li>
 *   <li>{@link entityrelationship.Relantionship#getTarget <em>Target</em>}</li>
 *   <li>{@link entityrelationship.Relantionship#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see entityrelationship.EntityrelationshipPackage#getRelantionship()
 * @model
 * @generated
 */
public interface Relantionship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see entityrelationship.EntityrelationshipPackage#getRelantionship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entityrelationship.Relantionship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Cardinality</b></em>' attribute.
	 * The default value is <code>"0:1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cardinality</em>' attribute.
	 * @see #setSourceCardinality(String)
	 * @see entityrelationship.EntityrelationshipPackage#getRelantionship_SourceCardinality()
	 * @model default="0:1"
	 * @generated
	 */
	String getSourceCardinality();

	/**
	 * Sets the value of the '{@link entityrelationship.Relantionship#getSourceCardinality <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cardinality</em>' attribute.
	 * @see #getSourceCardinality()
	 * @generated
	 */
	void setSourceCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * The default value is <code>"0:1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see #setTargetCardinality(String)
	 * @see entityrelationship.EntityrelationshipPackage#getRelantionship_TargetCardinality()
	 * @model default="0:1"
	 * @generated
	 */
	String getTargetCardinality();

	/**
	 * Sets the value of the '{@link entityrelationship.Relantionship#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see entityrelationship.EntityrelationshipPackage#getRelantionship_Source()
	 * @model required="true"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link entityrelationship.Relantionship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see entityrelationship.EntityrelationshipPackage#getRelantionship_Target()
	 * @model required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link entityrelationship.Relantionship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getRelantionship_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Relantionship
