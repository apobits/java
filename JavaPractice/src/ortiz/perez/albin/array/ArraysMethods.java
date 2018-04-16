/**
 * 
 */
package ortiz.perez.albin.array;

import java.util.Arrays;

/**
 * @author Administrador
 *
 */
public class ArraysMethods {

	public static void main(String[] args) {

		int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.binarySearch(x, 5));// retrieves the position
														// found by the binary
														// search

		int y[] = Arrays.copyOf(x, x.length);
		int z[] = Arrays.copyOfRange(y, 0, 5);

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		System.out.println("x array " + Arrays.toString(x));
		System.out.println("y array " + Arrays.toString(y));
		System.out.println("z array " + Arrays.toString(z));
		System.out.println("x equals y? " + Arrays.equals(x, y));// returns
																	// true, it
																	// compares
																	// one
																	// dimension
																	// arrays
		System.out.println("a equals b? " + Arrays.equals(a, b));// returns
																	// false
																	// because
																	// does not
																	// check
																	// nested
																	// arrays
		System.out.println("a equals b? " + Arrays.deepEquals(a, b));// returns
																		// true
																		// because
																		// it
																		// check
																		// m ,,s
																		// nested
																		// arrays
		int c[] = new int[5];
		Arrays.fill(c, 2);// fills the array with the specified value
		System.out.println(Arrays.toString(c));

		Integer d[] = { 3, 2, 4, 1, 5, };
		Arrays.sort(d);// sorts the array in ascending order
		System.out.println(Arrays.toString(d));
		Arrays.sort(d, (f, g) -> {
			return g - f;
		});// sorts the array in descending order
		System.out.println(Arrays.toString(d));

		int e[] = { 1, 3, 2, 5, 4 };
		Arrays.parallelSort(e);// it splits the array into sub arrays when
								// minimum granularity is reached, otherwise it
								// sorts without splitting
		System.out.println(Arrays.toString(e));

		int f[] = { 10, 11, 12, 13 };
		Arrays.setAll(f, t -> f[t]);// sets the value returned to the specified
									// index
		System.out.println(Arrays.toString(f));

		Arrays.parallelSetAll(f, t -> f[t]);// sets the value returned to the
											// specified index in parallel
		System.out.println(Arrays.toString(f));

		Arrays.parallelPrefix(f, (g, h) -> g * h);// sets the operation's result
													// at the index that holds
													// the h value
		System.out.println(Arrays.toString(f));
	}

}
