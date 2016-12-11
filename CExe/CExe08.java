package CExe;

/** Controlling Execution, Exercise 8: 
 * (2) Create a switch statement that prints a message for each case,
 *  and put the switch inside a for loop that tries each case. 
 *  Put a break after each case and test it, 
 *  then remove the breaks and see what happens.
 * 
 * @author joe
 *
 */
public class CExe08 {

	void testSwitch (boolean useBreak) {
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				System.out.println("i is now zero.");
				if (useBreak) break;
			case 1:
				System.out.println("i is now one.");
				if (useBreak) break;
			case 2:
				System.out.println("i is now two.");
				if (useBreak) break;
			case 3:
				System.out.println("i is now three.");
				if (useBreak) break;
			}
		}
		System.out.println("All done.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CExe08 t = new CExe08();
		t.testSwitch(true);
		System.out.println(" ");
		t.testSwitch(false);
	}

}
