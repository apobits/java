package code.wars;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class IsItEven {
    public static void main(String[] args) {
	assertFalse(isEven(3));
    }

    public static boolean isEven(double n) {
	return n % 2 == 0;
    }
}
