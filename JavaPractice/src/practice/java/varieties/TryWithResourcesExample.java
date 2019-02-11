/**
 * 
 */
package practice.java.varieties;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author apobits@gmail.com
 *
 */
public class TryWithResourcesExample {

	static class AutoCloseableExample implements Closeable {

		@Override
		public void close() throws IOException {
			System.out.println("In AutoCloseableExample#close");
			throw new IOException("IOException test");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (AutoCloseableExample a = new AutoCloseableExample()) {
			throw new Exception("Exception test");// First step, when exception is thrown close method of
													// AutoCloseableExample
			// will be executed
		} catch (Exception e) {
			System.out.println("In catch block");// Second step, catch block will be executed
			System.out.println("Main exception " + e);
			System.out.println("Suppressed exceptions size " + e.getSuppressed().length);
			System.out.println("Suppressed excepion " + e.getSuppressed()[0]);
			e.addSuppressed(new Exception("Suppressed exception test"));
		} finally {
			System.out.println("In finally block");// Third step, finally block will be executed
		}
	}

}
