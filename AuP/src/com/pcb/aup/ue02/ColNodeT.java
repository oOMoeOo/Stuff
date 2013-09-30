package com.pcb.aup.ue02;

public class ColNodeT {

	private int id; // Knotennummer
	private int colour; // Knotenfarbe

	// Gibt die Knotennummer zur�ck
	public int getId() {
		return id;
	}

	// Setzen der Knotennummer
	public void setId(int i) {
		id = i;
	}

	// Gibt die Knotenfarbe zur�ck
	public int getColour() {
		return colour;
	}

	// Setzen der Knotenfarbe
	public void setColour(int col) {
		colour = col;
	}
	
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) return false;
		if (obj instanceof ColNodeT) {
			ColNodeT other = (ColNodeT) obj;
			return id == other.id;
		}
		return false;
	}
}
