package practice.java.datastructuresandalgorithms;

import java.util.Arrays;

public class DivideAndConquerExamples {

    public static void main(String[] args) {
	//	System.out.println(maximumSquaresInArea(1680, 640));
	var numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	System.out.printf("Sum of %s is %d", Arrays.toString(numbers), arraySumRecursively(numbers));
    }

    public static int maximumSquaresInArea(int height, int width) {
	var max = height > width ? height : width;
	var min = height == max ? width : height;
	var result = maximumSquaresInAreaHelp(max, min);
	return (max * min) / (result * result);
    }

    private static int maximumSquaresInAreaHelp(int max, int min) {
	if (max % min == 0) {
	    return min;
	}
	return maximumSquaresInAreaHelp(min, max % min);
    }

    private static int arraySumRecursively(int[] numbers, int index) {
	if (index == numbers.length - 1) {
	    return numbers[index];
	}
	return numbers[index] + arraySumRecursively(numbers, ++index);
    }

    public static int arraySumRecursively(int[] numbers) {
	return arraySumRecursively(numbers, 0);
    }
}
