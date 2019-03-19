/**
 * 
 */
package practice.java.nio;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample<T, U> {

	public static void main(String[] args) {
		IntStream is1 = IntStream.range(1, 3);
		IntStream is2 = IntStream.rangeClosed(1, 3);
		IntStream is3 = IntStream.concat(is1, is2);
		Object val = is3.boxed().collect(Collectors.groupingBy(k -> k));
		System.out.println(val);

	}

}
