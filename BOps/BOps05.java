package BOps;

/** Objects, Exercise 5:
 * (2) Create a class called Dog [I will call it BOps05 instead] containing two Strings: name and says. 
 * In main( ), create two dog objects with names “spot” (who says, “Ruff!”) 
 * and “scruffy” (who says, “Wurf!”). Then display their names and what they say. 
 */
public class BOps05 {
	String name, says ;
	void soundOff() {
		System.out.println(name + " says, \"" + says + "\"");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BOps05 d1 = new BOps05();
		BOps05 d2 = new BOps05();
		// Before name and says are assigned, they are null.
		d1.soundOff();
		d1.name = "spot";
		d1.says = "Ruff!";
		d2.name = "scruffy";
		d2.says = "Wurf!";
		d1.soundOff();
		d2.soundOff();
	}

}
