package code.wars;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareNSum {

    public static void main(String[] args) {
	assertEquals(5, squareSum(new int[] { 1, 2 }));
	assertEquals(14, squareSum(new int[] { 1, 2, 3 }));
    }

    public static int squareSum(int[] n) {
	return Arrays.stream(n).reduce(0, (t, u) -> t + (u * u));
    }

}
