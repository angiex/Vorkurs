package edu.ax.day6;

public class Vektortest {

	public static void main(String[] args) {

		Raumvektor one = new Raumvektor();
		Raumvektor two = new Raumvektor();
		Raumvektor add = new Raumvektor();

		one.x = 1;
		one.y = 2;
		one.z = 3;

		two.x = 8;
		two.y = 9;
		two.z = 10;

		add.x = one.x + two.x;
		add.y = one.y + two.y;
		add.z = one.z + two.z;

		one.printVector();
		two.printVector();
		add.printVector();
	}

}
