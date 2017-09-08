package edu.ax.day4;
import java.util.Scanner;

public class Computerspieler {

	public static void main(String[] args) {
		
		int guess = 500;
		int max = 1000;
		int min = 0;
		int times = 0;
		//int borders[] = {guess, max};
		byte reply;
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter 1 when the number is higher, -l when lower and 0 when exactly the same.");
		
		do {
			System.out.println("Is the number higher, lower or exactly " + guess + "?");
			reply = user.nextByte();
			
			if (reply == 1) {
				min = guess;
				guess = (min + max) / 2;
			} else if (reply == -1) {
				max = guess;
				guess = (min + max) / 2;
			} else {
				System.out.println("Please enter a valid reply.");
				times--;
			}
			
			times++;
			
		} while (reply != 0);
		
		user.close();
		System.out.println("Thanks for playing. The computer needed " + times + " tries");
		
	}
	
}
