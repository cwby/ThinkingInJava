package DIni;

/** Initialization & Cleanup, Exercise 1:
 * (1) Create a class containing an uninitialized String reference. 
 * Demonstrate that this reference is initialized by Java to null.
 * @author joe
 */
public class DIni01 {
	String s ;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DIni01 t = new DIni01();
		System.out.println("s="+t.s);
	}

}
