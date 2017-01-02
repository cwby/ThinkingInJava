package FReU;

/** Reusing Classes, Exercise 02:
 * (2) Inherit a new class from class Detergent.
 * Override scrub( ) and add a new method called sterilize( ).
 * 
 * @author joe
 */
public class FReU02 extends FReU02parent {
	FReU02() {
		System.out.println("Constructed a FReU02 object.");
	}
	void scrub() {
		System.out.println("Scrub, scrub, scrub");
	}
	void sterilize() {
		System.out.println("Super-heat it");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU02 t = new FReU02();
		t.sterilize();
		t.scrub();
		t.wipe();
	}
}

// Do not make a child (i.e., an inheriting class) of the class that contains the "main" method, or java will not know which "main" to run.
///** An inheriting class */
//class FReU02child extends FReU02 {
//	FReU02child() {
//		System.out.println("Constructed a FReU02child object.");
//	}
//	void brush() {
//		System.out.println("Sweep away");
//	}
//}
/** a class to inherit */
class FReU02parent {
	FReU02parent() {
		System.out.println("Constructed a FReU02parent object.");
	}
	void scrub() {
		System.out.println("Scrub-a-dub");
	}
	void wipe() {
		System.out.println("Wipe it good");
	}
}

