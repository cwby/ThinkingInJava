package DIni;


/** Initialization & Cleanup, Exercise 12:
 * (4) Create a class called Tank that can be filled and emptied,
 * and has a termination condition that it must be empty when the object is cleaned up.
 * Write a finalize( ) that verifies this termination condition.
 * In main( ), test the possible scenarios that can occur when your Tank is used.
 * 
 * The order in which things are executed here confuses me.  
 *   Maybe that is because the program execution is _not_ suspended as garbage collection runs, 
 *    so the program and garbage collection output is interspersed with each other.
 *   The order of the lines output changes between 2 runs of the same code when I 
 *     comment out the 1st System.gc(),
 *     run the code.
 *     un-comment the 1st System.gc(),
 *     run the code,
 *     then run the code again.
 * The finalize() only seems to run on the un-named DIni12 objects.  Maybe java thinks that the named objects may still be used later.
 * @author joe
 */
public class DIni12 { // I will call the class DIni12 rather than Tank
	int instance ;
	static int i = 1;
	/**
	 * Create a "tank" (a DIni12 object), saying whether it is full
	 * @param b Specify true if you want a full DIni12, or false if you want an empty DIni12.
	 */
	DIni12() {
		instance = i++ ;
		System.out.println("Creating instance " + instance + " of a DIni12 object");
	}
	boolean full = false ;
	boolean fill() {
		full = true ;
		return full ;
	}
	boolean drain() {
		full = false ;
		return full ;
	}
	protected void finalize() {
		System.out.println("The DIni12 finalize() is running now, cleaning up instance " + instance);
		if (full) System.out.println("ERROR(me): Instance " + instance + " of the Dini12 object is full");
		//super.finalize(); // Call the base-class version (needs exception handling)
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni12 t = new DIni12();  // instance 1
		System.out.println("t.full is " + t.full + "    t.instance = " + t.instance);
		new DIni12().fill();      // instance 2
		System.gc();              // At this point, instances 1 & 2 are no longer in use, and so could be garbage-collected
		System.out.println("Try another scenario.");
		DIni12 t2 = new DIni12(); // instance 3
		System.out.println("t2.full is " + t2.full + "    t2.instance = " + t2.instance );
		t2.drain();
		System.out.println("t2.full is " + t2.full + "    t2.instance = " + t2.instance );
		new DIni12();             // instance 4
		new DIni12().fill();      // instance 5
		System.gc();
	}
}
