package BOps;

/** Operators, Exercise 14:   
 * (3) Write a method that takes two String arguments 
 * and uses all the boolean comparisons 
 * to compare the two Strings and print the results. 
 * For the == and !=, also perform the equals( ) test. 
 * In main( ), call your method with some different String objects.
 * @author joe
 */
public class BOps14 {

	/**
	 * @param s1 Any string
	 * @param s2 Any string
	 */
	void allComps (String s1, String s2) {
		System.out.println("s1=\"" + s1 + "\"");
		System.out.println("s2=\"" + s2 + "\"");
		System.out.println("s1==s1? " + (s1==s2));
		System.out.println("s1.equals(s2)? " + s1.equals(s2));
		System.out.println("s1!=s1? " + (s1!=s2));
		System.out.println("!s1.equals(s2)? " + !s1.equals(s2));
	}
	public static void main(String[] args) {
		BOps14 doThis = new BOps14();
		doThis.allComps("aoeu","aoeu");
	}

}
