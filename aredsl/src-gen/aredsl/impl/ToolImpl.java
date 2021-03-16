/**
 */
package aredsl.impl;

import aredsl.Action;
import aredsl.AredslPackage;
import aredsl.Behaviour;
import aredsl.Tool;

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
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.ToolImpl#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.impl.ToolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link aredsl.impl.ToolImpl#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link aredsl.impl.ToolImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link aredsl.impl.ToolImpl#getTargetPrecondition <em>Target Precondition</em>}</li>
 *   <li>{@link aredsl.impl.ToolImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolImpl extends MinimalEObjectImpl.Container implements Tool {
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
	 * The cached value of the '{@link #getBehaviours() <em>Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<Behaviour> behaviours;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = "None";

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPrecondition() <em>Target Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PRECONDITION_EDEFAULT = "None";

	/**
	 * The cached value of the '{@link #getTargetPrecondition() <em>Target Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String targetPrecondition = TARGET_PRECONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.TOOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.TOOL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.TOOL__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behaviour> getBehaviours() {
		if (behaviours == null) {
			behaviours = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, AredslPackage.TOOL__BEHAVIOURS);
		}
		return behaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.TOOL__PRECONDITION, oldPrecondition,
					precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetPrecondition() {
		return targetPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPrecondition(String newTargetPrecondition) {
		String oldTargetPrecondition = targetPrecondition;
		targetPrecondition = newTargetPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.TOOL__TARGET_PRECONDITION,
					oldTargetPrecondition, targetPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, AredslPackage.TOOL__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AredslPackage.TOOL__BEHAVIOURS:
			return ((InternalEList<?>) getBehaviours()).basicRemove(otherEnd, msgs);
		case AredslPackage.TOOL__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
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
		case AredslPackage.TOOL__ID:
			return getId();
		case AredslPackage.TOOL__DESCRIPTION:
			return getDescription();
		case AredslPackage.TOOL__BEHAVIOURS:
			return getBehaviours();
		case AredslPackage.TOOL__PRECONDITION:
			return getPrecondition();
		case AredslPackage.TOOL__TARGET_PRECONDITION:
			return getTargetPrecondition();
		case AredslPackage.TOOL__ACTIONS:
			return getActions();
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
		case AredslPackage.TOOL__ID:
			setId((String) newValue);
			return;
		case AredslPackage.TOOL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AredslPackage.TOOL__BEHAVIOURS:
			getBehaviours().clear();
			getBehaviours().addAll((Collection<? extends Behaviour>) newValue);
			return;
		case AredslPackage.TOOL__PRECONDITION:
			setPrecondition((String) newValue);
			return;
		case AredslPackage.TOOL__TARGET_PRECONDITION:
			setTargetPrecondition((String) newValue);
			return;
		case AredslPackage.TOOL__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
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
		case AredslPackage.TOOL__ID:
			setId(ID_EDEFAULT);
			return;
		case AredslPackage.TOOL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AredslPackage.TOOL__BEHAVIOURS:
			getBehaviours().clear();
			return;
		case AredslPackage.TOOL__PRECONDITION:
			setPrecondition(PRECONDITION_EDEFAULT);
			return;
		case AredslPackage.TOOL__TARGET_PRECONDITION:
			setTargetPrecondition(TARGET_PRECONDITION_EDEFAULT);
			return;
		case AredslPackage.TOOL__ACTIONS:
			getActions().clear();
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
		case AredslPackage.TOOL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case AredslPackage.TOOL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AredslPackage.TOOL__BEHAVIOURS:
			return behaviours != null && !behaviours.isEmpty();
		case AredslPackage.TOOL__PRECONDITION:
			return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
		case AredslPackage.TOOL__TARGET_PRECONDITION:
			return TARGET_PRECONDITION_EDEFAULT == null ? targetPrecondition != null
					: !TARGET_PRECONDITION_EDEFAULT.equals(targetPrecondition);
		case AredslPackage.TOOL__ACTIONS:
			return actions != null && !actions.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", precondition: ");
		result.append(precondition);
		result.append(", targetPrecondition: ");
		result.append(targetPrecondition);
		result.append(')');
		return result.toString();
	}

} //ToolImpl
