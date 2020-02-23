package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheFirstNonConsecutiveNumber {
    public static void main(String[] args) {
	assertEquals(5, find(new int[] { 1, 2, 3, 5, 6 }));
    }

    public static Integer find(final int[] array) {
	for (int i = 1; i < array.length; i++) {
	    if (array[i - 1] + 1 != array[i]) {
		return array[i];
	    }
	}
	return null;
    }
}
