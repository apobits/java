/**
 * 
 */
package practice.java.nio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static double compute(double base, Function<Integer, Integer> func) {
		return func.apply((int) base);
	}

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3);
		
		ints.forEach(x->System.out.println(x));
	}

}
