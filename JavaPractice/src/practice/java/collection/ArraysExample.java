/**
 * 
 */
package practice.java.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

/**
 * @author apobits@gmail.com
 *
 */
public class ArraysExample {

	public static void deepToString() {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(Arrays.deepToString(a));
	}

	public static void asList() {
		// creating a bridge from array to collection
		// the list return is backed by the specified array
		int[] numbers = new int[] { 1, 2, 3 };

		List<int[]> numbersList = Arrays.asList(numbers);

		numbersList.get(0)[1] = 4;

		numbers[0] = 5;

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbersList.get(0)[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();

	}

	public static void main(String[] args) {
		deepToString();
		System.exit(1);
		
		asList();

		int[] array1 = new int[] { 1, 2, 3 };

		int[] array2 = new int[] { 4, 5, 6 };

		Integer[] array3 = new Integer[] { Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9) };

		Comparator<Integer> comparator = (t, u) -> t.compareTo(u);

		Arrays.sort(array3, comparator);

		// binary search
		// array must be sorted to expect the correct result
		System.out.println("Element 2 is in position: " + Arrays.binarySearch(array1, 2));
		System.out.println("Element 7 is in position: " + Arrays.binarySearch(array3, 7, comparator));

		// copying arrays, it truncates or pads if necessary
		int[] array4 = Arrays.copyOf(array1, 2);

		// copying arrays, from inclusive to exclusive
		int[] array5 = Arrays.copyOfRange(array4, 0, 2);

		// arrays should be compared for equality with Arrays#equals
		// if just comparing object references use equals method
		System.out.println("array4 equals array5 = " + Arrays.equals(array4, array5));

		// filling an array
		Arrays.fill(array2, 5);
		System.out.println("array2 after filled with 5");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();

		// primitive arrays can only be sorted in ascending order
		Arrays.sort(array2);

		// Object arrays can be sorted in ascending order or by the order defined in the
		// comparator
		Arrays.sort(array3, 0, array3.length, comparator);

		// Sorts an array in parallel, methods are analogous to normal sort
		Arrays.parallelSort(array2);

		// returns an spliterator of the specified array
		Spliterator.OfInt spliterator = Arrays.spliterator(array1);

		System.out.println("Printing elements in the array through a stream");
		Arrays.stream(array1).forEach(t -> System.out.print(t + " "));

		// Updating all elements of the array with the result of the unary operator
		Arrays.setAll(array1, t -> t + 1);

		// Updating all elements of the array in parallel with the result of the unary
		// operator
		Arrays.parallelSetAll(array1, t -> t + 1);

		System.out.println();
		// updated all of the elements of the array with the result of the int binary
		// operator
		Arrays.parallelPrefix(array1, (t, u) -> t * u);
		System.out.println("array1 after using parallel prefix");
		System.out.println(Arrays.toString(array1));

	}

}
