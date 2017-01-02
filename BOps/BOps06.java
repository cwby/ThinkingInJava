package BOps;

/** Operators, Exercise 6:
 * (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object. 
 * Test for comparison using == and equals( ) for all references.
 * 
 * @author joe
 *
 */
public class BOps06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BOps05 d1 = new BOps05();
		d1.name = "spot";
		d1.says = "Ruff!";
		BOps05 newSpot = d1 ;
		System.out.println("** newSpot is an alias of d1 **");
		System.out.println("newSpot == d1? " + (newSpot == d1));
		System.out.println("newSpot.equals(d1)? " + newSpot.equals(d1));
		BOps05 d2 = new BOps05();
		d2.name = "spot";
		d2.says = "Ruff!";
		System.out.println("** d2 has the same values as d1 **");
		System.out.println("d2.name == d1.name? " + (d2.name == d1.name));
		System.out.println("d2.name.equals(d1.name)? " + d2.name.equals(d1.name));
		System.out.println("d2 == d1? " + (d2 == d1));
		System.out.println("d2.equals(d1)? " + d2.equals(d1));
	}

}
