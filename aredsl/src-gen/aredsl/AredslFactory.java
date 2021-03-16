/**
 */
package aredsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aredsl.AredslPackage
 * @generated
 */
public interface AredslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AredslFactory eINSTANCE = aredsl.impl.AredslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editor</em>'.
	 * @generated
	 */
	Editor createEditor();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	Layer createLayer();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Style</em>'.
	 * @generated
	 */
	LabelStyle createLabelStyle();

	/**
	 * Returns a new object of class '<em>Model3 DNode Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model3 DNode Style</em>'.
	 * @generated
	 */
	Model3DNodeStyle createModel3DNodeStyle();

	/**
	 * Returns a new object of class '<em>Image2 DNode Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image2 DNode Style</em>'.
	 * @generated
	 */
	Image2DNodeStyle createImage2DNodeStyle();

	/**
	 * Returns a new object of class '<em>Geometric Shape Node Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometric Shape Node Style</em>'.
	 * @generated
	 */
	GeometricShapeNodeStyle createGeometricShapeNodeStyle();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Edge Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Style</em>'.
	 * @generated
	 */
	EdgeStyle createEdgeStyle();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Create Instance Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Instance Operation</em>'.
	 * @generated
	 */
	CreateInstanceOperation createCreateInstanceOperation();

	/**
	 * Returns a new object of class '<em>Remove Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Operation</em>'.
	 * @generated
	 */
	RemoveOperation createRemoveOperation();

	/**
	 * Returns a new object of class '<em>Set Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Operation</em>'.
	 * @generated
	 */
	SetOperation createSetOperation();

	/**
	 * Returns a new object of class '<em>Unset Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unset Operation</em>'.
	 * @generated
	 */
	UnsetOperation createUnsetOperation();

	/**
	 * Returns a new object of class '<em>Tool Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Set</em>'.
	 * @generated
	 */
	ToolSet createToolSet();

	/**
	 * Returns a new object of class '<em>Change Context Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Context Operation</em>'.
	 * @generated
	 */
	ChangeContextOperation createChangeContextOperation();

	/**
	 * Returns a new object of class '<em>Marker Based Tracker Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marker Based Tracker Action</em>'.
	 * @generated
	 */
	MarkerBasedTrackerAction createMarkerBasedTrackerAction();

	/**
	 * Returns a new object of class '<em>Marker Less Tracker Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marker Less Tracker Action</em>'.
	 * @generated
	 */
	MarkerLessTrackerAction createMarkerLessTrackerAction();

	/**
	 * Returns a new object of class '<em>Sensor Based Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Based Action</em>'.
	 * @generated
	 */
	SensorBasedAction createSensorBasedAction();

	/**
	 * Returns a new object of class '<em>Gesture Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gesture Action</em>'.
	 * @generated
	 */
	GestureAction createGestureAction();

	/**
	 * Returns a new object of class '<em>Voice Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voice Action</em>'.
	 * @generated
	 */
	VoiceAction createVoiceAction();

	/**
	 * Returns a new object of class '<em>Mental Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mental Action</em>'.
	 * @generated
	 */
	MentalAction createMentalAction();

	/**
	 * Returns a new object of class '<em>Tactile Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tactile Action</em>'.
	 * @generated
	 */
	TactileAction createTactileAction();

	/**
	 * Returns a new object of class '<em>Move Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Element</em>'.
	 * @generated
	 */
	MoveElement createMoveElement();

	/**
	 * Returns a new object of class '<em>Show System Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Show System Menu</em>'.
	 * @generated
	 */
	ShowSystemMenu createShowSystemMenu();

	/**
	 * Returns a new object of class '<em>Arrange Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrange Elements</em>'.
	 * @generated
	 */
	ArrangeElements createArrangeElements();

	/**
	 * Returns a new object of class '<em>Exit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit</em>'.
	 * @generated
	 */
	Exit createExit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AredslPackage getAredslPackage();

} //AredslFactory
