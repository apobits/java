/**
 * 
 */
package ortiz.perez.albin.exception;

/**
 * @author aposo
 *
 */
public class Finally {

	public static void finallyAfterException() {
		try {
			throw new RuntimeException();
		} finally {
			System.out.println("Printed after RuntimeException thrown");
		}
	}

	public static void finallyAfterReturn() {
		try {
			return;
		} finally {
			System.out.println("Printed after return in try clause");
		}
	}

	public static void finallyAfterTryCode() {
		try {
			System.out.println("Printed within try clause");
		} finally {
			System.out.println("Printed after try clause");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			finallyAfterException();
		} catch (Exception e) {
			System.out.println(e);
		}
		finallyAfterReturn();
		finallyAfterTryCode();
	}

}
