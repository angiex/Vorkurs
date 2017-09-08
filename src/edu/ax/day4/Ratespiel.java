package edu.ax.day4;
import java.util.Scanner;

public class Ratespiel {

	public static void main(String[] args) {
		
		//generate random number from 1 to 1000
		short rand = (short) (Math.round(Math.random() * 999) + 1);
		short uNumber;
		int times = 0;
		
		System.out.println("Geben Sie eine Zahl zwischen 1 und 1000 ein. Wenn Sie das Spiel beenden möchten, geben Sie 0 ein.");
		
		Scanner input = new Scanner(System.in);
		
		do {
			//user enters number
			uNumber = input.nextShort();
			
			//test if uNumber is bigger or smaller than generated number
			if (uNumber < rand) {
				System.out.println("Die gesuchte Zahl ist größer.");
			} else if (uNumber > rand) {
				System.out.println("Die gesuchte Zahl ist kleiner.");
			}
			
			//count how many times user guesses number
			times++;
			
			//stop loop if uNumber is 0 or the correct number
		} while ( (uNumber != rand) && (uNumber != 0) );
		
		input.close();
		
		System.out.println("Die gesuchte Zahl ist " + rand + ". Sie haben " + times + " Versuche gebraucht.");
		
	}
	
}
