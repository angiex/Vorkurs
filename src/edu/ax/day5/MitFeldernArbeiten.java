package edu.ax.day5;
import java.util.Scanner;

public class MitFeldernArbeiten {

	public static void main(String[] args) {

		int space;
		double x, av;
		double var = 0;
		double sum = 0;

		// user inputs length of array
		do {
			Scanner num = new Scanner(System.in);
			space = num.nextInt();
			num.close();
		} while (space < 2);

		// create array
		double[] randNum = new double[space];

		// create random Numbers and write into array
		for (int i = 0; i < randNum.length; i++) {
			x = (Math.round(Math.random() * 99) + 1);
			randNum[i] = x;
			sum = sum + x;
		}

		// For debugging purposes, print out array
		for (int i = 0; i < randNum.length; i++) {
			System.out.println(randNum[i]);
		}

		// calculate average and variance
		av = (sum / randNum.length);
		for (int i = 0; i < randNum.length; i++) {
			var = var + Math.pow(randNum[i] - av, 2);
		}
		var = var / (randNum.length - 1);

		System.out.println("The average of the numbers inside the array is " + av + " and the variance is " + var);

	}

}
