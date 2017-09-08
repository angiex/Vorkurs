package edu.ax.day4;

public class EinfacheForSchleifenA {

	public static void main(String args[]) {
	
		int a = 1;
		int mod;
	
		//Gebe 1...40 aus und den Rest der Division durch 7
		for (int i = a; i <= 40; i++) {
			mod = i % 7;
			System.out.println(i + " dividiert durch 7 ergibt den Rest " + mod);
			
		}
	}
}
