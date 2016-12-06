package BOps;

/** Operators, Exercise 13:
 * (1) Write a method that displays char values in binary form. 
 * Demonstrate it using several different characters.
 * @author joe
 */
public class BOps13 {
	void charToBin(char c) {
		System.out.println(c + ": " + Integer.toBinaryString(c<<0));
	}
	public static void main(String[] args) {
		String data = "aerop";
		BOps13 doIt = new BOps13() ;
	    for (int i = 0; i < data.length(); i++) {
	    	doIt.charToBin(data.charAt(i));
	    	//System.out.println(data.charAt(i) + ": " + Integer.toBinaryString(data.charAt(i)<<0));
	    }
	}
}
