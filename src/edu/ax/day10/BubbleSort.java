package edu.ax.day10;

public class BubbleSort {

	public static void bubbleSort(double[] sort) {
		boolean change;
		do {
			change = false;
			for (int i = 0; i < sort.length - 1; i++) {

				if (sort[i] > sort[i + 1]) {
					double tempStore = sort[i];
					sort[i] = sort[i + 1];
					sort[i + 1] = tempStore;
					change = true;
				}
			}
		} while (change);
	}

}