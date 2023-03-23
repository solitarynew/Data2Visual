/**
 */
package GraphQL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GraphQL.GraphQLPackage
 * @generated
 */
public interface GraphQLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphQLFactory eINSTANCE = GraphQL.impl.GraphQLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Type</em>'.
	 * @generated
	 */
	SystemType createSystemType();

	/**
	 * Returns a new object of class '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int</em>'.
	 * @generated
	 */
	Int createInt();

	/**
	 * Returns a new object of class '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float</em>'.
	 * @generated
	 */
	Float createFloat();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ID</em>'.
	 * @generated
	 */
	ID createID();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphQLPackage getGraphQLPackage();

} //GraphQLFactory
