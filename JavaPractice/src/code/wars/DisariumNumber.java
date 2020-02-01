package code.wars;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisariumNumber {
    public static void main(String[] args) {
	assertEquals("Disarium !!", disariumNumber(89));
    }

    public static String disariumNumber(int number) {
	AtomicInteger integer = new AtomicInteger();
	return Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt)
			.reduce(0, (t, u) -> t + (int) Math.pow(u, integer.incrementAndGet())) == number ?
			"Disarium !!" :
			"Not !!";
    }

}
