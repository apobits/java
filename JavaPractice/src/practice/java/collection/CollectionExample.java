/**
 * 
 */
package practice.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * @author apobits@gmail.com
 *
 */
public class CollectionExample {

	public static void collectionEquality() {
		Collection<Integer> c1 = Arrays.asList(1);
		Collection<Integer> c2 = new ArrayList<Integer>();
		c2.add(1);
		Collection<Integer> c3 = new TreeSet<Integer>();
		c3.add(1);
		Collection<Integer> c4 = new TreeSet<Integer>();
		c4.add(1);
		Collection<Integer> c5 = new HashSet<Integer>();
		c5.add(1);

		System.out.println("Collection c1 is equal to c2: " + c1.equals(c2));
		System.out.println("Collection c2 is equal to c3: " + c2.equals(c3));
		System.out.println("Collection c3 is equal to c4: " + c3.equals(c4));
		System.out.println("Collection c4 is equal to c5: " + c4.equals(c5));
	}

	public static void collection() {

		// Collection is the parent interface
		// TreeSet is an implementation of the sub interface Set
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
		// retains all the elements that are not in the specified collection argument
		ll.retainAll(collection);

		// returns true if the collection has the object specified by the argument
		System.out.println("Collection has object Hello ? " + collection.contains("Hello"));

		// compare if the invoking collection is equals to the collection specified by
		// the argument
		System.out.println("Is collection equals to ts ? " + collection.equals(ts));

		// for each element in the collection executes the code implemented by consumer
		System.out.println("Printing all the elements in the collection: ");
		collection.forEach(t -> System.out.print(t + " "));

		// Obtaining the runtime class of this object
		Class<?> collectionClass = collection.getClass();
		System.out.println("Runtime class of collection: " + collectionClass);

		// returns true if the collection is empty, false otherwise
		System.out.println("Is collection empty: " + collection.isEmpty());

		// returns an iterator over the invoking collection
		Iterator<String> it = collection.iterator();

		// returns a possible parallel stream, it is valid to return a sequential stream
		Stream<String> parallelStream = collection.parallelStream();

		// returns a sequential stream
		Stream<String> sequentialStream = collection.stream();

		// removes a single instance of the specified argument from the collection,
		// return true if the
		// collection was modified, false otherwise
		ll.remove("replaced");

		// removes all the elements in the collection that satisfies the specified
		// predicate
		collection.removeIf(t -> t.equals("Hello"));

		// returns the number of elements in the collection
		System.out.println("number of elements in the collection are: " + collection.size());

		// returns an spliterator of the specified collection
		Spliterator<String> spliterator = collection.spliterator();

		// returns an object array from the elements in the collection
		Object[] collectionObjectArray = collection.toArray();

		String[] collectionStringArray = new String[0];
		String[] collectionStringArray1 = new String[collection.size()];
		// returns an array of the elements in the collection, if the parameter array is
		// big enough to store the collection this array is used, otherwise a new array
		// is created
		collectionStringArray1 = collection.toArray(collectionStringArray);
		System.out.println(collectionStringArray.equals(collectionStringArray1));

		// returns a string representation of the collection
		System.out.println(collection.toString());

		// clear the collection, after this method returns the collection will be empty
		collection.clear();
	}

	public static void main(String[] args) {
		collectionEquality();
	}

}
