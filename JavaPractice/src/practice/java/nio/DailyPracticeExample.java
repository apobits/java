/**
 * 
 */
package practice.java.nio;

import java.util.Arrays;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("A", "BB", "C", "D", "E");
		System.out.println(words.stream().filter(t -> t.length() == 1).anyMatch(t -> {
			System.out.println("Printing...");
			return true;
		}));
	}
}
