package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumMultiple {
    public static void main(String[] args) {
	assertEquals(6, maxMultiple(2, 7));
    }

    public static int maxMultiple(int divisor, int bound) {
	for (int i = bound; i >= 0; i--) {
	    if (i % divisor == 0) {
		return i;
	    }
	}
	return 0;
    }
}
