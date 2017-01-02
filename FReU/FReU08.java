package FReU;

/** Reusing Classes, Exercise 08:
 * (1) Create a base class with only a non-default constructor,
 * and a derived class with both a default (no-arg) and non-default constructor.
 * In the derived-class constructors,
 * call the base-class constructor.
 * 
 * @author joe
 */
public class FReU08 extends FReU08parent {
	FReU08() {
		super(2);
		System.out.println("FReU08 default constructor (requiring no argument)");
	}
	FReU08(int i) {
		super(i);
		System.out.println("FReU08 constructor requiring int argument, int = " + i);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU08 t = new FReU08(3);
		FReU08 a = new FReU08();		
	}
}
/** Base class with only a non-default constructor */
class FReU08parent {
	FReU08parent(int i) {
		System.out.println("FReU08parent constructor requiring int argument, int = " + i);
	}
}