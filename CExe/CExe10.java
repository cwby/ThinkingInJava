package CExe;

/** Controlling Execution, Exercise 10: 
 * (5) A vampire number has an even number of digits and is formed
 * by multiplying a pair of numbers containing half the number of digits of the result.
 * The digits are taken from the original number in any order.
 * Pairs of trailing zeroes are not allowed.
 * Examples include:<ul>
 * <li>1260 = 21 * 60</li>
 * <li>1827 = 21 * 87</li>
 * <li>2187 = 27 * 81</li>
 * </ul>Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 * 
 * @author joe
 *
 */
public class CExe10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] product, components ;
		/** For the product of two 2-digit numbers to be 4 digits (>999, <10,000), 
		 * the larger number of the pair must be between sqrt(1000) and 99.
		 * and the smaller number must be between 1000/(larger number) and the larger number. 
		 */
		for (int i = (int) Math.sqrt(1000); i <= 99; i++) {
			for (int j = (1000 / i) + 1; j <= i ; j++) {
				/** the product may not end end in a pair of zeros, so skip pairs that both end in zero. */
				if ((i % 10 == 0) & (j % 10 == 0)) continue ;
				/** decompose i, j, and their product into their component digits by turning them into Strings. */
				product = Integer.toString(i * j).toCharArray()  ;
				components = (Integer.toString(i) + Integer.toString(j)).toCharArray();
				/** Keep track of how many digits are matched. If 4 are matched, we have a "vampire number". */
				int nMatched = 0 ;
				EachComponentDigit:
				for (char c : components ) {
					for (int p = 0; p < (product.length - nMatched) ; p++) {
						if (product[p] == c) {
							/** This product digit is matched to a component digit, so make it a letter so it will not be matched to another product digit. */
							product[p] = 'x' ;
							nMatched++ ;
							// if this is not the last element to be checked by this "for" loop, ... 
							if (p < (product.length - nMatched)) {
								// ... shift the unmatched elements of the array to the left, overwriting the newly matched element.
								for (int e = p; e < (product.length - nMatched); e++) {
									product[e] = product[e + 1];
								}
							}
							if (nMatched == product.length) {
								System.out.println("Vampire number: components: " + i + ", " + j + "  product: " + (i * j));
								break EachComponentDigit ;
							}
							/** We are done with this component digit, so go to the next one. */
							continue EachComponentDigit ;
						}
						/** if that was the last component digit, and we found no match (we got past if (product[p] == c), this is not a vampire number, so go to the next number. */
						if (p == product.length) break EachComponentDigit ;
					}
				}
			}
		}
	}
}
