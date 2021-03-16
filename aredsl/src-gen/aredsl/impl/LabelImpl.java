/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.Label;
import aredsl.LabelStyle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.LabelImpl#getLabelstyles <em>Labelstyles</em>}</li>
 *   <li>{@link aredsl.impl.LabelImpl#getSemanticExpression <em>Semantic Expression</em>}</li>
 *   <li>{@link aredsl.impl.LabelImpl#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.impl.LabelImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label {
	/**
	 * The cached value of the '{@link #getLabelstyles() <em>Labelstyles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelstyles()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelStyle> labelstyles;

	/**
	 * The default value of the '{@link #getSemanticExpression() <em>Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticExpression() <em>Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticExpression()
	 * @generated
	 * @ordered
	 */
	protected String semanticExpression = SEMANTIC_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabelStyle> getLabelstyles() {
		if (labelstyles == null) {
			labelstyles = new EObjectContainmentEList<LabelStyle>(LabelStyle.class, this,
					AredslPackage.LABEL__LABELSTYLES);
		}
		return labelstyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSemanticExpression() {
		return semanticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemanticExpression(String newSemanticExpression) {
		String oldSemanticExpression = semanticExpression;
		semanticExpression = newSemanticExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.LABEL__SEMANTIC_EXPRESSION,
					oldSemanticExpression, semanticExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.LABEL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.LABEL__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AredslPackage.LABEL__LABELSTYLES:
			return ((InternalEList<?>) getLabelstyles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AredslPackage.LABEL__LABELSTYLES:
			return getLabelstyles();
		case AredslPackage.LABEL__SEMANTIC_EXPRESSION:
			return getSemanticExpression();
		case AredslPackage.LABEL__ID:
			return getId();
		case AredslPackage.LABEL__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AredslPackage.LABEL__LABELSTYLES:
			getLabelstyles().clear();
			getLabelstyles().addAll((Collection<? extends LabelStyle>) newValue);
			return;
		case AredslPackage.LABEL__SEMANTIC_EXPRESSION:
			setSemanticExpression((String) newValue);
			return;
		case AredslPackage.LABEL__ID:
			setId((String) newValue);
			return;
		case AredslPackage.LABEL__DESCRIPTION:
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
		case AredslPackage.LABEL__LABELSTYLES:
			getLabelstyles().clear();
			return;
		case AredslPackage.LABEL__SEMANTIC_EXPRESSION:
			setSemanticExpression(SEMANTIC_EXPRESSION_EDEFAULT);
			return;
		case AredslPackage.LABEL__ID:
			setId(ID_EDEFAULT);
			return;
		case AredslPackage.LABEL__DESCRIPTION:
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
		case AredslPackage.LABEL__LABELSTYLES:
			return labelstyles != null && !labelstyles.isEmpty();
		case AredslPackage.LABEL__SEMANTIC_EXPRESSION:
			return SEMANTIC_EXPRESSION_EDEFAULT == null ? semanticExpression != null
					: !SEMANTIC_EXPRESSION_EDEFAULT.equals(semanticExpression);
		case AredslPackage.LABEL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case AredslPackage.LABEL__DESCRIPTION:
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
		result.append(" (semanticExpression: ");
		result.append(semanticExpression);
		result.append(", id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
