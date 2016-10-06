package com.cs.tu.findrefactor.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.Getcb;

import com.cs.tu.findrefactor.graph.FindAllPaths;
import com.cs.tu.findrefactor.graph.GraphFindAllPaths;

import CFG.AbstractNode;
import CFG.CFGPackage;
import CFG.Node;
import CFG.Var;
import CFG.impl.ConditionalNodeImpl;
import CFG.impl.IterativeNodeImpl;
import CFG.impl.MControlFlowGraphImpl;
import CFG.impl.NodeImpl;

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
			packageRegistry.put(CFGPackage.eNS_URI, CFGPackage.eINSTANCE);

			// Register XML resource as UMLResource.Factory.Instance
			Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE
					.getExtensionToFactoryMap();
			extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
			//
			Resource resource = resourceSet.getResource(
					URI.createURI("Models/cfg.xmi"), true);

			// try to load the file into resource
//			List<AbstractNode> nodeList = new ArrayList<AbstractNode>();
			
			StringBuffer sb = null;
			for (EObject eObj : resource.getContents()) {
				MControlFlowGraphImpl mControlFlowGraphImpl = (MControlFlowGraphImpl) eObj;

				EList<Var> localVars = mControlFlowGraphImpl.getLocalVar();
				if (localVars != null && localVars.size() > 0) {
					
					for (Var var : localVars) {
						GraphFindAllPaths<String> graphFindAllPaths = new GraphFindAllPaths<String>();
						if (mControlFlowGraphImpl.getNodes() != null) {
							for (AbstractNode aNode : mControlFlowGraphImpl
									.getNodes()) {

								if (aNode instanceof NodeImpl) {
									NodeImpl node = (NodeImpl) aNode;
									if (node.getVar() != null) {
										for (Var v : node.getVar()) {
											if (v.getName().equals(
													var.getName())) {
												graphFindAllPaths.addNode(aNode.getClass()+" : "+v.getName());
												break;
											}

										}

									}
								}

								if (aNode instanceof ConditionalNodeImpl) {
									ConditionalNodeImpl conNode = (ConditionalNodeImpl) aNode;
									if (conNode.getVar() != null) {
										for (Var v : conNode.getVar()) {
											if (v.getName().equals(
													var.getName())) {
												graphFindAllPaths.addNode(aNode.getClass()+" : "+v.getName());
												break;
											}

										}

										if (conNode.getTrueConditionNode() != null) {
											EList<Var> vList = conNode.getTrueConditionNode().getVar();
											if (vList != null) {
												for (Var v : vList) {
													if (v.getName().equals(
															var.getName())) {
														graphFindAllPaths.addNode(conNode.getTrueConditionNode().getClass()+" : "+v.getName());
														break;
													}
												}
											}
										}

										if (conNode.getFalseConditionNode() != null) {
											EList<Var> vList = conNode.getFalseConditionNode().getVar();
											if (vList != null) {
												for (Var v : vList) {
													if (v.getName().equals(
															var.getName())) {
														graphFindAllPaths.addNode(conNode.getFalseConditionNode().getClass()+" : "+v.getName());
														break;
													}
												}
											}
										}
									}

								}

								if (aNode instanceof IterativeNodeImpl) {
									IterativeNodeImpl iNode = (IterativeNodeImpl) aNode;
									if (iNode.getVar() != null) {
										for (Var v : iNode.getVar()) {
											if (v.getName().equals(
													var.getName())) {
												graphFindAllPaths.addNode(iNode.getClass()+" : "+v.getName());
												break;
											}

										}

									}

								}
							}
						}
						
						 FindAllPaths<String > findAllPaths = new FindAllPaths<String >(graphFindAllPaths);
						 List<List<String>> pathList = findAllPaths.getAllPaths(graphFindAllPaths.nodeList.get(0), graphFindAllPaths.nodeList.get(graphFindAllPaths.nodeList.size()-1));
						
						 						System.out.println(var.getName());
						 for (List<String> list : pathList) {
							System.out.println(list);
						}
						 System.out.println("-------------------------");
						 

					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void printAllPath(int[][] pathList, int source,int destination) {
		StringBuffer path = new StringBuffer();
		int noOfNodes = pathList[source].length;
		path.append(source + "-->");
		for (int i = 0; i < noOfNodes; i++) {
			if (path.toString().contains("" + i))
				continue;

			if (pathList[source][i] == 1) {
				if (i == destination) {
					path.append(destination);
					System.out.println(path);
					path = new StringBuffer(path.toString().replace(
							"" + destination, ""));
				} else {
					printAllPath(pathList, i, destination);
				}
			}
		}
		path = new StringBuffer(path.toString()
				.replaceFirst(source + "-->", ""));
	}

	private static void getChildNode(EList<AbstractNode> list, StringBuffer sb) {
		if (list != null && list.size() > 0) {
			for (AbstractNode aNode : list) {

				if (aNode instanceof NodeImpl) {
					NodeImpl node = (NodeImpl) aNode;
					Var var = node.getVar().get(0);
					if (var != null) {
						sb.append(var.getName() + "(Node)");
						sb.append("-->");
					}
				}

				if (aNode instanceof ConditionalNodeImpl) {
					ConditionalNodeImpl conNode = (ConditionalNodeImpl) aNode;
					Var var = conNode.getVar().get(0);
					if (var != null) {
						sb.append(var.getName() + "(ConditionNode)");
						sb.append("-->");
					}
					if (conNode.getTrueConditionNode() != null) {
						Node trueNode = conNode.getTrueConditionNode();
						Var varTrue = trueNode.getVar().get(0);
						if (var != null) {
							sb.append(varTrue.getName() + "(trueNode)");
							sb.append("-->");
						}
					}

					if (conNode.getFalseConditionNode() != null) {
						Node faleNode = conNode.getTrueConditionNode();
						Var varFale = faleNode.getVar().get(0);
						if (var != null) {
							sb.append(varFale.getName() + "(faleNode)");
							sb.append("-->");
						}
					}
				}

				if (aNode instanceof IterativeNodeImpl) {
					IterativeNodeImpl iNode = (IterativeNodeImpl) aNode;
					Var var = iNode.getVar().get(0);
					if (var != null) {
						sb.append(var.getName() + "(IterativeNode)");
						sb.append("-->");
					}

				}
			}
		}
	}

}
