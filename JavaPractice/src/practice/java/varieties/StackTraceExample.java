/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class StackTraceExample {

	public static void main(String[] args) {

		try {
			throw new Exception("Testing stack trace");
		} catch (Exception e) {
			System.out.println(e);
			for (StackTraceElement x : e.getStackTrace()) {
				System.out.println(x);
			}
		}

	}

}
