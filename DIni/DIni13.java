package DIni;


/** Initialization & Cleanup, Exercise 13:
 * (1) Verify the statements in this paragraph:
 * The static initializers for Cups run when either the access of the static object cup1 occurs on the line marked (1), 
 * or if line (1) is commented out and the lines marked (2) are uncommented. 
 * If both (1) and (2) are commented out, the static initialization for Cups never occurs, 
 * as you can see from the output. 
 * Also, it doesn’t matter if one or both of the lines marked (2) are uncommented; 
 * the static initialization only occurs once.
 * <p>
 * Per the instructions above, 
 * test the code below by un-commenting:<ul>
 *    <li>line 1, or </li>
 *    <li>2a & 2b, or </li>
 *    <li>just 2a, or </li>
 *    <li>just 2b, or </li>
 *    <li>none of them.</li>
 * </ul>
 * @author joe
 */
public class DIni13 { // This code is copied from the book, but the book calls the class ExplicitStatic rather than DIni13.
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.cup1.f(99); // (1)
	}
//	 static Cups cups1 = new Cups(); // (2a)
//	 static Cups cups2 = new Cups(); // (2b)
}

// The code below is copied from the book:
class Cup {
		Cup(int marker) {
			System.out.println("Cup(" + marker + ")");
		}
		void f(int marker) {
			System.out.println("f(" + marker + ")");
		}
	}
class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {
		System.out.println("Cups()");
	}
}
/* Output:
Inside main()
Cup(1)
Cup(2)
f(99)
*///:~
