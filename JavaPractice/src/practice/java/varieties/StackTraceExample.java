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
			StackTraceFirstException.throwException();
		} catch (Exception e) {
			for (StackTraceElement x : e.getStackTrace()) {
				System.out.println(x);
			}
		}

	}

}
