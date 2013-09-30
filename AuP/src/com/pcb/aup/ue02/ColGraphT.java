package com.pcb.aup.ue02;

public interface ColGraphT {
	// Knoten v hinzuf�gen
	void addNode(ColNodeT v);

	// Initialisierung
	void initGraph();

	// Kante (v, w) hinzuf�gen
	void addArc(ColNodeT v, ColNodeT w);

	// true gdw. alle Knoten gef�rbt sind
	boolean allNodesColoured();

	// Gibt den n�chstgr��eren ungef�rbten Knoten zu v als return-Wert zur�ck.
	// Liefert einen NULL-Pointer gdw. kein solcher Knoten existiert.
	ColNodeT nextUncolouredNode(ColNodeT v);

	// true gdw. es eine Kante (v, w) f�r wenigstens einen Knoten w in colours gibt.
	boolean associatedWith(ColNodeT v, ColSetT colours);
}
