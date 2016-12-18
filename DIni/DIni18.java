package DIni;


/** Initialization & Cleanup, Exercise 18:
 * (1) Complete the previous exercise by creating objects to attach to the array of references.
 * @author joe
 */
public class DIni18 {
	DIni18(String s) {
		System.out.println("in Constructor. s = " + s) ;
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni18[] myS = new DIni18[3] ;
		for (int i = 0; i < myS.length ; i++) {
			myS[i] = new DIni18("x" + i);
		}
	}
}
