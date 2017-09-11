package edu.ax.day6;

import java.util.Scanner;

public class RaumvektorenImFeld {

	public static void main(String[] args) {

		Raumvektor[] feld = {};
		Raumvektor[] kopie;

		Scanner input = new Scanner(System.in);
		byte user;

		do {
			System.out.println(
					"1 to add, 2 to delete all, 3 to print, 4 to delete vector, 5 to ?????, 6 to create new random vector, 0 to stop program");

			user = input.nextByte();

			switch (user) {

			case 1:
				Raumvektor addVector = new Raumvektor();

				System.out.println("Please enter x, y and z of your vector");
				addVector.x = input.nextDouble();
				addVector.y = input.nextDouble();
				addVector.z = input.nextDouble();

				kopie = new Raumvektor[feld.length + 1];

				for (int i = 0; i < feld.length; i++) {
					kopie[i] = feld[i];
				}

				kopie[feld.length] = addVector;
				feld = kopie;
				// For debugging purposes, print out length of array
				// System.out.println("länge jetzt:" + feld.length);
				break;

			case 2:
				feld = new Raumvektor[0];
				break;

			case 3:
				// For debugging purposes, print out length of array
				// System.out.println("länge jetzt:" + feld.length);

				System.out.println("Your array now contains the following vectors:");
				for (int i = 0; i < feld.length; i++) {
					System.out.println(feld[i].x + " " + feld[i].y + " " + feld[i].z);
				}
				break;

			case 4:
				System.out.println("Please enter the index of the vector you want to delete.");
				int delVector;
				kopie = new Raumvektor[feld.length - 1];

				do {
					delVector = input.nextInt();
				} while ((delVector < 0) || (delVector > (feld.length - 1)));

				for (int i = 0; i < delVector; i++) {
					kopie[i] = feld[i];
				}

				for (int i = (delVector + 1); i < (feld.length); i++) {
					kopie[i - 1] = feld[i];
				}

				feld = kopie;
				// For debugging purposes, print out length of array
				// System.out.println("länge jetzt:" + feld.length);
				break;

			case 5:
				Raumvektor centre = new Raumvektor();
				centre.x = 0;
				centre.y = 0;
				centre.z = 0;
				for (int i = 0; i < feld.length; i++) {
					centre.x = centre.x + feld[i].x;
					centre.y = centre.y + feld[i].y;
					centre.z = centre.z + feld[i].z;
				}

				centre.x = (centre.x / feld.length);
				centre.y = (centre.y / feld.length);
				centre.z = (centre.z / feld.length);

				feld = new Raumvektor[1];
				feld[0] = centre;

				centre.printVector();
				break;

			case 6:
				System.out.println("Please enter the number of random vectors you want to add.");
				int n;

				do {
					n = input.nextInt();
				} while (n < 0);

				kopie = new Raumvektor[feld.length + n];

				for (int j = 0; j < feld.length; j++) {
					kopie[j] = feld[j];
				}

				for (int j = feld.length; j < kopie.length; j++) {
					Raumvektor randVector = new Raumvektor();

					randVector.x = Math.random();
					randVector.y = Math.random();
					randVector.z = Math.random();

					kopie[j] = randVector;
				}

				feld = kopie;
				break;

			case 0:
				System.out.println("Thank you, goodbye.");
				break;

			default:
				System.out.println("Please enter a valid input.");
				user = input.nextByte();
				break;
			}

		} while (user != 0);

		input.close();

	}
}
