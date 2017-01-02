package EAcc;

import static EAcc.EAcc03on.EAcc03debug.*;
//import static EAcc.EAcc03off.EAcc03debug.*;

/** Access Control, Exercise 03: (2) Create two packages:
 * debug and debugoff, (I used EAcc03on and EAcc03off)
 * containing an identical class with a debug( ) method.
 * The first version displays its String argument to the console,
 * the second does nothing.
 * Use a static import line to import the class into a test program,
 * and demonstrate the conditional compilation effect.
 * 
 * @author joe
 */
public class EAcc03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		debug("debug is on");
	}
}
