package edu.ax.day5;
import java.util.Scanner;

public class FelderMischen {

	public static void main(String[] args) {

		int n;

		// user input
		do {
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			input.close();
		} while (n < 1);

		// create array with natural numbers up until n
		int[] numbers = new int[n];
		for (int i = 1; i <= n; i++) {
			numbers[i - 1] = i;
			System.out.print(numbers[i - 1] + " ");
		}

		System.out.println(" | ");

		// create array to shuffle numbers
		int[] shuffle = new int[n];

		for (int i = 1; i <= n; i++) {
			int numbersInd = (int) Math.round((Math.random() * (n - 1)));

			if (numbers[numbersInd] != 0) {
				shuffle[i - 1] = numbers[numbersInd];
				numbers[numbersInd] = 0;

				System.out.print(shuffle[i - 1] + " ");
			} else {
				i--;
			}

		}

	}
}
