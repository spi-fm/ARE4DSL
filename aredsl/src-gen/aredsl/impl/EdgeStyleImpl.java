/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.EdgeStyle;
import aredsl.LineKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.EdgeStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link aredsl.impl.EdgeStyleImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link aredsl.impl.EdgeStyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link aredsl.impl.EdgeStyleImpl#getSemanticCondition <em>Semantic Condition</em>}</li>
 *   <li>{@link aredsl.impl.EdgeStyleImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeStyleImpl extends MinimalEObjectImpl.Container implements EdgeStyle {
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
	protected static final LineKind KIND_EDEFAULT = LineKind.SOLID;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected LineKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticCondition() <em>Semantic Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CONDITION_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getSemanticCondition() <em>Semantic Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCondition()
	 * @generated
	 * @ordered
	 */
	protected String semanticCondition = SEMANTIC_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.EDGE_STYLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE_STYLE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(LineKind newKind) {
		LineKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE_STYLE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE_STYLE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSemanticCondition() {
		return semanticCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemanticCondition(String newSemanticCondition) {
		String oldSemanticCondition = semanticCondition;
		semanticCondition = newSemanticCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE_STYLE__SEMANTIC_CONDITION,
					oldSemanticCondition, semanticCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE_STYLE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AredslPackage.EDGE_STYLE__COLOR:
			return getColor();
		case AredslPackage.EDGE_STYLE__KIND:
			return getKind();
		case AredslPackage.EDGE_STYLE__WIDTH:
			return getWidth();
		case AredslPackage.EDGE_STYLE__SEMANTIC_CONDITION:
			return getSemanticCondition();
		case AredslPackage.EDGE_STYLE__DESCRIPTION:
			return getDescription();
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
		case AredslPackage.EDGE_STYLE__COLOR:
			setColor((String) newValue);
			return;
		case AredslPackage.EDGE_STYLE__KIND:
			setKind((LineKind) newValue);
			return;
		case AredslPackage.EDGE_STYLE__WIDTH:
			setWidth((Integer) newValue);
			return;
		case AredslPackage.EDGE_STYLE__SEMANTIC_CONDITION:
			setSemanticCondition((String) newValue);
			return;
		case AredslPackage.EDGE_STYLE__DESCRIPTION:
			setDescription((String) newValue);
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
		case AredslPackage.EDGE_STYLE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case AredslPackage.EDGE_STYLE__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case AredslPackage.EDGE_STYLE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case AredslPackage.EDGE_STYLE__SEMANTIC_CONDITION:
			setSemanticCondition(SEMANTIC_CONDITION_EDEFAULT);
			return;
		case AredslPackage.EDGE_STYLE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case AredslPackage.EDGE_STYLE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case AredslPackage.EDGE_STYLE__KIND:
			return kind != KIND_EDEFAULT;
		case AredslPackage.EDGE_STYLE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case AredslPackage.EDGE_STYLE__SEMANTIC_CONDITION:
			return SEMANTIC_CONDITION_EDEFAULT == null ? semanticCondition != null
					: !SEMANTIC_CONDITION_EDEFAULT.equals(semanticCondition);
		case AredslPackage.EDGE_STYLE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", width: ");
		result.append(width);
		result.append(", semanticCondition: ");
		result.append(semanticCondition);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EdgeStyleImpl
