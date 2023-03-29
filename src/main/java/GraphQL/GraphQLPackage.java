/**
 */
package GraphQL;

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
	 * The feature id for the '<em><b>Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DIRECTIVE = 1;

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
	 * The feature id for the '<em><b>Is Nullable In Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_NULLABLE_IN_ARRAY = 4;

	/**
	 * The feature id for the '<em><b>Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DIRECTIVE = 5;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 6;

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
	 * The meta object id for the '{@link GraphQL.impl.DirectiveImpl <em>Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.DirectiveImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getDirective()
	 * @generated
	 */
	int DIRECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__ARGUMENT = 1;

	/**
	 * The number of structural features of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.ArgumentImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.ObjectTypeImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DIRECTIVE = TYPE__DIRECTIVE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ATTRIBUTE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.InterfaceTypeImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__DIRECTIVE = TYPE__DIRECTIVE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ATTRIBUTE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.EnumTypeImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DIRECTIVE = TYPE__DIRECTIVE;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphQL.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphQL.impl.ScalarTypeImpl
	 * @see GraphQL.impl.GraphQLPackageImpl#getScalarType()
	 * @generated
	 */
	int SCALAR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE__DIRECTIVE = TYPE__DIRECTIVE;

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
	 * Returns the meta object for the containment reference list '{@link GraphQL.Type#getDirective <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directive</em>'.
	 * @see GraphQL.Type#getDirective()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Directive();

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
	 * Returns the meta object for the attribute '{@link GraphQL.Attribute#isIsNullableInArray <em>Is Nullable In Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable In Array</em>'.
	 * @see GraphQL.Attribute#isIsNullableInArray()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsNullableInArray();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphQL.Attribute#getDirective <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directive</em>'.
	 * @see GraphQL.Attribute#getDirective()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Directive();

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
	 * Returns the meta object for class '{@link GraphQL.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directive</em>'.
	 * @see GraphQL.Directive
	 * @generated
	 */
	EClass getDirective();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Directive#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphQL.Directive#getName()
	 * @see #getDirective()
	 * @generated
	 */
	EAttribute getDirective_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphQL.Directive#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see GraphQL.Directive#getArgument()
	 * @see #getDirective()
	 * @generated
	 */
	EReference getDirective_Argument();

	/**
	 * Returns the meta object for class '{@link GraphQL.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see GraphQL.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphQL.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link GraphQL.Argument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GraphQL.Argument#getValue()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Value();

	/**
	 * Returns the meta object for class '{@link GraphQL.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see GraphQL.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphQL.ObjectType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see GraphQL.ObjectType#getAttribute()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Attribute();

	/**
	 * Returns the meta object for class '{@link GraphQL.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see GraphQL.InterfaceType
	 * @generated
	 */
	EClass getInterfaceType();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphQL.InterfaceType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see GraphQL.InterfaceType#getAttribute()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Attribute();

	/**
	 * Returns the meta object for class '{@link GraphQL.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see GraphQL.EnumType
	 * @generated
	 */
	EClass getEnumType();

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
		 * The meta object literal for the '<em><b>Directive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__DIRECTIVE = eINSTANCE.getType_Directive();

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
		 * The meta object literal for the '<em><b>Is Nullable In Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_NULLABLE_IN_ARRAY = eINSTANCE.getAttribute_IsNullableInArray();

		/**
		 * The meta object literal for the '<em><b>Directive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DIRECTIVE = eINSTANCE.getAttribute_Directive();

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
		 * The meta object literal for the '{@link GraphQL.impl.DirectiveImpl <em>Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.DirectiveImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getDirective()
		 * @generated
		 */
		EClass DIRECTIVE = eINSTANCE.getDirective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTIVE__NAME = eINSTANCE.getDirective_Name();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE__ARGUMENT = eINSTANCE.getDirective_Argument();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.ArgumentImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.ObjectTypeImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__ATTRIBUTE = eINSTANCE.getObjectType_Attribute();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.InterfaceTypeImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getInterfaceType()
		 * @generated
		 */
		EClass INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__ATTRIBUTE = eINSTANCE.getInterfaceType_Attribute();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.EnumTypeImpl <em>Enum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.EnumTypeImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getEnumType()
		 * @generated
		 */
		EClass ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '{@link GraphQL.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphQL.impl.ScalarTypeImpl
		 * @see GraphQL.impl.GraphQLPackageImpl#getScalarType()
		 * @generated
		 */
		EClass SCALAR_TYPE = eINSTANCE.getScalarType();

	}

} //GraphQLPackage
