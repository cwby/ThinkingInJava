package EAcc;

import EAcc.EAcc04prot.EAcc04prot;

/** Access Control, Exercise 04:
 * (2) Show that protected methods have package access but are not public.
 * [This component of the example tries to call the protected method from a Class in a different package.]
 * 
 * @author joe
 */
public class EAcc04 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EAcc04prot t = new EAcc04prot();
		t.iAmProtected("A Class in a different package _CANNOT_ call the iAmProtected method of EAcc04prot");
	}
}
