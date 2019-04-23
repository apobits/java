/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author aposo
 *
 */
public class Q33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(numberArray));

		List<Integer> myList = Collections.synchronizedList(new ArrayList<>());

		listOfNumbers.stream().map(t -> {
			myList.add(t);
			return t;
		}).forEachOrdered(t -> System.out.print(t + " "));

		System.out.println();

		myList.forEach(t -> System.out.print(t + " "));

	}

}
