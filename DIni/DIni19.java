package DIni;


/** Initialization & Cleanup, Exercise 19:
 * (2) Write a method that takes a vararg String array.
 * Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
 * @author joe
 */
public class DIni19 {
	void mySMeth(String... s) {
		for (String str : s) {
			System.out.print(str + " ");
		}
		
		System.out.println();
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni19 t = new DIni19() ;
		t.mySMeth("aoe", "uo", "ea","kek");
		String[] s = {"Aoe", "uO", "Ea","Kek"} ;
		t.mySMeth(s);
	}
}
