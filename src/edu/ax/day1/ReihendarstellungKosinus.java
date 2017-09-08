package edu.ax.day1;
public class ReihendarstellungKosinus {

	public static void main(String[] args) {
		System.out.println(cosinus(3.1415, 5));
		System.out.println(cosinus(3.1415/4, 5));
		System.out.println(cosinus(3.1415/2, 5));
	}
	
	//Methode für Fakultäten
	public static int fakultaet(int zufakultieren) {
		//initialisiere x
		int x = 1;
		
		//Beachte den Fall: 0! = 1
				if (zufakultieren == 0) {
					x = 1;
				}
		
		//for-Schleife zum Berechnen von Fakultäten
		for (int n = zufakultieren; n>0; n--) {
			//multipliziere x mit n und speichere das ergebnis unter x, wiederhole mit
			//dem nächstkleineren n
			x = x*n;
			}
		
		//Methode gibt x = zufakultieren! aus
		return x;
		}
	
	//Methode für Potenzen
	//BEACHTE: Diese Methode gilt nur für nicht-negative ganzzahlige Exponenten, da sonstige Zahlen
	//als Exponenten in unserer Aufgabe nicht relevant sind
	public static double potenz(double base, int exp) {
		//initialisiere y
		double y = 1;
		
		//beachte den Fall: exp = 0
				if (exp == 0) {
					y = 1;
				}
		
		//For-Schleife zum Berechnen von Potenzen
		for (int x = exp; x>0; x--) {
			y = y*base;
		}
		
		//Methode gibt y = base^exp aus
		return y;
	}
	
	public static double cosinus(double x, int durchlaeufe) {
		int n = 0;
		double cos = 0;
		
		//verwende nun n als zähler bis die gewünschte anzahl an durchläufen erreicht ist
		while (n < durchlaeufe) {
			cos = cos + potenz(-1, n)*(potenz(x, 2*n)/fakultaet(2*n));
			n++;
		}
		return cos;
	}

}
