/**
 * 
 */
package practice.java.stream;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author apobits@gmail.com
 *
 */
public class IntStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntStream is = IntStream.of(1, 2, 3, 4, 5);
		OptionalDouble average = is.average();
		int sum = is.sum();
		DoubleStream ds = is.asDoubleStream();
		Stream<Integer> integerStream = is.mapToObj(t -> t);

	}

}
