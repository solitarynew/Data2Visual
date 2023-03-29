/**
 */
package GraphQL.impl;

import GraphQL.Attribute;
import GraphQL.Directive;
import GraphQL.GraphQLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GraphQL.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link GraphQL.impl.AttributeImpl#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link GraphQL.impl.AttributeImpl#isIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link GraphQL.impl.AttributeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link GraphQL.impl.AttributeImpl#isIsNullableInArray <em>Is Nullable In Array</em>}</li>
 *   <li>{@link GraphQL.impl.AttributeImpl#getDirective <em>Directive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsArray() <em>Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsArray() <em>Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArray()
	 * @generated
	 * @ordered
	 */
	protected boolean isArray = IS_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNullable = IS_NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNullableInArray() <em>Is Nullable In Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNullableInArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULLABLE_IN_ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNullableInArray() <em>Is Nullable In Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNullableInArray()
	 * @generated
	 * @ordered
	 */
	protected boolean isNullableInArray = IS_NULLABLE_IN_ARRAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirective() <em>Directive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirective()
	 * @generated
	 * @ordered
	 */
	protected EList<Directive> directive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphQLPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsArray() {
		return isArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsArray(boolean newIsArray) {
		boolean oldIsArray = isArray;
		isArray = newIsArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.ATTRIBUTE__IS_ARRAY, oldIsArray, isArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNullable() {
		return isNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNullable(boolean newIsNullable) {
		boolean oldIsNullable = isNullable;
		isNullable = newIsNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.ATTRIBUTE__IS_NULLABLE, oldIsNullable, isNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.ATTRIBUTE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNullableInArray() {
		return isNullableInArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNullableInArray(boolean newIsNullableInArray) {
		boolean oldIsNullableInArray = isNullableInArray;
		isNullableInArray = newIsNullableInArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.ATTRIBUTE__IS_NULLABLE_IN_ARRAY, oldIsNullableInArray, isNullableInArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directive> getDirective() {
		if (directive == null) {
			directive = new EObjectContainmentEList<Directive>(Directive.class, this, GraphQLPackage.ATTRIBUTE__DIRECTIVE);
		}
		return directive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphQLPackage.ATTRIBUTE__DIRECTIVE:
				return ((InternalEList<?>)getDirective()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphQLPackage.ATTRIBUTE__NAME:
				return getName();
			case GraphQLPackage.ATTRIBUTE__IS_ARRAY:
				return isIsArray();
			case GraphQLPackage.ATTRIBUTE__IS_NULLABLE:
				return isIsNullable();
			case GraphQLPackage.ATTRIBUTE__TYPE_NAME:
				return getTypeName();
			case GraphQLPackage.ATTRIBUTE__IS_NULLABLE_IN_ARRAY:
				return isIsNullableInArray();
			case GraphQLPackage.ATTRIBUTE__DIRECTIVE:
				return getDirective();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphQLPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case GraphQLPackage.ATTRIBUTE__IS_ARRAY:
				setIsArray((Boolean)newValue);
				return;
			case GraphQLPackage.ATTRIBUTE__IS_NULLABLE:
				setIsNullable((Boolean)newValue);
				return;
			case GraphQLPackage.ATTRIBUTE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case GraphQLPackage.ATTRIBUTE__IS_NULLABLE_IN_ARRAY:
				setIsNullableInArray((Boolean)newValue);
				return;
			case GraphQLPackage.ATTRIBUTE__DIRECTIVE:
				getDirective().clear();
				getDirective().addAll((Collection<? extends Directive>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphQLPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphQLPackage.ATTRIBUTE__IS_ARRAY:
				setIsArray(IS_ARRAY_EDEFAULT);
				return;
			case GraphQLPackage.ATTRIBUTE__IS_NULLABLE:
				setIsNullable(IS_NULLABLE_EDEFAULT);
				return;
			case GraphQLPackage.ATTRIBUTE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case GraphQLPackage.ATTRIBUTE__IS_NULLABLE_IN_ARRAY:
				setIsNullableInArray(IS_NULLABLE_IN_ARRAY_EDEFAULT);
				return;
			case GraphQLPackage.ATTRIBUTE__DIRECTIVE:
				getDirective().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphQLPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphQLPackage.ATTRIBUTE__IS_ARRAY:
				return isArray != IS_ARRAY_EDEFAULT;
			case GraphQLPackage.ATTRIBUTE__IS_NULLABLE:
				return isNullable != IS_NULLABLE_EDEFAULT;
			case GraphQLPackage.ATTRIBUTE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case GraphQLPackage.ATTRIBUTE__IS_NULLABLE_IN_ARRAY:
				return isNullableInArray != IS_NULLABLE_IN_ARRAY_EDEFAULT;
			case GraphQLPackage.ATTRIBUTE__DIRECTIVE:
				return directive != null && !directive.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isArray: ");
		result.append(isArray);
		result.append(", isNullable: ");
		result.append(isNullable);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", isNullableInArray: ");
		result.append(isNullableInArray);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
