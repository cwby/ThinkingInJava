package BOps;

/** Objects, Exercise 3:
 * (1) Create a class containing a float and use it to demonstrate aliasing during method calls. 
 */
public class BOps03 {
	/** a method to demonstrate aliasing during method calls. */
	float x ;
	/**
	 * @param b A BOps03 object, which contains the attribute x, a float
	 */
	static void mkThreePointThree(BOps03 b) {
		b.x = 3.3f ;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BOps03 myB = new BOps03();
		myB.x = 4f ;
		System.out.println("myB.x is " + myB.x);
		/** Even though this function returns nothing, 
		 * it's effect persists beyond it's scope (i.e., after it ends), 
		 * because it's arg (b) becomes an alias for the object (myB) passed to the function. 
		 */
		mkThreePointThree(myB);
		System.out.println("myB.x is " + myB.x);

	}

}
