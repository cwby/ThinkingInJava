package DIni;


/** Initialization & Cleanup, Exercise 22:
 * (2) Write a switch statement for the enum in the previous example.
 * For each case, output a description of that particular currency.
 */
public class DIni22 {
	/** List of bills in ascending value ($1 to $100) */
	enum cash {
		BUCK,
		FIN,
		SAWBUCK,
		DUB,
		FROG,
		CNOTE,
	}
	void howYaDoin(cash m) {
		switch (m) {
		case BUCK:
		case FIN:
			System.out.println("I only have a " + m);
			break;
		case SAWBUCK:
		case DUB:
			System.out.println("I have a " + m);
			break;
		case FROG:
		case CNOTE:
			System.out.println("I'm rich, with a " + m);
			break;
		}
	}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		DIni22 t = new DIni22();
		t.howYaDoin(cash.BUCK);
		t.howYaDoin(cash.FIN);
		t.howYaDoin(cash.SAWBUCK);
		t.howYaDoin(cash.DUB);
		t.howYaDoin(cash.FROG);		
		t.howYaDoin(cash.CNOTE);		
	}
}