/**
 * 
 */
package practice.java.datastructuresandalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class Intersection {

	public static List<Integer> intersection(int[] a, int[] b) {
		long start = System.nanoTime();
		List<Integer> result = new ArrayList<>(a.length);
		for (int x : a) {
			for (int y : b) {
				if (x == y)
					result.add(x);
			}
		}
		long end = System.nanoTime();
		System.out.println("Executed in " + (end - start) + " nanoseconds");
		return result;
	}

	public static List<Integer> intersection2(int[] a, int[] b) {
		long start = System.nanoTime();
		Arrays.sort(a);
		Arrays.sort(b);

		List<Integer> result = new ArrayList<>(a.length);
		for (int x : a) {
			if (Arrays.binarySearch(b, x) != -1) {
				result.add(x);
			}
		}
		long end = System.nanoTime();
		System.out.println("Executed in " + (end - start) + " nanoseconds");
		return result;
	}

	public static void main(String[] args) {
		var a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		var b = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35 };
		System.out.println(intersection2(a, b));

	}

}
