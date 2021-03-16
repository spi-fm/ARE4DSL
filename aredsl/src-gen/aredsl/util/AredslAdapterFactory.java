/**
 */
package aredsl.util;

import aredsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aredsl.AredslPackage
 * @generated
 */
public class AredslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AredslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AredslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AredslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AredslSwitch<Adapter> modelSwitch = new AredslSwitch<Adapter>() {
		@Override
		public Adapter caseEditor(Editor object) {
			return createEditorAdapter();
		}

		@Override
		public Adapter caseLayer(Layer object) {
			return createLayerAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseLabelStyle(LabelStyle object) {
			return createLabelStyleAdapter();
		}

		@Override
		public Adapter caseNodeStyle(NodeStyle object) {
			return createNodeStyleAdapter();
		}

		@Override
		public Adapter caseModel3DNodeStyle(Model3DNodeStyle object) {
			return createModel3DNodeStyleAdapter();
		}

		@Override
		public Adapter caseImage2DNodeStyle(Image2DNodeStyle object) {
			return createImage2DNodeStyleAdapter();
		}

		@Override
		public Adapter caseGeometricShapeNodeStyle(GeometricShapeNodeStyle object) {
			return createGeometricShapeNodeStyleAdapter();
		}

		@Override
		public Adapter caseLabel(Label object) {
			return createLabelAdapter();
		}

		@Override
		public Adapter caseEdge(Edge object) {
			return createEdgeAdapter();
		}

		@Override
		public Adapter caseEdgeStyle(EdgeStyle object) {
			return createEdgeStyleAdapter();
		}

		@Override
		public Adapter caseTool(Tool object) {
			return createToolAdapter();
		}

		@Override
		public Adapter caseCreateInstanceOperation(CreateInstanceOperation object) {
			return createCreateInstanceOperationAdapter();
		}

		@Override
		public Adapter caseDomainOperation(DomainOperation object) {
			return createDomainOperationAdapter();
		}

		@Override
		public Adapter caseRemoveOperation(RemoveOperation object) {
			return createRemoveOperationAdapter();
		}

		@Override
		public Adapter caseSetOperation(SetOperation object) {
			return createSetOperationAdapter();
		}

		@Override
		public Adapter caseUnsetOperation(UnsetOperation object) {
			return createUnsetOperationAdapter();
		}

		@Override
		public Adapter caseToolSet(ToolSet object) {
			return createToolSetAdapter();
		}

		@Override
		public Adapter caseChangeContextOperation(ChangeContextOperation object) {
			return createChangeContextOperationAdapter();
		}

		@Override
		public Adapter caseMarkerBasedTrackerAction(MarkerBasedTrackerAction object) {
			return createMarkerBasedTrackerActionAdapter();
		}

		@Override
		public Adapter caseMarkerLessTrackerAction(MarkerLessTrackerAction object) {
			return createMarkerLessTrackerActionAdapter();
		}

		@Override
		public Adapter caseSensorBasedAction(SensorBasedAction object) {
			return createSensorBasedActionAdapter();
		}

		@Override
		public Adapter caseGestureAction(GestureAction object) {
			return createGestureActionAdapter();
		}

		@Override
		public Adapter caseVoiceAction(VoiceAction object) {
			return createVoiceActionAdapter();
		}

		@Override
		public Adapter caseTrackerAction(TrackerAction object) {
			return createTrackerActionAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseMentalAction(MentalAction object) {
			return createMentalActionAdapter();
		}

		@Override
		public Adapter caseTactileAction(TactileAction object) {
			return createTactileActionAdapter();
		}

		@Override
		public Adapter caseBehaviour(Behaviour object) {
			return createBehaviourAdapter();
		}

		@Override
		public Adapter caseSupportOperation(SupportOperation object) {
			return createSupportOperationAdapter();
		}

		@Override
		public Adapter caseMoveElement(MoveElement object) {
			return createMoveElementAdapter();
		}

		@Override
		public Adapter caseShowSystemMenu(ShowSystemMenu object) {
			return createShowSystemMenuAdapter();
		}

		@Override
		public Adapter caseArrangeElements(ArrangeElements object) {
			return createArrangeElementsAdapter();
		}

		@Override
		public Adapter caseExit(Exit object) {
			return createExitAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Editor
	 * @generated
	 */
	public Adapter createEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.LabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.LabelStyle
	 * @generated
	 */
	public Adapter createLabelStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.NodeStyle <em>Node Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.NodeStyle
	 * @generated
	 */
	public Adapter createNodeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Model3DNodeStyle <em>Model3 DNode Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Model3DNodeStyle
	 * @generated
	 */
	public Adapter createModel3DNodeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Image2DNodeStyle <em>Image2 DNode Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Image2DNodeStyle
	 * @generated
	 */
	public Adapter createImage2DNodeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.GeometricShapeNodeStyle <em>Geometric Shape Node Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.GeometricShapeNodeStyle
	 * @generated
	 */
	public Adapter createGeometricShapeNodeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.EdgeStyle <em>Edge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.EdgeStyle
	 * @generated
	 */
	public Adapter createEdgeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.CreateInstanceOperation <em>Create Instance Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.CreateInstanceOperation
	 * @generated
	 */
	public Adapter createCreateInstanceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.DomainOperation <em>Domain Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.DomainOperation
	 * @generated
	 */
	public Adapter createDomainOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.RemoveOperation <em>Remove Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.RemoveOperation
	 * @generated
	 */
	public Adapter createRemoveOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.SetOperation <em>Set Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.SetOperation
	 * @generated
	 */
	public Adapter createSetOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.UnsetOperation <em>Unset Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.UnsetOperation
	 * @generated
	 */
	public Adapter createUnsetOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.ToolSet <em>Tool Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.ToolSet
	 * @generated
	 */
	public Adapter createToolSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.ChangeContextOperation <em>Change Context Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.ChangeContextOperation
	 * @generated
	 */
	public Adapter createChangeContextOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.MarkerBasedTrackerAction <em>Marker Based Tracker Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.MarkerBasedTrackerAction
	 * @generated
	 */
	public Adapter createMarkerBasedTrackerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.MarkerLessTrackerAction <em>Marker Less Tracker Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.MarkerLessTrackerAction
	 * @generated
	 */
	public Adapter createMarkerLessTrackerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.SensorBasedAction <em>Sensor Based Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.SensorBasedAction
	 * @generated
	 */
	public Adapter createSensorBasedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.GestureAction <em>Gesture Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.GestureAction
	 * @generated
	 */
	public Adapter createGestureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.VoiceAction <em>Voice Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.VoiceAction
	 * @generated
	 */
	public Adapter createVoiceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.TrackerAction <em>Tracker Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.TrackerAction
	 * @generated
	 */
	public Adapter createTrackerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.MentalAction <em>Mental Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.MentalAction
	 * @generated
	 */
	public Adapter createMentalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.TactileAction <em>Tactile Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.TactileAction
	 * @generated
	 */
	public Adapter createTactileActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Behaviour
	 * @generated
	 */
	public Adapter createBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.SupportOperation <em>Support Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.SupportOperation
	 * @generated
	 */
	public Adapter createSupportOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.MoveElement <em>Move Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.MoveElement
	 * @generated
	 */
	public Adapter createMoveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.ShowSystemMenu <em>Show System Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.ShowSystemMenu
	 * @generated
	 */
	public Adapter createShowSystemMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.ArrangeElements <em>Arrange Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.ArrangeElements
	 * @generated
	 */
	public Adapter createArrangeElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aredsl.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aredsl.Exit
	 * @generated
	 */
	public Adapter createExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AredslAdapterFactory
