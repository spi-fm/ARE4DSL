/**
 */
package aredsl.impl;

import aredsl.AredslPackage;
import aredsl.Edge;
import aredsl.EdgeStyle;
import aredsl.Label;
import aredsl.Node;

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
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aredsl.impl.EdgeImpl#getId <em>Id</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getOriginSemanticExpression <em>Origin Semantic Expression</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getDestinationSemanticExpression <em>Destination Semantic Expression</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getEdgestyles <em>Edgestyles</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getMiddleLabel <em>Middle Label</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getOriginNode <em>Origin Node</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getDestinationNode <em>Destination Node</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getOriginLabel <em>Origin Label</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getDestinationLabel <em>Destination Label</em>}</li>
 *   <li>{@link aredsl.impl.EdgeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

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
	 * The default value of the '{@link #getOriginSemanticExpression() <em>Origin Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginSemanticExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_SEMANTIC_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginSemanticExpression() <em>Origin Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginSemanticExpression()
	 * @generated
	 * @ordered
	 */
	protected String originSemanticExpression = ORIGIN_SEMANTIC_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationSemanticExpression() <em>Destination Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationSemanticExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_SEMANTIC_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationSemanticExpression() <em>Destination Semantic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationSemanticExpression()
	 * @generated
	 * @ordered
	 */
	protected String destinationSemanticExpression = DESTINATION_SEMANTIC_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEdgestyles() <em>Edgestyles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgestyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EdgeStyle> edgestyles;

	/**
	 * The cached value of the '{@link #getMiddleLabel() <em>Middle Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleLabel()
	 * @generated
	 * @ordered
	 */
	protected Label middleLabel;

	/**
	 * The cached value of the '{@link #getOriginNode() <em>Origin Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginNode()
	 * @generated
	 * @ordered
	 */
	protected Node originNode;

	/**
	 * The cached value of the '{@link #getDestinationNode() <em>Destination Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationNode()
	 * @generated
	 * @ordered
	 */
	protected Node destinationNode;

	/**
	 * The cached value of the '{@link #getOriginLabel() <em>Origin Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginLabel()
	 * @generated
	 * @ordered
	 */
	protected Label originLabel;

	/**
	 * The cached value of the '{@link #getDestinationLabel() <em>Destination Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationLabel()
	 * @generated
	 * @ordered
	 */
	protected Label destinationLabel;

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
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AredslPackage.Literals.EDGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginSemanticExpression() {
		return originSemanticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginSemanticExpression(String newOriginSemanticExpression) {
		String oldOriginSemanticExpression = originSemanticExpression;
		originSemanticExpression = newOriginSemanticExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__ORIGIN_SEMANTIC_EXPRESSION,
					oldOriginSemanticExpression, originSemanticExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationSemanticExpression() {
		return destinationSemanticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationSemanticExpression(String newDestinationSemanticExpression) {
		String oldDestinationSemanticExpression = destinationSemanticExpression;
		destinationSemanticExpression = newDestinationSemanticExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__DESTINATION_SEMANTIC_EXPRESSION,
					oldDestinationSemanticExpression, destinationSemanticExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EdgeStyle> getEdgestyles() {
		if (edgestyles == null) {
			edgestyles = new EObjectContainmentEList<EdgeStyle>(EdgeStyle.class, this, AredslPackage.EDGE__EDGESTYLES);
		}
		return edgestyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getMiddleLabel() {
		return middleLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiddleLabel(Label newMiddleLabel, NotificationChain msgs) {
		Label oldMiddleLabel = middleLabel;
		middleLabel = newMiddleLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AredslPackage.EDGE__MIDDLE_LABEL, oldMiddleLabel, newMiddleLabel);
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
	public void setMiddleLabel(Label newMiddleLabel) {
		if (newMiddleLabel != middleLabel) {
			NotificationChain msgs = null;
			if (middleLabel != null)
				msgs = ((InternalEObject) middleLabel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.EDGE__MIDDLE_LABEL, null, msgs);
			if (newMiddleLabel != null)
				msgs = ((InternalEObject) newMiddleLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.EDGE__MIDDLE_LABEL, null, msgs);
			msgs = basicSetMiddleLabel(newMiddleLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__MIDDLE_LABEL, newMiddleLabel,
					newMiddleLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getOriginNode() {
		if (originNode != null && originNode.eIsProxy()) {
			InternalEObject oldOriginNode = (InternalEObject) originNode;
			originNode = (Node) eResolveProxy(oldOriginNode);
			if (originNode != oldOriginNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AredslPackage.EDGE__ORIGIN_NODE,
							oldOriginNode, originNode));
			}
		}
		return originNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetOriginNode() {
		return originNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginNode(Node newOriginNode) {
		Node oldOriginNode = originNode;
		originNode = newOriginNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__ORIGIN_NODE, oldOriginNode,
					originNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getDestinationNode() {
		if (destinationNode != null && destinationNode.eIsProxy()) {
			InternalEObject oldDestinationNode = (InternalEObject) destinationNode;
			destinationNode = (Node) eResolveProxy(oldDestinationNode);
			if (destinationNode != oldDestinationNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AredslPackage.EDGE__DESTINATION_NODE,
							oldDestinationNode, destinationNode));
			}
		}
		return destinationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetDestinationNode() {
		return destinationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationNode(Node newDestinationNode) {
		Node oldDestinationNode = destinationNode;
		destinationNode = newDestinationNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__DESTINATION_NODE,
					oldDestinationNode, destinationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getOriginLabel() {
		return originLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginLabel(Label newOriginLabel, NotificationChain msgs) {
		Label oldOriginLabel = originLabel;
		originLabel = newOriginLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AredslPackage.EDGE__ORIGIN_LABEL, oldOriginLabel, newOriginLabel);
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
	public void setOriginLabel(Label newOriginLabel) {
		if (newOriginLabel != originLabel) {
			NotificationChain msgs = null;
			if (originLabel != null)
				msgs = ((InternalEObject) originLabel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.EDGE__ORIGIN_LABEL, null, msgs);
			if (newOriginLabel != null)
				msgs = ((InternalEObject) newOriginLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.EDGE__ORIGIN_LABEL, null, msgs);
			msgs = basicSetOriginLabel(newOriginLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__ORIGIN_LABEL, newOriginLabel,
					newOriginLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getDestinationLabel() {
		return destinationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationLabel(Label newDestinationLabel, NotificationChain msgs) {
		Label oldDestinationLabel = destinationLabel;
		destinationLabel = newDestinationLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AredslPackage.EDGE__DESTINATION_LABEL, oldDestinationLabel, newDestinationLabel);
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
	public void setDestinationLabel(Label newDestinationLabel) {
		if (newDestinationLabel != destinationLabel) {
			NotificationChain msgs = null;
			if (destinationLabel != null)
				msgs = ((InternalEObject) destinationLabel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.EDGE__DESTINATION_LABEL, null, msgs);
			if (newDestinationLabel != null)
				msgs = ((InternalEObject) newDestinationLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AredslPackage.EDGE__DESTINATION_LABEL, null, msgs);
			msgs = basicSetDestinationLabel(newDestinationLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__DESTINATION_LABEL,
					newDestinationLabel, newDestinationLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AredslPackage.EDGE__DESCRIPTION, oldDescription,
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
		case AredslPackage.EDGE__EDGESTYLES:
			return ((InternalEList<?>) getEdgestyles()).basicRemove(otherEnd, msgs);
		case AredslPackage.EDGE__MIDDLE_LABEL:
			return basicSetMiddleLabel(null, msgs);
		case AredslPackage.EDGE__ORIGIN_LABEL:
			return basicSetOriginLabel(null, msgs);
		case AredslPackage.EDGE__DESTINATION_LABEL:
			return basicSetDestinationLabel(null, msgs);
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
		case AredslPackage.EDGE__ID:
			return getId();
		case AredslPackage.EDGE__ORIGIN_SEMANTIC_EXPRESSION:
			return getOriginSemanticExpression();
		case AredslPackage.EDGE__DESTINATION_SEMANTIC_EXPRESSION:
			return getDestinationSemanticExpression();
		case AredslPackage.EDGE__EDGESTYLES:
			return getEdgestyles();
		case AredslPackage.EDGE__MIDDLE_LABEL:
			return getMiddleLabel();
		case AredslPackage.EDGE__ORIGIN_NODE:
			if (resolve)
				return getOriginNode();
			return basicGetOriginNode();
		case AredslPackage.EDGE__DESTINATION_NODE:
			if (resolve)
				return getDestinationNode();
			return basicGetDestinationNode();
		case AredslPackage.EDGE__ORIGIN_LABEL:
			return getOriginLabel();
		case AredslPackage.EDGE__DESTINATION_LABEL:
			return getDestinationLabel();
		case AredslPackage.EDGE__DESCRIPTION:
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
		case AredslPackage.EDGE__ID:
			setId((String) newValue);
			return;
		case AredslPackage.EDGE__ORIGIN_SEMANTIC_EXPRESSION:
			setOriginSemanticExpression((String) newValue);
			return;
		case AredslPackage.EDGE__DESTINATION_SEMANTIC_EXPRESSION:
			setDestinationSemanticExpression((String) newValue);
			return;
		case AredslPackage.EDGE__EDGESTYLES:
			getEdgestyles().clear();
			getEdgestyles().addAll((Collection<? extends EdgeStyle>) newValue);
			return;
		case AredslPackage.EDGE__MIDDLE_LABEL:
			setMiddleLabel((Label) newValue);
			return;
		case AredslPackage.EDGE__ORIGIN_NODE:
			setOriginNode((Node) newValue);
			return;
		case AredslPackage.EDGE__DESTINATION_NODE:
			setDestinationNode((Node) newValue);
			return;
		case AredslPackage.EDGE__ORIGIN_LABEL:
			setOriginLabel((Label) newValue);
			return;
		case AredslPackage.EDGE__DESTINATION_LABEL:
			setDestinationLabel((Label) newValue);
			return;
		case AredslPackage.EDGE__DESCRIPTION:
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
		case AredslPackage.EDGE__ID:
			setId(ID_EDEFAULT);
			return;
		case AredslPackage.EDGE__ORIGIN_SEMANTIC_EXPRESSION:
			setOriginSemanticExpression(ORIGIN_SEMANTIC_EXPRESSION_EDEFAULT);
			return;
		case AredslPackage.EDGE__DESTINATION_SEMANTIC_EXPRESSION:
			setDestinationSemanticExpression(DESTINATION_SEMANTIC_EXPRESSION_EDEFAULT);
			return;
		case AredslPackage.EDGE__EDGESTYLES:
			getEdgestyles().clear();
			return;
		case AredslPackage.EDGE__MIDDLE_LABEL:
			setMiddleLabel((Label) null);
			return;
		case AredslPackage.EDGE__ORIGIN_NODE:
			setOriginNode((Node) null);
			return;
		case AredslPackage.EDGE__DESTINATION_NODE:
			setDestinationNode((Node) null);
			return;
		case AredslPackage.EDGE__ORIGIN_LABEL:
			setOriginLabel((Label) null);
			return;
		case AredslPackage.EDGE__DESTINATION_LABEL:
			setDestinationLabel((Label) null);
			return;
		case AredslPackage.EDGE__DESCRIPTION:
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
		case AredslPackage.EDGE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case AredslPackage.EDGE__ORIGIN_SEMANTIC_EXPRESSION:
			return ORIGIN_SEMANTIC_EXPRESSION_EDEFAULT == null ? originSemanticExpression != null
					: !ORIGIN_SEMANTIC_EXPRESSION_EDEFAULT.equals(originSemanticExpression);
		case AredslPackage.EDGE__DESTINATION_SEMANTIC_EXPRESSION:
			return DESTINATION_SEMANTIC_EXPRESSION_EDEFAULT == null ? destinationSemanticExpression != null
					: !DESTINATION_SEMANTIC_EXPRESSION_EDEFAULT.equals(destinationSemanticExpression);
		case AredslPackage.EDGE__EDGESTYLES:
			return edgestyles != null && !edgestyles.isEmpty();
		case AredslPackage.EDGE__MIDDLE_LABEL:
			return middleLabel != null;
		case AredslPackage.EDGE__ORIGIN_NODE:
			return originNode != null;
		case AredslPackage.EDGE__DESTINATION_NODE:
			return destinationNode != null;
		case AredslPackage.EDGE__ORIGIN_LABEL:
			return originLabel != null;
		case AredslPackage.EDGE__DESTINATION_LABEL:
			return destinationLabel != null;
		case AredslPackage.EDGE__DESCRIPTION:
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
		result.append(", originSemanticExpression: ");
		result.append(originSemanticExpression);
		result.append(", destinationSemanticExpression: ");
		result.append(destinationSemanticExpression);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
