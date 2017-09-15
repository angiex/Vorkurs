package edu.ax.day7;

public class AusgabeTest {

	public static void main(String[] args) {

		AusgabeBasis b = new AusgabeBasis();
		Dreieck d = new Dreieck();
		RationaleZahl z = new RationaleZahl();
		Vektor v = new Vektor();

		Object[] stuff = new Object[4];
		stuff[0] = b;
		stuff[1] = d;
		stuff[2] = z;
		stuff[3] = v;

		AusgabeBasis stuff0 = (AusgabeBasis) stuff[0];
		Dreieck stuff1 = (Dreieck) stuff[1];
		RationaleZahl stuff2 = (RationaleZahl) stuff[2];
		Vektor stuff3 = (Vektor) stuff[3];

		stuff0.print();
		stuff1.print();
		stuff2.print();
		stuff3.print();

	}
}
