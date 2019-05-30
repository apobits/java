/**
 * 
 */
package practice.java.generic;

import java.util.Arrays;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class UpperBoundWildcardExample {

	public static void test(List<? extends Number> list) {
		for (Number x : list) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		List<Integer> i = Arrays.asList(1, 2, 3);
		List<Double> d = Arrays.asList(1.0, 2.0, 3.0);
		test(i);
		test(d);

	}
}
