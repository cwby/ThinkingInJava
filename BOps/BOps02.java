package BOps;

/** Operators, Exercise 2:
 * (1) Create a class containing a float and use it to demonstrate aliasing. 
 * @param args
 */
public class BOps02 {
	float f ;
	public static void main(String[] args) {
		BOps02 obj1 = new BOps02();
		BOps02 obj2 = new BOps02();
		obj1.f = 234f;
		obj2 = obj1;
		System.out.println("obj2.f should now be obj1.f. obj2.f: " + obj2.f + "  obj1.f: " + obj1.f );
		obj2.f = 65.4f;
		System.out.println("Changing one changes the other. obj2.f: " + obj2.f + "  obj1.f: " + obj1.f );
	}

}
