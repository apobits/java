/**
 * 
 */
package practice.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Administrador
 *
 */
public class LambdaExample {

	static int i;

	public static <T, R> void testLambdaAsParameter(Function<T, R> function, T t) {
		System.out.println(function.apply(t));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int j = 0;

		// Assign example
		Consumer<String> consumer = t -> {
			i = 1;
			// j=i; //it must be final or effectively final
			System.out.println(t);
		};
		consumer.accept("Hello");

		// Parameter example
		testLambdaAsParameter((t) -> t, "Hello");

		System.out.println(i);
	}

}
