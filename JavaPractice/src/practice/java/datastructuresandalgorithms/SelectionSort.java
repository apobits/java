package practice.java.datastructuresandalgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(Integer[] numbers, Integer[] temp) {

        int tempIndex = 0;
        int elementsLeft = numbers.length;

        while (elementsLeft > 0) {
            int minimum = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != null && numbers[i] < minimum) {
                    minimum = numbers[i];
                    index = i;
                }
            }
            temp[tempIndex] = numbers[index];
            tempIndex++;
            numbers[index] = null;
            elementsLeft--;
        }
        numbers = temp;
    }

    public static void sort2(Integer[] numbers) {
        int index = 0;
        while (index < numbers.length) {
            int minIndex = index;
            for (int j = index; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[index];
            numbers[index] = numbers[minIndex];
            numbers[minIndex] = temp;
            index++;
        }
    }

    public static void main(String[] args) {
        var numbers = new Integer[]{3, 2, 1};
//        var temp = new Integer[numbers.length];
//        sort(numbers, temp);
//        System.out.println(Arrays.deepToString(numbers));
//        numbers = temp;
//        System.out.println(Arrays.deepToString(numbers));
        sort2(numbers);
        System.out.println(Arrays.deepToString(numbers));
    }

}
