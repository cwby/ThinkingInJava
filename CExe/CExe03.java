package CExe;

import java.util.Random;

/** Controlling Execution, Exercise 3: 
 * (1) Modify Exercise 2 so that your code is surrounded by an “infinite” while loop.
 *  It will then run until you interrupt it from the keyboard (typically by pressing Control-C).
 * 
 * @author joe
 *
 */
public class CExe03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		for ( ; ; ) {
			int r = rand.nextInt(5), c = rand.nextInt(5);
			String e ;
			if (r < c) 
				e = "r < c";
			else if (r == c)
				e = "r = c";
			else
				e = "r > c";
			System.out.println("r="+r+"  c="+c+" comparison: "+ e);
		}
	}

}
