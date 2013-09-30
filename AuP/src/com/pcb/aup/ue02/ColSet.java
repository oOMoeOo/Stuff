package com.pcb.aup.ue02;

import java.util.HashSet;
import java.util.Set;

public class ColSet implements ColSetT {

	private Set<ColNodeT> nodes = new HashSet<ColNodeT>();
	
	@Override
	public void clear() {
		nodes.clear();
	}

	@Override
	public void include(ColNodeT v) {
		nodes.add(v);
	}

	@Override
	public boolean member(ColNodeT v) {
		return nodes.contains(v);
	}

}
