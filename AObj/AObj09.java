package AObj;

/** Everything is an Object, Exercise 9
 * (2) Write a program that demonstrates that autoboxing works 
 * for all the primitive types and their wrappers.
 * <br> THIS FAILS! it throws many exceptions, each saying, "cannot convert from [some primitive type] to [the corresponding wrapper type]
 * <br> The solution at <a href="http://greggordon.org/java/tij4/object/AutoboxTest.java">a webpage with solutions</a> also fails the same way. 
 * <br> per the book: automatically convert from a primitive to a wrapper type
 * using a shorthand ("autoboxing").
 * <br> "Character c = 'x' ;" is shorthand for 
 * "Character c = new Character('x') ;"
 * <br> This is also "autoboxing" (converting a wrapper object to 
 * a primitive:
 * <br> char ch = c ;
 * @author joe
 */
public class AObj09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character c = 'x';
		char ch = c ;
		boolean bo = true ;
		Boolean b = bo;
		byte by = 1;
		Byte byt = by;
		short s = 1;
		Short sh = s;
		int i = 1;
		Integer in = i;
		long l = 1;
		Long lo = l;
		float f = 1;
		Float fl = f;
		double d = 1;
		Double dou = d;
	}
}
