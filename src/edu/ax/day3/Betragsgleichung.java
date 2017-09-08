package edu.ax.day3;
import java.util.Scanner;

public class Betragsgleichung {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//user input for values a, b, c
		System.out.println("Geben Sie einen Wert f�r a ein.");
		double a = input.nextDouble();
		System.out.println("Geben Sie einen Wert f�r b ein.");
		double b = input.nextDouble();
		System.out.println("Geben Sie einen Wert f�r c ein.");
		double c = input.nextDouble();
		//end user input
		input.close();
		
		if ( (a == 0) && ( Math.abs(b) != c) ) {
			System.out.println("Es gibt keine L�sung.");
		} else if ( ( a == 0 ) && ( Math.abs(b) == c ) ) { 
			System.out.println("Es gibt unendlich viele L�sungen.");
		} else if ( c == 0 ) {
			double result = (c - b) / a;
			System.out.println("Es gibt genau eine L�sung: " + result);
		} else {
			double result1 = (c - b) / a;
			double result2 = -((c + b) / a);
			System.out.println("Es gibt zwei L�sungen: " + result1 + " und " + result2);
		}
		
	}
	
}
