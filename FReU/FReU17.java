package FReU;

/** Reusing Classes, Exercise 17:
 * (1) Modify Exercise 16 so that Frog overrides the method definitions from the base class (provides new definitions using the same method signatures).
 * Note what happens in main( ).
 * 
 * @author joe
 */
public class FReU17 extends FReU16Amphibian {
	void layEggs(FReU17 f, int i) {
		System.out.println("Froggy laid " + i + " eggs.");
	}
	static void hatch(FReU17 f) {
		System.out.println("Froggy hatched.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU17 frog = new FReU17();
		hatch(frog);
		frog.layEggs(frog, 523); // not a static function, so it has to be called as part of an object.
	}
}

/** The parent class */
class FReU17Amphibian {
	static void layEggs(FReU17Amphibian a, int i) {
		System.out.println("Laid " + i + " eggs.");
	}
	static void hatch(FReU17Amphibian a) {
		System.out.println("Hatched.");
	}
}
