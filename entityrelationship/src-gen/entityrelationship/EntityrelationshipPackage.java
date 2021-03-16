/**
 */
package entityrelationship;

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
 * @see entityrelationship.EntityrelationshipFactory
 * @model kind="package"
 * @generated
 */
public interface EntityrelationshipPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entityrelationship";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://aredsl.uca.es/entityrelationship";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "entityrelationship";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityrelationshipPackage eINSTANCE = entityrelationship.impl.EntityrelationshipPackageImpl.init();

	/**
	 * The meta object id for the '{@link entityrelationship.impl.ERModelImpl <em>ER Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.ERModelImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getERModel()
	 * @generated
	 */
	int ER_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Relantionships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL__RELANTIONSHIPS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>ER Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ER Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.EntityImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Is Weak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_WEAK = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.RelantionshipImpl <em>Relantionship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.RelantionshipImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getRelantionship()
	 * @generated
	 */
	int RELANTIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELANTIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELANTIONSHIP__SOURCE_CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELANTIONSHIP__TARGET_CARDINALITY = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELANTIONSHIP__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELANTIONSHIP__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELANTIONSHIP__ATTRIBUTES = 5;

	/**
	 * The number of structural features of the '<em>Relantionship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELANTIONSHIP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relantionship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELANTIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.AttributeImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_PRIMARY_KEY = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.DATATYPE <em>DATATYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.DATATYPE
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getDATATYPE()
	 * @generated
	 */
	int DATATYPE = 4;

	/**
	 * Returns the meta object for class '{@link entityrelationship.ERModel <em>ER Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ER Model</em>'.
	 * @see entityrelationship.ERModel
	 * @generated
	 */
	EClass getERModel();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.ERModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see entityrelationship.ERModel#getEntities()
	 * @see #getERModel()
	 * @generated
	 */
	EReference getERModel_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.ERModel#getRelantionships <em>Relantionships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relantionships</em>'.
	 * @see entityrelationship.ERModel#getRelantionships()
	 * @see #getERModel()
	 * @generated
	 */
	EReference getERModel_Relantionships();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.ERModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entityrelationship.ERModel#getName()
	 * @see #getERModel()
	 * @generated
	 */
	EAttribute getERModel_Name();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see entityrelationship.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entityrelationship.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see entityrelationship.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Entity#isIsWeak <em>Is Weak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Weak</em>'.
	 * @see entityrelationship.Entity#isIsWeak()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsWeak();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Relantionship <em>Relantionship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relantionship</em>'.
	 * @see entityrelationship.Relantionship
	 * @generated
	 */
	EClass getRelantionship();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Relantionship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entityrelationship.Relantionship#getName()
	 * @see #getRelantionship()
	 * @generated
	 */
	EAttribute getRelantionship_Name();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Relantionship#getSourceCardinality <em>Source Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Cardinality</em>'.
	 * @see entityrelationship.Relantionship#getSourceCardinality()
	 * @see #getRelantionship()
	 * @generated
	 */
	EAttribute getRelantionship_SourceCardinality();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Relantionship#getTargetCardinality <em>Target Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cardinality</em>'.
	 * @see entityrelationship.Relantionship#getTargetCardinality()
	 * @see #getRelantionship()
	 * @generated
	 */
	EAttribute getRelantionship_TargetCardinality();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Relantionship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see entityrelationship.Relantionship#getSource()
	 * @see #getRelantionship()
	 * @generated
	 */
	EReference getRelantionship_Source();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Relantionship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see entityrelationship.Relantionship#getTarget()
	 * @see #getRelantionship()
	 * @generated
	 */
	EReference getRelantionship_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Relantionship#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see entityrelationship.Relantionship#getAttributes()
	 * @see #getRelantionship()
	 * @generated
	 */
	EReference getRelantionship_Attributes();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see entityrelationship.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entityrelationship.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see entityrelationship.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Attribute#isForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see entityrelationship.Attribute#isForeignKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary Key</em>'.
	 * @see entityrelationship.Attribute#isIsPrimaryKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsPrimaryKey();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.DATATYPE <em>DATATYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DATATYPE</em>'.
	 * @see entityrelationship.DATATYPE
	 * @generated
	 */
	EEnum getDATATYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityrelationshipFactory getEntityrelationshipFactory();

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
		 * The meta object literal for the '{@link entityrelationship.impl.ERModelImpl <em>ER Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.ERModelImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getERModel()
		 * @generated
		 */
		EClass ER_MODEL = eINSTANCE.getERModel();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ER_MODEL__ENTITIES = eINSTANCE.getERModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Relantionships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ER_MODEL__RELANTIONSHIPS = eINSTANCE.getERModel_Relantionships();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ER_MODEL__NAME = eINSTANCE.getERModel_Name();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.EntityImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Is Weak</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_WEAK = eINSTANCE.getEntity_IsWeak();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.RelantionshipImpl <em>Relantionship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.RelantionshipImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getRelantionship()
		 * @generated
		 */
		EClass RELANTIONSHIP = eINSTANCE.getRelantionship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELANTIONSHIP__NAME = eINSTANCE.getRelantionship_Name();

		/**
		 * The meta object literal for the '<em><b>Source Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELANTIONSHIP__SOURCE_CARDINALITY = eINSTANCE.getRelantionship_SourceCardinality();

		/**
		 * The meta object literal for the '<em><b>Target Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELANTIONSHIP__TARGET_CARDINALITY = eINSTANCE.getRelantionship_TargetCardinality();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELANTIONSHIP__SOURCE = eINSTANCE.getRelantionship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELANTIONSHIP__TARGET = eINSTANCE.getRelantionship_Target();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELANTIONSHIP__ATTRIBUTES = eINSTANCE.getRelantionship_Attributes();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.AttributeImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__FOREIGN_KEY = eINSTANCE.getAttribute_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>Is Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_PRIMARY_KEY = eINSTANCE.getAttribute_IsPrimaryKey();

		/**
		 * The meta object literal for the '{@link entityrelationship.DATATYPE <em>DATATYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.DATATYPE
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getDATATYPE()
		 * @generated
		 */
		EEnum DATATYPE = eINSTANCE.getDATATYPE();

	}

} //EntityrelationshipPackage
