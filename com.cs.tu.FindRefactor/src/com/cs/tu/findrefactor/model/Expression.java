/**
 */
package com.cs.tu.findrefactor.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cs.tu.findrefactor.model.Expression#getExpressionName <em>Expression Name</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.Expression#isIsIdentifier <em>Is Identifier</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.Expression#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.cs.tu.findrefactor.model.CfgPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Name</em>' attribute.
	 * @see #setExpressionName(String)
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getExpression_ExpressionName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getExpressionName();

	/**
	 * Sets the value of the '{@link com.cs.tu.findrefactor.model.Expression#getExpressionName <em>Expression Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Name</em>' attribute.
	 * @see #getExpressionName()
	 * @generated
	 */
	void setExpressionName(String value);

	/**
	 * Returns the value of the '<em><b>Is Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Identifier</em>' attribute.
	 * @see #setIsIdentifier(boolean)
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getExpression_IsIdentifier()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsIdentifier();

	/**
	 * Sets the value of the '{@link com.cs.tu.findrefactor.model.Expression#isIsIdentifier <em>Is Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Identifier</em>' attribute.
	 * @see #isIsIdentifier()
	 * @generated
	 */
	void setIsIdentifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Inner Expression</b></em>' containment reference list.
	 * The list contents are of type {@link com.cs.tu.findrefactor.model.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Expression</em>' containment reference list.
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getExpression_InnerExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getInnerExpression();

} // Expression
