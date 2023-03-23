/**
 */
package GraphQL;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see GraphQL.GraphQLFactory
 * @model kind="package"
 * @generated
 */
public interface GraphQLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GraphQL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/GraphQL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GraphQL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphQLPackage eINSTANCE = GraphQL.impl.GraphQLPackageImpl.init();

	/**
	 * The meta object id for the '{@link GraphQL.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.TypeImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.AttributeImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_NULLABLE = 2;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE_NAME = 3;

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
	 * The meta object id for the '{@link GraphQL.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.SchemaImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.ScalarTypeImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getScalarType()
	 * @generated
	 */
	int SCALAR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Scalar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scalar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.SystemTypeImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.IntImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getInt()
	 * @generated
	 */
	int INT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.FloatImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.StringImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getString()
	 * @generated
	 */
	int STRING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.BooleanImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.IDImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getID()
	 * @generated
	 */
	int ID = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.EnumImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Enumvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ENUMVALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.EnumValueImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link GraphQL.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see GraphQL.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphQL.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphQL.Type#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see GraphQL.Type#getAttribute()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Attribute();

	/**
	 * Returns the meta object for class '{@link GraphQL.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see GraphQL.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphQL.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Attribute#isIsArray <em>Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Array</em>'.
	 * @see GraphQL.Attribute#isIsArray()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsArray();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Attribute#isIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see GraphQL.Attribute#isIsNullable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsNullable();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Attribute#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see GraphQL.Attribute#getTypeName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_TypeName();

	/**
	 * Returns the meta object for class '{@link GraphQL.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see GraphQL.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphQL.Schema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see GraphQL.Schema#getType()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphQL.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for class '{@link GraphQL.ScalarType <em>Scalar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Type</em>'.
	 * @see GraphQL.ScalarType
	 * @generated
	 */
	EClass getScalarType();

	/**
	 * Returns the meta object for class '{@link GraphQL.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see GraphQL.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for class '{@link GraphQL.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see GraphQL.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for class '{@link GraphQL.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see GraphQL.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link GraphQL.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see GraphQL.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link GraphQL.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see GraphQL.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link GraphQL.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see GraphQL.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for class '{@link GraphQL.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see GraphQL.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphQL.Enum#getEnumvalue <em>Enumvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumvalue</em>'.
	 * @see GraphQL.Enum#getEnumvalue()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Enumvalue();

	/**
	 * Returns the meta object for class '{@link GraphQL.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see GraphQL.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.EnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GraphQL.EnumValue#getValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.EnumValue#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see GraphQL.EnumValue#getNumber()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Number();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphQLFactory getGraphQLFactory();

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
		 * The meta object literal for the '{@link GraphQL.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.TypeImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ATTRIBUTE = eINSTANCE.getType_Attribute();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.AttributeImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getAttribute()
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
		 * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ARRAY = eINSTANCE.getAttribute_IsArray();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_NULLABLE = eINSTANCE.getAttribute_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE_NAME = eINSTANCE.getAttribute_TypeName();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.SchemaImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TYPE = eINSTANCE.getSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.ScalarTypeImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getScalarType()
		 * @generated
		 */
		EClass SCALAR_TYPE = eINSTANCE.getScalarType();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.SystemTypeImpl <em>System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.SystemTypeImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getSystemType()
		 * @generated
		 */
		EClass SYSTEM_TYPE = eINSTANCE.getSystemType();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.IntImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.FloatImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.StringImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.BooleanImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.IDImpl <em>ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.IDImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.EnumImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Enumvalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__ENUMVALUE = eINSTANCE.getEnum_Enumvalue();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.EnumValueImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__NUMBER = eINSTANCE.getEnumValue_Number();

	}

} //GraphQLPackage
