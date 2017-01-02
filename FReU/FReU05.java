package FReU;

/** Reusing Classes, Exercise 05:
 * (1) Create two classes,
 * A and B,
 * with default constructors (empty argument lists) that announce themselves.
 * Inherit a new class called C from A,
 * and create a member of class B inside C.
 * Do not create a constructor for C.
 * Create an object of class C and observe the results.
 * 
 * @author joe
 */
public class FReU05 extends FReU05parent{
	/** Create an object within this class (an example of composition, rather than inheritance). */
	FReU05component t = new FReU05component();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU05 c = new FReU05();
		// Creating this object, first its parent class's constructor runs, 
		//  then the component class's constructor runs.
	}
}
/** Make a class to be inherited. */
class FReU05parent {
	FReU05parent() {
		System.out.println("Constructed a FReU05parent object.");
	}
}
/** Make a class, an object of with will be created within another class. */
class FReU05component {
	FReU05component() {
		System.out.println("Constructed a FReU05component object.");
	}
}