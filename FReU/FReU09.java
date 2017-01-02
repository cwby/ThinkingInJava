package FReU;

/** Reusing Classes, Exercise 09:
 * (2) Create a class called Root (FReU09root) that contains an instance of each of the classes 
 * (that you also create) named Component1, Component2, and Component3 (FReU09a, FReU09b, FReU09c).
 * Derive a class Stem (FReU09) from Root that also contains an instance of each “component.” 
 * All classes should have default constructors that print a message about that class.
 * 
 * @author joe
 */
public class FReU09 extends FReU09root {
	FReU09() {
		System.out.println("FReU09 default constructor");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU09 t = new FReU09();
	}
}
/** a class containing instances (objects) of the classes FReU09a, FReU09b, & FReU09c */
class FReU09root {
	FReU09root() {
		System.out.println("FReU09root default constructor");
	}
	FReU12a a = new FReU12a();
	FReU12b b = new FReU12b();
	FReU12c c = new FReU12c();
}
/** a class to be a component of FReU09root */
class FReU09a {
	FReU09a() {
		System.out.println("FReU09a default constructor");
	}
}
/** a class to be a component of FReU09root */
class FReU09b {
	FReU09b() {
		System.out.println("FReU09b default constructor");
	}
}
/** a class to be a component of FReU09root */
class FReU09c {
	FReU09c() {
		System.out.println("FReU09c default constructor");
	}
}
