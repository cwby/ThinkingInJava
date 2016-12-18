package DIni;


/** Initialization & Cleanup, Exercise 7:
 * (1) Create a class without a constructor,
 * and then create an object of that class in main( ) to verify that the default constructor is automatically synthesized.
 * @author joe
 */
public class DIni07 {
	String c = "c prints this, proving that the object has been 'constructed'";
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni07 t = new DIni07();
		System.out.println(t.c);
	}
}
