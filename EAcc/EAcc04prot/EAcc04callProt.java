package EAcc.EAcc04prot;

/** Access Control, Exercise 04: 
 * (2) Show that protected methods have package access but are not public.
 * [This component of the example calls the protected method from another Class within the same package.]
 * 
 * @author joe
 */
public class EAcc04callProt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EAcc04prot t = new EAcc04prot();
		t.iAmProtected("Another Class in the same package can call the iAmProtected method of EAcc04prot");
	}
}
