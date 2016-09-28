/**
 */
package com.cs.tu.findrefactor.model.impl;

import com.cs.tu.findrefactor.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CfgFactoryImpl extends EFactoryImpl implements CfgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CfgFactory init() {
		try {
			CfgFactory thecfgFactory = (CfgFactory)EPackage.Registry.INSTANCE.getEFactory("www.cs.tu.ac.th"); 
			if (thecfgFactory != null) {
				return thecfgFactory;
			}
		}
		catch (Exception exception) {
			exception.printStackTrace();
//			EcorePlugin.INSTANCE.log(exception);
		}
		return new CfgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CfgPackage.MCONTROL_FLOW_GRAPH: return createMControlFlowGraph();
			case CfgPackage.NODE: return createNode();
			case CfgPackage.CONDITIONAL_NODE: return createConditionalNode();
			case CfgPackage.ITERATIVE_NODE: return createIterativeNode();
			case CfgPackage.EXPRESSION: return createExpression();
			case CfgPackage.VAR: return createVar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MControlFlowGraph createMControlFlowGraph() {
		MControlFlowGraphImpl mControlFlowGraph = new MControlFlowGraphImpl();
		return mControlFlowGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode createConditionalNode() {
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterativeNode createIterativeNode() {
		IterativeNodeImpl iterativeNode = new IterativeNodeImpl();
		return iterativeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var createVar() {
		VarImpl var = new VarImpl();
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfgPackage getcfgPackage() {
		return (CfgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CfgPackage getPackage() {
		return CfgPackage.eINSTANCE;
	}

} //cfgFactoryImpl
