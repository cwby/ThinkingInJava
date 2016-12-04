package AObj;

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
	 * this AObj16 self-named function takes one argument, the tree height (an integer).
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
