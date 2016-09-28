/**
 */
package com.cs.tu.findrefactor.model;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.cs.tu.findrefactor.model.CfgFactory
 * @model kind="package"
 * @generated
 */
public interface CfgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CFG";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.cs.tu.ac.th";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CfgPackage eINSTANCE = com.cs.tu.findrefactor.model.impl.CfgPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl <em>MControl Flow Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl
	 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getMControlFlowGraph()
	 * @generated
	 */
	int MCONTROL_FLOW_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FLOW_GRAPH__NODES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FLOW_GRAPH__NAME = 1;

	/**
	 * The feature id for the '<em><b>Local Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FLOW_GRAPH__LOCAL_VAR = 2;

	/**
	 * The number of structural features of the '<em>MControl Flow Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FLOW_GRAPH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.cs.tu.findrefactor.model.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.findrefactor.model.impl.AbstractNodeImpl
	 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 1;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__FROM_NODE = 0;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__TO_NODE = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__VAR = 4;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__DATA_FLOW = 5;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.cs.tu.findrefactor.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.findrefactor.model.impl.NodeImpl
	 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FROM_NODE = ABSTRACT_NODE__FROM_NODE;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TO_NODE = ABSTRACT_NODE__TO_NODE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EXPRESSION = ABSTRACT_NODE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VAR = ABSTRACT_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DATA_FLOW = ABSTRACT_NODE__DATA_FLOW;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cs.tu.findrefactor.model.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.findrefactor.model.impl.ConditionalNodeImpl
	 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 3;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__FROM_NODE = ABSTRACT_NODE__FROM_NODE;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__TO_NODE = ABSTRACT_NODE__TO_NODE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__EXPRESSION = ABSTRACT_NODE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__VAR = ABSTRACT_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__DATA_FLOW = ABSTRACT_NODE__DATA_FLOW;

	/**
	 * The feature id for the '<em><b>True Condition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__TRUE_CONDITION_NODE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Condition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__FALSE_CONDITION_NODE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.cs.tu.findrefactor.model.impl.IterativeNodeImpl <em>Iterative Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.findrefactor.model.impl.IterativeNodeImpl
	 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getIterativeNode()
	 * @generated
	 */
	int ITERATIVE_NODE = 4;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__FROM_NODE = ABSTRACT_NODE__FROM_NODE;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__TO_NODE = ABSTRACT_NODE__TO_NODE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__EXPRESSION = ABSTRACT_NODE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__VAR = ABSTRACT_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__DATA_FLOW = ABSTRACT_NODE__DATA_FLOW;

	/**
	 * The feature id for the '<em><b>True Condition Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__TRUE_CONDITION_NODE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Condition Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__FALSE_CONDITION_NODE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__NODES = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iterative Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.cs.tu.findrefactor.model.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.findrefactor.model.impl.ExpressionImpl
	 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Expression Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Inner Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INNER_EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.cs.tu.findrefactor.model.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.findrefactor.model.impl.VarImpl
	 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' container reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__NODES = 2;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link com.cs.tu.findrefactor.model.MControlFlowGraph <em>MControl Flow Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MControl Flow Graph</em>'.
	 * @see com.cs.tu.findrefactor.model.MControlFlowGraph
	 * @generated
	 */
	EClass getMControlFlowGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cs.tu.findrefactor.model.MControlFlowGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see com.cs.tu.findrefactor.model.MControlFlowGraph#getNodes()
	 * @see #getMControlFlowGraph()
	 * @generated
	 */
	EReference getMControlFlowGraph_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.findrefactor.model.MControlFlowGraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cs.tu.findrefactor.model.MControlFlowGraph#getName()
	 * @see #getMControlFlowGraph()
	 * @generated
	 */
	EAttribute getMControlFlowGraph_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cs.tu.findrefactor.model.MControlFlowGraph#getLocalVar <em>Local Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Var</em>'.
	 * @see com.cs.tu.findrefactor.model.MControlFlowGraph#getLocalVar()
	 * @see #getMControlFlowGraph()
	 * @generated
	 */
	EReference getMControlFlowGraph_LocalVar();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.findrefactor.model.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see com.cs.tu.findrefactor.model.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the reference list '{@link com.cs.tu.findrefactor.model.AbstractNode#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Node</em>'.
	 * @see com.cs.tu.findrefactor.model.AbstractNode#getFromNode()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_FromNode();

	/**
	 * Returns the meta object for the reference '{@link com.cs.tu.findrefactor.model.AbstractNode#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Node</em>'.
	 * @see com.cs.tu.findrefactor.model.AbstractNode#getToNode()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_ToNode();

	/**
	 * Returns the meta object for the containment reference '{@link com.cs.tu.findrefactor.model.AbstractNode#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.cs.tu.findrefactor.model.AbstractNode#getExpression()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_Expression();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.findrefactor.model.AbstractNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cs.tu.findrefactor.model.AbstractNode#getName()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cs.tu.findrefactor.model.AbstractNode#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see com.cs.tu.findrefactor.model.AbstractNode#getVar()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_Var();

	/**
	 * Returns the meta object for the reference list '{@link com.cs.tu.findrefactor.model.AbstractNode#getDataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Flow</em>'.
	 * @see com.cs.tu.findrefactor.model.AbstractNode#getDataFlow()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_DataFlow();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.findrefactor.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.cs.tu.findrefactor.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.findrefactor.model.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see com.cs.tu.findrefactor.model.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for the containment reference '{@link com.cs.tu.findrefactor.model.ConditionalNode#getTrueConditionNode <em>True Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>True Condition Node</em>'.
	 * @see com.cs.tu.findrefactor.model.ConditionalNode#getTrueConditionNode()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_TrueConditionNode();

	/**
	 * Returns the meta object for the containment reference '{@link com.cs.tu.findrefactor.model.ConditionalNode#getFalseConditionNode <em>False Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>False Condition Node</em>'.
	 * @see com.cs.tu.findrefactor.model.ConditionalNode#getFalseConditionNode()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_FalseConditionNode();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.findrefactor.model.IterativeNode <em>Iterative Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterative Node</em>'.
	 * @see com.cs.tu.findrefactor.model.IterativeNode
	 * @generated
	 */
	EClass getIterativeNode();

	/**
	 * Returns the meta object for the reference '{@link com.cs.tu.findrefactor.model.IterativeNode#getTrueConditionNode <em>True Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>True Condition Node</em>'.
	 * @see com.cs.tu.findrefactor.model.IterativeNode#getTrueConditionNode()
	 * @see #getIterativeNode()
	 * @generated
	 */
	EReference getIterativeNode_TrueConditionNode();

	/**
	 * Returns the meta object for the reference '{@link com.cs.tu.findrefactor.model.IterativeNode#getFalseConditionNode <em>False Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>False Condition Node</em>'.
	 * @see com.cs.tu.findrefactor.model.IterativeNode#getFalseConditionNode()
	 * @see #getIterativeNode()
	 * @generated
	 */
	EReference getIterativeNode_FalseConditionNode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cs.tu.findrefactor.model.IterativeNode#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see com.cs.tu.findrefactor.model.IterativeNode#getNodes()
	 * @see #getIterativeNode()
	 * @generated
	 */
	EReference getIterativeNode_Nodes();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.findrefactor.model.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see com.cs.tu.findrefactor.model.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.findrefactor.model.Expression#getExpressionName <em>Expression Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Name</em>'.
	 * @see com.cs.tu.findrefactor.model.Expression#getExpressionName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ExpressionName();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.findrefactor.model.Expression#isIsIdentifier <em>Is Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Identifier</em>'.
	 * @see com.cs.tu.findrefactor.model.Expression#isIsIdentifier()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_IsIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cs.tu.findrefactor.model.Expression#getInnerExpression <em>Inner Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Expression</em>'.
	 * @see com.cs.tu.findrefactor.model.Expression#getInnerExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_InnerExpression();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.findrefactor.model.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see com.cs.tu.findrefactor.model.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.findrefactor.model.Var#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cs.tu.findrefactor.model.Var#getName()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.cs.tu.findrefactor.model.Var#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see com.cs.tu.findrefactor.model.Var#getMethod()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Method();

	/**
	 * Returns the meta object for the container reference list '{@link com.cs.tu.findrefactor.model.Var#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference list '<em>Nodes</em>'.
	 * @see com.cs.tu.findrefactor.model.Var#getNodes()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Nodes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CfgFactory getcfgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl <em>MControl Flow Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl
		 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getMControlFlowGraph()
		 * @generated
		 */
		EClass MCONTROL_FLOW_GRAPH = eINSTANCE.getMControlFlowGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONTROL_FLOW_GRAPH__NODES = eINSTANCE.getMControlFlowGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCONTROL_FLOW_GRAPH__NAME = eINSTANCE.getMControlFlowGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Local Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONTROL_FLOW_GRAPH__LOCAL_VAR = eINSTANCE.getMControlFlowGraph_LocalVar();

		/**
		 * The meta object literal for the '{@link com.cs.tu.findrefactor.model.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.findrefactor.model.impl.AbstractNodeImpl
		 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>From Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__FROM_NODE = eINSTANCE.getAbstractNode_FromNode();

		/**
		 * The meta object literal for the '<em><b>To Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__TO_NODE = eINSTANCE.getAbstractNode_ToNode();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__EXPRESSION = eINSTANCE.getAbstractNode_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__NAME = eINSTANCE.getAbstractNode_Name();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__VAR = eINSTANCE.getAbstractNode_Var();

		/**
		 * The meta object literal for the '<em><b>Data Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__DATA_FLOW = eINSTANCE.getAbstractNode_DataFlow();

		/**
		 * The meta object literal for the '{@link com.cs.tu.findrefactor.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.findrefactor.model.impl.NodeImpl
		 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link com.cs.tu.findrefactor.model.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.findrefactor.model.impl.ConditionalNodeImpl
		 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getConditionalNode()
		 * @generated
		 */
		EClass CONDITIONAL_NODE = eINSTANCE.getConditionalNode();

		/**
		 * The meta object literal for the '<em><b>True Condition Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__TRUE_CONDITION_NODE = eINSTANCE.getConditionalNode_TrueConditionNode();

		/**
		 * The meta object literal for the '<em><b>False Condition Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__FALSE_CONDITION_NODE = eINSTANCE.getConditionalNode_FalseConditionNode();

		/**
		 * The meta object literal for the '{@link com.cs.tu.findrefactor.model.impl.IterativeNodeImpl <em>Iterative Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.findrefactor.model.impl.IterativeNodeImpl
		 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getIterativeNode()
		 * @generated
		 */
		EClass ITERATIVE_NODE = eINSTANCE.getIterativeNode();

		/**
		 * The meta object literal for the '<em><b>True Condition Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATIVE_NODE__TRUE_CONDITION_NODE = eINSTANCE.getIterativeNode_TrueConditionNode();

		/**
		 * The meta object literal for the '<em><b>False Condition Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATIVE_NODE__FALSE_CONDITION_NODE = eINSTANCE.getIterativeNode_FalseConditionNode();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATIVE_NODE__NODES = eINSTANCE.getIterativeNode_Nodes();

		/**
		 * The meta object literal for the '{@link com.cs.tu.findrefactor.model.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.findrefactor.model.impl.ExpressionImpl
		 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expression Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESSION_NAME = eINSTANCE.getExpression_ExpressionName();

		/**
		 * The meta object literal for the '<em><b>Is Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__IS_IDENTIFIER = eINSTANCE.getExpression_IsIdentifier();

		/**
		 * The meta object literal for the '<em><b>Inner Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__INNER_EXPRESSION = eINSTANCE.getExpression_InnerExpression();

		/**
		 * The meta object literal for the '{@link com.cs.tu.findrefactor.model.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.findrefactor.model.impl.VarImpl
		 * @see com.cs.tu.findrefactor.model.impl.CfgPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__NAME = eINSTANCE.getVar_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__METHOD = eINSTANCE.getVar_Method();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' container reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__NODES = eINSTANCE.getVar_Nodes();

	}

} //cfgPackage
