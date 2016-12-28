package DIni;


/** Initialization & Cleanup, Exercise 20:
 * (1) Create a main( ) that uses varargs instead of the ordinary main( ) syntax.
 * Print all the elements in the resulting args array.
 * Test it with various numbers of command-line arguments.
 * (i.e., <ul>
 *   <li>Open a Terminal, </li>
 *   <li>change to the directory with this DIni20.java file, </li>
 *   <li>compile it by typing "javac DIni20.java", </li>
 *   <li>run     it by typing "java -cp .. DIni.DIni20" (or "java -classpath .. (etc.)")</li>
 * </ul>
 * @author joe
 */
public class DIni20_alt {
	void printArgs(String...args) {
		for (String s : args) System.out.print("  " + s);
		System.out.println();
	}
	/**
	* @param args
	*/
	public static void main(String... args) {
		DIni20_alt t = new DIni20_alt();
		t.printArgs("el1", "element2", "element3", "Element4");
		t.printArgs("el1");
		t.printArgs("el1", "Element4");
		t.printArgs("el1", "oeu", "df", "uoeu", "or", "oeuoaau");
	}
}
