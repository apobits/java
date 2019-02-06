/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class ExceptionExample {

	static class ErrorException extends Error {

		private static final long serialVersionUID = 1L;

	}

	static class RuntimeExceptionException extends RuntimeException {

		private static final long serialVersionUID = 1L;

	}

	static class ExceptionException extends Exception {

		private static final long serialVersionUID = 1L;

	}

	static class ExceptionException1 extends ExceptionException {

		private static final long serialVersionUID = 1L;

	}

	static class ExceptionException2 extends ExceptionException {

		private static final long serialVersionUID = 1L;

	}

	// unchecked exception
	public static void error() {
		// Error exceptions must not be caught by a reasonable application
		// although in some occasions an application may catch them for special purposes
		throw new ErrorException();
	}

	// unchecked exception
	public static void runtimeException() {
		// runtime exceptions are usually not caught by the application as they
		// described
		// a bug such as logic errors or improper use of an api
		throw new RuntimeExceptionException();
	}

	// checked exceptions
	public static void exception() throws ExceptionException1, ExceptionException2 {
		// Exceptions must be caught by applications
		boolean flag = false;

		if (flag) {
			throw new ExceptionException1();
		} else {
			throw new ExceptionException2();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			exception();
		} catch (ExceptionException1 | ExceptionException2 e) {// e is implicitly final when using a multi catch block
			System.out.println(e);
			// e = new ExceptionException1(); // it is implicitly final
		} finally {
			// finally code will always be executed even if within the try block happens an
			// error, return, break, continue
			System.out.println("From finally block");
		}

	}

}
