package edu.ax.day7;

public class VektorenInEbene {

	public static void main(String[] args) {

		Vektor v = new Vektor(2, 2);
		v.pointReflect();

		System.out.println(v.toString());

		v.xReflect();
		System.out.println(v.toString());

		v.yReflect();
		System.out.println(v.toString());

		System.out.println(v.absVector());

		v.rotateVector(Math.PI / 2);
		System.out.println(v.toString() + "\n");

		Vektor w = new Vektor(1, 0);
		System.out.println(w.toString());

		w.rotateVector(Math.PI / 4);
		System.out.println(w.toString());

		System.out.println(w.absVector());

	}

}
