/**
 * 
 */
package practice.java.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class StreamExample {

	private static List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

	public static void reduce() {
		System.out.println(integers.stream().reduce(-1, (t, u) -> t + u));
	}

	public static void max() {
		System.out.println(integers.stream().max((t, u) -> t - u));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reduce();
		max();
	}

}
