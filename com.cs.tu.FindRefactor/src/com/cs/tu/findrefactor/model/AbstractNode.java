/**
 */
package com.cs.tu.findrefactor.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cs.tu.findrefactor.model.AbstractNode#getFromNode <em>From Node</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.AbstractNode#getToNode <em>To Node</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.AbstractNode#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.AbstractNode#getName <em>Name</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.AbstractNode#getVar <em>Var</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.AbstractNode#getDataFlow <em>Data Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.cs.tu.findrefactor.model.CfgPackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends EObject {
	/**
	 * Returns the value of the '<em><b>From Node</b></em>' reference list.
	 * The list contents are of type {@link com.cs.tu.findrefactor.model.AbstractNode}.
	 * It is bidirectional and its opposite is '{@link com.cs.tu.findrefactor.model.AbstractNode#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node</em>' reference list.
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getAbstractNode_FromNode()
	 * @see com.cs.tu.findrefactor.model.AbstractNode#getToNode
	 * @model opposite="toNode" ordered="false"
	 * @generated
	 */
	EList<AbstractNode> getFromNode();

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.cs.tu.findrefactor.model.AbstractNode#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' reference.
	 * @see #setToNode(AbstractNode)
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getAbstractNode_ToNode()
	 * @see com.cs.tu.findrefactor.model.AbstractNode#getFromNode
	 * @model opposite="fromNode" ordered="false"
	 * @generated
	 */
	AbstractNode getToNode();

	/**
	 * Sets the value of the '{@link com.cs.tu.findrefactor.model.AbstractNode#getToNode <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' reference.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getAbstractNode_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link com.cs.tu.findrefactor.model.AbstractNode#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getAbstractNode_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.cs.tu.findrefactor.model.AbstractNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link com.cs.tu.findrefactor.model.Var}.
	 * It is bidirectional and its opposite is '{@link com.cs.tu.findrefactor.model.Var#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getAbstractNode_Var()
	 * @see com.cs.tu.findrefactor.model.Var#getNodes
	 * @model opposite="nodes" containment="true"
	 * @generated
	 */
	EList<Var> getVar();

	/**
	 * Returns the value of the '<em><b>Data Flow</b></em>' reference list.
	 * The list contents are of type {@link com.cs.tu.findrefactor.model.AbstractNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flow</em>' reference list.
	 * @see com.cs.tu.findrefactor.model.CfgPackage#getAbstractNode_DataFlow()
	 * @model
	 * @generated
	 */
	EList<AbstractNode> getDataFlow();

} // AbstractNode
