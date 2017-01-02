package FReU;

/** Reusing Classes, Exercise 06:
 * (1) Using Chess.java (renamed FReU06.java),
 * prove the statements in this paragraph:
 * The preceding example has default constructors; 
 * that is, they don’t have any arguments. 
 * It’s easy for the compiler to call these 
 * because there’s no question about what arguments to pass. 
 * If your class doesn’t have default arguments, 
 * or if you want to call a base-class constructor that has an argument, 
 * you must explicitly write the calls to the base-class constructor 
 * using the super keyword and the appropriate argument list:
 * 
 * @author joe
 */
public class FReU06 extends BoardGame {
	FReU06() {
		// Comenting out this next statement causes a compilation error.
		super(11);
		System.out.println("FReU06 constructor");
	}
	FReU06(int i) {
		// Commenting out this next statement causes a compilation error.
		//super(i);
		System.out.println("FReU06 constructor with a passed argument");
	}
	public static void main(String[] args) {
		FReU06 x = new FReU06();
		FReU06 t = new FReU06(3);
	}
} /* Output:
Game constructor
BoardGame constructor
Chess constructor
*///:~

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}	
