/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;

/**
 * @author aposo
 *
 */
public class Q53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 20, 10, 20, 20);

		boolean b = nums.stream().filter(t -> t == 20).allMatch(t -> t == 20);

		System.out.println(b);

		b = nums.stream().map(t -> 20).noneMatch(t -> t == 10);

		System.out.println(b);

	}

}
