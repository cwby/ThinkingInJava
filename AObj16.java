package thinkingInJava;

//: initialization/Overloading.java
//Demonstration of both constructor
//and ordinary method overloading.
import static net.mindview.util.Print.*; 

/** This was the Tree class, 
 * but I renamed it so I coud track my progress through the exercises.
 * @author Thinking In Java book
 */
class AObj16 { // was Tree
	/** 
	 * this p061Ex16 self-named function takes one argument, the tree height (an integer).
	 */
	 int height;
	 /** Seedlings (no given height) get a height of zero.
	  */
	 AObj16() {
	 print("Planting a seedling");
	 height = 0;
	 }
	 
	 AObj16(int initialHeight) {
	 height = initialHeight;
	 print("Creating new Tree that is " +
	 height + " feet tall"); 
}
/** 
 * Use info() to find out how tall the tree is.
 */
void info() {
print("Tree is " + height + " feet tall");
}
/** if you pass a string to info(), that string is pre-pended to the output string.
 * 
 * @param s
 */
void info(String s) {
print(s + ": Tree is " + height + " feet tall");
}
}
/** This is on overloading example.
 * I am not sure what that is yet - it comes later in the book.
 * @author General Use
 *
 */
public class Overloading {
public static void main(String[] args) {
for(int i = 0; i < 5; i++) {
AObj16 t = new AObj16(i);
t.info();
t.info("overloaded method");
}
// Overloaded constructor:
new AObj16();
}
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~ 