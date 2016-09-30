package com.cs.tu.findrefactor.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.Data;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;

import com.cs.tu.findrefactor.model.AbstractNode;
import com.cs.tu.findrefactor.model.CfgPackage;
import com.cs.tu.findrefactor.model.MControlFlowGraph;
import com.cs.tu.findrefactor.model.Var;
import com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl;
import com.cs.tu.findrefactor.model.impl.NodeImpl;

public class LoadTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		

		try {
			
			ResourceSet resourceSet = new ResourceSetImpl();

	        // register UML
	        Map packageRegistry = resourceSet.getPackageRegistry();
	        packageRegistry.put(CfgPackage.eNS_URI, CfgPackage.eINSTANCE);

	        // Register XML resource as UMLResource.Factory.Instance
	        Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
	        extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
//
	        Resource resource = resourceSet.getResource(URI.createURI("Models/cfg.xmi"), true);

	        // try to load the file into resource
	        
	        for (EObject eObj : resource.getContents()) {
	        	MControlFlowGraphImpl mControlFlowGraphImpl = (com.cs.tu.findrefactor.model.impl.MControlFlowGraphImpl) eObj;
	        	
	        	if(mControlFlowGraphImpl.getNodes() != null){
	        		for (AbstractNode asNode : mControlFlowGraphImpl.getNodes()) {
	        			if(asNode instanceof NodeImpl){
	        				NodeImpl nodeImpl = (NodeImpl) asNode;
//	        				if(nodeImpl.getVar() != null){
//	        					for (Var var : nodeImpl.getVar()) {
//									System.out.println(var.getName());
//								}
//	        				}
	        				if(nodeImpl.getDataFlow() != null){
	        					for (AbstractNode dfNode : nodeImpl.getDataFlow()) {
									System.out.println(dfNode.getClass());
								}
	        				}
	        			}
					}
	        	}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	

}
