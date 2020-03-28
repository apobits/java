package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDecimalsDigits {
    public static void main(String[] args) {
	assertEquals(3, digits(123));
    }

    public static int digits(long n) {
	return String.valueOf(n).length();
    }

}
