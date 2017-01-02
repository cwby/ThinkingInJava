package FReU;

/** Reusing Classes, Exercise 21:
 * (1) Create a class with a final method.
 * Inherit from that class and attempt to overwrite that method.
 * 
 * @author joe
 */
public class FReU21 extends FReU21parent {
	void myMethod() {
		System.out.println("Attempt to override a final method of the parent class.");
	} // FReU21parent.myMethod() is final, so this fails with "Error: A JNI error has occurred..."
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU21 t = new FReU21();
	}
}

/** */
class FReU21parent {
	final void myMethod() {}
}