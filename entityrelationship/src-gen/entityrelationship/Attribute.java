/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entityrelationship.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link entityrelationship.Attribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link entityrelationship.Attribute#isForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link entityrelationship.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 * </ul>
 *
 * @see entityrelationship.EntityrelationshipPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.DATATYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see entityrelationship.DATATYPE
	 * @see #setDataType(DATATYPE)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_DataType()
	 * @model
	 * @generated
	 */
	DATATYPE getDataType();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see entityrelationship.DATATYPE
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DATATYPE value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' attribute.
	 * @see #setForeignKey(boolean)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_ForeignKey()
	 * @model
	 * @generated
	 */
	boolean isForeignKey();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#isForeignKey <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' attribute.
	 * @see #isForeignKey()
	 * @generated
	 */
	void setForeignKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(boolean)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_IsPrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isIsPrimaryKey();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #isIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(boolean value);

} // Attribute
