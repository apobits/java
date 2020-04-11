package code.wars;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimizeSumOfArray {
    public static void main(String[] args) {
	assertEquals(22, minSum(new int[] { 5, 4, 2, 3 }));
    }

    public static int minSum(int[] passed) {
	Arrays.sort(passed);
	int sum = 0;
	for (int i = 0; i < passed.length / 2; i++) {
	    sum += (passed[i] * passed[passed.length - (i + 1)]);
	}
	return sum;
    }
}
