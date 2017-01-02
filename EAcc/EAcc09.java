package EAcc;

import EAcc.EAcc09local.*;

/** Access Control, Exercise 09:
 * (2) Create the following file in the access/local (EAcc) directory (presumably in your CLASSPATH):
 * <pre>// access/local/PackagedClass.java
 * package access.local;
 * class PackagedClass {
 *   public PackagedClass() {
 *     System.out.println("Creating a packaged class");
 *   }
 * }</pre>
 * Then create the following file in a directory other than access/local (I'll use EAcc.EAcc09frgn):<pre>
 * // access/foreign/Foreign.java
 * package access.foreign;
 * import access.local.*;
 * public class Foreign {
 *   public static void main(String[] args) {
 *     PackagedClass pc = new PackagedClass();
 *   }
 * }</pre>
 * Explain why the compiler generates an error. 
 * Would making the Foreign class part of the access.local (EAcc) package change anything?
 * 
 * @author joe
 */
public class EAcc09 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Even though the EAcc09local method is public, the EAcc09local class is not,
		//  so a EAcc09local object cannot be directly constructed in a class from another package,
		//  even if the package containing the EAcc09local object has been imported.
		// However, it would be available were the EAcc09local class within this same package, 
		//  per the default package access (or the "public" class access level, were "public" specified before the class name)
		// So this next line fails.
		EAcc09local pc = new EAcc09local();
		// But this next line succeeds. 
		EAcc09InSamePackage pc2 = new EAcc09InSamePackage();
	}
}

/** Demonstrating that a class in the same package is available to other classes in the same package, be default. */
class EAcc09InSamePackage {
	/** second test method for Access Control, Exercise 09
	 */
	public EAcc09InSamePackage() {
		System.out.println("Creating a class within the same package as the calling class");
	}
}