package code.wars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrder {
    public static void main(String[] args) {
	assertEquals(54321, sortDesc(54213));
    }

    public static int sortDesc(final int num) {
	return Integer.parseInt(Stream.of(String.valueOf(num).split("")).sorted((t, u) -> u.compareTo(t))
			.collect(Collectors.joining()));
    }

}
