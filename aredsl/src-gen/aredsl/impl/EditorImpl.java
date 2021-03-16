/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.Editor;
import aredsl.Layer;
import aredsl.QueryLanguageKind;
import aredsl.ToolSet;

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
 * An implementation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.EditorImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link aredsl.impl.EditorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link aredsl.impl.EditorImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link aredsl.impl.EditorImpl#getName <em>Name</em>}</li>
 *   <li>{@link aredsl.impl.EditorImpl#getToolsets <em>Toolsets</em>}</li>
 *   <li>{@link aredsl.impl.EditorImpl#getQueryLanguageKind <em>Query Language Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditorImpl extends MinimalEObjectImpl.Container implements Editor {
	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layer;

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
	 * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected String fileExtension = FILE_EXTENSION_EDEFAULT;

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
	 * The cached value of the '{@link #getToolsets() <em>Toolsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolsets()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolSet> toolsets;

	/**
	 * The default value of the '{@link #getQueryLanguageKind() <em>Query Language Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguageKind()
	 * @generated
	 * @ordered
	 */
	protected static final QueryLanguageKind QUERY_LANGUAGE_KIND_EDEFAULT = QueryLanguageKind.LINQ;

	/**
	 * The cached value of the '{@link #getQueryLanguageKind() <em>Query Language Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguageKind()
	 * @generated
	 * @ordered
	 */
	protected QueryLanguageKind queryLanguageKind = QUERY_LANGUAGE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layer> getLayer() {
		if (layer == null) {
			layer = new EObjectContainmentEList<Layer>(Layer.class, this, AredslPackage.EDITOR__LAYER);
		}
		return layer;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDITOR__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileExtension() {
		return fileExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileExtension(String newFileExtension) {
		String oldFileExtension = fileExtension;
		fileExtension = newFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDITOR__FILE_EXTENSION,
					oldFileExtension, fileExtension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDITOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToolSet> getToolsets() {
		if (toolsets == null) {
			toolsets = new EObjectContainmentEList<ToolSet>(ToolSet.class, this, AredslPackage.EDITOR__TOOLSETS);
		}
		return toolsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryLanguageKind getQueryLanguageKind() {
		return queryLanguageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryLanguageKind(QueryLanguageKind newQueryLanguageKind) {
		QueryLanguageKind oldQueryLanguageKind = queryLanguageKind;
		queryLanguageKind = newQueryLanguageKind == null ? QUERY_LANGUAGE_KIND_EDEFAULT : newQueryLanguageKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDITOR__QUERY_LANGUAGE_KIND,
					oldQueryLanguageKind, queryLanguageKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AredslPackage.EDITOR__LAYER:
			return ((InternalEList<?>) getLayer()).basicRemove(otherEnd, msgs);
		case AredslPackage.EDITOR__TOOLSETS:
			return ((InternalEList<?>) getToolsets()).basicRemove(otherEnd, msgs);
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
		case AredslPackage.EDITOR__LAYER:
			return getLayer();
		case AredslPackage.EDITOR__DESCRIPTION:
			return getDescription();
		case AredslPackage.EDITOR__FILE_EXTENSION:
			return getFileExtension();
		case AredslPackage.EDITOR__NAME:
			return getName();
		case AredslPackage.EDITOR__TOOLSETS:
			return getToolsets();
		case AredslPackage.EDITOR__QUERY_LANGUAGE_KIND:
			return getQueryLanguageKind();
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
		case AredslPackage.EDITOR__LAYER:
			getLayer().clear();
			getLayer().addAll((Collection<? extends Layer>) newValue);
			return;
		case AredslPackage.EDITOR__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AredslPackage.EDITOR__FILE_EXTENSION:
			setFileExtension((String) newValue);
			return;
		case AredslPackage.EDITOR__NAME:
			setName((String) newValue);
			return;
		case AredslPackage.EDITOR__TOOLSETS:
			getToolsets().clear();
			getToolsets().addAll((Collection<? extends ToolSet>) newValue);
			return;
		case AredslPackage.EDITOR__QUERY_LANGUAGE_KIND:
			setQueryLanguageKind((QueryLanguageKind) newValue);
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
		case AredslPackage.EDITOR__LAYER:
			getLayer().clear();
			return;
		case AredslPackage.EDITOR__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AredslPackage.EDITOR__FILE_EXTENSION:
			setFileExtension(FILE_EXTENSION_EDEFAULT);
			return;
		case AredslPackage.EDITOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AredslPackage.EDITOR__TOOLSETS:
			getToolsets().clear();
			return;
		case AredslPackage.EDITOR__QUERY_LANGUAGE_KIND:
			setQueryLanguageKind(QUERY_LANGUAGE_KIND_EDEFAULT);
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
		case AredslPackage.EDITOR__LAYER:
			return layer != null && !layer.isEmpty();
		case AredslPackage.EDITOR__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AredslPackage.EDITOR__FILE_EXTENSION:
			return FILE_EXTENSION_EDEFAULT == null ? fileExtension != null
					: !FILE_EXTENSION_EDEFAULT.equals(fileExtension);
		case AredslPackage.EDITOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AredslPackage.EDITOR__TOOLSETS:
			return toolsets != null && !toolsets.isEmpty();
		case AredslPackage.EDITOR__QUERY_LANGUAGE_KIND:
			return queryLanguageKind != QUERY_LANGUAGE_KIND_EDEFAULT;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", fileExtension: ");
		result.append(fileExtension);
		result.append(", name: ");
		result.append(name);
		result.append(", queryLanguageKind: ");
		result.append(queryLanguageKind);
		result.append(')');
		return result.toString();
	}

} //EditorImpl
