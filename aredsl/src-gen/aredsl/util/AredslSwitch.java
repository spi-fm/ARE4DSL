/**
 */
package aredsl.util;

import aredsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see aredsl.AredslPackage
 * @generated
 */
public class AredslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AredslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AredslSwitch() {
		if (modelPackage == null) {
			modelPackage = AredslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AredslPackage.EDITOR: {
			Editor editor = (Editor) theEObject;
			T result = caseEditor(editor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.LAYER: {
			Layer layer = (Layer) theEObject;
			T result = caseLayer(layer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.LABEL_STYLE: {
			LabelStyle labelStyle = (LabelStyle) theEObject;
			T result = caseLabelStyle(labelStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.NODE_STYLE: {
			NodeStyle nodeStyle = (NodeStyle) theEObject;
			T result = caseNodeStyle(nodeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.MODEL3_DNODE_STYLE: {
			Model3DNodeStyle model3DNodeStyle = (Model3DNodeStyle) theEObject;
			T result = caseModel3DNodeStyle(model3DNodeStyle);
			if (result == null)
				result = caseNodeStyle(model3DNodeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.IMAGE2_DNODE_STYLE: {
			Image2DNodeStyle image2DNodeStyle = (Image2DNodeStyle) theEObject;
			T result = caseImage2DNodeStyle(image2DNodeStyle);
			if (result == null)
				result = caseNodeStyle(image2DNodeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE: {
			GeometricShapeNodeStyle geometricShapeNodeStyle = (GeometricShapeNodeStyle) theEObject;
			T result = caseGeometricShapeNodeStyle(geometricShapeNodeStyle);
			if (result == null)
				result = caseNodeStyle(geometricShapeNodeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.LABEL: {
			Label label = (Label) theEObject;
			T result = caseLabel(label);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.EDGE: {
			Edge edge = (Edge) theEObject;
			T result = caseEdge(edge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.EDGE_STYLE: {
			EdgeStyle edgeStyle = (EdgeStyle) theEObject;
			T result = caseEdgeStyle(edgeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.TOOL: {
			Tool tool = (Tool) theEObject;
			T result = caseTool(tool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.CREATE_INSTANCE_OPERATION: {
			CreateInstanceOperation createInstanceOperation = (CreateInstanceOperation) theEObject;
			T result = caseCreateInstanceOperation(createInstanceOperation);
			if (result == null)
				result = caseDomainOperation(createInstanceOperation);
			if (result == null)
				result = caseBehaviour(createInstanceOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.DOMAIN_OPERATION: {
			DomainOperation domainOperation = (DomainOperation) theEObject;
			T result = caseDomainOperation(domainOperation);
			if (result == null)
				result = caseBehaviour(domainOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.REMOVE_OPERATION: {
			RemoveOperation removeOperation = (RemoveOperation) theEObject;
			T result = caseRemoveOperation(removeOperation);
			if (result == null)
				result = caseDomainOperation(removeOperation);
			if (result == null)
				result = caseBehaviour(removeOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.SET_OPERATION: {
			SetOperation setOperation = (SetOperation) theEObject;
			T result = caseSetOperation(setOperation);
			if (result == null)
				result = caseDomainOperation(setOperation);
			if (result == null)
				result = caseBehaviour(setOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.UNSET_OPERATION: {
			UnsetOperation unsetOperation = (UnsetOperation) theEObject;
			T result = caseUnsetOperation(unsetOperation);
			if (result == null)
				result = caseDomainOperation(unsetOperation);
			if (result == null)
				result = caseBehaviour(unsetOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.TOOL_SET: {
			ToolSet toolSet = (ToolSet) theEObject;
			T result = caseToolSet(toolSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.CHANGE_CONTEXT_OPERATION: {
			ChangeContextOperation changeContextOperation = (ChangeContextOperation) theEObject;
			T result = caseChangeContextOperation(changeContextOperation);
			if (result == null)
				result = caseDomainOperation(changeContextOperation);
			if (result == null)
				result = caseBehaviour(changeContextOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.MARKER_BASED_TRACKER_ACTION: {
			MarkerBasedTrackerAction markerBasedTrackerAction = (MarkerBasedTrackerAction) theEObject;
			T result = caseMarkerBasedTrackerAction(markerBasedTrackerAction);
			if (result == null)
				result = caseTrackerAction(markerBasedTrackerAction);
			if (result == null)
				result = caseAction(markerBasedTrackerAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.MARKER_LESS_TRACKER_ACTION: {
			MarkerLessTrackerAction markerLessTrackerAction = (MarkerLessTrackerAction) theEObject;
			T result = caseMarkerLessTrackerAction(markerLessTrackerAction);
			if (result == null)
				result = caseTrackerAction(markerLessTrackerAction);
			if (result == null)
				result = caseAction(markerLessTrackerAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.SENSOR_BASED_ACTION: {
			SensorBasedAction sensorBasedAction = (SensorBasedAction) theEObject;
			T result = caseSensorBasedAction(sensorBasedAction);
			if (result == null)
				result = caseAction(sensorBasedAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.GESTURE_ACTION: {
			GestureAction gestureAction = (GestureAction) theEObject;
			T result = caseGestureAction(gestureAction);
			if (result == null)
				result = caseAction(gestureAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.VOICE_ACTION: {
			VoiceAction voiceAction = (VoiceAction) theEObject;
			T result = caseVoiceAction(voiceAction);
			if (result == null)
				result = caseAction(voiceAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.TRACKER_ACTION: {
			TrackerAction trackerAction = (TrackerAction) theEObject;
			T result = caseTrackerAction(trackerAction);
			if (result == null)
				result = caseAction(trackerAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.MENTAL_ACTION: {
			MentalAction mentalAction = (MentalAction) theEObject;
			T result = caseMentalAction(mentalAction);
			if (result == null)
				result = caseAction(mentalAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.TACTILE_ACTION: {
			TactileAction tactileAction = (TactileAction) theEObject;
			T result = caseTactileAction(tactileAction);
			if (result == null)
				result = caseAction(tactileAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.BEHAVIOUR: {
			Behaviour behaviour = (Behaviour) theEObject;
			T result = caseBehaviour(behaviour);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.SUPPORT_OPERATION: {
			SupportOperation supportOperation = (SupportOperation) theEObject;
			T result = caseSupportOperation(supportOperation);
			if (result == null)
				result = caseBehaviour(supportOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.MOVE_ELEMENT: {
			MoveElement moveElement = (MoveElement) theEObject;
			T result = caseMoveElement(moveElement);
			if (result == null)
				result = caseSupportOperation(moveElement);
			if (result == null)
				result = caseBehaviour(moveElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.SHOW_SYSTEM_MENU: {
			ShowSystemMenu showSystemMenu = (ShowSystemMenu) theEObject;
			T result = caseShowSystemMenu(showSystemMenu);
			if (result == null)
				result = caseSupportOperation(showSystemMenu);
			if (result == null)
				result = caseBehaviour(showSystemMenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.ARRANGE_ELEMENTS: {
			ArrangeElements arrangeElements = (ArrangeElements) theEObject;
			T result = caseArrangeElements(arrangeElements);
			if (result == null)
				result = caseSupportOperation(arrangeElements);
			if (result == null)
				result = caseBehaviour(arrangeElements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AredslPackage.EXIT: {
			Exit exit = (Exit) theEObject;
			T result = caseExit(exit);
			if (result == null)
				result = caseSupportOperation(exit);
			if (result == null)
				result = caseBehaviour(exit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditor(Editor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelStyle(LabelStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeStyle(NodeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model3 DNode Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model3 DNode Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel3DNodeStyle(Model3DNodeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image2 DNode Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image2 DNode Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage2DNodeStyle(Image2DNodeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometric Shape Node Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometric Shape Node Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometricShapeNodeStyle(GeometricShapeNodeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeStyle(EdgeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Instance Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Instance Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateInstanceOperation(CreateInstanceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainOperation(DomainOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveOperation(RemoveOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOperation(SetOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unset Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unset Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsetOperation(UnsetOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolSet(ToolSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Context Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Context Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeContextOperation(ChangeContextOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marker Based Tracker Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marker Based Tracker Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkerBasedTrackerAction(MarkerBasedTrackerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marker Less Tracker Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marker Less Tracker Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkerLessTrackerAction(MarkerLessTrackerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Based Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Based Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorBasedAction(SensorBasedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gesture Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gesture Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestureAction(GestureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voice Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voice Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoiceAction(VoiceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tracker Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracker Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackerAction(TrackerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mental Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mental Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMentalAction(MentalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tactile Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tactile Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTactileAction(TactileAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviour(Behaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportOperation(SupportOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveElement(MoveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show System Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show System Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowSystemMenu(ShowSystemMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrange Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrange Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrangeElements(ArrangeElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExit(Exit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AredslSwitch
