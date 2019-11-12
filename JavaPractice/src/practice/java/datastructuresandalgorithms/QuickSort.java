package practice.java.datastructuresandalgorithms;

import java.util.Arrays;

public class QuickSort {

    public static void lomutoPartitioning(int[] numbers) {
        lomutoPartitioningHelper(numbers, 0, numbers.length - 1);
    }

    private static void lomutoPartitioningHelper(int[] numbers, int start, int end) {
        if (start < end) {
            int mid = lomutoPartitioningImp(numbers, start, end);
            lomutoPartitioningHelper(numbers, start, mid - 1);
            lomutoPartitioningHelper(numbers, mid + 1, end);
        }

    }

    private static int lomutoPartitioningImp(int[] numbers, int start, int end) {
        int i = start - 1, pivot = numbers[end], x = 0;

        for (int j = start; j <= end; j++) {
            if (numbers[j] < pivot) {
                swap(numbers, ++i, j);
            }
        }
        swap(numbers, ++i, end);
        return i;
    }

    private static void swap(int[] numbers, int posx, int posy) {
        int temp = numbers[posx];
        numbers[posx] = numbers[posy];
        numbers[posy] = temp;
    }

    public static void main(String args[]) {
        var numbers = new int[]{2, 3, 1, 8, 6, 5};
        lomutoPartitioning(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
