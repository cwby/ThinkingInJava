package FReU;

/** Reusing Classes, Exercise 10:
 * (1) Modify the previous exercise so that each class only has non-default constructors.
 * 
 * @author joe
 */
public class FReU10 extends FReU10root {
	FReU10(int i) {
		super(i);
		System.out.println("FReU10 constructor requiring int argument, int = " + i);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU10 t = new FReU10(3);
	}
}
/** a class containing instances (objects) of the classes FReU10a, FReU10b, & FReU10c */
class FReU10root {
	FReU10root(int i) {
		System.out.println("FReU10root constructor requiring int argument, int = " + i);
		FReU10a a = new FReU10a(i);
		FReU10a b = new FReU10a(i);
		FReU10a c = new FReU10a(i);
	}
}
/** a class to be a component of FReU10root */
class FReU10a {
	FReU10a(int i) {
		System.out.println("FReU10a constructor requiring int argument, int = " + i);
	}
}
/** a class to be a component of FReU10root */
class FReU10b {
	FReU10b(int i) {
		System.out.println("FReU10a constructor requiring int argument, int = " + i);
	}
}
/** a class to be a component of FReU10root */
class FReU10c {
	FReU10c(int i) {
		System.out.println("FReU10a constructor requiring int argument, int = " + i);
	}
}
