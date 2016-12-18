package DIni;


/** Initialization & Cleanup, Exercise 16:
 * (1) Create an array of String objects and assign a String to each element.
 * Print the array by using a for loop.
 * @author joe
 */
public class DIni16 {
	String[] s = {"a", "b", "c"};
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni16 t = new DIni16() ;
		for (int i=0; i < t.s.length; i++) {
			System.out.print(t.s[i] + "  ");
		}
	}
}
