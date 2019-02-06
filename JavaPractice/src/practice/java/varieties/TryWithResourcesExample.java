/**
 * 
 */
package practice.java.varieties;

import java.io.Closeable;

/**
 * @author apobits@gmail.com
 *
 */
public class TryWithResourcesExample {

	static class AutoCloseableExample implements Closeable {

		@Override
		public void close() {
			System.out.println("In AutoCloseableExample#close");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (AutoCloseableExample a = new AutoCloseableExample()) {
			throw new Exception();// First step, when exception is thrown close method of AutoCloseableExample
									// will be executed
		} catch (Exception e) {
			System.out.println("In catch block");// Second step, catch block will be executed
		} finally {
			System.out.println("In finally block");// Third step, finally block will be executed
		}
	}

}
