/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author aposo
 *
 */
public class Q19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(200);

		UnaryOperator<Integer> funIntF = t -> t * 5;
		nums.replaceAll(funIntF);

		System.out.println(nums);

	}

}
