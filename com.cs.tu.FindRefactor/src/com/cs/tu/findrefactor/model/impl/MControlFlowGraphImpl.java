/**
 */
package com.cs.tu.findrefactor.model.impl;

import com.cs.tu.findrefactor.model.AbstractNode;
import com.cs.tu.findrefactor.model.MControlFlowGraph;
import com.cs.tu.findrefactor.model.Var;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MControl Flow Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl#getLocalVar <em>Local Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MControlFlowGraphImpl extends EObjectImpl implements MControlFlowGraph {
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
	 * The cached value of the '{@link #getLocalVar() <em>Local Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVar()
	 * @generated
	 * @ordered
	 */
	protected EList<Var> localVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MControlFlowGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfgPackage.Literals.MCONTROL_FLOW_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<AbstractNode>(AbstractNode.class, this, CfgPackage.MCONTROL_FLOW_GRAPH__NODES);
		}
		return nodes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.MCONTROL_FLOW_GRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Var> getLocalVar() {
		if (localVar == null) {
			localVar = new EObjectContainmentWithInverseEList<Var>(Var.class, this, CfgPackage.MCONTROL_FLOW_GRAPH__LOCAL_VAR, CfgPackage.VAR__METHOD);
		}
		return localVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfgPackage.MCONTROL_FLOW_GRAPH__LOCAL_VAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocalVar()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfgPackage.MCONTROL_FLOW_GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case CfgPackage.MCONTROL_FLOW_GRAPH__LOCAL_VAR:
				return ((InternalEList<?>)getLocalVar()).basicRemove(otherEnd, msgs);
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
			case CfgPackage.MCONTROL_FLOW_GRAPH__NODES:
				return getNodes();
			case CfgPackage.MCONTROL_FLOW_GRAPH__NAME:
				return getName();
			case CfgPackage.MCONTROL_FLOW_GRAPH__LOCAL_VAR:
				return getLocalVar();
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
			case CfgPackage.MCONTROL_FLOW_GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends AbstractNode>)newValue);
				return;
			case CfgPackage.MCONTROL_FLOW_GRAPH__NAME:
				setName((String)newValue);
				return;
			case CfgPackage.MCONTROL_FLOW_GRAPH__LOCAL_VAR:
				getLocalVar().clear();
				getLocalVar().addAll((Collection<? extends Var>)newValue);
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
			case CfgPackage.MCONTROL_FLOW_GRAPH__NODES:
				getNodes().clear();
				return;
			case CfgPackage.MCONTROL_FLOW_GRAPH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CfgPackage.MCONTROL_FLOW_GRAPH__LOCAL_VAR:
				getLocalVar().clear();
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
			case CfgPackage.MCONTROL_FLOW_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case CfgPackage.MCONTROL_FLOW_GRAPH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CfgPackage.MCONTROL_FLOW_GRAPH__LOCAL_VAR:
				return localVar != null && !localVar.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MControlFlowGraphImpl
