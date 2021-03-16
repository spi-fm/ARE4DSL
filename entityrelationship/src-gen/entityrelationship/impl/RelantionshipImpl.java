/**
 */
package entityrelationship.impl;

import entityrelationship.Attribute;
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
 * An implementation of the model object '<em><b>Relantionship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entityrelationship.impl.RelantionshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link entityrelationship.impl.RelantionshipImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link entityrelationship.impl.RelantionshipImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link entityrelationship.impl.RelantionshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link entityrelationship.impl.RelantionshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link entityrelationship.impl.RelantionshipImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelantionshipImpl extends MinimalEObjectImpl.Container implements Relantionship {
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
	 * The default value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CARDINALITY_EDEFAULT = "0:1";

	/**
	 * The cached value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected String sourceCardinality = SOURCE_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CARDINALITY_EDEFAULT = "0:1";

	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected String targetCardinality = TARGET_CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Entity source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Entity target;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelantionshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.RELANTIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELANTIONSHIP__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceCardinality() {
		return sourceCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceCardinality(String newSourceCardinality) {
		String oldSourceCardinality = sourceCardinality;
		sourceCardinality = newSourceCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EntityrelationshipPackage.RELANTIONSHIP__SOURCE_CARDINALITY, oldSourceCardinality,
					sourceCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetCardinality(String newTargetCardinality) {
		String oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EntityrelationshipPackage.RELANTIONSHIP__TARGET_CARDINALITY, oldTargetCardinality,
					targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Entity) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EntityrelationshipPackage.RELANTIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Entity newSource) {
		Entity oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELANTIONSHIP__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Entity) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EntityrelationshipPackage.RELANTIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Entity newTarget) {
		Entity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELANTIONSHIP__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					EntityrelationshipPackage.RELANTIONSHIP__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EntityrelationshipPackage.RELANTIONSHIP__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
		case EntityrelationshipPackage.RELANTIONSHIP__NAME:
			return getName();
		case EntityrelationshipPackage.RELANTIONSHIP__SOURCE_CARDINALITY:
			return getSourceCardinality();
		case EntityrelationshipPackage.RELANTIONSHIP__TARGET_CARDINALITY:
			return getTargetCardinality();
		case EntityrelationshipPackage.RELANTIONSHIP__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case EntityrelationshipPackage.RELANTIONSHIP__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case EntityrelationshipPackage.RELANTIONSHIP__ATTRIBUTES:
			return getAttributes();
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
		case EntityrelationshipPackage.RELANTIONSHIP__NAME:
			setName((String) newValue);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__SOURCE_CARDINALITY:
			setSourceCardinality((String) newValue);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__TARGET_CARDINALITY:
			setTargetCardinality((String) newValue);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__SOURCE:
			setSource((Entity) newValue);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__TARGET:
			setTarget((Entity) newValue);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
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
		case EntityrelationshipPackage.RELANTIONSHIP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__SOURCE_CARDINALITY:
			setSourceCardinality(SOURCE_CARDINALITY_EDEFAULT);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__TARGET_CARDINALITY:
			setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__SOURCE:
			setSource((Entity) null);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__TARGET:
			setTarget((Entity) null);
			return;
		case EntityrelationshipPackage.RELANTIONSHIP__ATTRIBUTES:
			getAttributes().clear();
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
		case EntityrelationshipPackage.RELANTIONSHIP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EntityrelationshipPackage.RELANTIONSHIP__SOURCE_CARDINALITY:
			return SOURCE_CARDINALITY_EDEFAULT == null ? sourceCardinality != null
					: !SOURCE_CARDINALITY_EDEFAULT.equals(sourceCardinality);
		case EntityrelationshipPackage.RELANTIONSHIP__TARGET_CARDINALITY:
			return TARGET_CARDINALITY_EDEFAULT == null ? targetCardinality != null
					: !TARGET_CARDINALITY_EDEFAULT.equals(targetCardinality);
		case EntityrelationshipPackage.RELANTIONSHIP__SOURCE:
			return source != null;
		case EntityrelationshipPackage.RELANTIONSHIP__TARGET:
			return target != null;
		case EntityrelationshipPackage.RELANTIONSHIP__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
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
		result.append(", sourceCardinality: ");
		result.append(sourceCardinality);
		result.append(", targetCardinality: ");
		result.append(targetCardinality);
		result.append(')');
		return result.toString();
	}

} //RelantionshipImpl
