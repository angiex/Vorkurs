package edu.ax.day1;
//öffentliche Klasse Arithmetik
public class Arithmetik {
	
	public static void main(String[] args) {
		//b) Lege reelle Zahl x = 1.0 an
		double x = 1.0;
		
		//c) Gib aus, dass das Programm Arithmetik gestartet wurde und was der Wert von x ist.
		System.out.println("Das Programm Arithmetik wurde gestartet. x besitzt den Wert " + x);
		
		//d) Gib das Polynom  y = f(x) aus
		double y = 1+2*x*x+5*x*x*x*x;
		System.out.println("Das Ergebnis von y mit y=f(x)=1+2x^2+5x^4 ist " + y);
		
		//e) Sinus, Kosinus und Tangens von x
		System.out.println("Der Sinus von x ist " + Math.sin(x));
		System.out.println("Der Kosinus von x ist " + Math.cos(x));
		System.out.println("Der Tangens von x ist " + Math.tan(x));
		
		//f) z berechnen, übernehme y aus d
		//zaehler von z
		double zaehler = 1+y-(Math.sin(y)/Math.cos(3));
		//Teilergebnis Zähler im Nenner
		double a = Math.sqrt(24)+ Math.sin(0.2*y) + Math.cos(Math.sin(Math.cos(y+1))) - 0.3*y;
		//Teilergebnis Nenner im Nenner
		double b = 1+ Math.sqrt(y) + Math.sin(0.4);
		//Berechne z
		double z = zaehler/(1+(a/b));
		//Gebe das Ergebnis aus
		System.out.println("Das Ergebnis von z ist " + z);
	}

}
