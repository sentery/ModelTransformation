package com.cs.tu.findrefactor.core;

import com.cs.tu.findrefactor.model.CfgPackage;
import com.cs.tu.findrefactor.model.MControlFlowGraph;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFModelLoad {

	
	public MControlFlowGraph load(){
		CfgPackage.eINSTANCE.eClass();
		
		  Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
          Map<String, Object> m = reg.getExtensionToFactoryMap();
          m.put("cfg", new XMIResourceFactoryImpl());

          // Obtain a new resource set
          ResourceSet resSet = new ResourceSetImpl();

          // Get the resource
          Resource resource = resSet.getResource(URI
                          .createURI("website/My.website"), true);
          // Get the first model element and cast it to the right type, in my
          // example everything is hierarchical included in this first node
          MControlFlowGraph mControlFlowGraph = (MControlFlowGraph) resource.getContents().get(0);
          return mControlFlowGraph;
		
		
	}
}