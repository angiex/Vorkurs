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

			System.out.println(newDice[newDice.length - 1]);

		} while (throwDice != 1);

	}

}
