package DIni;


/** Initialization & Cleanup, Exercise 17:
 * (2) Create a class with a constructor that takes a String argument.
 * During construction, print the argument.
 * Create an array of object references to this class,
 * but don’t actually create objects to assign into the array.
 * 
 * When you run the program, notice whether the initialization messages from the constructor calls are printed.
 * Answer: No initialization messages are printed, because the code just creates references to unfilled array spots.
 * 
 * @author joe
 */
public class DIni17 {
	DIni17(String s) {
		System.out.println("in Constructor. s = " + s) ;
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni17[] myS = new DIni17[3] ;
	}
}
