package BOps;
//import java.math.*; 

/** Operators, Exercise 8:   
 * (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results.
 * 
 * @author joe
 *
 */
public class BOps08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** A long expressed in octal notation */
		long o = 0351 ;
		int oi = (int) ((0 * Math.pow(8, 3)) + (3 * Math.pow(8, 2)) + (5 * Math.pow(8, 1)) + (1 * Math.pow(8, 0))) ;
		System.out.println("octal 0351: " + Long.toBinaryString(o) + "  in base 10: " + oi);
		long o2 = 077 ;
		int o2i = (int) ((0 * Math.pow(8, 2)) + (7 * Math.pow(8, 1)) + (7 * Math.pow(8, 0))) ;
		System.out.println("octal 0351: " + Long.toBinaryString(o2) + "  in base 10: " + o2i);
		/** A long expressed in hex notation */
		long h = 0x35df ;
		int hi = (int) ((3 * Math.pow(16, 3)) + (5 * Math.pow(16, 2)) + (13 * Math.pow(16, 1)) + (15 * Math.pow(16, 0))) ;
		System.out.println("hex 0x35df: " + Long.toBinaryString(h) + "  in base 10: " + hi);
		long h2 = 0xf ;
		int h2i = (int) ((15 * Math.pow(16, 0))) ;
		System.out.println("hex 0x35df: " + Long.toBinaryString(h2) + "  in base 10: " + h2i);
	}

}
