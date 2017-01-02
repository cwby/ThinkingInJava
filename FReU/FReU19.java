package FReU;

/** Reusing Classes, Exercise 19:
 * (2) Create a class with a blank final reference to an object.
 * Perform the initialization of the blank final inside all constructors.
 * Demonstrate the guarantee that the final must be initialized before use,
 * and that it cannot be changed once initialized.
 * 
 * <p> I do NOT know how to demonstrate the guarantee that the final must be initialized before use.
 * 
 * @author joe
 */
public class FReU19 {
	FReU19() {
		f = 3;
	}
	FReU19(int i) {
		f = i;
	}
	final int f ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU19 t = new FReU19();
		System.out.println("FReU19 object created with no arguments. i = " + t.f);
		FReU19 s = new FReU19(19);
		System.out.println("FReU19 object created with int argument. i = " + s.f);
		//t.f = 9; // This line will not compile, because the value of this final object, f, cannot be changed once it is initialized.
	}
}
