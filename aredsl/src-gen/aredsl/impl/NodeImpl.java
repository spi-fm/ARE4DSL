/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.ContainmentKind;
import aredsl.Label;
import aredsl.Node;
import aredsl.NodeStyle;

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
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.NodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.impl.NodeImpl#getSemanticExpression <em>Semantic Expression</em>}</li>
 *   <li>{@link aredsl.impl.NodeImpl#getNodestyles <em>Nodestyles</em>}</li>
 *   <li>{@link aredsl.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link aredsl.impl.NodeImpl#getContaimentKind <em>Contaiment Kind</em>}</li>
 *   <li>{@link aredsl.impl.NodeImpl#getContentNodes <em>Content Nodes</em>}</li>
 *   <li>{@link aredsl.impl.NodeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
	 * The cached value of the '{@link #getNodestyles() <em>Nodestyles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodestyles()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeStyle> nodestyles;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * The default value of the '{@link #getContaimentKind() <em>Contaiment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaimentKind()
	 * @generated
	 * @ordered
	 */
	protected static final ContainmentKind CONTAIMENT_KIND_EDEFAULT = ContainmentKind.FREE;

	/**
	 * The cached value of the '{@link #getContaimentKind() <em>Contaiment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaimentKind()
	 * @generated
	 * @ordered
	 */
	protected ContainmentKind contaimentKind = CONTAIMENT_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentNodes() <em>Content Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> contentNodes;

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
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE__SEMANTIC_EXPRESSION,
					oldSemanticExpression, semanticExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodeStyle> getNodestyles() {
		if (nodestyles == null) {
			nodestyles = new EObjectContainmentEList<NodeStyle>(NodeStyle.class, this, AredslPackage.NODE__NODESTYLES);
		}
		return nodestyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AredslPackage.NODE__LABEL,
					oldLabel, newLabel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(Label newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.NODE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject) newLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.NODE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainmentKind getContaimentKind() {
		return contaimentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContaimentKind(ContainmentKind newContaimentKind) {
		ContainmentKind oldContaimentKind = contaimentKind;
		contaimentKind = newContaimentKind == null ? CONTAIMENT_KIND_EDEFAULT : newContaimentKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE__CONTAIMENT_KIND,
					oldContaimentKind, contaimentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getContentNodes() {
		if (contentNodes == null) {
			contentNodes = new EObjectContainmentEList<Node>(Node.class, this, AredslPackage.NODE__CONTENT_NODES);
		}
		return contentNodes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.NODE__DESCRIPTION, oldDescription,
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
		case AredslPackage.NODE__NODESTYLES:
			return ((InternalEList<?>) getNodestyles()).basicRemove(otherEnd, msgs);
		case AredslPackage.NODE__LABEL:
			return basicSetLabel(null, msgs);
		case AredslPackage.NODE__CONTENT_NODES:
			return ((InternalEList<?>) getContentNodes()).basicRemove(otherEnd, msgs);
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
		case AredslPackage.NODE__ID:
			return getId();
		case AredslPackage.NODE__SEMANTIC_EXPRESSION:
			return getSemanticExpression();
		case AredslPackage.NODE__NODESTYLES:
			return getNodestyles();
		case AredslPackage.NODE__LABEL:
			return getLabel();
		case AredslPackage.NODE__CONTAIMENT_KIND:
			return getContaimentKind();
		case AredslPackage.NODE__CONTENT_NODES:
			return getContentNodes();
		case AredslPackage.NODE__DESCRIPTION:
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
		case AredslPackage.NODE__ID:
			setId((String) newValue);
			return;
		case AredslPackage.NODE__SEMANTIC_EXPRESSION:
			setSemanticExpression((String) newValue);
			return;
		case AredslPackage.NODE__NODESTYLES:
			getNodestyles().clear();
			getNodestyles().addAll((Collection<? extends NodeStyle>) newValue);
			return;
		case AredslPackage.NODE__LABEL:
			setLabel((Label) newValue);
			return;
		case AredslPackage.NODE__CONTAIMENT_KIND:
			setContaimentKind((ContainmentKind) newValue);
			return;
		case AredslPackage.NODE__CONTENT_NODES:
			getContentNodes().clear();
			getContentNodes().addAll((Collection<? extends Node>) newValue);
			return;
		case AredslPackage.NODE__DESCRIPTION:
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
		case AredslPackage.NODE__ID:
			setId(ID_EDEFAULT);
			return;
		case AredslPackage.NODE__SEMANTIC_EXPRESSION:
			setSemanticExpression(SEMANTIC_EXPRESSION_EDEFAULT);
			return;
		case AredslPackage.NODE__NODESTYLES:
			getNodestyles().clear();
			return;
		case AredslPackage.NODE__LABEL:
			setLabel((Label) null);
			return;
		case AredslPackage.NODE__CONTAIMENT_KIND:
			setContaimentKind(CONTAIMENT_KIND_EDEFAULT);
			return;
		case AredslPackage.NODE__CONTENT_NODES:
			getContentNodes().clear();
			return;
		case AredslPackage.NODE__DESCRIPTION:
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
		case AredslPackage.NODE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case AredslPackage.NODE__SEMANTIC_EXPRESSION:
			return SEMANTIC_EXPRESSION_EDEFAULT == null ? semanticExpression != null
					: !SEMANTIC_EXPRESSION_EDEFAULT.equals(semanticExpression);
		case AredslPackage.NODE__NODESTYLES:
			return nodestyles != null && !nodestyles.isEmpty();
		case AredslPackage.NODE__LABEL:
			return label != null;
		case AredslPackage.NODE__CONTAIMENT_KIND:
			return contaimentKind != CONTAIMENT_KIND_EDEFAULT;
		case AredslPackage.NODE__CONTENT_NODES:
			return contentNodes != null && !contentNodes.isEmpty();
		case AredslPackage.NODE__DESCRIPTION:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", semanticExpression: ");
		result.append(semanticExpression);
		result.append(", contaimentKind: ");
		result.append(contaimentKind);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
