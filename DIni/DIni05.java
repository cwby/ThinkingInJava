package DIni;


/** Initialization & Cleanup, Exercise 5:
 * (2) Create a class called Dog with an overloaded bark( ) method.
 * This method should be overloaded based on various primitive data types,
 * and print different types of barking, howling, etc.,
 * depending on which overloaded version is called.
 * Write a main( ) that calls all the different versions.
 * @author joe
 */
public class DIni05 {
	/**
	 * Default: a plain bark, twice
	 */
	void bark() {
		bark(' ', 2);
	}
	boolean bark(boolean b) {
		System.out.println("Woof.");
		return b;
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
	* @param args
	*/
	public static void main(String[] args) {
		DIni05 d = new DIni05() ;
		d.bark();
		d.bark('y');
		d.bark('!', 5);
		d.bark(true);
	}
}
