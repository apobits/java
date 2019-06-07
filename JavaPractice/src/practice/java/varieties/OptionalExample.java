/**
 * 
 */
package practice.java.varieties;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author apobits@gmail.com
 *
 */
public class OptionalExample {

	// since 9
	public static void stream() {
		Optional<Integer> optional1 = Optional.of(1);
		Optional<Integer> optional2 = Optional.ofNullable(null);
		Optional<Integer> optional3 = Optional.of(2);
		Optional<Integer> optional4 = Optional.of(3);

		Stream<Optional<Integer>> optionalStream = Stream.of(optional1, optional2, optional3, optional4);
		Stream<Integer> numbers = optionalStream.flatMap(t -> t.stream());
		numbers.forEach(t -> System.out.print(t + " "));
	}

	public static void ifPresent() {
		Optional<String> stringOptional = Optional.of("Albin");
		stringOptional.ifPresent(t -> System.out.println(t));
	}

	public static void ifPresentOrElse() {
		Optional<Double> doubleOptional = Optional.ofNullable(null);
		doubleOptional.ifPresentOrElse(t -> System.out.println(t), () -> System.out.println("Empty"));
	}

	public static void or() {
		Optional<Float> floatOptional = Optional.ofNullable(null);
		Optional<Float> floatOptionalOr = floatOptional.or(() -> Optional.of(15.0f));
		System.out.println(floatOptionalOr);

		System.out.println(floatOptional + " orElse: " + floatOptional.orElse(15f));

		System.out.println(floatOptional + " orElseGet:" + floatOptional.orElseGet(() -> 16f));

		try {
			System.out.println(floatOptional + " orElseThrow: " + floatOptional.orElseThrow());
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}

		try {
			System.out.println(
					floatOptional + " orElseThrow: " + floatOptional.orElseThrow(() -> new Exception("Own exception")));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void isEmpty() {
		Optional<Short> shortOptional = Optional.of(Short.valueOf("2"));
		System.out.println(shortOptional + " is empty:  " + shortOptional.isEmpty());
	}

	public static void isPresent() {
		byte b = 12;
		Optional<Byte> byteOptional = Optional.of(b);
		System.out.println(byteOptional + " is present: " + byteOptional.isPresent());
	}

	public static void filter() {
		Optional<Long> longOptional = Optional.of(12l);
		System.out.println(longOptional + " filtering value equals 12: " + longOptional.filter(t -> t == 12));
	}

	public static void flatMap() {
		// if value is present returns the optional created by the specified function
		Optional<BigDecimal> bigDecimalOptional = Optional.of(new BigDecimal(1));
		Optional<Integer> bigDecimalOptional1 = bigDecimalOptional.flatMap(t -> Optional.of(t.intValue()));
		System.out.println("before flatMap: " + bigDecimalOptional + "\nafter flatMap: " + bigDecimalOptional1);

		// if value is not present returns an empty optional
		Optional<BigDecimal> bigDecimalOptional2 = Optional.ofNullable(null);
		Optional<Integer> bigDecimalOptional3 = bigDecimalOptional2.flatMap(t -> Optional.of(t.intValue()));
		System.out.println("before flatMap: " + bigDecimalOptional2 + "\nafter flatMap: " + bigDecimalOptional3);
	}

	public static void map() {
		Optional<BigInteger> bigIntegerOptional = Optional.of(new BigInteger("13"));
		Optional<String> bigIntegerOptiona1 = bigIntegerOptional.map(t -> t.toString());
		System.out.println("before map: " + bigIntegerOptional + " after map: " + bigIntegerOptiona1);

		Optional<BigInteger> bigIntegerOptional2 = Optional.ofNullable(null);
		Optional<String> bigIntegerOptiona3 = bigIntegerOptional2.map(t -> t.toString());
		System.out.println("before map: " + bigIntegerOptional2 + " after map: " + bigIntegerOptiona3);
	}

	public static void get() {
		Optional<String> stringOptional = Optional.of("Danna");
		Optional<String> stringOptional1 = Optional.empty();
		try {
			System.out.println(stringOptional + " get: " + stringOptional.get());
			System.out.println(stringOptional1 + " get: " + stringOptional1.get());
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}

	public static void construct() {
		// creates an optional with the specified value or throw a NullPointerException
		// if the
		// specified value is null
		Optional.of(1);

		// creates an optional with the specified value or an empty optional if the
		// specified value is null
		Optional.ofNullable(null);

		// creates an empty optional
		Optional.empty();
	}

	public static void main(String[] args) {
		stream();
		System.out.println();

		ifPresent();
		System.out.println();

		ifPresentOrElse();
		System.out.println();

		or();
		System.out.println();

		isEmpty();
		System.out.println();

		isPresent();
		System.out.println();

		filter();
		System.out.println();

		flatMap();
		System.out.println();

		map();
		System.out.println();

		get();
	}

}
