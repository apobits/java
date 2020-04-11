package practice.java.datastructuresandalgorithms;

import javax.swing.*;
import java.util.Arrays;

public class BubbleSort {

    public static void sort(Integer[] toOrder) {
        int count = 0;
        for (int i = 0; i < toOrder.length - 1; i++) {
            for (int j = 0; j < toOrder.length - 1; j++) {
                ++count;
                if (toOrder[j] > toOrder[j + 1]) {
                    int temp = toOrder[j];
                    toOrder[j] = toOrder[j + 1];
                    toOrder[j + 1] = temp;
                }
            }
        }
        System.out.println(count);
    }

    public static void sortImprove(Integer[] toOrder) {
        int count = 0;
        for (int i = 0; i < toOrder.length - 1; i++) {
            boolean orderedFlag = true;
            for (int j = 0; j < (toOrder.length - 1) - i; j++) {
                ++count;
                if (toOrder[j] > toOrder[j + 1]) {
                    orderedFlag = false;
                    int temp = toOrder[j];
                    toOrder[j] = toOrder[j + 1];
                    toOrder[j + 1] = temp;
                }
            }
            if (orderedFlag) {
                break;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        Integer[] array = new Integer[]{2, 1, 3, 7, 6, 5, 4};
        sortImprove(array);
        System.out.println(Arrays.deepToString(array));
    }
}
