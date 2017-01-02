package FReU;

/** Reusing Classes, Exercise 16:
 * (2) Create a class called Amphibian (FReU16Amphibian).
 * From this,
 * inherit a class called Frog (FReU16).
 * Put appropriate methods in the base class.
 * In main( ),
 * create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
 * 
 * @author joe
 */
public class FReU16 extends FReU16Amphibian {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU16 frog = new FReU16();
		hatch(frog);
		FReU16Amphibian.layEggs(frog, 523); // The "FReU16Amphibian." is unnecessary here.
	}
}

/** The parent class */
class FReU16Amphibian {
	static void layEggs(FReU16Amphibian a, int i) {
		System.out.println("Laid " + i + " eggs.");
	}
	static void hatch(FReU16Amphibian a) {
		System.out.println("Hatched.");
	}
}
