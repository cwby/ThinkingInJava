package DIni;


/** Initialization & Cleanup, Exercise 10:
 * (2) Create a class with a finalize( ) method that prints a message.
 * In main( ), create an object of your class.
 * Explain the behavior of your program.
 * @author joe
 */
public class DIni10 {
	protected void finalize() {
		System.out.println("the memory used for the DIni10 object is about released");
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni10 t = new DIni10();
		System.out.println("All done with the DIni10 object, t");
		// finalize() will only be called if the system runs low on memory, and so needs to find what memory it may release.
		// So the output probably will not show the message, "the memory used for the DIni10 object is about released"
	}
}
