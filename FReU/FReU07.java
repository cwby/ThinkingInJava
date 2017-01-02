package FReU;

/** Reusing Classes, Exercise 07:
 * (1) Modify Exercise 5 so that A and B have constructors with arguments 
 * instead of default constructors.
 * Write a constructor for C and perform all initialization within C’s constructor.
 * 
 * @author joe
 */
public class FReU07 extends FReU07parent{
	FReU07(int i) {
		super(i);
		System.out.println("FReU07 constructor requiring int argument, int = " + i);
	}
	/** Create an object within this class (an example of composition, rather than inheritance). */
	FReU07component t = new FReU07component(2);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU07 c = new FReU07(4);
	}
}
/** Make a class to be inherited. */
class FReU07parent {
	FReU07parent(int i) {
		System.out.println("FReU07parent constructor requiring int argument, int = " + i);
	}
}
/** Make a class, an object of with will be created within another class. */
class FReU07component {
	FReU07component(int i) {
		System.out.println("FReU07component constructor requiring int argument, int = " + i);
	}
}
