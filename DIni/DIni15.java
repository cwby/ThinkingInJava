package DIni;


/** Initialization & Cleanup, Exercise 15:
 * (1) Create a class with a String that is initialized using instance initialization.
 * @author joe
 */
public class DIni15 {
	String s ;
	{
		s = "example of instance initialization";
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni15 t = new DIni15();
		System.out.println("s = " + t.s );
	}
}
