/**
 * 
 */
package practice.java.nio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		List<Integer> list = Stream.of(2, 1, 3).<List<Integer>>collect(() -> new ArrayList<>(), (t, s) -> t.add(s),
				(t, s) -> t.addAll(s));

		List<Integer> list1 = Stream.of(2, 1, 3).collect(Collectors.toList());

		System.out.println(list);

		System.out.println(list1);
	}
}
