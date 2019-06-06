/**
 * 
 */
package practice.java.nio;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		var stream = Stream.of(1, 2, 3, 4);
		Optional<Integer> integer = stream.min(Integer::compare);
		System.out.println(integer.orElseThrow());
	}
}
