/**
 * 
 */
package practice.java.nio;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static double compute(double base, Function<Integer, Integer> func) {
		return func.apply((int) base);
	}
	
	public static double get() {
		return 0.0;
	}

	public static void main(String[] args) {
		Supplier s = DailyPracticeExample::get;
		
		System.out.println(s.get());
	}
}
