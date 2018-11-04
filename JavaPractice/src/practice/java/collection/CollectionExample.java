/**
 * 
 */
package practice.java.collection;

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

	}

}
