package AObj;

class StaticTest {
	static int i = 0;
}
class Incrementable {
	static void increment() { StaticTest.i++; }
}
public class AObj07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// increment once, using the class name (possible because it is as static method)
		Incrementable.increment();
		// increment again, using an object
		Incrementable sf = new Incrementable();
		sf.increment();
		// StaticTest.i is static, so both incrementing affect to same (static) variable
		System.out.println("i incremented twice="+StaticTest.i);
		// increment again, using another object
		Incrementable sf2 = new Incrementable();
		sf2.increment();
		// StaticTest.i is static, so both incrementing affect to same (static) variable
		System.out.println("i incremented thrice="+StaticTest.i);
	}

}
