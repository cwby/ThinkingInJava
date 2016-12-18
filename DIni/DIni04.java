package DIni;


/** Initialization & Cleanup, Exercise 4:
 * (1) Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.
 * @author joe
 */
public class DIni04 {
	DIni04() {System.out.println("This constructor prints a message."); }
	DIni04(String s) {System.out.println(s); }
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni04 t = new DIni04();
		DIni04 t2 = new DIni04("Print this custom message.");
	}
}
