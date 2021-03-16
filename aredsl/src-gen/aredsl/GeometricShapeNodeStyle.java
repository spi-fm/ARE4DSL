/**
 */
package aredsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometric Shape Node Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.GeometricShapeNodeStyle#getColor <em>Color</em>}</li>
 *   <li>{@link aredsl.GeometricShapeNodeStyle#getKind <em>Kind</em>}</li>
 *   <li>{@link aredsl.GeometricShapeNodeStyle#getOutline <em>Outline</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getGeometricShapeNodeStyle()
 * @model
 * @generated
 */
public interface GeometricShapeNodeStyle extends NodeStyle {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see aredsl.AredslPackage#getGeometricShapeNodeStyle_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link aredsl.GeometricShapeNodeStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link aredsl.ShapeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see aredsl.ShapeKind
	 * @see #setKind(ShapeKind)
	 * @see aredsl.AredslPackage#getGeometricShapeNodeStyle_Kind()
	 * @model
	 * @generated
	 */
	ShapeKind getKind();

	/**
	 * Sets the value of the '{@link aredsl.GeometricShapeNodeStyle#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see aredsl.ShapeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ShapeKind value);

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * The literals are from the enumeration {@link aredsl.OutlineKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see aredsl.OutlineKind
	 * @see #setOutline(OutlineKind)
	 * @see aredsl.AredslPackage#getGeometricShapeNodeStyle_Outline()
	 * @model
	 * @generated
	 */
	OutlineKind getOutline();

	/**
	 * Sets the value of the '{@link aredsl.GeometricShapeNodeStyle#getOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see aredsl.OutlineKind
	 * @see #getOutline()
	 * @generated
	 */
	void setOutline(OutlineKind value);

} // GeometricShapeNodeStyle
