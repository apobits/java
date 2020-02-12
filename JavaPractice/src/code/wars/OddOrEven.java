package code.wars;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOrEven {
    public static void main(String[] args) {
	assertEquals("even", oddOrEven(new int[] { 0 }));
    }

    public static String oddOrEven(int[] array) {
	return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
