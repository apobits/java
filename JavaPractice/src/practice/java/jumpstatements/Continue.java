/**
 * 
 */
package practice.java.jumpstatements;

/**
 * @author apobits@gmail.com
 *
 */
public class Continue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//continue
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println("i is " + i);
		}

		//labeled continue 
		out: for (int i = 0; i < 10; i++) {
			System.out.println("i is " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("j is " + j);
				if (j == 5) {
					continue out;
				}
			}
		}

	}

}
