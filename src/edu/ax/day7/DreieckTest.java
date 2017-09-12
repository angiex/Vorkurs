package edu.ax.day7;

public class DreieckTest {

	public static void main(String[] args) {

		Dreieck d1 = new Dreieck(new Vektor(2, 5), new Vektor(-2, 1), new Vektor(6, -4));

		System.out.println(d1);

		System.out.println(d1.centroid());

		d1.rotateTriangle(Math.PI / 2);
		System.out.println(d1);

		d1.yReflect();
		System.out.println(d1);

		d1.pointReflect();
		System.out.println(d1);

	}

}
