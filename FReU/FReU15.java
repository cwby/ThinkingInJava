package FReU;

import FReU.FReU15prot.*;

/** Reusing Classes, Exercise 15:
 * (2) Create a class inside a package. (the FReU15prot class of the FReU.FReU15prot package)
 * Your class should contain a protected method (myMethod()).
 * Outside of the package (here in the FReu package)
 * try to call the protected method and explain the results.
 * Now inherit from your class and call the protected method from inside a method 
 * of your derived class.
 * (One of two programs for this exercise.)
 * (for the rest, see the FReU15prot class in the FReU.FReU15prot package)
 * 
 * @author joe
 */
public class FReU15 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FReU15prot t = new FReU15prot();
		//t.myMethod();
		// The previous statement fails because it tries to call a protected method of a class from another package.
		//  Protected methods are only shared within their home package, or with classes that extend their home class.
		FReU15child c = new FReU15child();
		c.myMethodNew();
		// myMethodNew is available because it is a method with package-level access and is in the same package as FReU15.
	}
}

/** A class within the FReU package that inherits the FReU15prot class of the FReU.FReU15prot package */
class FReU15child extends FReU15prot {
	void myMethodNew() {
		myMethod();
	}
}