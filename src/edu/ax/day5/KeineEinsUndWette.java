package edu.ax.day5;

import java.util.Scanner;

public class KeineEinsUndWette {

	public static void main(String[] args) {

		boolean win;
		long games = 0;
		double winCount = 0;
		double result;

		System.out.println("How many times do you want to play?");
		Scanner input = new Scanner(System.in);
		do {
			games = input.nextLong();
		} while (games < 0);

		input.close();

		for (long l = 0; l < games; l++) {
			win = playGame();
			if (win) {
				System.out.println("Congratulations, you won 1€");
				winCount++;
			} else {
				System.out.println("Sorry, you lost 1€.");
				winCount--;
			}
		}

		result = winCount / games;

		System.out.println("On average your balance has changed by " + result);

	}

	public static boolean playGame() {
		int throwDice;
		int[] dice = new int[0];
		int[] newDice = new int[1];

		do {
			throwDice = (int) (Math.round((Math.random() * 5)) + 1);

			// copy content of dice
			for (int i = 0; i < dice.length; i++) {
				newDice[i] = dice[i];
			}

			newDice[newDice.length - 1] = throwDice;

			dice = newDice;
			newDice = new int[dice.length + 1];

		} while (throwDice != 1);

		for (int i = 0; i < dice.length; i++) {
			System.out.println(dice[i]);
		}

		if (dice.length <= 2) {
			return true;
		} else {
			return false;
		}

	}
}
