/**
 * 
 */
package ortiz.perez.albin.hackerrank.exception;

/**
 * @author Administrador
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}

		return (int) Math.pow(n, p);
	}

}
