/**
 * 
 */
package practice.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @author apobits@gmail.com
 *
 */
public class CollectionExample {

	public static void main(String[] args) {

		// Collection is the parent interface
		// TreeSet is an implementation of a sub interface Set
		Collection<String> collection = new TreeSet<>();
		collection.add("Hello");
		collection.add("there");

		// Using conversion constructor
		LinkedList<String> ll = new LinkedList<>(collection);
		ArrayList<String> al = new ArrayList<>(collection);
		TreeSet<String> ts = new TreeSet<>(collection);

		// Using bulk operations
		ll.addAll(al);
		ts.addAll(al);
		al.containsAll(ll);
		ts.removeAll(ll);
		ll.replaceAll(t -> new String("replaced"));

	}

}
