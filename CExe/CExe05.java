package CExe;

/** Controlling Execution, Exercise 5: 
 * (4) Repeat Exercise 10 from the previous chapter,
 *  using the ternary operator and a bitwise test to display the ones and zeroes, 
 *  instead of Integer.toBinaryString( ).
 *  A much briefer solution is available at @see https://github.com/panurg/thinking-in-java/commit/75dab5f95dcac27b24dda54698f5e9c30b57a5ff
 * 
 * @author joe
 *
 */
public class CExe05 {

	/** I do not know how to check each bit (each base-2 digit) of a numeric value 
	 * except by checking whether the right-most base-2 digit is zero or one 
	 * (by seeing if the modulus is zero or one when the number is divided by 2)
	 * then bitwise right-shifting the number, to test the next base-2 digit.
	 * I use ABS() to test the 1st digit
	 * @param operator '=' to print a, '&', '|', or '^' to print the associated logical combination of a and b
	 * @param a any integer
	 * @param b any integer. b is ignored (but must be present) if operator is '=' or '~'.
	 */
	void doTestsWithOperator(char operator, int a, int b) {
		/** a string in which to build the binary form of the result */
		String result = "" ;
		/** two variables that will be altered with each loop, initially set to a and b */
		int x, y ;
		/** Test if each value is not divisible by 2 (i.e., the right-most value in binary would be 1)
		 * If specified in "operator", apply the desired bitwise test (&, |, !) to the resulting 'ones place" digit, 
		 * and store "0" or "1" in result (per whether the bitwise test was true or false).
		 */ 
		if (operator == '=')
			result = (Math.abs(a) % 2 == 1) ? "1" : "0" ;
		else if (operator == '~')
			result = (Math.abs(~a) % 2 == 1) ? "1" : "0" ;
		else if (operator == '&')
			result = ((Math.abs(a) % 2 == 1) & (Math.abs(b) % 2 == 1)) ? "1" : "0" ;
		else if (operator == '|')
			result = ((Math.abs(a) % 2 == 1) | (Math.abs(b) % 2 == 1)) ? "1" : "0" ;
		else if (operator == '^')
			result = ((Math.abs(a) % 2 == 1) ^ (Math.abs(b) % 2 == 1)) ? "1" : "0" ;
		if (operator != '~')
			x = a ;
		else
			x = ~a ;
		y = b ;
		/** Right-shift the value, then test if the right-most base-2 digit is 1
		 * Apply the desired bitwise test (&, |, !) to the 'ones place" digits, 
		 * and pre-pend a 0 or 1 to result (per whether the bitwise test was true or false).
		 * The while loop right-shifts each value before testing it, so we already tested the right-most digit before it was lost in the loop
		 * Do this loop until the right-shifted values to be tested would be zero.
		 */
		if ((operator == '=') | (operator == '~'))
			do {
				result = (((x>>>=1) % 2 == 1) ? "1" : "0") + result ;
			} while (x>>1 != 0) ;
		else
			do {
				if (operator == '&')
					result = ((((x>>>=1) % 2 == 1) & ((y>>>=1) % 2 == 1)) ? "1" : "0") + result ;
				else if (operator == '|')
					result = ((((x>>>=1) % 2 == 1) | ((y>>>=1) % 2 == 1)) ? "1" : "0") + result ;
				else if (operator == '^')
					result = ((((x>>>=1) % 2 == 1) ^ ((y>>>=1) % 2 == 1)) ? "1" : "0") + result ;
			} while ((x>>1 != 0) | (y>>1 != 0)) ;
		// Here, if I knew how, I would trim leading zeros from result, to match how Integer.toBinaryString() treats leading zeros. 
		/** Display the result */
		if (operator == '=')
			System.out.println("value = " + a + " = " + result + "\n    " +
					           "value = " + a + " = " + Integer.toBinaryString(a) + " [verification]");
		else if (operator == '~')
			System.out.println("~value = " + ~a + " = " + result + "\n    " +
					           "~value = " + ~a + " = " + Integer.toBinaryString(~a) + " [verification]");
		else if (operator == '&')
			System.out.println("a " + operator + " b: " + result + "\n" +
			                   "a " + operator + " b: " + Integer.toBinaryString(a & b) + " [verification]");
		else if (operator == '|')
			System.out.println("a " + operator + " b: " + result + "\n" +
	                           "a " + operator + " b: " + Integer.toBinaryString(a | b) + " [verification]");
		else if (operator == '^')
			System.out.println("a " + operator + " b: " + result + "\n" +
	                           "a " + operator + " b: " + Integer.toBinaryString(a ^ b) + " [verification]");
	}
	void doTests(int a, int b) {
		System.out.print(" a: ");
		doTestsWithOperator('=', a, b);
		System.out.print(" b: ");
		doTestsWithOperator('=', b, b);
		System.out.print("~a: ");
		doTestsWithOperator('~', a, b);
		doTestsWithOperator('&', a, b);
		doTestsWithOperator('|', a, b);
		doTestsWithOperator('^', a, b);
	}
	public static void main(String[] args) {
		CExe05 t = new CExe05();
		//t.doTestsWithOperator('=', 0525, 0252);
		//t.doTestsWithOperator('~', 0525, 0252);
		//t.doTestsWithOperator('&', 0525, 0252);
		//t.doTestsWithOperator('|', 0525, 0252);
		//t.doTestsWithOperator('^', 0525, 0252);
		t.doTests( 0525,  0252);
		t.doTests(-0525,  0252);
		t.doTests(-0525, -0252);
		t.doTests( 1,  1);
		t.doTests(-1,  1);
		t.doTests(-1, -1);
		t.doTests(-1,  0);
		t.doTests( 0,  0);
	}

}
