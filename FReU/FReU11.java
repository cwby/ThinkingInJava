package FReU;

/** Reusing Classes, Exercise 11:
 * (3) Modify Detergent.java so that it uses delegation.
 * 
 * @author joe
 */
public class FReU11 {
	private FReU11toBeDelegated t = new FReU11toBeDelegated();
	public void append(String a) { t.append(a); }
	public void dilute() { t.dilute(); }
	public void apply() { t.apply(); }
	public String toString() { return t.toString(); }
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		t.scrub(); // Call base-class version
	}
	// Add methods to the interface:
	public void foam() { append(" foam()"); }
	// Test the new class:
	public static void main(String[] args) {
		FReU11 x = new FReU11();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		FReU11toBeDelegated.main(args); // Call the main method of the base class. This is independent of the prior statements in "main".
	}	
}
/** A class to be inherited */
class FReU11toBeDelegated {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		FReU11toBeDelegated x = new FReU11toBeDelegated();
		x.dilute(); x.apply(); x.scrub();
		System.out.println(x);
	}
}