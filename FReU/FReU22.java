package FReU;

/** Reusing Classes, Exercise 22:
 * (1) Create a final class and attempt to inherit from it.
 * 
 * @author joe
 */
public class FReU22 extends FReU22final {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("A final class (e.g., FReU22final) cannot be inherited, so FReU22 causes a compile error.");
	}
}

/** a final class */
final class FReU22final {
	int i = 7;
}