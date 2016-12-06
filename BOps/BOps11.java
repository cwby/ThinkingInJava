package BOps;

/** Operators, Exercise 11:   
 * (3) Start with a number that has a binary one in the most significant position 
 * (hint: Use a hexadecimal constant). 
 * Using the signed right-shift operator, right shift it all the way through 
 * all of its binary positions, each time displaying the result using Integer.toBinaryString( ).
 * @author joe
 */
public class BOps11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0xd ;
		System.out.println(Integer.toBinaryString(x));
		//for (int i = 0; i < 4; i++) {
		//while (x > 0) {
		do {
			System.out.println(Integer.toBinaryString(x>>=1));
		} while (x != 0); // "not x" at the end of a do look is kind of like "until x". Java has no "until" loop.
	}

}
