package practice.java.datastructuresandalgorithms;

public class BinarySearch {

    public static void main(String args[]) {
	var numbers = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	System.out.println(binarySearchIterative(numbers, 6));
	System.out.println(binarySearchRecursive(numbers, 6));

    }

    public static boolean binarySearchRecursive(int[] numbers, int number) {
	return binarySearchRecursive(numbers, number, 0, numbers.length - 1);
    }

    private static boolean binarySearchRecursive(int[] numbers, int number, int start, int end) {
	if (start > end) {
	    return false;
	}

	var mid = (end - start) / 2 + start;

	if (numbers[mid] == number) {
	    return true;
	}

	if (numbers[mid] < number) {
	    return binarySearchRecursive(numbers, number, mid + 1, end);
	} else {
	    return binarySearchRecursive(numbers, number, start, mid - 1);
	}
    }

    public static boolean binarySearchIterative(int[] numbers, int number) {
	return binarySearchIterative(numbers, number, 0, numbers.length);
    }

    private static boolean binarySearchIterative(int[] numbers, int number, int start, int end) {
	while (start < end) {
	    var mid = start + (end - start) / 2;
	    if (numbers[mid] == number) {
		return true;
	    }
	    if (numbers[mid] < number) {
		start = mid + 1;
	    } else {
		end = mid - 1;
	    }
	}
	return false;
    }
}
