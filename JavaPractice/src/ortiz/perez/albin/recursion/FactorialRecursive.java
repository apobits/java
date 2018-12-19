/**
 * 
 */
package ortiz.perez.albin.recursion;

/**
 * @author aposo
 *
 */
public class FactorialRecursive {

	public int getFactorial(int n) {
		int result;

		if (n == 1)
			return n;
		else {
			int temp = getFactorial(n - 1);
			result = temp * n;
		}
		return result;
	}

	public static int getFactorialSecondPractice(int number) {

		if (number == 1) {
			return number;
		} else {
			return getFactorialSecondPractice(number - 1) * number;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(getFactorialSecondPractice(3));

		String string = "\n\r \t lolol lolo asll ala \n\r ---- \n\rasdfl aldfj adf";

		System.out.println(string.trim());

	}

}
