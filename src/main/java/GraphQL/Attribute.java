/**
 */
package GraphQL;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GraphQL.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link GraphQL.Attribute#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link GraphQL.Attribute#isIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link GraphQL.Attribute#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see GraphQL.GraphQLPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GraphQL.GraphQLPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GraphQL.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Array</em>' attribute.
	 * @see #setIsArray(boolean)
	 * @see GraphQL.GraphQLPackage#getAttribute_IsArray()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsArray();

	/**
	 * Sets the value of the '{@link GraphQL.Attribute#isIsArray <em>Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Array</em>' attribute.
	 * @see #isIsArray()
	 * @generated
	 */
	void setIsArray(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(boolean)
	 * @see GraphQL.GraphQLPackage#getAttribute_IsNullable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsNullable();

	/**
	 * Sets the value of the '{@link GraphQL.Attribute#isIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #isIsNullable()
	 * @generated
	 */
	void setIsNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see GraphQL.GraphQLPackage#getAttribute_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link GraphQL.Attribute#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // Attribute
