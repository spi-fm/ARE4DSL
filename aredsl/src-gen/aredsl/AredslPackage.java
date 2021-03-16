/**
 */
package aredsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aredsl.AredslFactory
 * @model kind="package"
 * @generated
 */
public interface AredslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aredsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://aredsl.uca.es/aredsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aredsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AredslPackage eINSTANCE = aredsl.impl.AredslPackageImpl.init();

	/**
	 * The meta object id for the '{@link aredsl.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.EditorImpl
	 * @see aredsl.impl.AredslPackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 0;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__LAYER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__FILE_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__NAME = 3;

	/**
	 * The feature id for the '<em><b>Toolsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__TOOLSETS = 4;

	/**
	 * The feature id for the '<em><b>Query Language Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__QUERY_LANGUAGE_KIND = 5;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.LayerImpl
	 * @see aredsl.impl.AredslPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ID = 0;

	/**
	 * The feature id for the '<em><b>Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__SEMANTIC_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NODES = 2;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__EDGES = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Reference Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__REFERENCE_ACTION = 5;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.NodeImpl
	 * @see aredsl.impl.AredslPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 0;

	/**
	 * The feature id for the '<em><b>Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SEMANTIC_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Nodestyles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODESTYLES = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Contaiment Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAIMENT_KIND = 4;

	/**
	 * The feature id for the '<em><b>Content Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTENT_NODES = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.LabelStyleImpl <em>Label Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.LabelStyleImpl
	 * @see aredsl.impl.AredslPackageImpl#getLabelStyle()
	 * @generated
	 */
	int LABEL_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Semantic Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__SEMANTIC_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.NodeStyleImpl <em>Node Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.NodeStyleImpl
	 * @see aredsl.impl.AredslPackageImpl#getNodeStyle()
	 * @generated
	 */
	int NODE_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Semantic Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__SEMANTIC_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Node Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.Model3DNodeStyleImpl <em>Model3 DNode Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.Model3DNodeStyleImpl
	 * @see aredsl.impl.AredslPackageImpl#getModel3DNodeStyle()
	 * @generated
	 */
	int MODEL3_DNODE_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_DNODE_STYLE__WIDTH = NODE_STYLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_DNODE_STYLE__HEIGHT = NODE_STYLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Semantic Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_DNODE_STYLE__SEMANTIC_CONDITION = NODE_STYLE__SEMANTIC_CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_DNODE_STYLE__DESCRIPTION = NODE_STYLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_DNODE_STYLE__FILE = NODE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model3 DNode Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_DNODE_STYLE_FEATURE_COUNT = NODE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model3 DNode Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL3_DNODE_STYLE_OPERATION_COUNT = NODE_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.Image2DNodeStyleImpl <em>Image2 DNode Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.Image2DNodeStyleImpl
	 * @see aredsl.impl.AredslPackageImpl#getImage2DNodeStyle()
	 * @generated
	 */
	int IMAGE2_DNODE_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE2_DNODE_STYLE__WIDTH = NODE_STYLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE2_DNODE_STYLE__HEIGHT = NODE_STYLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Semantic Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE2_DNODE_STYLE__SEMANTIC_CONDITION = NODE_STYLE__SEMANTIC_CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE2_DNODE_STYLE__DESCRIPTION = NODE_STYLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE2_DNODE_STYLE__FILE = NODE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image2 DNode Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE2_DNODE_STYLE_FEATURE_COUNT = NODE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image2 DNode Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE2_DNODE_STYLE_OPERATION_COUNT = NODE_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.GeometricShapeNodeStyleImpl <em>Geometric Shape Node Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.GeometricShapeNodeStyleImpl
	 * @see aredsl.impl.AredslPackageImpl#getGeometricShapeNodeStyle()
	 * @generated
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE__WIDTH = NODE_STYLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE__HEIGHT = NODE_STYLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Semantic Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE__SEMANTIC_CONDITION = NODE_STYLE__SEMANTIC_CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE__DESCRIPTION = NODE_STYLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE__COLOR = NODE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE__KIND = NODE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE__OUTLINE = NODE_STYLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Geometric Shape Node Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE_FEATURE_COUNT = NODE_STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Geometric Shape Node Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_SHAPE_NODE_STYLE_OPERATION_COUNT = NODE_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.LabelImpl
	 * @see aredsl.impl.AredslPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The feature id for the '<em><b>Labelstyles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LABELSTYLES = 0;

	/**
	 * The feature id for the '<em><b>Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SEMANTIC_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.EdgeImpl
	 * @see aredsl.impl.AredslPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Origin Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ORIGIN_SEMANTIC_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Destination Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESTINATION_SEMANTIC_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Edgestyles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGESTYLES = 3;

	/**
	 * The feature id for the '<em><b>Middle Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__MIDDLE_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Origin Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ORIGIN_NODE = 5;

	/**
	 * The feature id for the '<em><b>Destination Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESTINATION_NODE = 6;

	/**
	 * The feature id for the '<em><b>Origin Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ORIGIN_LABEL = 7;

	/**
	 * The feature id for the '<em><b>Destination Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESTINATION_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESCRIPTION = 9;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.EdgeStyleImpl
	 * @see aredsl.impl.AredslPackageImpl#getEdgeStyle()
	 * @generated
	 */
	int EDGE_STYLE = 10;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__KIND = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Semantic Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__SEMANTIC_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Edge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Edge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.ToolImpl
	 * @see aredsl.impl.AredslPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__BEHAVIOURS = 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PRECONDITION = 3;

	/**
	 * The feature id for the '<em><b>Target Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TARGET_PRECONDITION = 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ACTIONS = 5;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.BehaviourImpl
	 * @see aredsl.impl.AredslPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 28;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.DomainOperationImpl <em>Domain Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.DomainOperationImpl
	 * @see aredsl.impl.AredslPackageImpl#getDomainOperation()
	 * @generated
	 */
	int DOMAIN_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION__DESCRIPTION = BEHAVIOUR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Domain Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.CreateInstanceOperationImpl <em>Create Instance Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.CreateInstanceOperationImpl
	 * @see aredsl.impl.AredslPackageImpl#getCreateInstanceOperation()
	 * @generated
	 */
	int CREATE_INSTANCE_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATION__DESCRIPTION = DOMAIN_OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATION__FEATURE = DOMAIN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATION__TYPE = DOMAIN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATION__NAME = DOMAIN_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Create Instance Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATION_FEATURE_COUNT = DOMAIN_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Create Instance Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INSTANCE_OPERATION_OPERATION_COUNT = DOMAIN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.RemoveOperationImpl <em>Remove Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.RemoveOperationImpl
	 * @see aredsl.impl.AredslPackageImpl#getRemoveOperation()
	 * @generated
	 */
	int REMOVE_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION__DESCRIPTION = DOMAIN_OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION__CONSTRAINT = DOMAIN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION_FEATURE_COUNT = DOMAIN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION_OPERATION_COUNT = DOMAIN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.SetOperationImpl <em>Set Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.SetOperationImpl
	 * @see aredsl.impl.AredslPackageImpl#getSetOperation()
	 * @generated
	 */
	int SET_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION__DESCRIPTION = DOMAIN_OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION__FEATURE = DOMAIN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION__VALUE = DOMAIN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION__CONSTRAINT = DOMAIN_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_FEATURE_COUNT = DOMAIN_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Set Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_OPERATION_COUNT = DOMAIN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.UnsetOperationImpl <em>Unset Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.UnsetOperationImpl
	 * @see aredsl.impl.AredslPackageImpl#getUnsetOperation()
	 * @generated
	 */
	int UNSET_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_OPERATION__DESCRIPTION = DOMAIN_OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_OPERATION__FEATURE = DOMAIN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_OPERATION__CONSTRAINT = DOMAIN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unset Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_OPERATION_FEATURE_COUNT = DOMAIN_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unset Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_OPERATION_OPERATION_COUNT = DOMAIN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.ToolSetImpl <em>Tool Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.ToolSetImpl
	 * @see aredsl.impl.AredslPackageImpl#getToolSet()
	 * @generated
	 */
	int TOOL_SET = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SET__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SET__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SET__TOOLS = 2;

	/**
	 * The number of structural features of the '<em>Tool Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tool Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.ChangeContextOperationImpl <em>Change Context Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.ChangeContextOperationImpl
	 * @see aredsl.impl.AredslPackageImpl#getChangeContextOperation()
	 * @generated
	 */
	int CHANGE_CONTEXT_OPERATION = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONTEXT_OPERATION__DESCRIPTION = DOMAIN_OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Semantic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONTEXT_OPERATION__SEMANTIC_EXPRESSION = DOMAIN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Context Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONTEXT_OPERATION_FEATURE_COUNT = DOMAIN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Context Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONTEXT_OPERATION_OPERATION_COUNT = DOMAIN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.ActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.TrackerActionImpl <em>Tracker Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.TrackerActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getTrackerAction()
	 * @generated
	 */
	int TRACKER_ACTION = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Tracker Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tracker Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.MarkerBasedTrackerActionImpl <em>Marker Based Tracker Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.MarkerBasedTrackerActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getMarkerBasedTrackerAction()
	 * @generated
	 */
	int MARKER_BASED_TRACKER_ACTION = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_BASED_TRACKER_ACTION__DESCRIPTION = TRACKER_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Marker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_BASED_TRACKER_ACTION__MARKER_ID = TRACKER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marker Based Tracker Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_BASED_TRACKER_ACTION_FEATURE_COUNT = TRACKER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marker Based Tracker Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_BASED_TRACKER_ACTION_OPERATION_COUNT = TRACKER_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.MarkerLessTrackerActionImpl <em>Marker Less Tracker Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.MarkerLessTrackerActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getMarkerLessTrackerAction()
	 * @generated
	 */
	int MARKER_LESS_TRACKER_ACTION = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_LESS_TRACKER_ACTION__DESCRIPTION = TRACKER_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_LESS_TRACKER_ACTION__FILE = TRACKER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marker Less Tracker Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_LESS_TRACKER_ACTION_FEATURE_COUNT = TRACKER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marker Less Tracker Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_LESS_TRACKER_ACTION_OPERATION_COUNT = TRACKER_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.SensorBasedActionImpl <em>Sensor Based Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.SensorBasedActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getSensorBasedAction()
	 * @generated
	 */
	int SENSOR_BASED_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BASED_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Sensor Based Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BASED_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Based Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BASED_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.GestureActionImpl <em>Gesture Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.GestureActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getGestureAction()
	 * @generated
	 */
	int GESTURE_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Gesture Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gesture Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.VoiceActionImpl <em>Voice Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.VoiceActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getVoiceAction()
	 * @generated
	 */
	int VOICE_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Voice Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Voice Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.MentalActionImpl <em>Mental Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.MentalActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getMentalAction()
	 * @generated
	 */
	int MENTAL_ACTION = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTAL_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Mental Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mental Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTAL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.TactileActionImpl <em>Tactile Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.TactileActionImpl
	 * @see aredsl.impl.AredslPackageImpl#getTactileAction()
	 * @generated
	 */
	int TACTILE_ACTION = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Tactile Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tactile Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.SupportOperationImpl <em>Support Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.SupportOperationImpl
	 * @see aredsl.impl.AredslPackageImpl#getSupportOperation()
	 * @generated
	 */
	int SUPPORT_OPERATION = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_OPERATION__DESCRIPTION = BEHAVIOUR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Support Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_OPERATION_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Support Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_OPERATION_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.MoveElementImpl <em>Move Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.MoveElementImpl
	 * @see aredsl.impl.AredslPackageImpl#getMoveElement()
	 * @generated
	 */
	int MOVE_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ELEMENT__DESCRIPTION = SUPPORT_OPERATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Move Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ELEMENT_FEATURE_COUNT = SUPPORT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ELEMENT_OPERATION_COUNT = SUPPORT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.ShowSystemMenuImpl <em>Show System Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.ShowSystemMenuImpl
	 * @see aredsl.impl.AredslPackageImpl#getShowSystemMenu()
	 * @generated
	 */
	int SHOW_SYSTEM_MENU = 31;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SYSTEM_MENU__DESCRIPTION = SUPPORT_OPERATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Show System Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SYSTEM_MENU_FEATURE_COUNT = SUPPORT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Show System Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_SYSTEM_MENU_OPERATION_COUNT = SUPPORT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.ArrangeElementsImpl <em>Arrange Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.ArrangeElementsImpl
	 * @see aredsl.impl.AredslPackageImpl#getArrangeElements()
	 * @generated
	 */
	int ARRANGE_ELEMENTS = 32;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRANGE_ELEMENTS__DESCRIPTION = SUPPORT_OPERATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Arrange Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRANGE_ELEMENTS_FEATURE_COUNT = SUPPORT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arrange Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRANGE_ELEMENTS_OPERATION_COUNT = SUPPORT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.impl.ExitImpl <em>Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.impl.ExitImpl
	 * @see aredsl.impl.AredslPackageImpl#getExit()
	 * @generated
	 */
	int EXIT = 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__DESCRIPTION = SUPPORT_OPERATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FEATURE_COUNT = SUPPORT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_OPERATION_COUNT = SUPPORT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aredsl.LineKind <em>Line Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.LineKind
	 * @see aredsl.impl.AredslPackageImpl#getLineKind()
	 * @generated
	 */
	int LINE_KIND = 34;

	/**
	 * The meta object id for the '{@link aredsl.ShapeKind <em>Shape Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.ShapeKind
	 * @see aredsl.impl.AredslPackageImpl#getShapeKind()
	 * @generated
	 */
	int SHAPE_KIND = 35;

	/**
	 * The meta object id for the '{@link aredsl.ContainmentKind <em>Containment Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.ContainmentKind
	 * @see aredsl.impl.AredslPackageImpl#getContainmentKind()
	 * @generated
	 */
	int CONTAINMENT_KIND = 36;

	/**
	 * The meta object id for the '{@link aredsl.IntegrityRestrictionKind <em>Integrity Restriction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.IntegrityRestrictionKind
	 * @see aredsl.impl.AredslPackageImpl#getIntegrityRestrictionKind()
	 * @generated
	 */
	int INTEGRITY_RESTRICTION_KIND = 37;

	/**
	 * The meta object id for the '{@link aredsl.QueryLanguageKind <em>Query Language Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.QueryLanguageKind
	 * @see aredsl.impl.AredslPackageImpl#getQueryLanguageKind()
	 * @generated
	 */
	int QUERY_LANGUAGE_KIND = 38;

	/**
	 * The meta object id for the '{@link aredsl.OutlineKind <em>Outline Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aredsl.OutlineKind
	 * @see aredsl.impl.AredslPackageImpl#getOutlineKind()
	 * @generated
	 */
	int OUTLINE_KIND = 39;

	/**
	 * Returns the meta object for class '{@link aredsl.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see aredsl.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Editor#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layer</em>'.
	 * @see aredsl.Editor#getLayer()
	 * @see #getEditor()
	 * @generated
	 */
	EReference getEditor_Layer();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Editor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.Editor#getDescription()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Description();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Editor#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see aredsl.Editor#getFileExtension()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_FileExtension();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Editor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aredsl.Editor#getName()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Editor#getToolsets <em>Toolsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolsets</em>'.
	 * @see aredsl.Editor#getToolsets()
	 * @see #getEditor()
	 * @generated
	 */
	EReference getEditor_Toolsets();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Editor#getQueryLanguageKind <em>Query Language Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Language Kind</em>'.
	 * @see aredsl.Editor#getQueryLanguageKind()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_QueryLanguageKind();

	/**
	 * Returns the meta object for class '{@link aredsl.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see aredsl.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Layer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aredsl.Layer#getId()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Id();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Layer#getSemanticExpression <em>Semantic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Expression</em>'.
	 * @see aredsl.Layer#getSemanticExpression()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_SemanticExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Layer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see aredsl.Layer#getNodes()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Layer#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see aredsl.Layer#getEdges()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Edges();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Layer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.Layer#getDescription()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Description();

	/**
	 * Returns the meta object for the containment reference '{@link aredsl.Layer#getReferenceAction <em>Reference Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Action</em>'.
	 * @see aredsl.Layer#getReferenceAction()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_ReferenceAction();

	/**
	 * Returns the meta object for class '{@link aredsl.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see aredsl.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aredsl.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Node#getSemanticExpression <em>Semantic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Expression</em>'.
	 * @see aredsl.Node#getSemanticExpression()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_SemanticExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Node#getNodestyles <em>Nodestyles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodestyles</em>'.
	 * @see aredsl.Node#getNodestyles()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Nodestyles();

	/**
	 * Returns the meta object for the containment reference '{@link aredsl.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see aredsl.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Node#getContaimentKind <em>Contaiment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contaiment Kind</em>'.
	 * @see aredsl.Node#getContaimentKind()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ContaimentKind();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Node#getContentNodes <em>Content Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Nodes</em>'.
	 * @see aredsl.Node#getContentNodes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ContentNodes();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for class '{@link aredsl.LabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Style</em>'.
	 * @see aredsl.LabelStyle
	 * @generated
	 */
	EClass getLabelStyle();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.LabelStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see aredsl.LabelStyle#getColor()
	 * @see #getLabelStyle()
	 * @generated
	 */
	EAttribute getLabelStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.LabelStyle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see aredsl.LabelStyle#getHeight()
	 * @see #getLabelStyle()
	 * @generated
	 */
	EAttribute getLabelStyle_Height();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.LabelStyle#getSemanticCondition <em>Semantic Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Condition</em>'.
	 * @see aredsl.LabelStyle#getSemanticCondition()
	 * @see #getLabelStyle()
	 * @generated
	 */
	EAttribute getLabelStyle_SemanticCondition();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.LabelStyle#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.LabelStyle#getDescription()
	 * @see #getLabelStyle()
	 * @generated
	 */
	EAttribute getLabelStyle_Description();

	/**
	 * Returns the meta object for class '{@link aredsl.NodeStyle <em>Node Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Style</em>'.
	 * @see aredsl.NodeStyle
	 * @generated
	 */
	EClass getNodeStyle();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.NodeStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see aredsl.NodeStyle#getWidth()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EAttribute getNodeStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.NodeStyle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see aredsl.NodeStyle#getHeight()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EAttribute getNodeStyle_Height();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.NodeStyle#getSemanticCondition <em>Semantic Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Condition</em>'.
	 * @see aredsl.NodeStyle#getSemanticCondition()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EAttribute getNodeStyle_SemanticCondition();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.NodeStyle#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.NodeStyle#getDescription()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EAttribute getNodeStyle_Description();

	/**
	 * Returns the meta object for class '{@link aredsl.Model3DNodeStyle <em>Model3 DNode Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model3 DNode Style</em>'.
	 * @see aredsl.Model3DNodeStyle
	 * @generated
	 */
	EClass getModel3DNodeStyle();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Model3DNodeStyle#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see aredsl.Model3DNodeStyle#getFile()
	 * @see #getModel3DNodeStyle()
	 * @generated
	 */
	EAttribute getModel3DNodeStyle_File();

	/**
	 * Returns the meta object for class '{@link aredsl.Image2DNodeStyle <em>Image2 DNode Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image2 DNode Style</em>'.
	 * @see aredsl.Image2DNodeStyle
	 * @generated
	 */
	EClass getImage2DNodeStyle();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Image2DNodeStyle#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see aredsl.Image2DNodeStyle#getFile()
	 * @see #getImage2DNodeStyle()
	 * @generated
	 */
	EAttribute getImage2DNodeStyle_File();

	/**
	 * Returns the meta object for class '{@link aredsl.GeometricShapeNodeStyle <em>Geometric Shape Node Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometric Shape Node Style</em>'.
	 * @see aredsl.GeometricShapeNodeStyle
	 * @generated
	 */
	EClass getGeometricShapeNodeStyle();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.GeometricShapeNodeStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see aredsl.GeometricShapeNodeStyle#getColor()
	 * @see #getGeometricShapeNodeStyle()
	 * @generated
	 */
	EAttribute getGeometricShapeNodeStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.GeometricShapeNodeStyle#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see aredsl.GeometricShapeNodeStyle#getKind()
	 * @see #getGeometricShapeNodeStyle()
	 * @generated
	 */
	EAttribute getGeometricShapeNodeStyle_Kind();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.GeometricShapeNodeStyle#getOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see aredsl.GeometricShapeNodeStyle#getOutline()
	 * @see #getGeometricShapeNodeStyle()
	 * @generated
	 */
	EAttribute getGeometricShapeNodeStyle_Outline();

	/**
	 * Returns the meta object for class '{@link aredsl.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see aredsl.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Label#getLabelstyles <em>Labelstyles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labelstyles</em>'.
	 * @see aredsl.Label#getLabelstyles()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Labelstyles();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Label#getSemanticExpression <em>Semantic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Expression</em>'.
	 * @see aredsl.Label#getSemanticExpression()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_SemanticExpression();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Label#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aredsl.Label#getId()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Id();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Label#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.Label#getDescription()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Description();

	/**
	 * Returns the meta object for class '{@link aredsl.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see aredsl.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Edge#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aredsl.Edge#getId()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Id();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Edge#getOriginSemanticExpression <em>Origin Semantic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Semantic Expression</em>'.
	 * @see aredsl.Edge#getOriginSemanticExpression()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_OriginSemanticExpression();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Edge#getDestinationSemanticExpression <em>Destination Semantic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Semantic Expression</em>'.
	 * @see aredsl.Edge#getDestinationSemanticExpression()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_DestinationSemanticExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Edge#getEdgestyles <em>Edgestyles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edgestyles</em>'.
	 * @see aredsl.Edge#getEdgestyles()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Edgestyles();

	/**
	 * Returns the meta object for the containment reference '{@link aredsl.Edge#getMiddleLabel <em>Middle Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middle Label</em>'.
	 * @see aredsl.Edge#getMiddleLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_MiddleLabel();

	/**
	 * Returns the meta object for the reference '{@link aredsl.Edge#getOriginNode <em>Origin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Node</em>'.
	 * @see aredsl.Edge#getOriginNode()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_OriginNode();

	/**
	 * Returns the meta object for the reference '{@link aredsl.Edge#getDestinationNode <em>Destination Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Node</em>'.
	 * @see aredsl.Edge#getDestinationNode()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_DestinationNode();

	/**
	 * Returns the meta object for the containment reference '{@link aredsl.Edge#getOriginLabel <em>Origin Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin Label</em>'.
	 * @see aredsl.Edge#getOriginLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_OriginLabel();

	/**
	 * Returns the meta object for the containment reference '{@link aredsl.Edge#getDestinationLabel <em>Destination Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Label</em>'.
	 * @see aredsl.Edge#getDestinationLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_DestinationLabel();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Edge#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.Edge#getDescription()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Description();

	/**
	 * Returns the meta object for class '{@link aredsl.EdgeStyle <em>Edge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Style</em>'.
	 * @see aredsl.EdgeStyle
	 * @generated
	 */
	EClass getEdgeStyle();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.EdgeStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see aredsl.EdgeStyle#getColor()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.EdgeStyle#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see aredsl.EdgeStyle#getKind()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_Kind();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.EdgeStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see aredsl.EdgeStyle#getWidth()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.EdgeStyle#getSemanticCondition <em>Semantic Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Condition</em>'.
	 * @see aredsl.EdgeStyle#getSemanticCondition()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_SemanticCondition();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.EdgeStyle#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.EdgeStyle#getDescription()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_Description();

	/**
	 * Returns the meta object for class '{@link aredsl.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see aredsl.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Tool#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aredsl.Tool#getId()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Id();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Tool#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.Tool#getDescription()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Tool#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see aredsl.Tool#getBehaviours()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Behaviours();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Tool#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see aredsl.Tool#getPrecondition()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Tool#getTargetPrecondition <em>Target Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Precondition</em>'.
	 * @see aredsl.Tool#getTargetPrecondition()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_TargetPrecondition();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.Tool#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see aredsl.Tool#getActions()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Actions();

	/**
	 * Returns the meta object for class '{@link aredsl.CreateInstanceOperation <em>Create Instance Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Instance Operation</em>'.
	 * @see aredsl.CreateInstanceOperation
	 * @generated
	 */
	EClass getCreateInstanceOperation();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.CreateInstanceOperation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see aredsl.CreateInstanceOperation#getFeature()
	 * @see #getCreateInstanceOperation()
	 * @generated
	 */
	EAttribute getCreateInstanceOperation_Feature();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.CreateInstanceOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see aredsl.CreateInstanceOperation#getType()
	 * @see #getCreateInstanceOperation()
	 * @generated
	 */
	EAttribute getCreateInstanceOperation_Type();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.CreateInstanceOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aredsl.CreateInstanceOperation#getName()
	 * @see #getCreateInstanceOperation()
	 * @generated
	 */
	EAttribute getCreateInstanceOperation_Name();

	/**
	 * Returns the meta object for class '{@link aredsl.DomainOperation <em>Domain Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Operation</em>'.
	 * @see aredsl.DomainOperation
	 * @generated
	 */
	EClass getDomainOperation();

	/**
	 * Returns the meta object for class '{@link aredsl.RemoveOperation <em>Remove Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Operation</em>'.
	 * @see aredsl.RemoveOperation
	 * @generated
	 */
	EClass getRemoveOperation();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.RemoveOperation#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see aredsl.RemoveOperation#getConstraint()
	 * @see #getRemoveOperation()
	 * @generated
	 */
	EAttribute getRemoveOperation_Constraint();

	/**
	 * Returns the meta object for class '{@link aredsl.SetOperation <em>Set Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Operation</em>'.
	 * @see aredsl.SetOperation
	 * @generated
	 */
	EClass getSetOperation();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.SetOperation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see aredsl.SetOperation#getFeature()
	 * @see #getSetOperation()
	 * @generated
	 */
	EAttribute getSetOperation_Feature();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.SetOperation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see aredsl.SetOperation#getValue()
	 * @see #getSetOperation()
	 * @generated
	 */
	EAttribute getSetOperation_Value();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.SetOperation#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see aredsl.SetOperation#getConstraint()
	 * @see #getSetOperation()
	 * @generated
	 */
	EAttribute getSetOperation_Constraint();

	/**
	 * Returns the meta object for class '{@link aredsl.UnsetOperation <em>Unset Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unset Operation</em>'.
	 * @see aredsl.UnsetOperation
	 * @generated
	 */
	EClass getUnsetOperation();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.UnsetOperation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see aredsl.UnsetOperation#getFeature()
	 * @see #getUnsetOperation()
	 * @generated
	 */
	EAttribute getUnsetOperation_Feature();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.UnsetOperation#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see aredsl.UnsetOperation#getConstraint()
	 * @see #getUnsetOperation()
	 * @generated
	 */
	EAttribute getUnsetOperation_Constraint();

	/**
	 * Returns the meta object for class '{@link aredsl.ToolSet <em>Tool Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Set</em>'.
	 * @see aredsl.ToolSet
	 * @generated
	 */
	EClass getToolSet();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.ToolSet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aredsl.ToolSet#getId()
	 * @see #getToolSet()
	 * @generated
	 */
	EAttribute getToolSet_Id();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.ToolSet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.ToolSet#getDescription()
	 * @see #getToolSet()
	 * @generated
	 */
	EAttribute getToolSet_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link aredsl.ToolSet#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see aredsl.ToolSet#getTools()
	 * @see #getToolSet()
	 * @generated
	 */
	EReference getToolSet_Tools();

	/**
	 * Returns the meta object for class '{@link aredsl.ChangeContextOperation <em>Change Context Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Context Operation</em>'.
	 * @see aredsl.ChangeContextOperation
	 * @generated
	 */
	EClass getChangeContextOperation();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.ChangeContextOperation#getSemanticExpression <em>Semantic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Expression</em>'.
	 * @see aredsl.ChangeContextOperation#getSemanticExpression()
	 * @see #getChangeContextOperation()
	 * @generated
	 */
	EAttribute getChangeContextOperation_SemanticExpression();

	/**
	 * Returns the meta object for class '{@link aredsl.MarkerBasedTrackerAction <em>Marker Based Tracker Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker Based Tracker Action</em>'.
	 * @see aredsl.MarkerBasedTrackerAction
	 * @generated
	 */
	EClass getMarkerBasedTrackerAction();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.MarkerBasedTrackerAction#getMarkerId <em>Marker Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Id</em>'.
	 * @see aredsl.MarkerBasedTrackerAction#getMarkerId()
	 * @see #getMarkerBasedTrackerAction()
	 * @generated
	 */
	EAttribute getMarkerBasedTrackerAction_MarkerId();

	/**
	 * Returns the meta object for class '{@link aredsl.MarkerLessTrackerAction <em>Marker Less Tracker Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker Less Tracker Action</em>'.
	 * @see aredsl.MarkerLessTrackerAction
	 * @generated
	 */
	EClass getMarkerLessTrackerAction();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.MarkerLessTrackerAction#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see aredsl.MarkerLessTrackerAction#getFile()
	 * @see #getMarkerLessTrackerAction()
	 * @generated
	 */
	EAttribute getMarkerLessTrackerAction_File();

	/**
	 * Returns the meta object for class '{@link aredsl.SensorBasedAction <em>Sensor Based Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Based Action</em>'.
	 * @see aredsl.SensorBasedAction
	 * @generated
	 */
	EClass getSensorBasedAction();

	/**
	 * Returns the meta object for class '{@link aredsl.GestureAction <em>Gesture Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gesture Action</em>'.
	 * @see aredsl.GestureAction
	 * @generated
	 */
	EClass getGestureAction();

	/**
	 * Returns the meta object for class '{@link aredsl.VoiceAction <em>Voice Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voice Action</em>'.
	 * @see aredsl.VoiceAction
	 * @generated
	 */
	EClass getVoiceAction();

	/**
	 * Returns the meta object for class '{@link aredsl.TrackerAction <em>Tracker Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracker Action</em>'.
	 * @see aredsl.TrackerAction
	 * @generated
	 */
	EClass getTrackerAction();

	/**
	 * Returns the meta object for class '{@link aredsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see aredsl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for class '{@link aredsl.MentalAction <em>Mental Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mental Action</em>'.
	 * @see aredsl.MentalAction
	 * @generated
	 */
	EClass getMentalAction();

	/**
	 * Returns the meta object for class '{@link aredsl.TactileAction <em>Tactile Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tactile Action</em>'.
	 * @see aredsl.TactileAction
	 * @generated
	 */
	EClass getTactileAction();

	/**
	 * Returns the meta object for class '{@link aredsl.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see aredsl.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link aredsl.Behaviour#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aredsl.Behaviour#getDescription()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_Description();

	/**
	 * Returns the meta object for class '{@link aredsl.SupportOperation <em>Support Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Operation</em>'.
	 * @see aredsl.SupportOperation
	 * @generated
	 */
	EClass getSupportOperation();

	/**
	 * Returns the meta object for class '{@link aredsl.MoveElement <em>Move Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Element</em>'.
	 * @see aredsl.MoveElement
	 * @generated
	 */
	EClass getMoveElement();

	/**
	 * Returns the meta object for class '{@link aredsl.ShowSystemMenu <em>Show System Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show System Menu</em>'.
	 * @see aredsl.ShowSystemMenu
	 * @generated
	 */
	EClass getShowSystemMenu();

	/**
	 * Returns the meta object for class '{@link aredsl.ArrangeElements <em>Arrange Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrange Elements</em>'.
	 * @see aredsl.ArrangeElements
	 * @generated
	 */
	EClass getArrangeElements();

	/**
	 * Returns the meta object for class '{@link aredsl.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit</em>'.
	 * @see aredsl.Exit
	 * @generated
	 */
	EClass getExit();

	/**
	 * Returns the meta object for enum '{@link aredsl.LineKind <em>Line Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Kind</em>'.
	 * @see aredsl.LineKind
	 * @generated
	 */
	EEnum getLineKind();

	/**
	 * Returns the meta object for enum '{@link aredsl.ShapeKind <em>Shape Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape Kind</em>'.
	 * @see aredsl.ShapeKind
	 * @generated
	 */
	EEnum getShapeKind();

	/**
	 * Returns the meta object for enum '{@link aredsl.ContainmentKind <em>Containment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Containment Kind</em>'.
	 * @see aredsl.ContainmentKind
	 * @generated
	 */
	EEnum getContainmentKind();

	/**
	 * Returns the meta object for enum '{@link aredsl.IntegrityRestrictionKind <em>Integrity Restriction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integrity Restriction Kind</em>'.
	 * @see aredsl.IntegrityRestrictionKind
	 * @generated
	 */
	EEnum getIntegrityRestrictionKind();

	/**
	 * Returns the meta object for enum '{@link aredsl.QueryLanguageKind <em>Query Language Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Language Kind</em>'.
	 * @see aredsl.QueryLanguageKind
	 * @generated
	 */
	EEnum getQueryLanguageKind();

	/**
	 * Returns the meta object for enum '{@link aredsl.OutlineKind <em>Outline Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Outline Kind</em>'.
	 * @see aredsl.OutlineKind
	 * @generated
	 */
	EEnum getOutlineKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AredslFactory getAredslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aredsl.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.EditorImpl
		 * @see aredsl.impl.AredslPackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR__LAYER = eINSTANCE.getEditor_Layer();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__DESCRIPTION = eINSTANCE.getEditor_Description();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__FILE_EXTENSION = eINSTANCE.getEditor_FileExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__NAME = eINSTANCE.getEditor_Name();

		/**
		 * The meta object literal for the '<em><b>Toolsets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR__TOOLSETS = eINSTANCE.getEditor_Toolsets();

		/**
		 * The meta object literal for the '<em><b>Query Language Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__QUERY_LANGUAGE_KIND = eINSTANCE.getEditor_QueryLanguageKind();

		/**
		 * The meta object literal for the '{@link aredsl.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.LayerImpl
		 * @see aredsl.impl.AredslPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__ID = eINSTANCE.getLayer_Id();

		/**
		 * The meta object literal for the '<em><b>Semantic Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__SEMANTIC_EXPRESSION = eINSTANCE.getLayer_SemanticExpression();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__NODES = eINSTANCE.getLayer_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__EDGES = eINSTANCE.getLayer_Edges();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__DESCRIPTION = eINSTANCE.getLayer_Description();

		/**
		 * The meta object literal for the '<em><b>Reference Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__REFERENCE_ACTION = eINSTANCE.getLayer_ReferenceAction();

		/**
		 * The meta object literal for the '{@link aredsl.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.NodeImpl
		 * @see aredsl.impl.AredslPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '<em><b>Semantic Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SEMANTIC_EXPRESSION = eINSTANCE.getNode_SemanticExpression();

		/**
		 * The meta object literal for the '<em><b>Nodestyles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODESTYLES = eINSTANCE.getNode_Nodestyles();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Contaiment Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CONTAIMENT_KIND = eINSTANCE.getNode_ContaimentKind();

		/**
		 * The meta object literal for the '<em><b>Content Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONTENT_NODES = eINSTANCE.getNode_ContentNodes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '{@link aredsl.impl.LabelStyleImpl <em>Label Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.LabelStyleImpl
		 * @see aredsl.impl.AredslPackageImpl#getLabelStyle()
		 * @generated
		 */
		EClass LABEL_STYLE = eINSTANCE.getLabelStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STYLE__COLOR = eINSTANCE.getLabelStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STYLE__HEIGHT = eINSTANCE.getLabelStyle_Height();

		/**
		 * The meta object literal for the '<em><b>Semantic Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STYLE__SEMANTIC_CONDITION = eINSTANCE.getLabelStyle_SemanticCondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STYLE__DESCRIPTION = eINSTANCE.getLabelStyle_Description();

		/**
		 * The meta object literal for the '{@link aredsl.impl.NodeStyleImpl <em>Node Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.NodeStyleImpl
		 * @see aredsl.impl.AredslPackageImpl#getNodeStyle()
		 * @generated
		 */
		EClass NODE_STYLE = eINSTANCE.getNodeStyle();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE__WIDTH = eINSTANCE.getNodeStyle_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE__HEIGHT = eINSTANCE.getNodeStyle_Height();

		/**
		 * The meta object literal for the '<em><b>Semantic Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE__SEMANTIC_CONDITION = eINSTANCE.getNodeStyle_SemanticCondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE__DESCRIPTION = eINSTANCE.getNodeStyle_Description();

		/**
		 * The meta object literal for the '{@link aredsl.impl.Model3DNodeStyleImpl <em>Model3 DNode Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.Model3DNodeStyleImpl
		 * @see aredsl.impl.AredslPackageImpl#getModel3DNodeStyle()
		 * @generated
		 */
		EClass MODEL3_DNODE_STYLE = eINSTANCE.getModel3DNodeStyle();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL3_DNODE_STYLE__FILE = eINSTANCE.getModel3DNodeStyle_File();

		/**
		 * The meta object literal for the '{@link aredsl.impl.Image2DNodeStyleImpl <em>Image2 DNode Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.Image2DNodeStyleImpl
		 * @see aredsl.impl.AredslPackageImpl#getImage2DNodeStyle()
		 * @generated
		 */
		EClass IMAGE2_DNODE_STYLE = eINSTANCE.getImage2DNodeStyle();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE2_DNODE_STYLE__FILE = eINSTANCE.getImage2DNodeStyle_File();

		/**
		 * The meta object literal for the '{@link aredsl.impl.GeometricShapeNodeStyleImpl <em>Geometric Shape Node Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.GeometricShapeNodeStyleImpl
		 * @see aredsl.impl.AredslPackageImpl#getGeometricShapeNodeStyle()
		 * @generated
		 */
		EClass GEOMETRIC_SHAPE_NODE_STYLE = eINSTANCE.getGeometricShapeNodeStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRIC_SHAPE_NODE_STYLE__COLOR = eINSTANCE.getGeometricShapeNodeStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRIC_SHAPE_NODE_STYLE__KIND = eINSTANCE.getGeometricShapeNodeStyle_Kind();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRIC_SHAPE_NODE_STYLE__OUTLINE = eINSTANCE.getGeometricShapeNodeStyle_Outline();

		/**
		 * The meta object literal for the '{@link aredsl.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.LabelImpl
		 * @see aredsl.impl.AredslPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Labelstyles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__LABELSTYLES = eINSTANCE.getLabel_Labelstyles();

		/**
		 * The meta object literal for the '<em><b>Semantic Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SEMANTIC_EXPRESSION = eINSTANCE.getLabel_SemanticExpression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ID = eINSTANCE.getLabel_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__DESCRIPTION = eINSTANCE.getLabel_Description();

		/**
		 * The meta object literal for the '{@link aredsl.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.EdgeImpl
		 * @see aredsl.impl.AredslPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ID = eINSTANCE.getEdge_Id();

		/**
		 * The meta object literal for the '<em><b>Origin Semantic Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ORIGIN_SEMANTIC_EXPRESSION = eINSTANCE.getEdge_OriginSemanticExpression();

		/**
		 * The meta object literal for the '<em><b>Destination Semantic Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__DESTINATION_SEMANTIC_EXPRESSION = eINSTANCE.getEdge_DestinationSemanticExpression();

		/**
		 * The meta object literal for the '<em><b>Edgestyles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__EDGESTYLES = eINSTANCE.getEdge_Edgestyles();

		/**
		 * The meta object literal for the '<em><b>Middle Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__MIDDLE_LABEL = eINSTANCE.getEdge_MiddleLabel();

		/**
		 * The meta object literal for the '<em><b>Origin Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__ORIGIN_NODE = eINSTANCE.getEdge_OriginNode();

		/**
		 * The meta object literal for the '<em><b>Destination Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__DESTINATION_NODE = eINSTANCE.getEdge_DestinationNode();

		/**
		 * The meta object literal for the '<em><b>Origin Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__ORIGIN_LABEL = eINSTANCE.getEdge_OriginLabel();

		/**
		 * The meta object literal for the '<em><b>Destination Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__DESTINATION_LABEL = eINSTANCE.getEdge_DestinationLabel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__DESCRIPTION = eINSTANCE.getEdge_Description();

		/**
		 * The meta object literal for the '{@link aredsl.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.EdgeStyleImpl
		 * @see aredsl.impl.AredslPackageImpl#getEdgeStyle()
		 * @generated
		 */
		EClass EDGE_STYLE = eINSTANCE.getEdgeStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__COLOR = eINSTANCE.getEdgeStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__KIND = eINSTANCE.getEdgeStyle_Kind();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__WIDTH = eINSTANCE.getEdgeStyle_Width();

		/**
		 * The meta object literal for the '<em><b>Semantic Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__SEMANTIC_CONDITION = eINSTANCE.getEdgeStyle_SemanticCondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__DESCRIPTION = eINSTANCE.getEdgeStyle_Description();

		/**
		 * The meta object literal for the '{@link aredsl.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.ToolImpl
		 * @see aredsl.impl.AredslPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__ID = eINSTANCE.getTool_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__DESCRIPTION = eINSTANCE.getTool_Description();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__BEHAVIOURS = eINSTANCE.getTool_Behaviours();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__PRECONDITION = eINSTANCE.getTool_Precondition();

		/**
		 * The meta object literal for the '<em><b>Target Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__TARGET_PRECONDITION = eINSTANCE.getTool_TargetPrecondition();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__ACTIONS = eINSTANCE.getTool_Actions();

		/**
		 * The meta object literal for the '{@link aredsl.impl.CreateInstanceOperationImpl <em>Create Instance Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.CreateInstanceOperationImpl
		 * @see aredsl.impl.AredslPackageImpl#getCreateInstanceOperation()
		 * @generated
		 */
		EClass CREATE_INSTANCE_OPERATION = eINSTANCE.getCreateInstanceOperation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INSTANCE_OPERATION__FEATURE = eINSTANCE.getCreateInstanceOperation_Feature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INSTANCE_OPERATION__TYPE = eINSTANCE.getCreateInstanceOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INSTANCE_OPERATION__NAME = eINSTANCE.getCreateInstanceOperation_Name();

		/**
		 * The meta object literal for the '{@link aredsl.impl.DomainOperationImpl <em>Domain Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.DomainOperationImpl
		 * @see aredsl.impl.AredslPackageImpl#getDomainOperation()
		 * @generated
		 */
		EClass DOMAIN_OPERATION = eINSTANCE.getDomainOperation();

		/**
		 * The meta object literal for the '{@link aredsl.impl.RemoveOperationImpl <em>Remove Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.RemoveOperationImpl
		 * @see aredsl.impl.AredslPackageImpl#getRemoveOperation()
		 * @generated
		 */
		EClass REMOVE_OPERATION = eINSTANCE.getRemoveOperation();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_OPERATION__CONSTRAINT = eINSTANCE.getRemoveOperation_Constraint();

		/**
		 * The meta object literal for the '{@link aredsl.impl.SetOperationImpl <em>Set Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.SetOperationImpl
		 * @see aredsl.impl.AredslPackageImpl#getSetOperation()
		 * @generated
		 */
		EClass SET_OPERATION = eINSTANCE.getSetOperation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPERATION__FEATURE = eINSTANCE.getSetOperation_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPERATION__VALUE = eINSTANCE.getSetOperation_Value();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPERATION__CONSTRAINT = eINSTANCE.getSetOperation_Constraint();

		/**
		 * The meta object literal for the '{@link aredsl.impl.UnsetOperationImpl <em>Unset Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.UnsetOperationImpl
		 * @see aredsl.impl.AredslPackageImpl#getUnsetOperation()
		 * @generated
		 */
		EClass UNSET_OPERATION = eINSTANCE.getUnsetOperation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSET_OPERATION__FEATURE = eINSTANCE.getUnsetOperation_Feature();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSET_OPERATION__CONSTRAINT = eINSTANCE.getUnsetOperation_Constraint();

		/**
		 * The meta object literal for the '{@link aredsl.impl.ToolSetImpl <em>Tool Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.ToolSetImpl
		 * @see aredsl.impl.AredslPackageImpl#getToolSet()
		 * @generated
		 */
		EClass TOOL_SET = eINSTANCE.getToolSet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_SET__ID = eINSTANCE.getToolSet_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_SET__DESCRIPTION = eINSTANCE.getToolSet_Description();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_SET__TOOLS = eINSTANCE.getToolSet_Tools();

		/**
		 * The meta object literal for the '{@link aredsl.impl.ChangeContextOperationImpl <em>Change Context Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.ChangeContextOperationImpl
		 * @see aredsl.impl.AredslPackageImpl#getChangeContextOperation()
		 * @generated
		 */
		EClass CHANGE_CONTEXT_OPERATION = eINSTANCE.getChangeContextOperation();

		/**
		 * The meta object literal for the '<em><b>Semantic Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CONTEXT_OPERATION__SEMANTIC_EXPRESSION = eINSTANCE
				.getChangeContextOperation_SemanticExpression();

		/**
		 * The meta object literal for the '{@link aredsl.impl.MarkerBasedTrackerActionImpl <em>Marker Based Tracker Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.MarkerBasedTrackerActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getMarkerBasedTrackerAction()
		 * @generated
		 */
		EClass MARKER_BASED_TRACKER_ACTION = eINSTANCE.getMarkerBasedTrackerAction();

		/**
		 * The meta object literal for the '<em><b>Marker Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER_BASED_TRACKER_ACTION__MARKER_ID = eINSTANCE.getMarkerBasedTrackerAction_MarkerId();

		/**
		 * The meta object literal for the '{@link aredsl.impl.MarkerLessTrackerActionImpl <em>Marker Less Tracker Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.MarkerLessTrackerActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getMarkerLessTrackerAction()
		 * @generated
		 */
		EClass MARKER_LESS_TRACKER_ACTION = eINSTANCE.getMarkerLessTrackerAction();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER_LESS_TRACKER_ACTION__FILE = eINSTANCE.getMarkerLessTrackerAction_File();

		/**
		 * The meta object literal for the '{@link aredsl.impl.SensorBasedActionImpl <em>Sensor Based Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.SensorBasedActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getSensorBasedAction()
		 * @generated
		 */
		EClass SENSOR_BASED_ACTION = eINSTANCE.getSensorBasedAction();

		/**
		 * The meta object literal for the '{@link aredsl.impl.GestureActionImpl <em>Gesture Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.GestureActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getGestureAction()
		 * @generated
		 */
		EClass GESTURE_ACTION = eINSTANCE.getGestureAction();

		/**
		 * The meta object literal for the '{@link aredsl.impl.VoiceActionImpl <em>Voice Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.VoiceActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getVoiceAction()
		 * @generated
		 */
		EClass VOICE_ACTION = eINSTANCE.getVoiceAction();

		/**
		 * The meta object literal for the '{@link aredsl.impl.TrackerActionImpl <em>Tracker Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.TrackerActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getTrackerAction()
		 * @generated
		 */
		EClass TRACKER_ACTION = eINSTANCE.getTrackerAction();

		/**
		 * The meta object literal for the '{@link aredsl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.ActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '{@link aredsl.impl.MentalActionImpl <em>Mental Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.MentalActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getMentalAction()
		 * @generated
		 */
		EClass MENTAL_ACTION = eINSTANCE.getMentalAction();

		/**
		 * The meta object literal for the '{@link aredsl.impl.TactileActionImpl <em>Tactile Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.TactileActionImpl
		 * @see aredsl.impl.AredslPackageImpl#getTactileAction()
		 * @generated
		 */
		EClass TACTILE_ACTION = eINSTANCE.getTactileAction();

		/**
		 * The meta object literal for the '{@link aredsl.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.BehaviourImpl
		 * @see aredsl.impl.AredslPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__DESCRIPTION = eINSTANCE.getBehaviour_Description();

		/**
		 * The meta object literal for the '{@link aredsl.impl.SupportOperationImpl <em>Support Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.SupportOperationImpl
		 * @see aredsl.impl.AredslPackageImpl#getSupportOperation()
		 * @generated
		 */
		EClass SUPPORT_OPERATION = eINSTANCE.getSupportOperation();

		/**
		 * The meta object literal for the '{@link aredsl.impl.MoveElementImpl <em>Move Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.MoveElementImpl
		 * @see aredsl.impl.AredslPackageImpl#getMoveElement()
		 * @generated
		 */
		EClass MOVE_ELEMENT = eINSTANCE.getMoveElement();

		/**
		 * The meta object literal for the '{@link aredsl.impl.ShowSystemMenuImpl <em>Show System Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.ShowSystemMenuImpl
		 * @see aredsl.impl.AredslPackageImpl#getShowSystemMenu()
		 * @generated
		 */
		EClass SHOW_SYSTEM_MENU = eINSTANCE.getShowSystemMenu();

		/**
		 * The meta object literal for the '{@link aredsl.impl.ArrangeElementsImpl <em>Arrange Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.ArrangeElementsImpl
		 * @see aredsl.impl.AredslPackageImpl#getArrangeElements()
		 * @generated
		 */
		EClass ARRANGE_ELEMENTS = eINSTANCE.getArrangeElements();

		/**
		 * The meta object literal for the '{@link aredsl.impl.ExitImpl <em>Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.impl.ExitImpl
		 * @see aredsl.impl.AredslPackageImpl#getExit()
		 * @generated
		 */
		EClass EXIT = eINSTANCE.getExit();

		/**
		 * The meta object literal for the '{@link aredsl.LineKind <em>Line Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.LineKind
		 * @see aredsl.impl.AredslPackageImpl#getLineKind()
		 * @generated
		 */
		EEnum LINE_KIND = eINSTANCE.getLineKind();

		/**
		 * The meta object literal for the '{@link aredsl.ShapeKind <em>Shape Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.ShapeKind
		 * @see aredsl.impl.AredslPackageImpl#getShapeKind()
		 * @generated
		 */
		EEnum SHAPE_KIND = eINSTANCE.getShapeKind();

		/**
		 * The meta object literal for the '{@link aredsl.ContainmentKind <em>Containment Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.ContainmentKind
		 * @see aredsl.impl.AredslPackageImpl#getContainmentKind()
		 * @generated
		 */
		EEnum CONTAINMENT_KIND = eINSTANCE.getContainmentKind();

		/**
		 * The meta object literal for the '{@link aredsl.IntegrityRestrictionKind <em>Integrity Restriction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.IntegrityRestrictionKind
		 * @see aredsl.impl.AredslPackageImpl#getIntegrityRestrictionKind()
		 * @generated
		 */
		EEnum INTEGRITY_RESTRICTION_KIND = eINSTANCE.getIntegrityRestrictionKind();

		/**
		 * The meta object literal for the '{@link aredsl.QueryLanguageKind <em>Query Language Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.QueryLanguageKind
		 * @see aredsl.impl.AredslPackageImpl#getQueryLanguageKind()
		 * @generated
		 */
		EEnum QUERY_LANGUAGE_KIND = eINSTANCE.getQueryLanguageKind();

		/**
		 * The meta object literal for the '{@link aredsl.OutlineKind <em>Outline Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aredsl.OutlineKind
		 * @see aredsl.impl.AredslPackageImpl#getOutlineKind()
		 * @generated
		 */
		EEnum OUTLINE_KIND = eINSTANCE.getOutlineKind();

	}

} //AredslPackage
