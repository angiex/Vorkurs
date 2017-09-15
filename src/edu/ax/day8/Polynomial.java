package edu.ax.day8;

public class Polynomial {

	private double[] coefficients;

	// constructors
	public Polynomial() {
		coefficients = new double[1];
		coefficients[0] = 0;
	}

	public Polynomial(double a0) {
		coefficients = new double[1];
		coefficients[0] = a0;
	}

	public Polynomial(double[] coefficient) {
		this.coefficients = coefficient;
	}

	// static methods
	public static Polynomial monomial(int n) {
		Polynomial monom = new Polynomial();
		monom.setCoefficient(n, 1);
		return monom;
	}

	public static Polynomial add(Polynomial f, Polynomial g) {

		if (f == null || g == null) {
			throw new IllegalArgumentException("This is not a valid input");
		}

		double[] hArray;
		if (f.degree() <= g.degree()) {
			hArray = new double[g.degree() + 1];
			for (int i = 0; i <= g.degree(); i++) {
				hArray[i] = f.getCoefficient(i) + g.getCoefficient(i);
			}
		} else {
			hArray = new double[f.degree() + 1];
			for (int i = 0; i <= f.degree(); i++) {
				hArray[i] = f.getCoefficient(i) + g.getCoefficient(i);
			}
		}

		Polynomial h = new Polynomial(hArray);
		return h;
	}

	public static Polynomial multiply(Polynomial f, Polynomial g) {
		// Cauchy product

		int hLength = f.degree() + g.degree() + 1;
		double[] hArray = new double[hLength];

		for (int i = 0; i < hLength; i++) {
			hArray[i] = 0;
			for (int j = 0; j <= i; j++) {
				hArray[i] = hArray[i] + (f.getCoefficient(i) * g.getCoefficient(i - j));
			}
		}

		Polynomial h = new Polynomial(hArray);
		return h;
	}

	public static Polynomial zeroPolynomial(double[] z) {
		if (z == null) {
			throw new IllegalArgumentException("Your have no array.");
		}

		Polynomial goalPoly = new Polynomial(1);

		for (int i = 0; i < z.length; i++) {
			double x0 = z[i];
			double[] factor = { -x0, 1 };
			Polynomial zeroPoly = new Polynomial(factor);

			goalPoly = multiply(goalPoly, zeroPoly);
		}

		return goalPoly;
	}

	// setter and getter methods
	public void setCoefficients(double[] coefficients) {
		this.coefficients = coefficients;
	}

	public double[] getCoefficients() {
		return coefficients;
	}

	public void setCoefficient(int k, double a) {
		if (k < 0) {
			throw new IllegalArgumentException("You cannot access a negative array field.");
		} else if (k < coefficients.length) {
			coefficients[k] = a;
		} else {

			double[] copy = new double[k + 1];

			for (int i = 0; i < coefficients.length; i++) {
				copy[i] = coefficients[i];
			}
			for (int i = coefficients.length; i < k; i++) {
				copy[i] = 0;
			}
			copy[k] = a;

			coefficients = copy;
		}
	}

	public double getCoefficient(int k) {
		if (k < 0) {
			throw new IllegalArgumentException("You cannot access a negative array field.");
		}

		if (k < coefficients.length) {
			return coefficients[k];
		} else {
			return 0;
		}
	}

	// Override existing methods of Object; is part of exercise sheet 9 (day 9),
	// task #33
	@Override
	public String toString() {
		String s = "";
		boolean firstSum = true;
		if (getCoefficient(0) != 0) {
			s = s + getCoefficient(0);
			firstSum = false;
		}
		for (int i = 1; i < (coefficients.length); i++) {
			if (getCoefficient(i) != 0) {
				if (firstSum) {
					s = s + getCoefficient(i) + "x^" + i;
					firstSum = false;
				} else {
					s = s + " + " + getCoefficient(i) + "x^" + i;
				}
			}
		}
		return s;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		double[] clone = new double[this.coefficients.length];
		for (int i = 0; i < this.coefficients.length; i++) {
			clone[i] = getCoefficient(i);
		}
		Polynomial clonedPoly = new Polynomial(clone);

		return clonedPoly;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals;
		if (obj instanceof Polynomial) {
			Polynomial compare = (Polynomial) obj;
			int i = 0;
			if (this.degree() == compare.degree()) {
				do {
					equals = (compare.getCoefficient(i) == this.getCoefficient(i));
					i++;
				} while ((equals == true) && (i <= this.degree()));
			} else {
				equals = false;
			}
		} else {
			equals = false;
		}

		return equals;
	}

	// non-static methods added to Polynomial
	public int degree() {
		int degree = coefficients.length;
		do {
			degree--;
		} while (coefficients[degree] == 0);
		return degree;
	}

	public double evaluate(double x) {
		double f = 0;
		for (int i = 0; i < (coefficients.length - 1); i++) {
			f = f + (coefficients[i] * Math.pow(x, i));
		}
		return f;
	}

}
