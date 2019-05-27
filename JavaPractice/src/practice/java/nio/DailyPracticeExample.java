/**
 * 
 */
package practice.java.nio;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		Collection<Integer> collection = new HashSet<>();
		System.out.println("adding 1 to collection: " + collection.add(1));

		Iterator<Integer> it = collection.iterator();

		System.out.println("checking if collection has an element: " + it.hasNext());

		System.out.println("removing an element for collection: " + it.next());
		it.remove();

		System.out.println("Collection's size: " + collection.size());

		System.out.println(collection.removeIf(t -> t == 1));

		System.out.println(collection.contains(1));

		collection.add(2);
		collection.add(3);

		System.out.println(collection.retainAll(List.of(2)));

		System.out.println(collection);

		Integer[] a = new Integer[1];

		System.out.println(a);

		a = collection.toArray(a);

		System.out.println(a);

		collection.stream().max(Comparator.comparing(t -> t)).ifPresent(t -> System.out.println(t));

	}

}
