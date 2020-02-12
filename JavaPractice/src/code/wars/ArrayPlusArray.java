package code.wars;

import java.util.stream.IntStream;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
	return IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sum();
    }
}
