package code.wars;

import java.util.Arrays;

public class FindNumbersWhichAreDivisibleByTheGivenNumber {
    public static void main(String[] args) {
	System.out.println(Arrays.toString(divisibleBy(new int[] { 1, 2, 3, 4, 5, 6 }, 2)));
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
	return Arrays.stream(numbers).filter(t -> t % divider == 0).toArray();
    }
}
