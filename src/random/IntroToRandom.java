//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r =0;
		
		//3. Now make r random. 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
	Random randy = new Random();
	int num = randy.nextInt();
    int num2 = randy.nextInt(101);
    int  num3 = randy.nextInt(51)+25;
		//4. Limit the random number between 0 and 100
   int num4 = randy.nextInt(311)-222;
		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value

		//6. Challenge: Limit the random number between -222 and 88

		//1. Print out the value of r
		System.out.println(num4);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}