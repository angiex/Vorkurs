package edu.ax.day5;

public class Felderfelder {

	public static void main(String[] args) {

		int[][] arrayArray = new int[10][10];

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				arrayArray[i][j] = (int) (Math.round(Math.random() * 8) + 1);
				System.out.print(arrayArray[i][j] + " ");
			}

			System.out.print("\n");

		}

	}

}
