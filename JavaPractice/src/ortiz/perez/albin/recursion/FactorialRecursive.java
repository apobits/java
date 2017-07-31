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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new FactorialRecursive().getFactorial(4));

	}

}
