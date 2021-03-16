/**
 */
package entityrelationship.impl;

import entityrelationship.Attribute;
import entityrelationship.DATATYPE;
import entityrelationship.EntityrelationshipPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#isForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DATATYPE DATA_TYPE_EDEFAULT = DATATYPE.INTEGER;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DATATYPE dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOREIGN_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForeignKey()
	 * @generated
	 * @ordered
	 */
	protected boolean foreignKey = FOREIGN_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimaryKey = IS_PRIMARY_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DATATYPE getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DATATYPE newDataType) {
		DATATYPE oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__DATA_TYPE,
					oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isForeignKey() {
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForeignKey(boolean newForeignKey) {
		boolean oldForeignKey = foreignKey;
		foreignKey = newForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__FOREIGN_KEY,
					oldForeignKey, foreignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPrimaryKey(boolean newIsPrimaryKey) {
		boolean oldIsPrimaryKey = isPrimaryKey;
		isPrimaryKey = newIsPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__IS_PRIMARY_KEY,
					oldIsPrimaryKey, isPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EntityrelationshipPackage.ATTRIBUTE__NAME:
			return getName();
		case EntityrelationshipPackage.ATTRIBUTE__DATA_TYPE:
			return getDataType();
		case EntityrelationshipPackage.ATTRIBUTE__FOREIGN_KEY:
			return isForeignKey();
		case EntityrelationshipPackage.ATTRIBUTE__IS_PRIMARY_KEY:
			return isIsPrimaryKey();
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
		case EntityrelationshipPackage.ATTRIBUTE__NAME:
			setName((String) newValue);
			return;
		case EntityrelationshipPackage.ATTRIBUTE__DATA_TYPE:
			setDataType((DATATYPE) newValue);
			return;
		case EntityrelationshipPackage.ATTRIBUTE__FOREIGN_KEY:
			setForeignKey((Boolean) newValue);
			return;
		case EntityrelationshipPackage.ATTRIBUTE__IS_PRIMARY_KEY:
			setIsPrimaryKey((Boolean) newValue);
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
		case EntityrelationshipPackage.ATTRIBUTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EntityrelationshipPackage.ATTRIBUTE__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case EntityrelationshipPackage.ATTRIBUTE__FOREIGN_KEY:
			setForeignKey(FOREIGN_KEY_EDEFAULT);
			return;
		case EntityrelationshipPackage.ATTRIBUTE__IS_PRIMARY_KEY:
			setIsPrimaryKey(IS_PRIMARY_KEY_EDEFAULT);
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
		case EntityrelationshipPackage.ATTRIBUTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EntityrelationshipPackage.ATTRIBUTE__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
		case EntityrelationshipPackage.ATTRIBUTE__FOREIGN_KEY:
			return foreignKey != FOREIGN_KEY_EDEFAULT;
		case EntityrelationshipPackage.ATTRIBUTE__IS_PRIMARY_KEY:
			return isPrimaryKey != IS_PRIMARY_KEY_EDEFAULT;
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
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", foreignKey: ");
		result.append(foreignKey);
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
