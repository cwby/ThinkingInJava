package EAcc.EAcc04prot;

/** Access Control, Exercise 04: 
 * (2) Show that protected methods have package access but are not public.
 * [This component of the example contains the protected method.]
 * 
 * @author joe
 */
public class EAcc04prot {
	/** Prints the given string
	 * @param s Any string
	 */
	protected void iAmProtected(String s) {
		System.out.println(s);
	}
}
