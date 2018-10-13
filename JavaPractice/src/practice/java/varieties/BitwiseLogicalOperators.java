/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class BitwiseLogicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// And operator &, 1 & 1 is 1 otherwise is 0. Example : 1&1 = 1, 1&0 = 0, 0&1 =
		// 0, 0&0 = 0
		System.out.println("15&5 is " + (15 & 5));

		// Or operator |, 0|0=0 0|1=1 1|0=1 1|1=1
		System.out.println("15|5 is " + (15 | 5));

		// Xor operator ^, 1^1=0 0^0=0 1^0=1 0^1=1
		System.out.println("15^5 is " + (15 ^ 5));

		// Not operator ~, ~0=1 ~1=0
		System.out.println("~5 is " + (~5));

	}

}
