package FReU;

import java.util.Random;

/** Reusing Classes, Exercise 18:
 * (2) Create a class with a static final field and a final field 
 * and demonstrate the difference between the two.
 * 
 * @author joe
 */
public class FReU18 {
	/** a Random object, to generate random things. */
	private static Random rand = new Random();
	/** a final int object (random value) */
	private final int notStatic = rand.nextInt(100);
	/** a static final int object (random value) */
	private final static int isStatic = rand.nextInt(100);
	void printMe() {
		System.out.println("notStatic = " + notStatic + ";   isStatic = " + isStatic);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU18 x = new FReU18();
		x.printMe();
		FReU18 y = new FReU18();
		y.printMe();
	}
}
