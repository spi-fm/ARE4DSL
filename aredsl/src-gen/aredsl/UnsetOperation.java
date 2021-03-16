/**
 */
package aredsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unset Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.UnsetOperation#getFeature <em>Feature</em>}</li>
 *   <li>{@link aredsl.UnsetOperation#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getUnsetOperation()
 * @model
 * @generated
 */
public interface UnsetOperation extends DomainOperation {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see aredsl.AredslPackage#getUnsetOperation_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link aredsl.UnsetOperation#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * The literals are from the enumeration {@link aredsl.IntegrityRestrictionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see aredsl.IntegrityRestrictionKind
	 * @see #setConstraint(IntegrityRestrictionKind)
	 * @see aredsl.AredslPackage#getUnsetOperation_Constraint()
	 * @model
	 * @generated
	 */
	IntegrityRestrictionKind getConstraint();

	/**
	 * Sets the value of the '{@link aredsl.UnsetOperation#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see aredsl.IntegrityRestrictionKind
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(IntegrityRestrictionKind value);

} // UnsetOperation
