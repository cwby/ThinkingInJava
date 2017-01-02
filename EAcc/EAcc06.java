package EAcc;

/** Access Control, Exercise 06:
 * (1) Create a class with protected data.
 * Create a second class in the same file with 
 * a method that manipulates the protected data in the first class.
 * <p>class EAcc06 has a method that manipulates the protected data in EAcc06prot
 * 
 * @author joe
 */
public class EAcc06 {
	/** manipulate protected data in another class in this package
	 * 
	 * @param o an EAcc06prot object
	 * @param s any string, to append to the EAcc06prot pro field
	 * @return the pro text string, appended with the given text
	 */
	String appendTo_pro(EAcc06prot o, String s) {
		o.pro = o.pro + s ;
		return o.pro ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EAcc06 t = new EAcc06();
		EAcc06prot e = new EAcc06prot();
		String s = t.appendTo_pro(e, " - I added this text");
		System.out.println(s);
	}
}

/** A class with protected data.
 * 
 * @author joe
 *
 */
class EAcc06prot {
	/** a protected field */
	protected String pro = "protected field" ;	
}