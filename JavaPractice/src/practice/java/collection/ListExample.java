/**
 * 
 */
package practice.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author apobits@gmail.com
 *
 */
public class ListExample {

	public static void arrayList() {
		// Usually the better performance implementation
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);

		// removes the first occurrence of the specified element
		// return true if the element was in the list
		list.remove(Integer.valueOf(2));

		// returns the element that was removed by its position and shifts the elements
		// one position to
		// the left
		list.remove(3);
		
		//returns the index of the specified object if it exits or -1 if it doesn't
		list.indexOf(2);
	}
	
	public static void linkedList() {
		//better performance under some circumstances
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

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
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

		list.add(5);
		subList.forEach(t -> System.out.println(t));
		list.forEach(t -> System.out.println(t));
	}

	public static void main(String[] args) {
		sublist();

	}

}
