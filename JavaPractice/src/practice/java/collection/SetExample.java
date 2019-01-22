/**
 * 
 */
package practice.java.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author aposo
 *
 */
public class SetExample {

	// Set does not allow duplicate elements

	public static void hashSet() {

		// best performance implementation but does not guarantee the order of elements
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(5);

		set.remove(2);

		set.contains(3);

		set.removeIf(t -> t.equals(5));
	}

	public static void treeSet() {

		// black red tree implementation, sorted according to the natural order of the
		// elements
		// implements the sortedSet interface
		SortedSet<Integer> set = new TreeSet<>();

		// order set that orders the elements according to the specified comparator
		SortedSet<Integer> set1 = new ConcurrentSkipListSet<Integer>((t, r) -> t - r);

		// comparator will be null if the set uses the natural ordering
		Comparator<Number> c = (Comparator<Number>) set.comparator();

		// comparator will not be null, because the sorted set was created with an
		// explicit comparator
		Comparator<Number> c1 = (Comparator<Number>) set1.comparator();

		System.out.println(c1.compare(1, 2));

		set1.add(2);
		set1.add(3);
		set1.add(1);
		set1.add(4);

		// gets the first element in the sorted set
		System.out.println("First element in the sortet set: " + set1.first());

		// gets the last element in the sorted set
		System.out.println("Last element in the sorted set: " + set1.last());

		// all the subsets are backed by the set

		// gets a subset of the sorted set from the beginning to one element before of
		// the specified element
		SortedSet<Integer> headSet = set1.headSet(2);
		System.out.println("head set of the sorted set: " + headSet);

		// gets a subset of the sorted set from the specified element to the end
		SortedSet<Integer> tailSet = set1.tailSet(2);
		System.out.println("tail set of the sorted set: " + tailSet);

		// gets a subset of the sorted set from the specified element to on element
		// before of the specified element
		SortedSet<Integer> subSet = set1.subSet(2, 3);
		System.out.println("sub set of sorted set: " + subSet);

		// calling add on a subset with an element that does not exist in the set throws
		// illegal argument exception
		// subSet.add(5);

		// removing an element from the subset also remove that element from the set
		subSet.remove(1);

		System.out.println("set: " + set1);

	}

	public static void linkedHashSet() {

		// second better performance implementation, it guarantees the order of elements
		// as they were inserted
		Set<Integer> set = new LinkedHashSet<>();

	}

	public static void main(String[] args) {
		treeSet();
	}

}
