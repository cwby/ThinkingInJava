package FReU;

/** Reusing Classes, Exercise 04:
 * (2) Prove that the base-class constructors are 
 * (a) always called and 
 * (b) called before derived-class constructors.
 * 
 * @author joe
 */
public class FReU04 extends FReU04parent{
	FReU04() {
		System.out.println("Constructed a FReU04 object.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU04 t = new FReU04();
	}
}
/** Make a class to be inherited. */
class FReU04parent {
	FReU04parent() {
		System.out.println("Constructed a FReU04parent object.");
	}
}