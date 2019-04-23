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
public class Q60 {

	public static int doSum(List<Integer> list) {
		return list.stream().mapToInt(t -> t).sum();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(doSum(nums));
	}

}
