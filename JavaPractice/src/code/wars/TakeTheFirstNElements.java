package code.wars;

import java.util.Arrays;

public class TakeTheFirstNElements {
    public static int[] take(int[] arr, int n) {
	return Arrays.copyOf(arr, n);
    }
}
