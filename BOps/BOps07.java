package BOps;
import java.util.*; 

/** Operators, Exercise 7:
 * (3) Write a program that simulates coin-flipping.
 * 
 * @author joe
 *
 */
public class BOps07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random() ;
		if (rand.nextBoolean()) {
			System.out.println("heads");
		} else {
			System.out.println("tails");
		}
		
	}

}
