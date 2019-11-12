package practice.java.datastructuresandalgorithms;

public class BinarySearch {

    private static int binarySearchV1Counter;

    private static int binarySearchV2Counter;

    public static boolean binarySearchV1(int numberToSearch, int[] numbers) {
        return binarySearchV1Util(numberToSearch, numbers, 0, numbers.length - 1);
    }

    public static boolean binarySearchV2(int numberToSearch, int[] numbers) {
        return binarySearchV2Util(numberToSearch, numbers, 0, numbers.length - 1);
    }

    private static boolean binarySearchV1Util(int numberToSearch, int[] numbers, int start, int end) {
        binarySearchV1Counter++;
        int mid = (start + end) / 2;

        if (numbers[mid] == numberToSearch) {
            return true;
        }

        if (numbers[mid] > numberToSearch) {
            return binarySearchV1Util(numberToSearch, numbers, start, mid - 1);
        } else {
            return binarySearchV1Util(numberToSearch, numbers, mid + 1, end);
        }

    }

    private static boolean binarySearchV2Util(int numberToSearch, int[] numbers, int start, int end) {
        binarySearchV2Counter++;
        int mid = (end - start) / 2 + start;

        if (numbers[mid] == numberToSearch) {
            return true;
        }

        if (numbers[mid] > numberToSearch) {
            return binarySearchV2Util(numberToSearch, numbers, start, mid - 1);
        } else {
            return binarySearchV2Util(numberToSearch, numbers, mid + 1, end);
        }
    }

    public static void main(String args[]) {
        var numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("binarySearchV1 " + binarySearchV1(5, numbers) + " number of recursive calls: " + binarySearchV1Counter);
        System.out.println("binarySearchV2 " + binarySearchV2(5, numbers) + " number of recursive calls: " + binarySearchV2Counter);
    }
}
