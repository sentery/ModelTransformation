/**
 */
package com.cs.tu.findrefactor.model.impl;

import com.cs.tu.findrefactor.model.AbstractNode;
import com.cs.tu.findrefactor.model.IterativeNode;
import com.cs.tu.findrefactor.model.Node;
import com.cs.tu.findrefactor.model.CfgPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterative Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.IterativeNodeImpl#getTrueConditionNode <em>True Condition Node</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.IterativeNodeImpl#getFalseConditionNode <em>False Condition Node</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.IterativeNodeImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterativeNodeImpl extends AbstractNodeImpl implements IterativeNode {
	/**
	 * The cached value of the '{@link #getTrueConditionNode() <em>True Condition Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueConditionNode()
	 * @generated
	 * @ordered
	 */
	protected Node trueConditionNode;

	/**
	 * The cached value of the '{@link #getFalseConditionNode() <em>False Condition Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseConditionNode()
	 * @generated
	 * @ordered
	 */
	protected Node falseConditionNode;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterativeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfgPackage.Literals.ITERATIVE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTrueConditionNode() {
		if (trueConditionNode != null && trueConditionNode.eIsProxy()) {
			InternalEObject oldTrueConditionNode = (InternalEObject)trueConditionNode;
			trueConditionNode = (Node)eResolveProxy(oldTrueConditionNode);
			if (trueConditionNode != oldTrueConditionNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CfgPackage.ITERATIVE_NODE__TRUE_CONDITION_NODE, oldTrueConditionNode, trueConditionNode));
			}
		}
		return trueConditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTrueConditionNode() {
		return trueConditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueConditionNode(Node newTrueConditionNode) {
		Node oldTrueConditionNode = trueConditionNode;
		trueConditionNode = newTrueConditionNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.ITERATIVE_NODE__TRUE_CONDITION_NODE, oldTrueConditionNode, trueConditionNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFalseConditionNode() {
		if (falseConditionNode != null && falseConditionNode.eIsProxy()) {
			InternalEObject oldFalseConditionNode = (InternalEObject)falseConditionNode;
			falseConditionNode = (Node)eResolveProxy(oldFalseConditionNode);
			if (falseConditionNode != oldFalseConditionNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CfgPackage.ITERATIVE_NODE__FALSE_CONDITION_NODE, oldFalseConditionNode, falseConditionNode));
			}
		}
		return falseConditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFalseConditionNode() {
		return falseConditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseConditionNode(Node newFalseConditionNode) {
		Node oldFalseConditionNode = falseConditionNode;
		falseConditionNode = newFalseConditionNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.ITERATIVE_NODE__FALSE_CONDITION_NODE, oldFalseConditionNode, falseConditionNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<AbstractNode>(AbstractNode.class, this, CfgPackage.ITERATIVE_NODE__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfgPackage.ITERATIVE_NODE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
			case CfgPackage.ITERATIVE_NODE__TRUE_CONDITION_NODE:
				if (resolve) return getTrueConditionNode();
				return basicGetTrueConditionNode();
			case CfgPackage.ITERATIVE_NODE__FALSE_CONDITION_NODE:
				if (resolve) return getFalseConditionNode();
				return basicGetFalseConditionNode();
			case CfgPackage.ITERATIVE_NODE__NODES:
				return getNodes();
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
			case CfgPackage.ITERATIVE_NODE__TRUE_CONDITION_NODE:
				setTrueConditionNode((Node)newValue);
				return;
			case CfgPackage.ITERATIVE_NODE__FALSE_CONDITION_NODE:
				setFalseConditionNode((Node)newValue);
				return;
			case CfgPackage.ITERATIVE_NODE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends AbstractNode>)newValue);
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
			case CfgPackage.ITERATIVE_NODE__TRUE_CONDITION_NODE:
				setTrueConditionNode((Node)null);
				return;
			case CfgPackage.ITERATIVE_NODE__FALSE_CONDITION_NODE:
				setFalseConditionNode((Node)null);
				return;
			case CfgPackage.ITERATIVE_NODE__NODES:
				getNodes().clear();
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
			case CfgPackage.ITERATIVE_NODE__TRUE_CONDITION_NODE:
				return trueConditionNode != null;
			case CfgPackage.ITERATIVE_NODE__FALSE_CONDITION_NODE:
				return falseConditionNode != null;
			case CfgPackage.ITERATIVE_NODE__NODES:
				return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IterativeNodeImpl
