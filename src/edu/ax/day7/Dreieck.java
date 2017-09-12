package edu.ax.day7;

public class Dreieck {

	private Vektor v1;
	private Vektor v2;
	private Vektor v3;

	public Dreieck(Vektor v1, Vektor v2, Vektor v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public void pointReflect() {
		v1.pointReflect();
		v2.pointReflect();
		v3.pointReflect();
	}

	public void xReflect() {
		v1.xReflect();
		v2.xReflect();
		v3.xReflect();
	}

	public void yReflect() {
		v1.yReflect();
		v2.yReflect();
		v3.yReflect();
	}

	public Vektor centroid() {

		double x = v1.getX() + v2.getX() + v3.getX();
		x = x / 3;
		double y = v1.getY() + v2.getY() + v3.getY();
		y = y / 3;

		Vektor centroid = new Vektor(x, y);
		return centroid;
	}

	public double area() {
		return 0.5 * (v1.getX() * (v2.getY() - v3.getY()) + v2.getX() * (v3.getY() - v1.getY())
				+ v3.getX() * (v1.getY() - v2.getY()));
	}

	public void rotateTriangle(double alpha) {

		v1.rotateVector(alpha);
		v2.rotateVector(alpha);
		v3.rotateVector(alpha);

	}

	public String toString() {
		return "(" + v1 + ", " + v2 + ", " + v3 + ")";
	}

}
