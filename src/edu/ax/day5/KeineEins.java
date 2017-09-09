package edu.ax.day5;

public class KeineEins {

	public static void main(String[] args) {

		int throwDice;
		int[] dice = new int[0];
		int[] newDice = new int[dice.length + 1];

		do {
			throwDice = (int) (Math.round((Math.random() * 5)) + 1);

			// copy content of dice
			for (int i = 0; i < dice.length; i++) {
				newDice[i] = dice[i];
			}

			newDice[newDice.length - 1] = throwDice;

			dice = newDice;

			for (int i = 0; i < dice.length; i++) {
				System.out.println(dice[i]);
			}

		} while (throwDice != 1);

	}

}
