package AObj;

/** This is on overloading example.
 * It uses @see AObj16
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