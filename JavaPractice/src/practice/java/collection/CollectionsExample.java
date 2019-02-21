/**
 * 
 */
package practice.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author apobits@gmail.com
 *
 */
public class CollectionsExample {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		List<Integer> numbers1 = new ArrayList<>();
		Set<String> names = new TreeSet<>();

		Collections.addAll(names, "Albin", "Danna", "Marcela");

		// adding an array of elements to a collection
		Collections.addAll(numbers, 1, 2, 3, 4);

		// Sorting a list with the natural order
		Collections.sort(numbers);

		Comparator<Integer> comparator = (t, u) -> t.compareTo(u);

		// no comparator specified, using natural order
		System.out.println(
				"Binary search of element 2 in " + numbers + " index is: " + Collections.binarySearch(numbers, 2));

		// Specifying a comparator
		System.out.println("Binary search of element 2 in " + numbers + " index is: "
				+ Collections.binarySearch(numbers, 2, comparator));

		// Generics in some situations can be passed through, in this cases you can
		// obtain a type safe view of a collection
		Collection<Integer> integerCollection = Collections.checkedCollection(numbers, Integer.class);

		// copying a list into another list with Collections class
		Collections.copy(numbers, numbers1);

		// gets a synchronized collection
		Collection<Integer> syncCollection = Collections.synchronizedCollection(numbers);

		// gets an unmodifiable collection
		Collection<Integer> unmodifiableCollection = Collections.unmodifiableCollection(numbers);

		System.out.println("Minum element in " + numbers + " is " + Collections.min(numbers));
		System.out.println("Max element in " + numbers + " is " + Collections.max(numbers));
	}

}
