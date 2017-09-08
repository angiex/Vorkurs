package edu.ax.day2;
import java.util.Scanner;

public class Bruch {

	public static void main(String[] args) {
		
		//create object input of class Scanner
		Scanner input = new Scanner(System.in);
		
		//ask user for input
		System.out.println("Geben Sie eine reelle Zahl ein.");
		//save user input as a
		double a = input.nextDouble();
		
		//calculate fraction x
		double x = (a + 641.3) / (3484 - 123.1);
		
		//stop data input
		input.close();
		
		//print out result of fraction x
		System.out.println(x);
	}
	
}
