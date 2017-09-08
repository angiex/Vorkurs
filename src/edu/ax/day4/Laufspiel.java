package edu.ax.day4;
import java.util.Scanner;

public class Laufspiel {

	public static void main(String[] args) {

		int i;
		int count = 0;
		double distance;

		// generate starting coordinates
		int userX = (int) (Math.round((Math.random() * 6)) + 1);
		int userY = (int) (Math.round((Math.random() * 6)) + 1);

		// generate destination coordinates
		int goalX = (int) (Math.round((Math.random() * 6)) + 1);
		int goalY = (int) (Math.round((Math.random() * 6)) + 1);

		// for debugging purposes, print out destination
		System.out.println("Destination (" + goalX + ", " + goalY + ")");

		// additional task (task #18): randomised teleporter field
		// In every game, two positions within the grid are chosen to function as a
		// teleporter. If the player steps onto one of the teleporters, they will be
		// moved to the other one. The goal cannot be a teleporter field. The two
		// corresponding teleporter fields cannot be the same field.

		int teleportX1 = 0;
		int teleportY1 = 0;
		int teleportX2 = 0;
		int teleportY2 = 0;
		String teleportMsg = "You have found the teleporter!";

		while (((teleportX1 == goalX) && (teleportY2 == goalY)) || (teleportX1 == 0)) {
			teleportX1 = (int) (Math.round((Math.random() * 6)) + 1);
			teleportY1 = (int) (Math.round((Math.random() * 6)) + 1);
		}

		while (((teleportX1 == teleportX2) && (teleportY1 == teleportX2)) || (teleportX2 == 0)) {
			teleportX2 = (int) (Math.round((Math.random() * 6)) + 1);
			teleportY2 = (int) (Math.round((Math.random() * 6)) + 1);
		}

		// for debugging purposes, print out the positions of the teleporter fields
		// System.out.println("This game's teleporter fields are (" + teleportX1 + ", "
		// + teleportY1 + ") and ("
		// + teleportX2 + ", " + teleportY2 + ")");

		Scanner move = new Scanner(System.in);

		System.out.println("1 to move up, 2 to move down, 3 to move to the left and 4 to move to the right by 1.");

		do {
			// for debugging purposes, print out
			// System.out.println("Your current position is (" + userX + ", " + userY +
			// ").");

			distance = Math.sqrt(Math.pow(userX - goalX, 2) + Math.pow(userY - goalY, 2));
			System.out.println("You are currently " + distance + " away from your goal.");

			printGrid(userX, userY);

			i = move.nextInt();

			switch (i) {
			case 1:
				userY--;
				break;
			case 2:
				userY++;
				break;
			case 3:
				userX--;
				break;
			case 4:
				userX++;
				break;
			default:
				System.out.println("This is not a valid input. Please enter 1 (up), 2 (down), 3 (left) or 4 (right).");
				// an invalid input does not count as a try
				count--;
			}

			count++;

			// if user moves outside of the 7x7 grid, they hit a 'wall'. User is not able to
			// move outside the grid or jump from one end of one row or column to the other.
			// However, trying to move outside the grid counts as a turn.

			switch (userY) {
			case 0:
				userY = 1;
				break;
			case 8:
				userY = 7;
				break;
			// default:
			// do nothing
			}

			switch (userX) {
			case 0:
				userX = 1;
				break;
			case 8:
				userX = 7;
				break;
			// default:
			// do nothing
			}

			if ((userX == teleportX1) && (userY == teleportY1)) {
				userX = teleportX2;
				userY = teleportY2;
				System.out.println(teleportMsg);
				printGrid(userX, userY);
			} else if ((userX == teleportX2) && (userY == teleportY2)) {
				userX = teleportX1;
				userY = teleportY1;
				System.out.println(teleportMsg);
				printGrid(userX, userY);
			}

		} while ((userX != goalX) || (userY != goalY));

		move.close();

		System.out.println("You have reached your goal (" + userX + ", " + userY + ").");
		printGrid(userX, userY);
		System.out.println("Congratulations! It took you " + count + " turns to reach the goal.");

	}

	// additional task (task #18): print out a visual representation
	static void printGrid(int userX, int userY) {

		String empty = "| ";
		String player = "|x";
		String line = "---------------";
		String endRow = "|\n";

		// every line break between the ...| | | |... lines also count as
		// a row
		for (int row = 1; row < 16; row++) {

			if (row % 2 == 1) {
				System.out.println(line);
			} else {

				for (int column = 1; column <= 8; column++) {
					if ((column == userX) && (row == 2 * userY)) {
						System.out.print(player);
					} else if (column == 8) {
						System.out.print(endRow);
					} else {
						System.out.print(empty);
					}

				}

			}
		}
	}

}
