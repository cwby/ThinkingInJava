package DIni;


/** Initialization & Cleanup, Exercise 21:
 * (1) Create an enum of the least-valuable six types of paper currency.
 * Loop through the values( ) and print each value and its ordinal( ).
 * @author joe
 */
public class DIni21 {
	/** List of bills in ascending value ($1 to $100) */
	enum cash {
		BUCK,
		FIN,
		SAWBUCK,
		DUB,
		FROG,
		CNOTE,
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		for (cash i: cash.values()) {
			System.out.println(i + " has ordinal = " + i.ordinal() );
		}
	}
}
