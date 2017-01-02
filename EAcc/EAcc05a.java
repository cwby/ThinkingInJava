package EAcc;

/** Access Control, Exercise 05:
 * (2) Create a class with public,
 * private,
 * protected,
 * and package-access fields and method members.
 * Create an object of this class and see what kind of compiler messages you get 
 * when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package.
 * 
 * @author joe
 */
public class EAcc05a {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EAcc05 t = new EAcc05();
		t.priMeth(t.pri);
		t.proMeth(t.pro);
		t.pacMeth(t.pac);
		t.pubMeth(t.pub);
	}
}
