package code.wars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNumbersFrom0ToN {
    public static void main(String[] args) {
	assertEquals("0+1+2+3=6", showSequence(3));
    }

    public static String showSequence(int value) {
	if (value < 0) {
	    return String.join("<", String.valueOf(value), "0");
	}
	if (value == 0) {
	    return String.join("=", "0", "0");
	}

	String numbers = IntStream.range(0, value + 1).mapToObj(t -> String.valueOf(t))
			.collect(Collectors.joining("+", "", " = "));
	int result = IntStream.range(0, value + 1).sum();

	return numbers + result;
    }

}
