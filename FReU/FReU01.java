package FReU;

/** Reusing Classes, Exercise 01:
 * (2) Create a simple class.
 * Inside a second class,
 * define a reference to an object of the first class.
 * Use lazy initialization to instantiate this object.
 * 
 * @author joe
 */
public class FReU01 {
	static FReU01simple t ; // Making it static seems necessary to make it exist before the main method is run.
	/** Demonstrate lazy initialization
	 * @param args
	 */
	public static void main(String[] args) {
		// "lazy initialization" - the object is initialized just before it is needed.
		if (t == null) {
			t = new FReU01simple();
		}
	}
}

/** a simple class */
class FReU01simple {
	FReU01simple() {
		System.out.println("A FReU01simple object is constructed.");
	}
}