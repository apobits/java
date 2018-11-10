/**
 * 
 */
package practice.java.collection;

import java.util.ArrayList;
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
	}

	public static void listIterator() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);

		//iterator that allows backward and forward traversing
		ListIterator<Integer> lit = list.listIterator();
		//Adds the element before the position that would be return by nextIndex
		lit.add(0);

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		//overrides the element that was returned after the call to next or previous
		lit.set(4);
		//removes the element that was returned after the call to next or previous
		lit.remove();
	}

	public static void main(String[] args) {
		listIterator();
		// TODO Auto-generated method stub

	}

}
