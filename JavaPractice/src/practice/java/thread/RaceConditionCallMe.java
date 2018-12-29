/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class RaceConditionCallMe {

	synchronized public void printMessage(String message) {
		System.out.print("[");
		System.out.print(message);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.print("]");
		System.out.println();
	}

}
