package EAcc;

/** Access Control, Exercise 08:
 * (4) Following the form of the example Lunch.java,
 * create a class called ConnectionManager (EAcc08) that manages a fixed array of Connection (EAcc08Con) objects.
 * The client programmer must not be able to explicitly create Connection objects,
 * but can only get them via a static method in ConnectionManager.
 * When the ConnectionManager runs out of objects,
 * it returns a null reference.
 * Test the classes in main( ).
 * 
 * @author joe
 */
public class EAcc08 {
	static int counter = 0 ;
	/** Specifies how many instances of EAcc08Con may be created. */
	static int upToHowMany = 5 ;
	/** An array of null EAcc08Con objects */
	EAcc08Con[] a = new EAcc08Con[upToHowMany] ;
	void getCon(int n) {
		if (counter < upToHowMany) {
			a[counter] = new EAcc08Con(counter + 1) ;
			counter++ ;
		} else {
			System.out.println("No new object created. " + counter + " objects have already been created.");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EAcc08 t = new EAcc08() ;
		for (int i = 0; i < 9; i++) {
			System.out.print("Attempt " + i + ": ");
			t.getCon(i);
		}
	}
}

/** Class containing anyAmount function to create instances of the class object */
class EAcc08Con {
	/** Constructor for EAcc08Con objects.
	 * 
	 * @param n number of this instance (>= 1)
	 */
	EAcc08Con(int n) {
		System.out.println("Constructed instance " + n + " of an EAcc08Con object.");
	}
}
