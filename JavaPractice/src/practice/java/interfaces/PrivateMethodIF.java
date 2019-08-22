/**
 * 
 */
package practice.java.interfaces;

/**
 * @author aposo
 *
 */
public interface PrivateMethodIF {

	// private static methods are only visible in the interface itself, not on
	// implementing classes nor through the interface reference
	private static void lol() {
		System.out.println("lol");
	}
}
