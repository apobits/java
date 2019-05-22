/**
 * 
 */
package practice.java.nio;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		Stream<Integer> numbers = Stream.of(1, 2, 3);
		IntStream numbers1 = numbers.mapToInt(t -> t);
		OptionalDouble result = numbers1.average();
		System.out.println(result.orElse(0));
	}

}
