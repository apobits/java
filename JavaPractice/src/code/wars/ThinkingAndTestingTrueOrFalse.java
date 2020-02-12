package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThinkingAndTestingTrueOrFalse {
    public static void main(String[] args) {
	assertEquals(3, testTrueFalse(7));
	assertEquals(1, testTrueFalse(8));
	assertEquals(2, testTrueFalse(9));
	assertEquals(2, testTrueFalse(10));
	assertEquals(3, testTrueFalse(100));
	assertEquals(6, testTrueFalse(1000));
	assertEquals(5, testTrueFalse(10000));
    }

    public static int testTrueFalse(int n) {
	return Math.round(n / 3);
    }
}
