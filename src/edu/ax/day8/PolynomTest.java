package edu.ax.day8;

public class PolynomTest {

	public static void main(String[] args) {

		double[] co1 = { 2, 4, 7, 4, 0, 3, 0 };
		double[] co2 = { 5, 6, 2, 4, 2, 9, 9, 8, 5 };
		Polynomial poly1 = new Polynomial(co1);
		Polynomial poly2 = new Polynomial(co2);

		System.out.println(poly1);

		System.out.println(poly2);

		System.out.println(Polynomial.add(poly1, poly2));
		System.out.println(Polynomial.monomial(3));
	}

}
