/**
 * 
 */
package practice.java.jumpstatements;

/**
 * @author apobits@gmail.com
 *
 */
public class Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// simple break
		for (int i = 0; i < 10; i++) {
			System.out.println("i is " + i);
			if (i == 5)
				break;
		}

		//labeled break
		out: for (int i = 0; i < 10; i++) {
			System.out.println("i is " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("j is " + j);
				if (j == 5) {
					break out;
				}
			}
		}
			

	}

}
