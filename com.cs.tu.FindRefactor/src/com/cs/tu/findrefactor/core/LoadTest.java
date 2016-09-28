package com.cs.tu.findrefactor.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.Data;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.cs.tu.findrefactor.model.MControlFlowGraph;

public class LoadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		  EMFModelLoad loader = new EMFModelLoad();
//		  MControlFlowGraph mControlFlowGraph = loader.load();
//          // Accessing the model information
//          System.out.println(mControlFlowGraph.getName());
//          // Lets see what info the webpage has
//          for (Iterator<Webpage> iterator = myWeb.getPages().iterator(); iterator
//                          .hasNext();) {
//                  Webpage page = iterator.next();
//                  System.out.println("Name : " + page.getName());
//                  // We could also iterate over the Articles...
//          }
		try {
//			XMIResourceImpl resource = new XMIResourceImpl();
//			 File source = new File("Models/cfg.xmi");
//			 resource.load( new FileInputStream(source), new HashMap<Object,Object>());
//			 Data data = (Data)resource.getContents().get(0);
//			 System.out.println(data.getClass());
			
//			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//			Map<String, Object> m = reg.getExtensionToFactoryMap();
//			m.put("key", new XMIResourceFactoryImpl());
//			ResourceSet resSet = new ResourceSetImpl();
//			Resource resource = resSet.createResource(URI.createFileURI("Models/cfg.xmi"));
//			resource.getContents().add(data);
//			resource.save(Collections.EMPTY_MAP);
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		

	}

}
