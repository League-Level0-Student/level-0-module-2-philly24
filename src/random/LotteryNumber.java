package random;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {
public static void main(String[] args) {
	Random randomMaker = new Random();
	
 int randomNumber = randomMaker.nextInt(5);
int randomNumber2 = randomMaker.nextInt(5);		
int randomNumber3 = randomMaker.nextInt(5);
int randomNumber4 = randomMaker.nextInt(5);
int randomNumber5 = randomMaker.nextInt(5);
	JOptionPane.showMessageDialog(null, "Lottery ticket numbers " + randomNumber + randomNumber2 + randomNumber3 + randomNumber4 + randomNumber5 );
}
}
