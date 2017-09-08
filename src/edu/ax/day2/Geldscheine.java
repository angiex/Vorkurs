package edu.ax.day2;
import java.util.Scanner;

public class Geldscheine {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie einen ganzzahligen Geldbetrag ein.");
		int bezahlung = input.nextInt();
		input.close();
		
		int[] scheine = { 500, 200, 100, 50, 20, 10, 5 };
		//what kind of money do we have?
		System.out.println("Es sind Scheine von folgenden Werten enthalten:");
		for (int x = 0; x < scheine.length; x++) {
			System.out.println(scheine[x]);
		}
		
		/* Alternatively:
		 * System.out.println(Arrays.toString(scheine));
		 */
		
		//how many 500?
		int fiveC = bezahlung / scheine[0];
		System.out.println("500-Scheine: " + fiveC);
		int mod = bezahlung % scheine[0];
		
		int twoC = mod / scheine[1];
		System.out.println("200-Scheine: " + twoC);
		mod = mod % scheine[1];
		
		int oneC = mod / scheine[2];
		System.out.println("100-Scheine: " + oneC);
		mod = mod % scheine[2];
		
		int fifty = mod / scheine[3];
		System.out.println("50-Scheine: " + fifty);
		mod = mod % scheine[3];
		
		int twenty = mod / scheine[4];
		System.out.println("20-Scheine: " + twenty);
		mod = mod % scheine[4];
		
		int ten = mod / scheine[5];
		System.out.println("10-Scheine: " + ten);
		mod = mod % scheine[5];
		
		int five = mod / scheine[6];
		System.out.println("5-Scheine: " + five);
		mod = mod % scheine[6];
		
		System.out.println("In Münzen bleibt übrig: " + mod);
		
	}

}
