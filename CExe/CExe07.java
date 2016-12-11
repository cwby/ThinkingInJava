package CExe;

/** Controlling Execution, Exercise 7: 
 * (1) Modify Exercise 1 so that the program exits by using the break keyword at value 99.
 *  Try using return instead.
 * 
 * @author joe
 *
 */
public class CExe07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Use break to leave the for loop when the value reaches 99.");
		for (int i=1; i < 101; i++) {
			System.out.print(i);
			if (i == 99)
				break ;
			System.out.println(" - keep going");
		}
		System.out.println("\n\nUse return to leave the for loop when the value reaches 99.");
		for (int i=1; i < 101; i++) {
			System.out.print(i);
			if (i == 99)
				return ;
			System.out.println(" - keep going");
		}
		System.out.println("\nEnd. This won't appear, because the prior 'return' will end this method.");
	}

}
