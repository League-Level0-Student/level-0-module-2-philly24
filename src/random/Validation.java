//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		
		String[]compliments = new String[5];
compliments[0] = "you look good";
compliments[1] = "you are nice";
compliments[2] = "you are cool";
compliments[3] = "you are smart";
compliments[4] = "you are good looking"; 
/*
for (int i = 0; i < compliments.length; i++) {
	System.out.println(compliments[i]); 
}
*/	


for (int i = 0; i < 10; i++) { 
	int randomNumber2 = randomMaker.nextInt(5);
System.out.println(compliments[randomNumber2]);
}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
