/**
 */
package aredsl.impl;

import aredsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AredslFactoryImpl extends EFactoryImpl implements AredslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AredslFactory init() {
		try {
			AredslFactory theAredslFactory = (AredslFactory) EPackage.Registry.INSTANCE
					.getEFactory(AredslPackage.eNS_URI);
			if (theAredslFactory != null) {
				return theAredslFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AredslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AredslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AredslPackage.EDITOR:
			return createEditor();
		case AredslPackage.LAYER:
			return createLayer();
		case AredslPackage.NODE:
			return createNode();
		case AredslPackage.LABEL_STYLE:
			return createLabelStyle();
		case AredslPackage.MODEL3_DNODE_STYLE:
			return createModel3DNodeStyle();
		case AredslPackage.IMAGE2_DNODE_STYLE:
			return createImage2DNodeStyle();
		case AredslPackage.GEOMETRIC_SHAPE_NODE_STYLE:
			return createGeometricShapeNodeStyle();
		case AredslPackage.LABEL:
			return createLabel();
		case AredslPackage.EDGE:
			return createEdge();
		case AredslPackage.EDGE_STYLE:
			return createEdgeStyle();
		case AredslPackage.TOOL:
			return createTool();
		case AredslPackage.CREATE_INSTANCE_OPERATION:
			return createCreateInstanceOperation();
		case AredslPackage.REMOVE_OPERATION:
			return createRemoveOperation();
		case AredslPackage.SET_OPERATION:
			return createSetOperation();
		case AredslPackage.UNSET_OPERATION:
			return createUnsetOperation();
		case AredslPackage.TOOL_SET:
			return createToolSet();
		case AredslPackage.CHANGE_CONTEXT_OPERATION:
			return createChangeContextOperation();
		case AredslPackage.MARKER_BASED_TRACKER_ACTION:
			return createMarkerBasedTrackerAction();
		case AredslPackage.MARKER_LESS_TRACKER_ACTION:
			return createMarkerLessTrackerAction();
		case AredslPackage.SENSOR_BASED_ACTION:
			return createSensorBasedAction();
		case AredslPackage.GESTURE_ACTION:
			return createGestureAction();
		case AredslPackage.VOICE_ACTION:
			return createVoiceAction();
		case AredslPackage.MENTAL_ACTION:
			return createMentalAction();
		case AredslPackage.TACTILE_ACTION:
			return createTactileAction();
		case AredslPackage.MOVE_ELEMENT:
			return createMoveElement();
		case AredslPackage.SHOW_SYSTEM_MENU:
			return createShowSystemMenu();
		case AredslPackage.ARRANGE_ELEMENTS:
			return createArrangeElements();
		case AredslPackage.EXIT:
			return createExit();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AredslPackage.LINE_KIND:
			return createLineKindFromString(eDataType, initialValue);
		case AredslPackage.SHAPE_KIND:
			return createShapeKindFromString(eDataType, initialValue);
		case AredslPackage.CONTAINMENT_KIND:
			return createContainmentKindFromString(eDataType, initialValue);
		case AredslPackage.INTEGRITY_RESTRICTION_KIND:
			return createIntegrityRestrictionKindFromString(eDataType, initialValue);
		case AredslPackage.QUERY_LANGUAGE_KIND:
			return createQueryLanguageKindFromString(eDataType, initialValue);
		case AredslPackage.OUTLINE_KIND:
			return createOutlineKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AredslPackage.LINE_KIND:
			return convertLineKindToString(eDataType, instanceValue);
		case AredslPackage.SHAPE_KIND:
			return convertShapeKindToString(eDataType, instanceValue);
		case AredslPackage.CONTAINMENT_KIND:
			return convertContainmentKindToString(eDataType, instanceValue);
		case AredslPackage.INTEGRITY_RESTRICTION_KIND:
			return convertIntegrityRestrictionKindToString(eDataType, instanceValue);
		case AredslPackage.QUERY_LANGUAGE_KIND:
			return convertQueryLanguageKindToString(eDataType, instanceValue);
		case AredslPackage.OUTLINE_KIND:
			return convertOutlineKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Editor createEditor() {
		EditorImpl editor = new EditorImpl();
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelStyle createLabelStyle() {
		LabelStyleImpl labelStyle = new LabelStyleImpl();
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model3DNodeStyle createModel3DNodeStyle() {
		Model3DNodeStyleImpl model3DNodeStyle = new Model3DNodeStyleImpl();
		return model3DNodeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image2DNodeStyle createImage2DNodeStyle() {
		Image2DNodeStyleImpl image2DNodeStyle = new Image2DNodeStyleImpl();
		return image2DNodeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometricShapeNodeStyle createGeometricShapeNodeStyle() {
		GeometricShapeNodeStyleImpl geometricShapeNodeStyle = new GeometricShapeNodeStyleImpl();
		return geometricShapeNodeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgeStyle createEdgeStyle() {
		EdgeStyleImpl edgeStyle = new EdgeStyleImpl();
		return edgeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateInstanceOperation createCreateInstanceOperation() {
		CreateInstanceOperationImpl createInstanceOperation = new CreateInstanceOperationImpl();
		return createInstanceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveOperation createRemoveOperation() {
		RemoveOperationImpl removeOperation = new RemoveOperationImpl();
		return removeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetOperation createSetOperation() {
		SetOperationImpl setOperation = new SetOperationImpl();
		return setOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsetOperation createUnsetOperation() {
		UnsetOperationImpl unsetOperation = new UnsetOperationImpl();
		return unsetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolSet createToolSet() {
		ToolSetImpl toolSet = new ToolSetImpl();
		return toolSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeContextOperation createChangeContextOperation() {
		ChangeContextOperationImpl changeContextOperation = new ChangeContextOperationImpl();
		return changeContextOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkerBasedTrackerAction createMarkerBasedTrackerAction() {
		MarkerBasedTrackerActionImpl markerBasedTrackerAction = new MarkerBasedTrackerActionImpl();
		return markerBasedTrackerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkerLessTrackerAction createMarkerLessTrackerAction() {
		MarkerLessTrackerActionImpl markerLessTrackerAction = new MarkerLessTrackerActionImpl();
		return markerLessTrackerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorBasedAction createSensorBasedAction() {
		SensorBasedActionImpl sensorBasedAction = new SensorBasedActionImpl();
		return sensorBasedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GestureAction createGestureAction() {
		GestureActionImpl gestureAction = new GestureActionImpl();
		return gestureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoiceAction createVoiceAction() {
		VoiceActionImpl voiceAction = new VoiceActionImpl();
		return voiceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MentalAction createMentalAction() {
		MentalActionImpl mentalAction = new MentalActionImpl();
		return mentalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TactileAction createTactileAction() {
		TactileActionImpl tactileAction = new TactileActionImpl();
		return tactileAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoveElement createMoveElement() {
		MoveElementImpl moveElement = new MoveElementImpl();
		return moveElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShowSystemMenu createShowSystemMenu() {
		ShowSystemMenuImpl showSystemMenu = new ShowSystemMenuImpl();
		return showSystemMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrangeElements createArrangeElements() {
		ArrangeElementsImpl arrangeElements = new ArrangeElementsImpl();
		return arrangeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exit createExit() {
		ExitImpl exit = new ExitImpl();
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineKind createLineKindFromString(EDataType eDataType, String initialValue) {
		LineKind result = LineKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeKind createShapeKindFromString(EDataType eDataType, String initialValue) {
		ShapeKind result = ShapeKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentKind createContainmentKindFromString(EDataType eDataType, String initialValue) {
		ContainmentKind result = ContainmentKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityRestrictionKind createIntegrityRestrictionKindFromString(EDataType eDataType, String initialValue) {
		IntegrityRestrictionKind result = IntegrityRestrictionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrityRestrictionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLanguageKind createQueryLanguageKindFromString(EDataType eDataType, String initialValue) {
		QueryLanguageKind result = QueryLanguageKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryLanguageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineKind createOutlineKindFromString(EDataType eDataType, String initialValue) {
		OutlineKind result = OutlineKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutlineKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AredslPackage getAredslPackage() {
		return (AredslPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AredslPackage getPackage() {
		return AredslPackage.eINSTANCE;
	}

} //AredslFactoryImpl
