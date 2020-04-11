package code.wars;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheDivisorsOfANumber {

    public static void main(String[] args) {
	assertEquals(3, numberOfDivisors(4));
    }

    public static long numberOfDivisors(int n) {
	return Stream.iterate(1, t -> ++t).filter(t -> n % t == 0).count();
    }

}
