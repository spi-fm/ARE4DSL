/**
 */
package entityrelationship.impl;

import entityrelationship.ERModel;
import entityrelationship.Entity;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Relantionship;

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
 * An implementation of the model object '<em><b>ER Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entityrelationship.impl.ERModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link entityrelationship.impl.ERModelImpl#getRelantionships <em>Relantionships</em>}</li>
 *   <li>{@link entityrelationship.impl.ERModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERModelImpl extends MinimalEObjectImpl.Container implements ERModel {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getRelantionships() <em>Relantionships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelantionships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relantionship> relantionships;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.ER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this,
					EntityrelationshipPackage.ER_MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relantionship> getRelantionships() {
		if (relantionships == null) {
			relantionships = new EObjectContainmentEList<Relantionship>(Relantionship.class, this,
					EntityrelationshipPackage.ER_MODEL__RELANTIONSHIPS);
		}
		return relantionships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ER_MODEL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EntityrelationshipPackage.ER_MODEL__ENTITIES:
			return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
		case EntityrelationshipPackage.ER_MODEL__RELANTIONSHIPS:
			return ((InternalEList<?>) getRelantionships()).basicRemove(otherEnd, msgs);
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
		case EntityrelationshipPackage.ER_MODEL__ENTITIES:
			return getEntities();
		case EntityrelationshipPackage.ER_MODEL__RELANTIONSHIPS:
			return getRelantionships();
		case EntityrelationshipPackage.ER_MODEL__NAME:
			return getName();
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
		case EntityrelationshipPackage.ER_MODEL__ENTITIES:
			getEntities().clear();
			getEntities().addAll((Collection<? extends Entity>) newValue);
			return;
		case EntityrelationshipPackage.ER_MODEL__RELANTIONSHIPS:
			getRelantionships().clear();
			getRelantionships().addAll((Collection<? extends Relantionship>) newValue);
			return;
		case EntityrelationshipPackage.ER_MODEL__NAME:
			setName((String) newValue);
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
		case EntityrelationshipPackage.ER_MODEL__ENTITIES:
			getEntities().clear();
			return;
		case EntityrelationshipPackage.ER_MODEL__RELANTIONSHIPS:
			getRelantionships().clear();
			return;
		case EntityrelationshipPackage.ER_MODEL__NAME:
			setName(NAME_EDEFAULT);
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
		case EntityrelationshipPackage.ER_MODEL__ENTITIES:
			return entities != null && !entities.isEmpty();
		case EntityrelationshipPackage.ER_MODEL__RELANTIONSHIPS:
			return relantionships != null && !relantionships.isEmpty();
		case EntityrelationshipPackage.ER_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ERModelImpl
