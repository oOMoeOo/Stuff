package com.pcb.aup.ue02;

public interface ColGraphT {
	// Knoten v hinzufügen
	void addNode(ColNodeT v);

	// Initialisierung
	void initGraph();

	// Kante (v, w) hinzufügen
	void addArc(ColNodeT v, ColNodeT w);

	// true gdw. alle Knoten gefärbt sind
	boolean allNodesColoured();

	// Gibt den nächstgrößeren ungefärbten Knoten zu v als return-Wert zurück.
	// Liefert einen NULL-Pointer gdw. kein solcher Knoten existiert.
	ColNodeT nextUncolouredNode(ColNodeT v);

	// true gdw. es eine Kante (v, w) für wenigstens einen Knoten w in colours gibt.
	boolean associatedWith(ColNodeT v, ColSetT colours);
}
