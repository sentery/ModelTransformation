/**
 */
package com.cs.tu.findrefactor.model.impl;

import com.cs.tu.findrefactor.model.Expression;
import com.cs.tu.findrefactor.model.CfgPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.ExpressionImpl#getExpressionName <em>Expression Name</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.ExpressionImpl#isIsIdentifier <em>Is Identifier</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.ExpressionImpl#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends EObjectImpl implements Expression {
	/**
	 * The default value of the '{@link #getExpressionName() <em>Expression Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionName() <em>Expression Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionName()
	 * @generated
	 * @ordered
	 */
	protected String expressionName = EXPRESSION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsIdentifier() <em>Is Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IDENTIFIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIdentifier() <em>Is Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIdentifier()
	 * @generated
	 * @ordered
	 */
	protected boolean isIdentifier = IS_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInnerExpression() <em>Inner Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> innerExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfgPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionName() {
		return expressionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionName(String newExpressionName) {
		String oldExpressionName = expressionName;
		expressionName = newExpressionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.EXPRESSION__EXPRESSION_NAME, oldExpressionName, expressionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIdentifier() {
		return isIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIdentifier(boolean newIsIdentifier) {
		boolean oldIsIdentifier = isIdentifier;
		isIdentifier = newIsIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.EXPRESSION__IS_IDENTIFIER, oldIsIdentifier, isIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getInnerExpression() {
		if (innerExpression == null) {
			innerExpression = new EObjectContainmentEList<Expression>(Expression.class, this, CfgPackage.EXPRESSION__INNER_EXPRESSION);
		}
		return innerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfgPackage.EXPRESSION__INNER_EXPRESSION:
				return ((InternalEList<?>)getInnerExpression()).basicRemove(otherEnd, msgs);
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
			case CfgPackage.EXPRESSION__EXPRESSION_NAME:
				return getExpressionName();
			case CfgPackage.EXPRESSION__IS_IDENTIFIER:
				return isIsIdentifier();
			case CfgPackage.EXPRESSION__INNER_EXPRESSION:
				return getInnerExpression();
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
			case CfgPackage.EXPRESSION__EXPRESSION_NAME:
				setExpressionName((String)newValue);
				return;
			case CfgPackage.EXPRESSION__IS_IDENTIFIER:
				setIsIdentifier((Boolean)newValue);
				return;
			case CfgPackage.EXPRESSION__INNER_EXPRESSION:
				getInnerExpression().clear();
				getInnerExpression().addAll((Collection<? extends Expression>)newValue);
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
			case CfgPackage.EXPRESSION__EXPRESSION_NAME:
				setExpressionName(EXPRESSION_NAME_EDEFAULT);
				return;
			case CfgPackage.EXPRESSION__IS_IDENTIFIER:
				setIsIdentifier(IS_IDENTIFIER_EDEFAULT);
				return;
			case CfgPackage.EXPRESSION__INNER_EXPRESSION:
				getInnerExpression().clear();
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
			case CfgPackage.EXPRESSION__EXPRESSION_NAME:
				return EXPRESSION_NAME_EDEFAULT == null ? expressionName != null : !EXPRESSION_NAME_EDEFAULT.equals(expressionName);
			case CfgPackage.EXPRESSION__IS_IDENTIFIER:
				return isIdentifier != IS_IDENTIFIER_EDEFAULT;
			case CfgPackage.EXPRESSION__INNER_EXPRESSION:
				return innerExpression != null && !innerExpression.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expressionName: ");
		result.append(expressionName);
		result.append(", isIdentifier: ");
		result.append(isIdentifier);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
