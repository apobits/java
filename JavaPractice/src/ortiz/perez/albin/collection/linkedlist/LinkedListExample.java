/**
 * 
 */
package ortiz.perez.albin.collection.linkedlist;

import java.util.LinkedList;

/**
 * @author aposo
 *
 */
public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<String> letters = new LinkedList<>();

		letters.add("B");
		letters.add("C");
		letters.add("D");
		// appends the element to the start of the list.
		letters.addFirst("A");
		// appends the element to the end of the list, it is equivalent to add
		letters.addLast("E");
		// appends the element to the end of the list
		letters.offer("Z");
		// appends the element to the end of the list
		letters.offerLast("F");
		// appends the element at the specified index
		letters.set(0, "a");
		System.out.println(letters);
		// gets the first element of the list
		System.out.println(letters.getFirst());
		// gets the first element of the list
		System.out.println(letters.peek());
		// gets the last element of the list
		System.out.println(letters.getLast());
		// gets the last element of the list
		System.out.println(letters.peekLast());
		// gets the first element of the list and removes it
		System.out.println(letters.poll());
		// gets the first element of the list and removes it
		System.out.println(letters.pollFirst());
		// gets the last element of the list and removes it
		System.out.println(letters.pollLast());
		// gets the first element of the list
		System.out.println(letters.getFirst());
		// gets the last element of the list
		System.out.println(letters.getLast());
		// get the element at the specified index
		System.out.println(letters.get(0));

		System.out.println(letters);

		// LinkedList<String> letters1 = new LinkedList<>(letters);
		// System.out.println(letters1);
		
		for(String x:letters){
			System.out.print(x);
		}

	}

}
