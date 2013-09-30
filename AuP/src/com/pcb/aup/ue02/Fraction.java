package com.pcb.aup.ue02;

/**
 * @author TODO insert author here
 */
public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int aNumerator, int aDenominator) {
		this.numerator = aNumerator;
		this.denominator = aDenominator;
	}

	private void simplify() {
		int gcd = findGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
	}

	private int findGCD(int a, int b) {
		return (b == 0) ? a : findGCD(b, a % b);
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenumenator() {
		return denominator;
	}

	public Fraction add(Fraction x) {
		int factor = denominator * x.denominator;
		Fraction a = multiply(factor / denominator);
		Fraction b = x.multiply(factor / x.denominator);
		return new Fraction(a.numerator + b.numerator, factor);
	}

	public Fraction subtract(Fraction x) {
		return add(new Fraction(-x.numerator, x.denominator));
	}
	
	public Fraction multiply(int factor) {
		return new Fraction(numerator * factor, denominator * factor);
	}

	public Fraction multiply(Fraction x) {
		return new Fraction(numerator * x.numerator, denominator * x.denominator);
	}

	public Fraction divide(Fraction x) {
		return multiply(new Fraction(x.denominator, x.numerator));
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Fraction) {
			Fraction other = (Fraction) obj;
			return numerator == other.numerator && denominator == other.denominator;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%d/%d", numerator, denominator);
	}

	/**
	 * @param args
	 *            Command line arguments -- ignored
	 */
	public static void main(String[] args) {
		Fraction x = new Fraction(3, 4); // 6/8
		Fraction y = new Fraction(1, 2); // 4/8
		Fraction z = x.add(y);
		System.out.println(z);
		z = x.subtract(y);
		System.out.println(z);
		z.simplify();
		System.out.println(z);
	}

}
