package edu.ax.day4;

public class EinfacheForSchleifenB {

	public static void main(String[] args) {
		
		long n = 1;
		double result = 0.0;
		
		//Berechne die Das Ergebnis der Summenformel von n bis 199999999 für 1/n^2
		for (long i = n; i <= 199999999 ; i++) {
			result = result + ( 1 / Math.pow(i, 2) );			
		}
		
		System.out.println(result);
		
	}
	
}
