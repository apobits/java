/**
 * 
 */
package practice.java.collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author aposo
 *
 */
public class SetExample {

	static enum Vowel {
		A, E, I, O, U
	}

	// Set does not allow duplicate elements

	public static void hashSet() {

		// best performance implementation but does not guarantee the order of elements
		// default capacity is 16, default load factor is 0.75
		// the hash table is expanded when the number of elements is greater than
		// (capacity*loadFactor)
		Set<Integer> set = new HashSet<>(4);
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
		// implements the sortedSet, navigableSet interface
		// this set is based on a TreeMap
		TreeSet<Integer> set = new TreeSet<>();

		// order set that orders the elements according to the specified comparator
		SortedSet<Integer> set1 = new ConcurrentSkipListSet<Integer>((t, r) -> t - r);

		// comparator will be null if the set uses the natural ordering
		Comparator<Number> c = (Comparator<Number>) set.comparator();

		// comparator will not be null, because the sorted set was created with an
		// explicit comparator
		Comparator<Number> c1 = (Comparator<Number>) set1.comparator();

		System.out.println(c1.compare(1, 2));

		// operations with O(log(n)) complexity
		set1.add(2);
		set1.add(3);
		set1.add(1);
		set1.add(4);
		set1.remove(4);
		set1.contains(4);

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
		// subSet.add(3);

		// removing an element from the subset also removes that element from the set
		subSet.remove(2);

		System.out.println("set: " + set1);

		//
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(5);

		// navigable set methods
		// gets the smallest element greater than or equals to the specified element
		System.out.println(set.ceiling(4));

		// get a descending iterator
		Iterator<Integer> it = set.descendingIterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

		// gets a descending set, this set is backed by the set
		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println("Descending set: " + descendingSet);

		// changes in this set are reflected in the set and viceversa
		descendingSet.add(8);

		// gets the largest element lesser than or equals to the specified element
		System.out.println(set.floor(4));

		// returns the elements from the beginning of the set to the specified element
		// inclusive
		System.out.println(set.headSet(3, true));
		// returns the elements from the beginning of the set to the specified element
		// exclusive
		System.out.println(set.headSet(3));

		// returns the elements from the specified element to the end of the set
		System.out.println(set.tailSet(3));
		// returns the same elements as tailSet without the flag
		System.out.println(set.tailSet(3, true));

		// returns the least element strictly greater than the specified element
		System.out.println(set.higher(3));

		// returns the greatest element strictly lesser than the specified element
		System.out.println(set.lower(3));

		// returns and removes the first element in the set
		System.out.println(set.pollFirst());

		// returns and removes the last element in the set
		System.out.println(set.pollLast());

		// returns a subset of the set whose elements starts from element inclusive to
		// element exclusive
		System.out.println(set.subSet(2, 5));

		// returns a subset of the set whose elements starts from element
		// inclusive/exclusive to element inclusive/exclusive
		NavigableSet<Integer> ss = set.subSet(2, true, 5, true);

		// adding an element on a subset will throw a key out of
		// range(TreeMap$NavigableSubMap) exception if the
		// value is not contained in the subset
		// ss.add(9);

		set.add(6);

		ss.forEach(t -> System.out.println(t));

		Iterator<Integer> it1 = set.iterator();
		set.add(7);

		// if set is modified after an iterator was created and that iterator is used a
		// concurrent modification exception is thrown
		while (it1.hasNext()) {
			System.out.print(it1.next());
		}

	}

	public static void linkedHashSet() {

		// second better performance implementation, it guarantees the order of elements
		// as they were inserted
		Set<Integer> set = new LinkedHashSet<>();

	}

	public static void enumSet() {
		// Creates an enum set with the values specified in the parameters
		EnumSet<Vowel> vowels = EnumSet.of(Vowel.A, Vowel.E);

		// Creates an enum set with all the constants in the enum parameter
		EnumSet<Vowel> vowels1 = EnumSet.allOf(Vowel.class);

		// Creates an enum set with the values not contained in the enum set parameter
		EnumSet<Vowel> vowels2 = EnumSet.complementOf(vowels);

		// Creates an enum set with the values contained in the enum set parameter
		EnumSet<Vowel> vowels3 = EnumSet.copyOf(vowels1);

		Collection<Vowel> enumCollection = vowels3;

		// Creates an enum set wit the values contained in the collection parameter
		EnumSet<Vowel> vowels4 = EnumSet.copyOf(enumCollection);

		// Creates an empty enum set
		EnumSet<Vowel> vowels5 = EnumSet.noneOf(Vowel.class);

		// Creates an enum set with the values in the range of from until to parameters
		EnumSet<Vowel> vowels6 = EnumSet.range(Vowel.E, Vowel.O);

		System.out.println(vowels);
		System.out.println(vowels1);
		System.out.println(vowels2);
		System.out.println(vowels3);
		System.out.println(vowels4);
		System.out.println(vowels5);
		System.out.println(vowels6);

	}

	public static void main(String[] args) {
//		treeSet();
//		hashSet();
		enumSet();
	}

}
