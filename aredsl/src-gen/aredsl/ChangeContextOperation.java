/**
 */
package aredsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Context Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.ChangeContextOperation#getSemanticExpression <em>Semantic Expression</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getChangeContextOperation()
 * @model
 * @generated
 */
public interface ChangeContextOperation extends DomainOperation {
	/**
	 * Returns the value of the '<em><b>Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Expression</em>' attribute.
	 * @see #setSemanticExpression(String)
	 * @see aredsl.AredslPackage#getChangeContextOperation_SemanticExpression()
	 * @model
	 * @generated
	 */
	String getSemanticExpression();

	/**
	 * Sets the value of the '{@link aredsl.ChangeContextOperation#getSemanticExpression <em>Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Expression</em>' attribute.
	 * @see #getSemanticExpression()
	 * @generated
	 */
	void setSemanticExpression(String value);

} // ChangeContextOperation
