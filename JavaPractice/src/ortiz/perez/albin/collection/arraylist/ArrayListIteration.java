/**
 * 
 */
package ortiz.perez.albin.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author aposo
 *
 */
public class ArrayListIteration {

	public static void main(String[] args) {
		// Represents a collection of sequence of elements
		// they can be accessed by its position
		ArrayList<String> list = new ArrayList<>(10);

		// Adding elements
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		// iterating by an iterator implementation
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.print(i.next());
		}
		System.out.println();

		// iterating by list for each method
		list.forEach(t -> System.out.print(t));
		System.out.println();

		// iterating by for each style
		for (String x : list) {
			System.out.print(x);
		}
		System.out.println();

		// iterating by for loop
		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j));
		}
		System.out.println();
		
		System.out.println("size " + list.size());

		// Printing list object
		System.out.println(list);

		//

	}

}
