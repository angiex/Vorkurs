package edu.ax.day6;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JDialog;

// according to exercise sheet:
// import java.awt.*
// import java.awt.event.*
// import javax.swing.*

public class JavaAWT {

	public static void main(String[] args) {
		JDialog window = new JDialog();

		window.setTitle("Spezialaufgabe: Java AWT");
		window.setBounds(10, 10, 500, 500);
		window.setLayout(new GridLayout(5, 5));

		for (int i = 1; i <= 25; i++) {
			window.add(new Button("Button " + i));
		}

		window.setModal(true);
		window.setVisible(true);

	}

}
