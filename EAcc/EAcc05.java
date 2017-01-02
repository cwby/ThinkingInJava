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
public class EAcc05 {
	/** a private field */
	private String pri = "private field" ;
	/** a protected field */
	protected String pro = "protected field" ;
	/** a package-access field */
	String pac = "package access field" ;
	/** a public field */
	public String pub = "public field" ;
	/** a private method */
	private void priMeth(String s) { System.out.println("private method: printing a " + s) ; }
	/** a protected method */
	protected void proMeth(String s) { System.out.println("protected method: printing a " + s) ; }
	/** a package-access method */
	void pacMeth(String s) { System.out.println("package access method: printing a " + s) ; }
	/** a public method */
	public void pubMeth(String s) { System.out.println("public method: printing a " + s) ; }
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
