/**
 * 
 */
package practice.java.nio;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {
	public static void main(String[] args) {
		for (String arg : args) {
			switch (arg) {
			case "a":
				System.out.println("great!");
				break;
			default:
				System.out.println("unknown");
			}
		}
	}
}
