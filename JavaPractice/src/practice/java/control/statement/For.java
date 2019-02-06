/**
 * 
 */
package practice.java.control.statement;

/**
 * @author apobits@gmail.com
 *
 */
public class For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		// for each loop
		for (int x[] : a) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

		// for loop can use Objects for iteration
		for (String x = new String(); true;) {

		}

	}

}
