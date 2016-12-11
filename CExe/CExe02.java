package CExe;

import java.util.Random;

/** Controlling Execution, Exercise 2: 
 * (2) Write a program that generates 25 random int values.
 *  For each value, use an if-else statement to classify it as 
 *  greater than, less than, or equal to a second randomly generated value.
 * 
 * @author joe
 *
 */
public class CExe02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i=0; i<25; i++) {
			int r = rand.nextInt(5), c = rand.nextInt(5);
			String e ;
			if (r < c) 
				e = "r < c";
			else if (r == c)
				e = "r = c";
			else
				e = "r > c";
			System.out.println("r="+r+"  c="+c+" comparison: "+ e);
		}
	}

}
