package practice.java.datastructuresandalgorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]) {
	var numbers = new int[] { 2, 3, 1, 8, 6, 5 };
	quickSort(numbers);
	System.out.println(Arrays.toString(numbers));
    }

    public static void quickSort(int[] numbers) {
	quickSort(numbers, 0, numbers.length - 1);
    }

    private static void quickSort(int[] numbers, int start, int end) {
	if (start >= end) {
	    return;
	}
	var middleIndex = (start + end) / 2;
	var pivot = numbers[middleIndex];
	var left = start;
	var right = end;
	while (left < right) {
	    while (numbers[left] < pivot) {
		left++;
	    }
	    while (numbers[right] > pivot) {
		right--;
	    }
	    if (left < right) {
		swap(numbers, left++, right--);
	    }
	}
	quickSort(numbers, start, middleIndex);
	quickSort(numbers, middleIndex + 1, end);
    }

    private static void swap(int[] numbers, int posx, int posy) {
	int temp = numbers[posx];
	numbers[posx] = numbers[posy];
	numbers[posy] = temp;
    }
}
