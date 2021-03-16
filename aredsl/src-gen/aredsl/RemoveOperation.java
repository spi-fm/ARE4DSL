/**
 */
package aredsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.RemoveOperation#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getRemoveOperation()
 * @model
 * @generated
 */
public interface RemoveOperation extends DomainOperation {
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
	 * @see aredsl.AredslPackage#getRemoveOperation_Constraint()
	 * @model
	 * @generated
	 */
	IntegrityRestrictionKind getConstraint();

	/**
	 * Sets the value of the '{@link aredsl.RemoveOperation#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see aredsl.IntegrityRestrictionKind
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(IntegrityRestrictionKind value);

} // RemoveOperation
