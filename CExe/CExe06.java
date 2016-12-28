package CExe;

import static net.mindview.util.Print.print;
// import static net.mindview.util.Print.printnb;
// import static net.mindview.util.Range.range;

/** Controlling Execution, Exercise 6: 
 * (2) Modify the two test( ) methods in the previous two programs
 *  so that they take two extra arguments, begin and end, 
 *  and so that testval is tested to see if it is 
 *  within the range between (and including) begin and end.
 * 
 * @author joe
 *
 */

public class CExe06 {
	
	int result = 0;
	  
	//: control/IfElse.java
	/** See if a value is greater than, less than, or equal to another value.
	 * Skip this if the value does not fall within a given range.
	 * The result is stored in "result" (an int, being +1, 0, or -1, depending on whether testval is respectively greater than, equal to, or less than target
	 * @param testval the value to be tested
	 * @param target the value compared (is testval greater, less than, or equal to this?)
	 * @param begin the lower end of the range (inclusive)
	 * @param end the upper end of the range (inclusive)
	 */
	void test(int testval, int target, int begin, int end) {
		if ((begin <= testval) & (testval <= end)) {
			if(testval > target)
				result = +1;
			else if(testval < target)
				result = -1;
			else
				result = 0; // Match
		} else {
			print("testval was not between begin and end (inclusive).  testval=" + testval + "  begin=" + begin + "  end=" + end);
			result = 99 ;
		}
	}
	
	//: control/IfElse2.java
	/** See if a value is greater than, less than, or equal to another value.
	 * Skip this if the value does not fall within a given range.
	 * @param testval the value to be tested
	 * @param target the value compared (is testval greater, less than, or equal to this?)
	 * @param begin the lower end of the range (inclusive)
	 * @param end the upper end of the range (inclusive)
	 * @return +1, 0, or -1, depending on whether testval is respectively greater than, equal to, or less than target, or 99 (out of range).
	 */
	int test2(int testval, int target, int begin, int end) {
		if ((begin <= testval) & (testval <= end)) {
			if(testval > target)
				return +1;
			else if(testval < target)
				return -1;
			else
				return 0; // Match
		} else {
			print("testval was not between begin and end (inclusive).  testval=" + testval + "  begin=" + begin + "  end=" + end);
			return 99 ;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CExe06 t = new CExe06() ;
		//: control/IfElse.java
	    t.test(10, 5, 0, 8);
	    print(t.result);
	    t.test(5, 10, 0, 8);
	    print(t.result);
	    t.test(5, 5, 0, 8);
	    print(t.result);
	    
	    print("\n"); // add a blank line between the two sets of results.

	    //: control/IfElse2.java
	    print(t.test2(10, 5, 0, 8));
	    print(t.test2(5, 10, 0, 8));
	    print(t.test2(5,  5, 0, 8));
	}

}
