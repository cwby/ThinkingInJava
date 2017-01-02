package FReU;

/** Reusing Classes, Exercise 03:
 * (2) Prove the sentence, 
 * "Even if you don’t create a constructor for Cartoon( ), 
 * the compiler will synthesize a default constructor for you 
 * that calls the base class constructor."
 * 
 * @author joe
 */
public class FReU03 extends FReU03parent {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU03 t = new FReU03();
	}
}

/** Create a child class without an explicit constructor. */
class FReU03parent {
	FReU03parent() {
		System.out.println("Constructor for FReU03parent object");
	}
}