package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String ari = "Ari is Good at Soccer"; 
		String kaleb = "Kaleb has no special talents :(:(:(";
		String nick = "He is Bald";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String question = JOptionPane.showInputDialog("Enter a name of a Person at the League of Amazing Programers at 12625 High Bluff Dr #113, San Diego, CA 92130.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(question.equalsIgnoreCase("Ari")) {
			JOptionPane.showMessageDialog(null,ari);
		}
		else if(question.equalsIgnoreCase("Kaleb")) {
			JOptionPane.showMessageDialog(null,kaleb);
		}
		else if(question.equalsIgnoreCase("Nick")) {
			JOptionPane.showMessageDialog(null,nick);
		}
		else {
			JOptionPane.showMessageDialog(null,"They don't go to the League");

		}
	}
}

