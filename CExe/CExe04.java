package CExe;

/** Controlling Execution, Exercise 4: 
 * (3) Write a program that uses two nested for loops and the modulus operator (%)
 *  to detect and print prime numbers 
 *  (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).
 * 
 * @author joe
 *
 */
public class CExe04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int myMax = 100 ;
		for (int i=2;i<=myMax;i++) {
			boolean isPrime = true ;
			for (int n=2;n<=Math.sqrt(i);n++) {
				if (i % n == 0) {
					isPrime = false ;
					break ;
				}
			}
			if (isPrime)
				System.out.println(i + " is prime");
		}
System.out.println("Those are the prime numbers between 1 and " + myMax + ", inclusive.");
	}

}
