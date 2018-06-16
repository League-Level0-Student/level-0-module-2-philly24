package random;

import javax.swing.JOptionPane;

public class Votingboth {
public static void main(String[] args) {
	String answer =JOptionPane.showInputDialog("How old are you in years");
	int go = Integer.parseInt(answer);
	if (go >=18) {
		JOptionPane.showInputDialog("who should be the next president?");
	} else {
JOptionPane.showMessageDialog(null, "No one cares");
	}
}
}
