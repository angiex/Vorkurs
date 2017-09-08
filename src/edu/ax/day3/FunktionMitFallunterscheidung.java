package edu.ax.day3;
import java.util.Scanner;

public class FunktionMitFallunterscheidung {

	public static void main(String[] args) {
		
		Scanner xValue = new Scanner(System.in);
		System.out.println("Geben Sie einen Wert für x ein.");
		
		//user input saved as x
		double x = xValue.nextDouble();
		//y is value of f(x)
		double y;
		xValue.close();
		
		//test cases
		if ( x < -2 ) {
			y = -2;
		} else if ( x > 2 ) {
			y = 2;
		} else {
			y = x;
		}
		
		//print result
		System.out.println("y nimmt den Wert " + y +  " an.");
		
	}
	
}
