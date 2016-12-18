package DIni;

/** Initialization & Cleanup, Exercise 2:
 * (2) Create a class with a String field that is initialized at the point of definition,
 * and another one that is initialized by the constructor.
 * What is the difference between the two approaches?
 * @author joe
 */
public class DIni02 {
	String s = "initialized at the point of definition" ;
	String st ;
	DIni02() {
		s = s + ", then appended to by the constructor";
		st = "initialized by the constructor" ;
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni02 t = new DIni02() ;
		System.out.println("s = " + t.s + "\nst = " + t.st);
	}
}
