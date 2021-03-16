/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.MarkerBasedTrackerAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marker Based Tracker Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.MarkerBasedTrackerActionImpl#getMarkerId <em>Marker Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkerBasedTrackerActionImpl extends TrackerActionImpl implements MarkerBasedTrackerAction {
	/**
	 * The default value of the '{@link #getMarkerId() <em>Marker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerId()
	 * @generated
	 * @ordered
	 */
	protected static final int MARKER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarkerId() <em>Marker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerId()
	 * @generated
	 * @ordered
	 */
	protected int markerId = MARKER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerBasedTrackerActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.MARKER_BASED_TRACKER_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMarkerId() {
		return markerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkerId(int newMarkerId) {
		int oldMarkerId = markerId;
		markerId = newMarkerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.MARKER_BASED_TRACKER_ACTION__MARKER_ID,
					oldMarkerId, markerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AredslPackage.MARKER_BASED_TRACKER_ACTION__MARKER_ID:
			return getMarkerId();
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
		case AredslPackage.MARKER_BASED_TRACKER_ACTION__MARKER_ID:
			setMarkerId((Integer) newValue);
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
		case AredslPackage.MARKER_BASED_TRACKER_ACTION__MARKER_ID:
			setMarkerId(MARKER_ID_EDEFAULT);
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
		case AredslPackage.MARKER_BASED_TRACKER_ACTION__MARKER_ID:
			return markerId != MARKER_ID_EDEFAULT;
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
		result.append(" (markerId: ");
		result.append(markerId);
		result.append(')');
		return result.toString();
	}

} //MarkerBasedTrackerActionImpl
