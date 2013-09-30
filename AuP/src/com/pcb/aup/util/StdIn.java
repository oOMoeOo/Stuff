package com.pcb.aup.util;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StdIn {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static String askString(String prompt) {
		System.out.print(prompt);
		try {
			return br.readLine();
		} catch (IOException e) {
			System.err.println("could not read from stdin");
			System.exit(100);
			return null;
		}
	}

	public static int askInt(String prompt) {
		try {
			return Integer.parseInt(askString(prompt));
		} catch (NumberFormatException e) {
			System.err.println("not an integer value");
			return askInt(prompt);
		}
	}

	public static double askDouble(String prompt) {
		try {
			return Double.parseDouble(askString(prompt));
		} catch (NumberFormatException e) {
			System.err.println("not a double value");
			return askDouble(prompt);
		}
	}

	/**
	 * Hauptprogramm zum Test der zuvor definierten Methoden
	 * 
	 * @param args
	 *            Kommandozeilenargumente werden ignoriert
	 */
	public static void main(String[] args) {
		String s = StdIn.askString("Bitte eine Zeichenkette eingeben: ");
		System.out.println(s);

		int i = StdIn.askInt("Bitte eine ganze Zahl eingeben: ");
		System.out.println(i);

		double d = StdIn.askDouble("Bitte eine Zahl eingeben: ");
		System.out.println(d);
	}

}
