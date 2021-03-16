/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.GeometricShapeNodeStyle;
import aredsl.OutlineKind;
import aredsl.ShapeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometric Shape Node Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.GeometricShapeNodeStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link aredsl.impl.GeometricShapeNodeStyleImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link aredsl.impl.GeometricShapeNodeStyleImpl#getOutline <em>Outline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeometricShapeNodeStyleImpl extends NodeStyleImpl implements GeometricShapeNodeStyle {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ShapeKind KIND_EDEFAULT = ShapeKind.CIRCLE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ShapeKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutline()
	 * @generated
	 * @ordered
	 */
	protected static final OutlineKind OUTLINE_EDEFAULT = OutlineKind.SIMPLE;

	/**
	 * The cached value of the '{@link #getOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutline()
	 * @generated
	 * @ordered
	 */
	protected OutlineKind outline = OUTLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometricShapeNodeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.GEOMETRIC_SHAPE_NODE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__COLOR,
					oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShapeKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ShapeKind newKind) {
		ShapeKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__KIND,
					oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutlineKind getOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutline(OutlineKind newOutline) {
		OutlineKind oldOutline = outline;
		outline = newOutline == null ? OUTLINE_EDEFAULT : newOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__OUTLINE,
					oldOutline, outline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__COLOR:
			return getColor();
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__KIND:
			return getKind();
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__OUTLINE:
			return getOutline();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__COLOR:
			setColor((String) newValue);
			return;
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__KIND:
			setKind((ShapeKind) newValue);
			return;
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__OUTLINE:
			setOutline((OutlineKind) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__OUTLINE:
			setOutline(OUTLINE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__KIND:
			return kind != KIND_EDEFAULT;
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE__OUTLINE:
			return outline != OUTLINE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", kind: ");
		result.append(kind);
		result.append(", outline: ");
		result.append(outline);
		result.append(')');
		return result.toString();
	}

} //GeometricShapeNodeStyleImpl
