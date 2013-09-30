package com.pcb.aup.ue02;

public interface ColSetT {
	// Zur leeren Menge setzen
	void clear();

	// Knoten v einfügen
	void include(ColNodeT v);

	// true gdw. v ein Element der Menge ist
	boolean member(ColNodeT v);
}
