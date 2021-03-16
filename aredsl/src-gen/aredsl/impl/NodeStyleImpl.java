/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.NodeStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.NodeStyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link aredsl.impl.NodeStyleImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link aredsl.impl.NodeStyleImpl#getSemanticCondition <em>Semantic Condition</em>}</li>
 *   <li>{@link aredsl.impl.NodeStyleImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeStyleImpl extends MinimalEObjectImpl.Container implements NodeStyle {
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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

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
	protected NodeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.NODE_STYLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE_STYLE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE_STYLE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE_STYLE__SEMANTIC_CONDITION,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE_STYLE__DESCRIPTION, oldDescription,
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
		case AredslPackage.NODE_STYLE__WIDTH:
			return getWidth();
		case AredslPackage.NODE_STYLE__HEIGHT:
			return getHeight();
		case AredslPackage.NODE_STYLE__SEMANTIC_CONDITION:
			return getSemanticCondition();
		case AredslPackage.NODE_STYLE__DESCRIPTION:
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
		case AredslPackage.NODE_STYLE__WIDTH:
			setWidth((Integer) newValue);
			return;
		case AredslPackage.NODE_STYLE__HEIGHT:
			setHeight((Integer) newValue);
			return;
		case AredslPackage.NODE_STYLE__SEMANTIC_CONDITION:
			setSemanticCondition((String) newValue);
			return;
		case AredslPackage.NODE_STYLE__DESCRIPTION:
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
		case AredslPackage.NODE_STYLE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case AredslPackage.NODE_STYLE__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case AredslPackage.NODE_STYLE__SEMANTIC_CONDITION:
			setSemanticCondition(SEMANTIC_CONDITION_EDEFAULT);
			return;
		case AredslPackage.NODE_STYLE__DESCRIPTION:
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
		case AredslPackage.NODE_STYLE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case AredslPackage.NODE_STYLE__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case AredslPackage.NODE_STYLE__SEMANTIC_CONDITION:
			return SEMANTIC_CONDITION_EDEFAULT == null ? semanticCondition != null
					: !SEMANTIC_CONDITION_EDEFAULT.equals(semanticCondition);
		case AredslPackage.NODE_STYLE__DESCRIPTION:
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", semanticCondition: ");
		result.append(semanticCondition);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NodeStyleImpl
