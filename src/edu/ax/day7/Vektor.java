package edu.ax.day7;

public class Vektor {

	private double x, y;

	// Vektor Konstrukor
	public Vektor(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Nullvektor Konstruktor
	public Vektor() {
		this.x = 0;
		this.y = 0;
	}

	// getter
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public void pointReflect() {
		x = -x;
		y = -y;
	}

	public void xReflect() {
		y = -y;
	}

	public void yReflect() {
		x = -x;
	}

	public double absVector() {
		return Math.sqrt((x * x) + (y * y));
	}

	public void rotateVector(double alpha) {
		if ((alpha < 0) || (alpha > 2 * Math.PI)) {
			return;
		}

		double prevX = x;
		double prevY = y;
		x = (prevX * Math.cos(alpha)) - (prevY * Math.sin(alpha));
		y = (prevX * Math.sin(alpha)) + (prevY * Math.cos(alpha));
	}

}
