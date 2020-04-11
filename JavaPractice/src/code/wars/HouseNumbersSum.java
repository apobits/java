package code.wars;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseNumbersSum {
    public static void main(String[] args) {
	assertEquals(11, houseNumbersSum(new int[] { 5, 1, 2, 3, 0, 3, 4, 5, 0 }));
    }

    public static int houseNumbersSum(final int[] arr) {
	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] == 0) {
		break;
	    }
	    sum += arr[i];
	}
	return sum;
    }
}
