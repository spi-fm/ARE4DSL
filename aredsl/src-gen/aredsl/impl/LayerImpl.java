/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.Edge;
import aredsl.Layer;
import aredsl.Node;
import aredsl.TrackerAction;

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
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.LayerImpl#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.impl.LayerImpl#getSemanticExpression <em>Semantic Expression</em>}</li>
 *   <li>{@link aredsl.impl.LayerImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link aredsl.impl.LayerImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link aredsl.impl.LayerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link aredsl.impl.LayerImpl#getReferenceAction <em>Reference Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends MinimalEObjectImpl.Container implements Layer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "DefaultLayer";

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
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

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
	 * The cached value of the '{@link #getReferenceAction() <em>Reference Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAction()
	 * @generated
	 * @ordered
	 */
	protected TrackerAction referenceAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.LAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.LAYER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.LAYER__SEMANTIC_EXPRESSION,
					oldSemanticExpression, semanticExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, AredslPackage.LAYER__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, AredslPackage.LAYER__EDGES);
		}
		return edges;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.LAYER__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackerAction getReferenceAction() {
		return referenceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceAction(TrackerAction newReferenceAction, NotificationChain msgs) {
		TrackerAction oldReferenceAction = referenceAction;
		referenceAction = newReferenceAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AredslPackage.LAYER__REFERENCE_ACTION, oldReferenceAction, newReferenceAction);
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
	public void setReferenceAction(TrackerAction newReferenceAction) {
		if (newReferenceAction != referenceAction) {
			NotificationChain msgs = null;
			if (referenceAction != null)
				msgs = ((InternalEObject) referenceAction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.LAYER__REFERENCE_ACTION, null, msgs);
			if (newReferenceAction != null)
				msgs = ((InternalEObject) newReferenceAction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.LAYER__REFERENCE_ACTION, null, msgs);
			msgs = basicSetReferenceAction(newReferenceAction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.LAYER__REFERENCE_ACTION,
					newReferenceAction, newReferenceAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AredslPackage.LAYER__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
		case AredslPackage.LAYER__EDGES:
			return ((InternalEList<?>) getEdges()).basicRemove(otherEnd, msgs);
		case AredslPackage.LAYER__REFERENCE_ACTION:
			return basicSetReferenceAction(null, msgs);
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
		case AredslPackage.LAYER__ID:
			return getId();
		case AredslPackage.LAYER__SEMANTIC_EXPRESSION:
			return getSemanticExpression();
		case AredslPackage.LAYER__NODES:
			return getNodes();
		case AredslPackage.LAYER__EDGES:
			return getEdges();
		case AredslPackage.LAYER__DESCRIPTION:
			return getDescription();
		case AredslPackage.LAYER__REFERENCE_ACTION:
			return getReferenceAction();
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
		case AredslPackage.LAYER__ID:
			setId((String) newValue);
			return;
		case AredslPackage.LAYER__SEMANTIC_EXPRESSION:
			setSemanticExpression((String) newValue);
			return;
		case AredslPackage.LAYER__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends Node>) newValue);
			return;
		case AredslPackage.LAYER__EDGES:
			getEdges().clear();
			getEdges().addAll((Collection<? extends Edge>) newValue);
			return;
		case AredslPackage.LAYER__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AredslPackage.LAYER__REFERENCE_ACTION:
			setReferenceAction((TrackerAction) newValue);
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
		case AredslPackage.LAYER__ID:
			setId(ID_EDEFAULT);
			return;
		case AredslPackage.LAYER__SEMANTIC_EXPRESSION:
			setSemanticExpression(SEMANTIC_EXPRESSION_EDEFAULT);
			return;
		case AredslPackage.LAYER__NODES:
			getNodes().clear();
			return;
		case AredslPackage.LAYER__EDGES:
			getEdges().clear();
			return;
		case AredslPackage.LAYER__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AredslPackage.LAYER__REFERENCE_ACTION:
			setReferenceAction((TrackerAction) null);
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
		case AredslPackage.LAYER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case AredslPackage.LAYER__SEMANTIC_EXPRESSION:
			return SEMANTIC_EXPRESSION_EDEFAULT == null ? semanticExpression != null
					: !SEMANTIC_EXPRESSION_EDEFAULT.equals(semanticExpression);
		case AredslPackage.LAYER__NODES:
			return nodes != null && !nodes.isEmpty();
		case AredslPackage.LAYER__EDGES:
			return edges != null && !edges.isEmpty();
		case AredslPackage.LAYER__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AredslPackage.LAYER__REFERENCE_ACTION:
			return referenceAction != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //LayerImpl
