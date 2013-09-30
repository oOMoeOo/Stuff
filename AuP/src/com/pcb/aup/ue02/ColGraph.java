package com.pcb.aup.ue02;

import java.util.HashMap;
import java.util.Map;

public class ColGraph implements ColGraphT {

	private ColSetT nodes = new ColSet();
	private Map<ColNodeT, ColSetT> outgoing = new HashMap<ColNodeT, ColSetT>();
	
	@Override
	public void addNode(ColNodeT v) {
		nodes.include(v);
	}

	@Override
	public void initGraph() {
		nodes.clear();
	}

	@Override
	public void addArc(ColNodeT v, ColNodeT w) {
		
	}

	@Override
	public boolean allNodesColoured() {
		return false;
	}

	@Override
	public ColNodeT nextUncolouredNode(ColNodeT v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean associatedWith(ColNodeT v, ColSetT colours) {
		// TODO Auto-generated method stub
		return false;
	}

}
