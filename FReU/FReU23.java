package FReU;

/** Reusing Classes, Exercise 23:
 * (2) Prove that class loading takes place only once.
 * Prove that loading may be caused by either 
 * the creation of the first instance of that class 
 * or by the access of a static member.
 * 
 * @author joe
 */
public class FReU23 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("class loading takes place only at the creation of the first instance of that class");
		FReU23a t = new FReU23a();
		FReU23a t2 = new FReU23a();
		System.out.println("... or at the first access of a static member of the class");
		System.out.println("Accessing a static member of FReU23b:" + FReU23b.b);
		System.out.println("Accessing a static member of FReU23b, again:" + FReU23b.b);
	}
}

/** A class containing a static object */
class FReU23a {
	static int a = printInt(31, "Initializing the int \"a\" (happens only once, no matter how many of these objects are created)");
	FReU23a() {
		System.out.println("An FReU23a object is created.");
	}
	static int printInt(int i, String s) {
		System.out.println(s + "   [Returning the int 31]");
		return i;
	}
}

/** A class containing a static object */
class FReU23b {
	static int b = FReU23a.printInt(71, "Initializing the int \"b\" (happens only once, no matter how many time members of the class are accessed)");
	FReU23b() {
		System.out.println("An FReU23b object is created.");
	}
}
