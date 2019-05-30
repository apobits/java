/**
 * 
 */
package practice.java.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class LowerBoundWildcardExample {

	public static void test(List<? super Integer> list) {
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Object> o = new ArrayList<>();
		List<Integer> i = new ArrayList<>();
		test(o);
		test(i);

		o.forEach(t -> System.out.print(t + " "));
		System.out.println();
		i.forEach(t -> System.out.print(t + " "));

	}

}
