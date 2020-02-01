package code.wars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BalancedNumber {

    public static void main(String[] args) {
	System.out.println(balancedNum(9559));
    }

    public static String balancedNum(long number) {
	int[] numbers = Arrays.stream(String.valueOf(number).split("")).mapToInt(t -> Integer.parseInt(t)).toArray();
	if (numbers.length < 3) {
	    return "Balanced";
	}
	int left = 0, right = 0;
	var middleIndex = numbers.length % 2 == 0 ? (numbers.length / 2) - 1 : numbers.length / 2;

	for (int i = 0; i < middleIndex; i++) {
	    left += numbers[i];
	}
	if (numbers.length % 2 == 0) {
	    middleIndex++;
	}
	for (int i = middleIndex + 1; i < numbers.length; i++) {
	    right += numbers[i];
	}
	return left == right ? "Balanced" : "Not Balanced";
    }

}
