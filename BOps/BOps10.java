package BOps;

/** Operators, Exercise 10:   
 * (3) Write a program with two constant values,
 *  one with alternating binary ones and zeroes, with a zero in the least-significant digit,
 *  and the second, also alternating, with a one in the least-significant digit
 *  (hint: It’s easiest to use hexadecimal constants for this). 
 *  Take these two values and combine them in all possible ways using the bitwise operators, 
 *  and display the results using Integer.toBinaryString( ).
 * 
 * @author joe
 *
 */
public class BOps10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0525, b = 0252 ;
		System.out.println(  
				"a = " + a + " = " + Integer.toBinaryString(a) + 
				"\nb = " + b + " = " + Integer.toBinaryString(b) +
				"\n~b = " + ~b + " = " + Integer.toBinaryString(~b)
				);
		System.out.println("a & b: " + Integer.toBinaryString(a & b));
		System.out.println("a | b: " + Integer.toBinaryString(a | b));
		System.out.println("a & ~b: " + Integer.toBinaryString(a & ~b));
		System.out.println("a ^ b: " + Integer.toBinaryString(a ^ b));
		System.out.println("a ^ ~b: " + Integer.toBinaryString(a ^ ~b));
		System.out.println("(a|b)^b: " + Integer.toBinaryString((a|b)^b));
	}

}
