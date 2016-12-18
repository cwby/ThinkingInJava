package DIni;


/** Initialization & Cleanup, Exercise 6:
 * (1) Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types),
 * but in reversed order relative to each other.
 * Verify that this works.
 * @author joe
 */
public class DIni06 {
	/**
	 * Default: a plain bark, twice
	 */
	void bark() {
		bark(' ', 2);
	}
	/**
	 * Bark once, adding the given character to the end of the bark
	 * @param c Character to add to the end of "bark"
	 */
	void bark(char c) {
		bark(c, 1);
	}
	/**
	 * Bark a given number of times, adding the given character to the end of the bark
	 * @param c Character to add to the end of "bark"
	 * @param i Number of times to bark
	 */
	void bark(char c, int i) {
		for (int a = 0;a < i; a++) {
			System.out.print("bark" + c + "! ");
		}
		System.out.println();
	}
	/**
	 * Bark a once, adding the given character to the end of the bark, then adding given number of exclamation points
	 * @param c Character to add to the end of "bark"
	 * @param i Number of exclamation marks
	 */
	void bark(int i, char c) {
		System.out.print("bark" + c) ;
		for (int a = 0;a < i; a++) {
			System.out.print("!");
		}
		System.out.println();
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni06 d = new DIni06() ;
		d.bark();
		d.bark('y');
		d.bark('s', 5);
		d.bark(7, 's');
	}
}
