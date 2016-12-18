package DIni;


/** Initialization & Cleanup, Exercise 11:
 * (4) Modify the previous exercise so that your finalize( ) will always be called.
 * @author joe
 */
public class DIni11 {
	/**
	 * finalize() will run if and when java runs clean-up, which depends on whether it needs unused memory.
	 */
	protected void finalize() {
		System.out.println("the memory used for the DIni11 object is about released");
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni11 t = new DIni11();
		// finalize() will only be called if it is forced, or if the system runs low on memory, and so needs to find what memory it may release.
		// Drop the reference. (I do not understand how adding this line this causes java to know that t is no longer used, and may be cleaned-up.)
		//   Cleanup is also done if the next line is "new DIni10 ;", which also has a finalize() method.
		//   Cleanup is not done if a named DIni10 or DIni11 object is created (e.g., "DIni11 x = DIni11();").
		//   I do not understand the "why" of all this (i.e., how java is processing things that triggers Cleanup (or not)).
		new DIni11();
		// Force garbage collection & finalization:
		System.gc();
		System.out.println("All done with the DIni11 object, t");
	}
}
