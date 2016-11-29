package thinkingInJava;
// page 61 Exercise 1
//import java.util.*;
public class AObj01 {
	static int i;
	static char c;
	Character x ; // could also say "String x ;"
	char z;
	public static void main(String[] args) {
		System.out.println("i=" + i + "  c=>" + c + "<" );
		// I tried to make a non-static variable and add it to the println, but kept getting the error, "Cannot make a static reference to the non-static field p061Ex01.x".
		// i.e.:
		//System.out.println("i=" + i + "  c=>" + c + "<" + p061Ex01.x);
		//   Does println require that called variables be static???
		// No. But only static variables are created when they are initialized. Other variables are only created when the objects they are in are created, with MyClass x = new MyClass()
		AObj01 y = new AObj01();
		System.out.println("i=" + i + "  c=>" + c + "< y.x=>" + y.x + "< y.z=>" + y.z + "<");
				
	}
}
