package DIni;


/** Initialization & Cleanup, Exercise 14:
 * (1) Create a class with a static String field that is initialized at the point of definition,
 * and another one that is initialized by the static block.
 * Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
 * 
 * I do not see how this proves that the fields are initialized before they are used, 
 *   except that the do indeed have non-null values.
 *   Maybe by "used" the author means used within "main".
 *   
 * @author joe
 */
public class DIni14 {
	static String si = "Static String initialized at the point of definition";
	static String sb ;
	static {
		sb = "Static String initialized by a static block";
		System.out.println("si and sb are initialized.");
		printThem();
	}
	static void printThem() {
		System.out.println("si = " + si + "\nsb = " + sb);
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		System.out.println("I am in main, and about to use the String fields si and sb.");
		DIni14.printThem();
	}
	static DIni14 t = new DIni14();
}
