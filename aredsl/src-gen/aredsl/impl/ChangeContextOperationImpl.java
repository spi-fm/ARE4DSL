/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.ChangeContextOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Context Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.ChangeContextOperationImpl#getSemanticExpression <em>Semantic Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeContextOperationImpl extends DomainOperationImpl implements ChangeContextOperation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeContextOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.CHANGE_CONTEXT_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AredslPackage.CHANGE_CONTEXT_OPERATION__SEMANTIC_EXPRESSION, oldSemanticExpression,
					semanticExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AredslPackage.CHANGE_CONTEXT_OPERATION__SEMANTIC_EXPRESSION:
			return getSemanticExpression();
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
		case AredslPackage.CHANGE_CONTEXT_OPERATION__SEMANTIC_EXPRESSION:
			setSemanticExpression((String) newValue);
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
		case AredslPackage.CHANGE_CONTEXT_OPERATION__SEMANTIC_EXPRESSION:
			setSemanticExpression(SEMANTIC_EXPRESSION_EDEFAULT);
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
		case AredslPackage.CHANGE_CONTEXT_OPERATION__SEMANTIC_EXPRESSION:
			return SEMANTIC_EXPRESSION_EDEFAULT == null ? semanticExpression != null
					: !SEMANTIC_EXPRESSION_EDEFAULT.equals(semanticExpression);
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
		result.append(')');
		return result.toString();
	}

} //ChangeContextOperationImpl
