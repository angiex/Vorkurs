package edu.ax.day2;
import java.util.Scanner;

public class AbcFormel {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie die den Koeffzizienten a ihres Polynoms der Form ax^2 + bx + c = 0 ein.");
		double a = input.nextDouble();
		
		System.out.println("Geben Sie die den Koeffzizienten b ihres Polynoms der Form ax^2 + bx + c = 0 ein.");
		double b = input.nextDouble();
		
		System.out.println("Geben Sie die den Koeffzizienten c ihres Polynoms der Form ax^2 + bx + c = 0 ein.");
		double c = input.nextDouble();
		input.close();
		
		boolean solution = false;
		boolean complex = false;
		
		if (a == 0) {
			System.out.println("Es ist nicht möglich die abc-Formel zu verwenden, da man nicht durch 0 dividieren kann.");
		} else if (b * b - 4 * a *c < 0) {
			System.out.println("Die Lösung ist komplex.");
			complex = true;
		} else if (b * b - 4 * a * c == 0) {
			System.out.println("Es gibt eine Lösung. Hierbei handelt es sich um eine doppelte Nullstelle.");
			solution = true;
		} else {
			System.out.println("Es gibt zwei Lösungen.");
			solution = true;
		}
		
		//Berechnung des Polynoms durch abc-Formel wenn es Lösungen gibt
		
		if (solution) {
			double x1 = (-b + Math.sqrt(b * b - 4 * a *c)) / (2 * a);
			double x2 = (-b - Math.sqrt(b * b - 4 * a *c)) / (2 * a);
			
			//Ausgabe des Ergebnisses
			System.out.println("Die Nullstellen des Polynoms sind " + x1 + " und " + x2);
		}
		
		if (complex) {
			double imag = Math.sqrt(Math.abs(b * b - 4 * a * c)) / (2 * a);
			double real = -b / (2 * a);
			System.out.println("Die Ergebnisse sind:" + real + "+" + imag + "*i und " + real + "-" + imag + "*i");
		}
		
	}

}
