package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {

	 String answer = JOptionPane.showInputDialog("how tall are you in inches?");	

	 int go = Integer.parseInt(answer);
	 
	
if (go > 48 ) {
	JOptionPane.showMessageDialog(null, "you could go on the rollercoaster");
} 
if (go<48) {
	JOptionPane.showMessageDialog(null, "get taller bro");
}

}

}
	
	



