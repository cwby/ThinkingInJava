package FReU;

/** Reusing Classes, Exercise 13:
 * (2) Create a class with a method that is overloaded three times.
 * Inherit a new class,
 * add a new overloading of the method,
 * and show that all four methods are available in the derived class.
 * 
 * @author joe
 */
public class FReU13 extends FReU13parent{
	void overloadMe(boolean b) {
		System.out.println("overloadMe method with boolean argument, b = " + b);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU13 o = new FReU13();
		o.overloadMe();
		o.overloadMe(3);
		o.overloadMe('a');
		o.overloadMe(true);
	}
}
class FReU13parent {
	void overloadMe() {
		System.out.println("overloadMe method with no arguments");
	}
	void overloadMe(int i) {
		System.out.println("overloadMe method with int argument, i = " + i);
	}
	void overloadMe(char c) {
		System.out.println("overloadMe method with char argument, c = " + c);
	}
}