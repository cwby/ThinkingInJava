package DIni;


/** Initialization & Cleanup, Exercise 3:
 * (1) Create a class with a default constructor (one that takes no arguments) that prints a message.
 * Create an object of this class.
 * @author joe
 */
public class DIni03 {
	DIni03() {System.out.println("This constructor prints a message."); }
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni03 t = new DIni03();
	}
}
