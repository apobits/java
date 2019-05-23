/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class ChainedExceptionExample {

	public static void throwSomething() throws Exception {
		throw new Exception("Exception in throwSomething");
	}

	public static void main(String[] args) {

		try {
			try {
				throwSomething();
			} catch (Exception e) {
				throw new Exception("Exception in try block ", e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
