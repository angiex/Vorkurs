package edu.ax.day7;

public class RationaleZahlTest {

	public static void main(String[] args) {

		RationaleZahl s = new RationaleZahl(3, 9);
		RationaleZahl t = new RationaleZahl(56, 99);

		RationaleZahl tPlusS = t.addition(s);

		System.out.println(t);
		System.out.println(s);
		System.out.println(tPlusS);

		RationaleZahl shortened = s.getShortenedNumber();
		System.out.println(shortened);
	}

}
