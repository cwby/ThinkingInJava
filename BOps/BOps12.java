package BOps;

/** Operators, Exercise 12:
 * (3) Start with a number that is all binary ones. 
 * Left shift it, then use the unsigned right-shift operator to right shift 
 * through all of its binary positions, 
 * each time displaying the result using Integer.toBinaryString( ).
 * @author joe
 */
public class BOps12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0xf ;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(x<<=1));
		//for (int i = 0; i < 4; i++) {
		//while (x > 0) {
		do {
			System.out.println(Integer.toBinaryString(x>>>=1));
		} while (x != 0); // "not x" at the end of a do look is kind of like "until x". Java has no "until" loop.
	}

}
