/**
 * 
 */
package justdo.it.ocpjp8;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * @author apobits@gmail.com
 *
 */
public class IntStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creates an IntStream from the range of(inclusive) to (exclusive)
		IntStream is = IntStream.range(0, 5);

		// Assigns to OptionalDouble object the result of the IntStream average method
		OptionalDouble od = is.average();

		// prints OptionalDouble object representation
		System.out.println(od);

		// prints the result of method isPresent(returns true if the OptionalDouble has
		// a value)
		System.out.println(od.isPresent());

		OptionalDouble od1 = OptionalDouble.empty();
		// prints the result of orElseGet(returns the value if present otherwise returns
		// the value returned by the DoubleSupplier interface implementation)
		System.out.println(od1.orElseGet(() -> 3.0));

		// prints OptionalDouble object representation
		System.out.println(od1);

		// if OptinalDouble has a value the consumer method will be invoked
		od1.ifPresent(t -> System.out.println(t));

	}

}
