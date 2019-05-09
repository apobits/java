/**
 * 
 */
package practice.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/**
 * @author apobits@gmail.com
 *
 */
public class ListExample {

	public static void arrayList() {
		// Usually the better performance implementation
		// Default capacity is 10, when maximum capacity is reached the new array is
		// created with a capacity of (oldcapacity + (oldcapacity)/2)
		ArrayList<Integer> list = new ArrayList<>();

		// adds the element to the end of the list
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);

		// adds the element at the specified index shifting up the existent values
		list.add(0, 2);

		// adds the specified collection starting from the specified index shifting up
		// the existent values
		list.addAll(2, Arrays.asList(4, 5, 6));

		// gets the element at the specified index
		System.out.println("Element at index 0: " + list.get(0));

		// removes the first occurrence of the specified element
		// return true if the element was in the list
		list.remove(Integer.valueOf(4));

		// returns the element that was removed at the specified position and shifts the
		// elements
		// one position to
		// the left
		list.remove(3);

		// returns the index of the specified object if it exits or -1 if it doesn't
		System.out.println("index of element 2: " + list.indexOf(2));

		// returns the last index of the specified element
		list.add(2);
		System.out.println("last index of element 2: " + list.lastIndexOf(2));

		// replaces every element in the list with the result of applying the unary
		// operator to that element
		list.replaceAll(t -> t + 1);

		// replaces the element at the specified index with the specified element
		list.set(0, 1);

		// printing list
		System.out.println("Printing list ");
		System.out.println(list);

		// sorts the elements in the list using the specified comparator
		System.out.println("Printing list in descending order");
		list.sort((t, r) -> r - t);
		System.out.println(list);

		// gets the object by its position in the list
		list.get(0);

	}

	public static void linkedList() {
		// better performance under some circumstances
		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
	}

	public static void listIterator() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);

		// iterator that allows backward and forward traversing
		ListIterator<Integer> lit = list.listIterator();
		// Adds the element before the position that would be return by nextIndex
		lit.add(0);
		System.out.println("Printing list: " + list);
		System.out.print("Printing elements from beginning to the end:");
		lit.previous();
		while (lit.hasNext()) {
			System.out.print(lit.next() + " ");
		}
		System.out.println();
		System.out.print("Printing elements from the end to the beginnig: ");
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
		}

		// performs the consumer action for each remaining element
		// forward iteration
		lit.forEachRemaining(t -> System.out.println(t));

		// if the list is modified after an iterator was created and that iterator is
		// used a concurrent modification exception is thrown
//		list.add(7);

		// overrides the element that was returned after the call to next or previous
		lit.set(4);
		// removes the element that was returned after the call to next or previous
		lit.remove();
	}

	public static void sublist() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);

		// sublist is backed by the list on which sublist was called
		// any changes on sublist will be reflected on the list where sublist was called
		List<Integer> subList = list.subList(1, list.size());
		subList.add(4);

		// when modifying(structural) the actual list, actions in the sublist may throw
		// a concurrent
		// modification exception
		list.add(1, 5);

		subList.forEach(t -> System.out.println(t));

		list.forEach(t -> System.out.println(t));
	}

	public static void iterator() {
		ArrayList<Integer> list = new ArrayList<>();
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}

	public static void spliterator() {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		Spliterator<Integer> spliterator = list.spliterator();
		System.out.print("Elements in spliterator: ");
		// iterates over the list through a spliterator
		spliterator.forEachRemaining(t -> System.out.print(t + " "));
		System.out.println();
		System.out.println("Elements in spliterator1 two: ");
		Spliterator<Integer> spliterator1 = spliterator.trySplit();
		if (spliterator1 != null) {
			spliterator1.forEachRemaining(t -> System.out.print(t + " "));
		}

		// iterates over the list through a spliterator
		spliterator.tryAdvance(t -> System.out.print(t + " "));

		// return an estimate of the number of elements that the spliterator would
		// iterate if a call to forEachRemaining
		System.out.println(spliterator.estimateSize());
	}

	public static void main(String[] args) {
//		listIterator();
//		sublist();
//		arrayList();
//		listIterator();
		spliterator();
	}

}
