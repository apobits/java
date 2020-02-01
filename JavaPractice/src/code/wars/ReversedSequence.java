package code.wars;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedSequence {
    public static void main(String[] args) {
	assertEquals(Arrays.toString(new int[] { 5, 4, 3, 2, 1 }), Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
	var result = new int[n];
	for (int i = n; i > 0; i--) {
	    result[n - i] = i;
	}
	return result;
    }

}
