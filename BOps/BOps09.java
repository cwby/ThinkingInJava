package BOps;

/** Operators, Exercise 9:   
 * (1) Display the largest and smallest numbers for both float and double exponential notation.  
 * 
 * @author joe
 *
 */
public class BOps09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float f = Float.MAX_VALUE ;
		float fs = Float.MIN_VALUE ;
		double d = Double.MAX_VALUE ;
		double ds = Double.MIN_VALUE ;
		System.out.println("largest float: " + f + "\nlargest double: " + d);
		System.out.println("smallest float: " + fs + "\nsmallest double: " + ds);
	}

}
