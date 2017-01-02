package FReU;

/** Reusing Classes, Exercise 24:
 * (2) In Beetle.java,
 * inherit a specific type of beetle from class Beetle,
 * following the same format as the existing classes.
 * Trace and explain the output.
 * 
 * @author joe
 */
public class FReU24 extends FReU24beetle {
	private int l = printInit(9, "FReU24.l initialized");
	public FReU24() {
		System.out.println("l = " + l);
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x3 = printInit(7, "static FReU24.x3 initialized");
	public static void main(String[] args) {
		FReU24 b = new FReU24();
	}
}

class FReU24beetle extends FReU24insect {
	protected int k = printInit(5, "FReU24.k initialized");
	public FReU24beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = printInit(3, "static FReU24beetle.x2 initialized");
} 

class FReU24insect {
	private int i = 4;
	protected int j;
	FReU24insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 =	printInit(1, "static FReU24insect.x1 initialized");
	static int printInit(int i, String s) {
		System.out.println(s);
		return i;
	}
}
/* output, with explanation:
i = 4, j = 0 // constructor of top-level parent (FReU24insect) print its private "i" and not-yet-initialized "j" values.
FReU24.k initialized  // constructor of FReU24beetle initializes k. j was initialized when FReU24insect was constructed.
k = 5 
j = 39
FReU24.l initialized   // constructor of FReU24 initializes l. j & k are already initialized.
l = 9
k = 5
j = 39
 */

