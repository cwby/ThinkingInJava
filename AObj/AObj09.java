package AObj;

/** Everything is an Object, Exercise 9
 * (2) Write a program that demonstrates that autoboxing works 
 * for all the primitive types and their wrappers.
 * <br> Boxing is making an object that just contains a primitive, so that it can be manipulated in operations that require objects.
 * <br> Autoboxing is automatic boxing; i.e., java will automatically convert primitives to objects when necessary, in most situations.
 * <br> Unboxing is converting an object into a primitive.
 * <br> Auto-unboxing is automatic unboxing; i.e., java will (try to?) automatically convert objects to primitives, when necessary, in most situations.
 * <br> [My question: What if the object does not just point to a single value, but rather to something more complex?]
 * @author joe
 */
public class AObj09 {
	public static void main(String[] args) {
		/** Autobox: Assign a primitive to an object, and java will automatically put the primitive in an object wrapper. */
		Character c = 'x';
		/** Auto-unbox: Assign an wrapper object to the associated primitive, and java will automatically put the object value into the primitive. */
		char ch = c ;
		System.out.println("Character c is " + c + " and char ch is " + ch);
		Boolean b = true;
		boolean bo = b ;
		System.out.println("the wrapper object Boolean bo is " + b + " and the primitive boolean bo is " + bo);
		Byte byt = 1;
		byte by = byt;
		System.out.println("   Byte: " + byt + "      byte: " + by);
		Short sh = 1;
		short s = sh;
		System.out.println("  Short: " + sh + "     short: " + s);
		Integer in = 1;
		int i = in;
		System.out.println("Integer: " + in + "       int: " + i);
		Long lo = 1L;
		long l = lo;
		System.out.println("   Long: " + lo + "      long: " + l);
		Float fl = 0.32f;
		float f = fl;
		System.out.println("  Float: " + fl + "  float: " + f);
		Double dou = 1d;
		double d = dou;
		System.out.println(" Double: " + dou + "  double: " + d);
	}
}
