package FReU;

/** Reusing Classes, Exercise 20:
 * (1) Show that @Override annotation solves the problem in this section.
 * 
 * @author joe
 */
public class FReU20 extends FReU20parent {
	@Override void myMethod() {
		System.out.println("a method in the child class, which will be created only if it overrides a parent class method.");
	} // FReU20parent.myMethod() is private, so it is not visible to be overridden, so this fails.
	@Override void printMe(int i, char c) {
		System.out.println("another method in the parent class, with c:" + c + " and i:" + i);
	} // The arguments in the parent printMe method occur in another order, 
	//     so this would overload rather than override printMe, 
	//     so the @Override prevents this printMe from being created.
	/**	
	 * @param args
	 */
	public static void main(String[] args) {
		FReU20 t = new FReU20();
		t.myMethod(); // fails. myMethod() is not created within t because it does not override a method in the parent class.
		t.printMe(3, 'm'); // fails. printMe(int i, char c) is not created within t because it does not override a method in the parent class.
	}
}

/** a class to be extended (to be inherited) */
class FReU20parent {
	private void myMethod() {
		System.out.println("a method in the parent class");
	}
	void printMe(char c, int i) {
		System.out.println("another method in the parent class, with c:" + c + " and i:" + i);
	}
}
