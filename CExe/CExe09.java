package CExe;

/** Controlling Execution, Exercise 9: 
 * (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,
 *  where each number (from the third on) is the sum of the previous two. 
 *  Create a method that takes an integer as an argument and 
 *  displays that many Fibonacci numbers starting from the beginning, 
 *  e.g., If you run java Fibonacci 5 (where Fibonacci is the name of the class) 
 *  the output will be: 1, 1, 2, 3, 5.
 * 
 * @author joe
 *
 */
public class CExe09 {

	/**
	 * Print the given number of values from the Fibonacci sequence.
	 * @param n How many values from the Fibonacci sequence should be printed?
	 */
	void nFib(int n) {
		int a = 0;
		int b = 0;
		int c = 1;
		int next = 0;
		System.out.print("Print " + n + " Fibonacci numbers: ");
		for (int i = 0; i < n; i++) {
			next = a + b + c ;
			System.out.print(c + "  ");
			next = a + b + c ;
			a = b;
			b = c; 
			c = next;
		}
		System.out.println("");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CExe09 t = new CExe09();
		t.nFib(0);
		t.nFib(3);
		t.nFib(20);
	}

}
