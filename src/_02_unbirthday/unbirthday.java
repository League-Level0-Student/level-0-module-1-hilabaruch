package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "what's your birthday date?");
		if (a.equals("07/30")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");

		}

		else {
			JOptionPane.showMessageDialog(null, "messy unbirthday to you");
		}
	}
}
