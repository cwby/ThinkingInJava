package FReU;

/** Reusing Classes, Exercise 12:
 * (3) Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
 * 
 * @author joe
 */
public class FReU12 extends FReU12root {
	FReU12() {
		System.out.println("FReU12 default constructor");
	}
	void dispose() {
		System.out.println("Disposing of FReU12 object.");
		super.dispose();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU12 t = new FReU12();
		t.dispose();
	}
}
/** a class containing instances (objects) of the classes FReU12a, FReU12b, & FReU12c */
class FReU12root {
	FReU12root() {
		System.out.println("FReU12root default constructor");
	}
	FReU12a a = new FReU12a();
	FReU12b b = new FReU12b();
	FReU12c c = new FReU12c();
	void dispose() {
		a.dispose();
		b.dispose();
		c.dispose();
		System.out.println("Disposing of FReU12root object.");
	}
}
/** a class to be a component of FReU12root */
class FReU12a {
	FReU12a() {
		System.out.println("FReU12a default constructor");
	}
	void dispose() {
		System.out.println("Disposing of FReU12a object.");
	}
}
/** a class to be a component of FReU12root */
class FReU12b {
	FReU12b() {
		System.out.println("FReU12b default constructor");
	}
	void dispose() {
		System.out.println("Disposing of FReU12b object.");
	}
}
/** a class to be a component of FReU12root */
class FReU12c {
	FReU12c() {
		System.out.println("FReU12c default constructor");
	}
	void dispose() {
		System.out.println("Disposing of FReU12c object.");
	}
}
