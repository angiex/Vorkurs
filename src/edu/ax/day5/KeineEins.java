package edu.ax.day5;

public class KeineEins {

	public static void main(String[] args) {

		byte throwDice;
		int count = 0;
		int[] dice = new int[0];

		do {
			throwDice = (byte) (Math.round((Math.random() * 5)) + 1);

			count++;
			dice[count - 1] = throwDice;

			int[] prevDice = new int[dice.length + 1];

			// copy content of dice into prev dice
			for (int i = 0; i < dice.length; i++) {
				prevDice[i] = dice[i];
			}

			// reset dice
			dice = new int[count];

		} while (throwDice != 1);

	}

}
