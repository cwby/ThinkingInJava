package DIni;


/** Initialization & Cleanup, Exercise 9:
 * (1) Create a class with two (overloaded) constructors.
 * Using this, call the second constructor inside the first one.
 * @author joe
 */
public class DIni09 {
	/**
	 * Default constructor, which prints the String "String from default constructor"
	 */
	DIni09() {
		this("String from default constructor");
		// You must use "this" rather than the constructor name 
		//  when calling a constructor from within another version of that overloaded constructor.
		//DIni09("String from default constructor"); // This fails, unless you create a DIni09() method 
		                                             //  which the DIni09() (within another DIni09 constructor) will call 
		                                             //  (rather than calling a DIni09(String) constructor).
	}
	/**
	 * Constructor that is passed a custom String
	 * @param s String to print when DIni09 object is created
	 */
	DIni09(String s) {
		System.out.println("     s = " + s + "\nthis.s = " + this.s);
	}
	String s = "Initial string";
	/**
	* @param args
	*/
	public static void main(String[] args) {
		System.out.println("\nResult of calling the default (no-arg) constructor:");
		DIni09 t = new DIni09();
		System.out.println("\nResult of calling the constructor which is passed a String:");
		DIni09 t2 = new DIni09("Custom string");
		System.out.println("\nt.s  = " + t.s + "\nt2.s = " + t2.s);
	}
}
