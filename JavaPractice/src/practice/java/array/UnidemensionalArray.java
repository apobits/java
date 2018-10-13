/**
 * 
 */
package practice.java.array;

/**
 * @author apobits@gmail.com
 *
 */
public class UnidemensionalArray {

	private static int[] array(int... a) {
		int[] array = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			array[i] = a[i];
		}

		return array;
	}

	public static void main(String[] args) {

		System.out.println(array(1, 2, 3, 4, 5, 6, 7, 8, 9)[8]);

	}

}
