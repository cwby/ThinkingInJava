package DIni;


/** Initialization & Cleanup, Exercise 8:
 * (1) Create a class with two methods.
 * Within the first method, call the second method twice: the first time without using this,
 * and the second time using this—just to see it working; you should not use this form in practice.
 * @author joe
 */
public class DIni08 {
	void call_doIt() {
		doIt();
		this.doIt();
	}
	void doIt() {
		System.out.println("Do it.");
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni08 t = new DIni08();
		t.call_doIt();
	}
}
