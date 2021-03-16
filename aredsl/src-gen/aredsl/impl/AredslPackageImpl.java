/**
 */
package aredsl.impl;

import aredsl.Action;
import aredsl.AredslFactory;
import aredsl.AredslPackage;
import aredsl.ArrangeElements;
import aredsl.Behaviour;
import aredsl.ChangeContextOperation;
import aredsl.ContainmentKind;
import aredsl.CreateInstanceOperation;
import aredsl.DomainOperation;
import aredsl.Edge;
import aredsl.EdgeStyle;
import aredsl.Editor;
import aredsl.Exit;
import aredsl.GeometricShapeNodeStyle;
import aredsl.GestureAction;
import aredsl.Image2DNodeStyle;
import aredsl.IntegrityRestrictionKind;
import aredsl.Label;
import aredsl.LabelStyle;
import aredsl.Layer;
import aredsl.LineKind;
import aredsl.MarkerBasedTrackerAction;
import aredsl.MarkerLessTrackerAction;
import aredsl.MentalAction;
import aredsl.Model3DNodeStyle;
import aredsl.MoveElement;
import aredsl.Node;
import aredsl.NodeStyle;
import aredsl.OutlineKind;
import aredsl.QueryLanguageKind;
import aredsl.RemoveOperation;
import aredsl.SensorBasedAction;
import aredsl.SetOperation;
import aredsl.ShapeKind;
import aredsl.ShowSystemMenu;
import aredsl.SupportOperation;
import aredsl.TactileAction;
import aredsl.Tool;
import aredsl.ToolSet;
import aredsl.TrackerAction;
import aredsl.UnsetOperation;
import aredsl.VoiceAction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AredslPackageImpl extends EPackageImpl implements AredslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model3DNodeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass image2DNodeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometricShapeNodeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createInstanceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeContextOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markerBasedTrackerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markerLessTrackerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorBasedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voiceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mentalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tactileActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showSystemMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrangeElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containmentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integrityRestrictionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryLanguageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outlineKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see aredsl.AredslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AredslPackageImpl() {
		super(eNS_URI, AredslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AredslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AredslPackage init() {
		if (isInited)
			return (AredslPackage) EPackage.Registry.INSTANCE.getEPackage(AredslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAredslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AredslPackageImpl theAredslPackage = registeredAredslPackage instanceof AredslPackageImpl
				? (AredslPackageImpl) registeredAredslPackage
				: new AredslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAredslPackage.createPackageContents();

		// Initialize created meta-data
		theAredslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAredslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AredslPackage.eNS_URI, theAredslPackage);
		return theAredslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditor() {
		return editorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEditor_Layer() {
		return (EReference) editorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEditor_Description() {
		return (EAttribute) editorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEditor_FileExtension() {
		return (EAttribute) editorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEditor_Name() {
		return (EAttribute) editorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEditor_Toolsets() {
		return (EReference) editorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEditor_QueryLanguageKind() {
		return (EAttribute) editorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayer_Id() {
		return (EAttribute) layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayer_SemanticExpression() {
		return (EAttribute) layerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayer_Nodes() {
		return (EReference) layerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayer_Edges() {
		return (EReference) layerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayer_Description() {
		return (EAttribute) layerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayer_ReferenceAction() {
		return (EReference) layerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Id() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_SemanticExpression() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Nodestyles() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Label() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_ContaimentKind() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_ContentNodes() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Description() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelStyle() {
		return labelStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelStyle_Color() {
		return (EAttribute) labelStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelStyle_Height() {
		return (EAttribute) labelStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelStyle_SemanticCondition() {
		return (EAttribute) labelStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelStyle_Description() {
		return (EAttribute) labelStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeStyle() {
		return nodeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeStyle_Width() {
		return (EAttribute) nodeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeStyle_Height() {
		return (EAttribute) nodeStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeStyle_SemanticCondition() {
		return (EAttribute) nodeStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeStyle_Description() {
		return (EAttribute) nodeStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel3DNodeStyle() {
		return model3DNodeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel3DNodeStyle_File() {
		return (EAttribute) model3DNodeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage2DNodeStyle() {
		return image2DNodeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage2DNodeStyle_File() {
		return (EAttribute) image2DNodeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometricShapeNodeStyle() {
		return geometricShapeNodeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeometricShapeNodeStyle_Color() {
		return (EAttribute) geometricShapeNodeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeometricShapeNodeStyle_Kind() {
		return (EAttribute) geometricShapeNodeStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeometricShapeNodeStyle_Outline() {
		return (EAttribute) geometricShapeNodeStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_Labelstyles() {
		return (EReference) labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_SemanticExpression() {
		return (EAttribute) labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Id() {
		return (EAttribute) labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Description() {
		return (EAttribute) labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_Id() {
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_OriginSemanticExpression() {
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_DestinationSemanticExpression() {
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Edgestyles() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_MiddleLabel() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_OriginNode() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_DestinationNode() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_OriginLabel() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_DestinationLabel() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_Description() {
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdgeStyle() {
		return edgeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdgeStyle_Color() {
		return (EAttribute) edgeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdgeStyle_Kind() {
		return (EAttribute) edgeStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdgeStyle_Width() {
		return (EAttribute) edgeStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdgeStyle_SemanticCondition() {
		return (EAttribute) edgeStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdgeStyle_Description() {
		return (EAttribute) edgeStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Id() {
		return (EAttribute) toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Description() {
		return (EAttribute) toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTool_Behaviours() {
		return (EReference) toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Precondition() {
		return (EAttribute) toolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_TargetPrecondition() {
		return (EAttribute) toolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTool_Actions() {
		return (EReference) toolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateInstanceOperation() {
		return createInstanceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateInstanceOperation_Feature() {
		return (EAttribute) createInstanceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateInstanceOperation_Type() {
		return (EAttribute) createInstanceOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateInstanceOperation_Name() {
		return (EAttribute) createInstanceOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainOperation() {
		return domainOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoveOperation() {
		return removeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveOperation_Constraint() {
		return (EAttribute) removeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetOperation() {
		return setOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetOperation_Feature() {
		return (EAttribute) setOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetOperation_Value() {
		return (EAttribute) setOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetOperation_Constraint() {
		return (EAttribute) setOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsetOperation() {
		return unsetOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnsetOperation_Feature() {
		return (EAttribute) unsetOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnsetOperation_Constraint() {
		return (EAttribute) unsetOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolSet() {
		return toolSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolSet_Id() {
		return (EAttribute) toolSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolSet_Description() {
		return (EAttribute) toolSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolSet_Tools() {
		return (EReference) toolSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeContextOperation() {
		return changeContextOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeContextOperation_SemanticExpression() {
		return (EAttribute) changeContextOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkerBasedTrackerAction() {
		return markerBasedTrackerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkerBasedTrackerAction_MarkerId() {
		return (EAttribute) markerBasedTrackerActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkerLessTrackerAction() {
		return markerLessTrackerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkerLessTrackerAction_File() {
		return (EAttribute) markerLessTrackerActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensorBasedAction() {
		return sensorBasedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGestureAction() {
		return gestureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVoiceAction() {
		return voiceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrackerAction() {
		return trackerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Description() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMentalAction() {
		return mentalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTactileAction() {
		return tactileActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviour() {
		return behaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviour_Description() {
		return (EAttribute) behaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportOperation() {
		return supportOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoveElement() {
		return moveElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShowSystemMenu() {
		return showSystemMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrangeElements() {
		return arrangeElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExit() {
		return exitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLineKind() {
		return lineKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getShapeKind() {
		return shapeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContainmentKind() {
		return containmentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIntegrityRestrictionKind() {
		return integrityRestrictionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQueryLanguageKind() {
		return queryLanguageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOutlineKind() {
		return outlineKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AredslFactory getAredslFactory() {
		return (AredslFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		editorEClass = createEClass(EDITOR);
		createEReference(editorEClass, EDITOR__LAYER);
		createEAttribute(editorEClass, EDITOR__DESCRIPTION);
		createEAttribute(editorEClass, EDITOR__FILE_EXTENSION);
		createEAttribute(editorEClass, EDITOR__NAME);
		createEReference(editorEClass, EDITOR__TOOLSETS);
		createEAttribute(editorEClass, EDITOR__QUERY_LANGUAGE_KIND);

		layerEClass = createEClass(LAYER);
		createEAttribute(layerEClass, LAYER__ID);
		createEAttribute(layerEClass, LAYER__SEMANTIC_EXPRESSION);
		createEReference(layerEClass, LAYER__NODES);
		createEReference(layerEClass, LAYER__EDGES);
		createEAttribute(layerEClass, LAYER__DESCRIPTION);
		createEReference(layerEClass, LAYER__REFERENCE_ACTION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__ID);
		createEAttribute(nodeEClass, NODE__SEMANTIC_EXPRESSION);
		createEReference(nodeEClass, NODE__NODESTYLES);
		createEReference(nodeEClass, NODE__LABEL);
		createEAttribute(nodeEClass, NODE__CONTAIMENT_KIND);
		createEReference(nodeEClass, NODE__CONTENT_NODES);
		createEAttribute(nodeEClass, NODE__DESCRIPTION);

		labelStyleEClass = createEClass(LABEL_STYLE);
		createEAttribute(labelStyleEClass, LABEL_STYLE__COLOR);
		createEAttribute(labelStyleEClass, LABEL_STYLE__HEIGHT);
		createEAttribute(labelStyleEClass, LABEL_STYLE__SEMANTIC_CONDITION);
		createEAttribute(labelStyleEClass, LABEL_STYLE__DESCRIPTION);

		nodeStyleEClass = createEClass(NODE_STYLE);
		createEAttribute(nodeStyleEClass, NODE_STYLE__WIDTH);
		createEAttribute(nodeStyleEClass, NODE_STYLE__HEIGHT);
		createEAttribute(nodeStyleEClass, NODE_STYLE__SEMANTIC_CONDITION);
		createEAttribute(nodeStyleEClass, NODE_STYLE__DESCRIPTION);

		model3DNodeStyleEClass = createEClass(MODEL3_DNODE_STYLE);
		createEAttribute(model3DNodeStyleEClass, MODEL3_DNODE_STYLE__FILE);

		image2DNodeStyleEClass = createEClass(IMAGE2_DNODE_STYLE);
		createEAttribute(image2DNodeStyleEClass, IMAGE2_DNODE_STYLE__FILE);

		geometricShapeNodeStyleEClass = createEClass(GEOMETRIC_SHAPE_NODE_STYLE);
		createEAttribute(geometricShapeNodeStyleEClass, GEOMETRIC_SHAPE_NODE_STYLE__COLOR);
		createEAttribute(geometricShapeNodeStyleEClass, GEOMETRIC_SHAPE_NODE_STYLE__KIND);
		createEAttribute(geometricShapeNodeStyleEClass, GEOMETRIC_SHAPE_NODE_STYLE__OUTLINE);

		labelEClass = createEClass(LABEL);
		createEReference(labelEClass, LABEL__LABELSTYLES);
		createEAttribute(labelEClass, LABEL__SEMANTIC_EXPRESSION);
		createEAttribute(labelEClass, LABEL__ID);
		createEAttribute(labelEClass, LABEL__DESCRIPTION);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__ID);
		createEAttribute(edgeEClass, EDGE__ORIGIN_SEMANTIC_EXPRESSION);
		createEAttribute(edgeEClass, EDGE__DESTINATION_SEMANTIC_EXPRESSION);
		createEReference(edgeEClass, EDGE__EDGESTYLES);
		createEReference(edgeEClass, EDGE__MIDDLE_LABEL);
		createEReference(edgeEClass, EDGE__ORIGIN_NODE);
		createEReference(edgeEClass, EDGE__DESTINATION_NODE);
		createEReference(edgeEClass, EDGE__ORIGIN_LABEL);
		createEReference(edgeEClass, EDGE__DESTINATION_LABEL);
		createEAttribute(edgeEClass, EDGE__DESCRIPTION);

		edgeStyleEClass = createEClass(EDGE_STYLE);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__COLOR);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__KIND);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__WIDTH);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__SEMANTIC_CONDITION);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__DESCRIPTION);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__ID);
		createEAttribute(toolEClass, TOOL__DESCRIPTION);
		createEReference(toolEClass, TOOL__BEHAVIOURS);
		createEAttribute(toolEClass, TOOL__PRECONDITION);
		createEAttribute(toolEClass, TOOL__TARGET_PRECONDITION);
		createEReference(toolEClass, TOOL__ACTIONS);

		createInstanceOperationEClass = createEClass(CREATE_INSTANCE_OPERATION);
		createEAttribute(createInstanceOperationEClass, CREATE_INSTANCE_OPERATION__FEATURE);
		createEAttribute(createInstanceOperationEClass, CREATE_INSTANCE_OPERATION__TYPE);
		createEAttribute(createInstanceOperationEClass, CREATE_INSTANCE_OPERATION__NAME);

		domainOperationEClass = createEClass(DOMAIN_OPERATION);

		removeOperationEClass = createEClass(REMOVE_OPERATION);
		createEAttribute(removeOperationEClass, REMOVE_OPERATION__CONSTRAINT);

		setOperationEClass = createEClass(SET_OPERATION);
		createEAttribute(setOperationEClass, SET_OPERATION__FEATURE);
		createEAttribute(setOperationEClass, SET_OPERATION__VALUE);
		createEAttribute(setOperationEClass, SET_OPERATION__CONSTRAINT);

		unsetOperationEClass = createEClass(UNSET_OPERATION);
		createEAttribute(unsetOperationEClass, UNSET_OPERATION__FEATURE);
		createEAttribute(unsetOperationEClass, UNSET_OPERATION__CONSTRAINT);

		toolSetEClass = createEClass(TOOL_SET);
		createEAttribute(toolSetEClass, TOOL_SET__ID);
		createEAttribute(toolSetEClass, TOOL_SET__DESCRIPTION);
		createEReference(toolSetEClass, TOOL_SET__TOOLS);

		changeContextOperationEClass = createEClass(CHANGE_CONTEXT_OPERATION);
		createEAttribute(changeContextOperationEClass, CHANGE_CONTEXT_OPERATION__SEMANTIC_EXPRESSION);

		markerBasedTrackerActionEClass = createEClass(MARKER_BASED_TRACKER_ACTION);
		createEAttribute(markerBasedTrackerActionEClass, MARKER_BASED_TRACKER_ACTION__MARKER_ID);

		markerLessTrackerActionEClass = createEClass(MARKER_LESS_TRACKER_ACTION);
		createEAttribute(markerLessTrackerActionEClass, MARKER_LESS_TRACKER_ACTION__FILE);

		sensorBasedActionEClass = createEClass(SENSOR_BASED_ACTION);

		gestureActionEClass = createEClass(GESTURE_ACTION);

		voiceActionEClass = createEClass(VOICE_ACTION);

		trackerActionEClass = createEClass(TRACKER_ACTION);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__DESCRIPTION);

		mentalActionEClass = createEClass(MENTAL_ACTION);

		tactileActionEClass = createEClass(TACTILE_ACTION);

		behaviourEClass = createEClass(BEHAVIOUR);
		createEAttribute(behaviourEClass, BEHAVIOUR__DESCRIPTION);

		supportOperationEClass = createEClass(SUPPORT_OPERATION);

		moveElementEClass = createEClass(MOVE_ELEMENT);

		showSystemMenuEClass = createEClass(SHOW_SYSTEM_MENU);

		arrangeElementsEClass = createEClass(ARRANGE_ELEMENTS);

		exitEClass = createEClass(EXIT);

		// Create enums
		lineKindEEnum = createEEnum(LINE_KIND);
		shapeKindEEnum = createEEnum(SHAPE_KIND);
		containmentKindEEnum = createEEnum(CONTAINMENT_KIND);
		integrityRestrictionKindEEnum = createEEnum(INTEGRITY_RESTRICTION_KIND);
		queryLanguageKindEEnum = createEEnum(QUERY_LANGUAGE_KIND);
		outlineKindEEnum = createEEnum(OUTLINE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		model3DNodeStyleEClass.getESuperTypes().add(this.getNodeStyle());
		image2DNodeStyleEClass.getESuperTypes().add(this.getNodeStyle());
		geometricShapeNodeStyleEClass.getESuperTypes().add(this.getNodeStyle());
		createInstanceOperationEClass.getESuperTypes().add(this.getDomainOperation());
		domainOperationEClass.getESuperTypes().add(this.getBehaviour());
		removeOperationEClass.getESuperTypes().add(this.getDomainOperation());
		setOperationEClass.getESuperTypes().add(this.getDomainOperation());
		unsetOperationEClass.getESuperTypes().add(this.getDomainOperation());
		changeContextOperationEClass.getESuperTypes().add(this.getDomainOperation());
		markerBasedTrackerActionEClass.getESuperTypes().add(this.getTrackerAction());
		markerLessTrackerActionEClass.getESuperTypes().add(this.getTrackerAction());
		sensorBasedActionEClass.getESuperTypes().add(this.getAction());
		gestureActionEClass.getESuperTypes().add(this.getAction());
		voiceActionEClass.getESuperTypes().add(this.getAction());
		trackerActionEClass.getESuperTypes().add(this.getAction());
		mentalActionEClass.getESuperTypes().add(this.getAction());
		tactileActionEClass.getESuperTypes().add(this.getAction());
		supportOperationEClass.getESuperTypes().add(this.getBehaviour());
		moveElementEClass.getESuperTypes().add(this.getSupportOperation());
		showSystemMenuEClass.getESuperTypes().add(this.getSupportOperation());
		arrangeElementsEClass.getESuperTypes().add(this.getSupportOperation());
		exitEClass.getESuperTypes().add(this.getSupportOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(editorEClass, Editor.class, "Editor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditor_Layer(), this.getLayer(), null, "layer", null, 1, -1, Editor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEditor_Description(), ecorePackage.getEString(), "description", null, 0, 1, Editor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditor_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 0, 1, Editor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Editor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditor_Toolsets(), this.getToolSet(), null, "toolsets", null, 1, -1, Editor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditor_QueryLanguageKind(), this.getQueryLanguageKind(), "queryLanguageKind", "LINQ", 0, 1,
				Editor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayer_Id(), ecorePackage.getEString(), "id", "DefaultLayer", 0, 1, Layer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayer_SemanticExpression(), ecorePackage.getEString(), "semanticExpression", null, 0, 1,
				Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLayer_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Layer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLayer_Edges(), this.getEdge(), null, "edges", null, 0, -1, Layer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLayer_Description(), ecorePackage.getEString(), "description", null, 0, 1, Layer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayer_ReferenceAction(), this.getTrackerAction(), null, "referenceAction", null, 0, 1,
				Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_SemanticExpression(), ecorePackage.getEString(), "semanticExpression", null, 0, 1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNode_Nodestyles(), this.getNodeStyle(), null, "nodestyles", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Label(), this.getLabel(), null, "label", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNode_ContaimentKind(), this.getContainmentKind(), "contaimentKind", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ContentNodes(), this.getNode(), null, "contentNodes", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelStyleEClass, LabelStyle.class, "LabelStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, LabelStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelStyle_Height(), ecorePackage.getEInt(), "height", null, 0, 1, LabelStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelStyle_SemanticCondition(), ecorePackage.getEString(), "semanticCondition", "true", 0, 1,
				LabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelStyle_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				LabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nodeStyleEClass, NodeStyle.class, "NodeStyle", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeStyle_Width(), ecorePackage.getEInt(), "width", null, 0, 1, NodeStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeStyle_Height(), ecorePackage.getEInt(), "height", null, 0, 1, NodeStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeStyle_SemanticCondition(), ecorePackage.getEString(), "semanticCondition", "true", 0, 1,
				NodeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeStyle_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				NodeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(model3DNodeStyleEClass, Model3DNodeStyle.class, "Model3DNodeStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel3DNodeStyle_File(), ecorePackage.getEString(), "file", null, 0, 1,
				Model3DNodeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(image2DNodeStyleEClass, Image2DNodeStyle.class, "Image2DNodeStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage2DNodeStyle_File(), ecorePackage.getEString(), "file", null, 0, 1,
				Image2DNodeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(geometricShapeNodeStyleEClass, GeometricShapeNodeStyle.class, "GeometricShapeNodeStyle",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeometricShapeNodeStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1,
				GeometricShapeNodeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeometricShapeNodeStyle_Kind(), this.getShapeKind(), "kind", null, 0, 1,
				GeometricShapeNodeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeometricShapeNodeStyle_Outline(), this.getOutlineKind(), "outline", null, 0, 1,
				GeometricShapeNodeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabel_Labelstyles(), this.getLabelStyle(), null, "labelstyles", null, 0, -1, Label.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_SemanticExpression(), ecorePackage.getEString(), "semanticExpression", null, 0, 1,
				Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLabel_Id(), ecorePackage.getEString(), "id", null, 0, 1, Label.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Label.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Id(), ecorePackage.getEString(), "id", "", 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_OriginSemanticExpression(), ecorePackage.getEString(), "originSemanticExpression", null,
				0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_DestinationSemanticExpression(), ecorePackage.getEString(),
				"destinationSemanticExpression", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Edgestyles(), this.getEdgeStyle(), null, "edgestyles", null, 0, -1, Edge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_MiddleLabel(), this.getLabel(), null, "middleLabel", null, 0, 1, Edge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_OriginNode(), this.getNode(), null, "originNode", null, 1, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEdge_DestinationNode(), this.getNode(), null, "destinationNode", null, 1, 1, Edge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_OriginLabel(), this.getLabel(), null, "originLabel", null, 0, 1, Edge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_DestinationLabel(), this.getLabel(), null, "destinationLabel", null, 0, 1, Edge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Description(), ecorePackage.getEString(), "description", null, 0, 1, Edge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeStyleEClass, EdgeStyle.class, "EdgeStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdgeStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, EdgeStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyle_Kind(), this.getLineKind(), "kind", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyle_Width(), ecorePackage.getEInt(), "width", null, 0, 1, EdgeStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyle_SemanticCondition(), ecorePackage.getEString(), "semanticCondition", "true", 0, 1,
				EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyle_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Id(), ecorePackage.getEString(), "id", null, 0, 1, Tool.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Description(), ecorePackage.getEString(), "description", null, 0, 1, Tool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Behaviours(), this.getBehaviour(), null, "behaviours", null, 1, -1, Tool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Precondition(), ecorePackage.getEString(), "precondition", "None", 0, 1, Tool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_TargetPrecondition(), ecorePackage.getEString(), "targetPrecondition", "None", 0, 1,
				Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTool_Actions(), this.getAction(), null, "actions", null, 1, -1, Tool.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(createInstanceOperationEClass, CreateInstanceOperation.class, "CreateInstanceOperation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateInstanceOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1,
				CreateInstanceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateInstanceOperation_Type(), ecorePackage.getEString(), "type", null, 0, 1,
				CreateInstanceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateInstanceOperation_Name(), ecorePackage.getEString(), "name", "newInstance", 0, 1,
				CreateInstanceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainOperationEClass, DomainOperation.class, "DomainOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeOperationEClass, RemoveOperation.class, "RemoveOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveOperation_Constraint(), this.getIntegrityRestrictionKind(), "constraint", null, 0, 1,
				RemoveOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(setOperationEClass, SetOperation.class, "SetOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, SetOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOperation_Value(), ecorePackage.getEString(), "value", null, 0, 1, SetOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOperation_Constraint(), this.getIntegrityRestrictionKind(), "constraint", null, 0, 1,
				SetOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(unsetOperationEClass, UnsetOperation.class, "UnsetOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsetOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1,
				UnsetOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsetOperation_Constraint(), this.getIntegrityRestrictionKind(), "constraint", null, 0, 1,
				UnsetOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(toolSetEClass, ToolSet.class, "ToolSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolSet_Id(), ecorePackage.getEString(), "id", "DefaultToolSet", 0, 1, ToolSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolSet_Description(), ecorePackage.getEString(), "description", null, 0, 1, ToolSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolSet_Tools(), this.getTool(), null, "tools", null, 0, -1, ToolSet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(changeContextOperationEClass, ChangeContextOperation.class, "ChangeContextOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeContextOperation_SemanticExpression(), ecorePackage.getEString(), "semanticExpression",
				null, 0, 1, ChangeContextOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markerBasedTrackerActionEClass, MarkerBasedTrackerAction.class, "MarkerBasedTrackerAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkerBasedTrackerAction_MarkerId(), ecorePackage.getEInt(), "markerId", null, 0, 1,
				MarkerBasedTrackerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markerLessTrackerActionEClass, MarkerLessTrackerAction.class, "MarkerLessTrackerAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkerLessTrackerAction_File(), ecorePackage.getEString(), "file", null, 0, 1,
				MarkerLessTrackerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorBasedActionEClass, SensorBasedAction.class, "SensorBasedAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gestureActionEClass, GestureAction.class, "GestureAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(voiceActionEClass, VoiceAction.class, "VoiceAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(trackerActionEClass, TrackerAction.class, "TrackerAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Description(), ecorePackage.getEString(), "description", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mentalActionEClass, MentalAction.class, "MentalAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tactileActionEClass, TactileAction.class, "TactileAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(behaviourEClass, Behaviour.class, "Behaviour", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviour_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(supportOperationEClass, SupportOperation.class, "SupportOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveElementEClass, MoveElement.class, "MoveElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(showSystemMenuEClass, ShowSystemMenu.class, "ShowSystemMenu", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrangeElementsEClass, ArrangeElements.class, "ArrangeElements", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(lineKindEEnum, LineKind.class, "LineKind");
		addEEnumLiteral(lineKindEEnum, LineKind.SOLID);
		addEEnumLiteral(lineKindEEnum, LineKind.DASHED);
		addEEnumLiteral(lineKindEEnum, LineKind.DOTTED);

		initEEnum(shapeKindEEnum, ShapeKind.class, "ShapeKind");
		addEEnumLiteral(shapeKindEEnum, ShapeKind.CIRCLE);
		addEEnumLiteral(shapeKindEEnum, ShapeKind.SQUARE);
		addEEnumLiteral(shapeKindEEnum, ShapeKind.RECTANGLE);
		addEEnumLiteral(shapeKindEEnum, ShapeKind.ELLIPSE);
		addEEnumLiteral(shapeKindEEnum, ShapeKind.DIAMOND);
		addEEnumLiteral(shapeKindEEnum, ShapeKind.TRIANGLE);

		initEEnum(containmentKindEEnum, ContainmentKind.class, "ContainmentKind");
		addEEnumLiteral(containmentKindEEnum, ContainmentKind.FREE);
		addEEnumLiteral(containmentKindEEnum, ContainmentKind.HORIZONTAL_ARRANGEMENT);
		addEEnumLiteral(containmentKindEEnum, ContainmentKind.VERTICAL_ARRANGEMENT);
		addEEnumLiteral(containmentKindEEnum, ContainmentKind.EXTERNAL_LINK);

		initEEnum(integrityRestrictionKindEEnum, IntegrityRestrictionKind.class, "IntegrityRestrictionKind");
		addEEnumLiteral(integrityRestrictionKindEEnum, IntegrityRestrictionKind.CASCADE);
		addEEnumLiteral(integrityRestrictionKindEEnum, IntegrityRestrictionKind.SET_NULL);
		addEEnumLiteral(integrityRestrictionKindEEnum, IntegrityRestrictionKind.NO_ACTION);

		initEEnum(queryLanguageKindEEnum, QueryLanguageKind.class, "QueryLanguageKind");
		addEEnumLiteral(queryLanguageKindEEnum, QueryLanguageKind.LINQ);
		addEEnumLiteral(queryLanguageKindEEnum, QueryLanguageKind.JPQL);
		addEEnumLiteral(queryLanguageKindEEnum, QueryLanguageKind.SQL);
		addEEnumLiteral(queryLanguageKindEEnum, QueryLanguageKind.AQL);
		addEEnumLiteral(queryLanguageKindEEnum, QueryLanguageKind.OCL);
		addEEnumLiteral(queryLanguageKindEEnum, QueryLanguageKind.XPATH_XQUERY);

		initEEnum(outlineKindEEnum, OutlineKind.class, "OutlineKind");
		addEEnumLiteral(outlineKindEEnum, OutlineKind.SIMPLE);
		addEEnumLiteral(outlineKindEEnum, OutlineKind.DOUBLE);
		addEEnumLiteral(outlineKindEEnum, OutlineKind.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //AredslPackageImpl
