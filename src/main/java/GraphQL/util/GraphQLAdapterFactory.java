/**
 */
package GraphQL.util;

import GraphQL.Attribute;
import GraphQL.EnumValue;
import GraphQL.GraphQLPackage;
import GraphQL.ID;
import GraphQL.Int;
import GraphQL.ScalarType;
import GraphQL.Schema;
import GraphQL.SystemType;
import GraphQL.Type;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GraphQL.GraphQLPackage
 * @generated
 */
public class GraphQLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphQLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphQLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GraphQLPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphQLSwitch<Adapter> modelSwitch =
		new GraphQLSwitch<Adapter>() {
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseScalarType(ScalarType object) {
				return createScalarTypeAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseInt(Int object) {
				return createIntAdapter();
			}
			@Override
			public Adapter caseFloat(GraphQL.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseString(GraphQL.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseBoolean(GraphQL.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseID(ID object) {
				return createIDAdapter();
			}
			@Override
			public Adapter caseEnum(GraphQL.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object) {
				return createEnumValueAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.ScalarType <em>Scalar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.ScalarType
	 * @generated
	 */
	public Adapter createScalarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.Int
	 * @generated
	 */
	public Adapter createIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.ID
	 * @generated
	 */
	public Adapter createIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GraphQL.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GraphQL.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
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

} //GraphQLAdapterFactory
