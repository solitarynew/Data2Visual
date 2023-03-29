/**
 */
package GraphQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GraphQL.InterfaceType#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see GraphQL.GraphQLPackage#getInterfaceType()
 * @model
 * @generated
 */
public interface InterfaceType extends Type {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link GraphQL.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see GraphQL.GraphQLPackage#getInterfaceType_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // InterfaceType
