package edu.ax.day4;

public class EinfacheForSchleifenC {

	public static void main(String[] args) {
		
		double sum = 0.0;
		double av;
		
		//Berechne die Summer aller 100 Zufallszahlen
		for (int i = 0; i < 100; i++) {
			sum = sum + Math.random();
		}
		
		av = sum / 100;
		
		System.out.println(av);
		
	}
	
}
