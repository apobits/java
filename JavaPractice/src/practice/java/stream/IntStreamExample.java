/**
 * 
 */
package practice.java.stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.IntConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author apobits@gmail.com
 *
 */
public class IntStreamExample {

	public static void contruct() {
		var numbers = new int[] { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(numbers);
		var intSummaryStatistics = intStream.summaryStatistics();
		IntConsumer intConsumer = intSummaryStatistics.andThen(t -> System.out.println(t));
		intConsumer.accept(7);
		intConsumer.accept(9);
		System.out.println(intSummaryStatistics.getMax());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		contruct();
		
		System.exit(0);
		
		IntStream is = IntStream.of(1, 2, 3, 4, 5);
		OptionalDouble average = is.average();
		int sum = is.sum();
		DoubleStream ds = is.asDoubleStream();
		Stream<Integer> integerStream = is.mapToObj(t -> t);
	}

}
