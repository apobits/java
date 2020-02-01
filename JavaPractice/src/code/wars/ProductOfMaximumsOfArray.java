package code.wars;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOfMaximumsOfArray {
    public static void main(String[] args) {
	assertEquals(12, maxProduct(new int[] { 1, 2, 3, -5, 4 }, 2));
    }

    public static long maxProduct(int[] numbers, int sub_size) {
	System.out.println(Arrays.toString(numbers));
	Arrays.sort(numbers);
	var index = numbers.length - 1;
	long product = 1;
	for (int i = 0; i < sub_size; i++) {
	    if (0 <= index && index < numbers.length) {
		product *= numbers[index--];
	    }
	}
	return product;
    }

    public static long maxProductV2(int[] numbers, int sub_size) {
	//this approach could be better that the first one if sort method guarantees O(n long n)
	return Arrays.stream(numbers).sorted().skip(numbers.length - sub_size).mapToLong(t -> t)
			.reduce(1, (t, u) -> t * u);
    }
}
