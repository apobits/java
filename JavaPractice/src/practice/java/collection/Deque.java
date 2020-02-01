/**
 * 
 */
package practice.java.collection;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author apobits@gmail.com
 *
 */
public class Deque {

	public static void linkedList() {
		// LinkedListExample implements the Deque interface
		LinkedList<Integer> linkedList = new LinkedList<>();

		// adds the element at the beginning of the list
		// if the capacity of the list is restricted and the list is full this method
		// throws an exception
		linkedList.addFirst(5);
		linkedList.addFirst(4);
		linkedList.addFirst(3);
		linkedList.addFirst(2);
		linkedList.addFirst(1);

		// adds the element at the beginning of the list
		// if the capacity of the list is restricted and the list is full this method
		// returns false when the element is not added
		linkedList.offerFirst(6);

		// adds the element at the end of the list
		// if the capacity of the Deque instance is restricted and the list is full this
		// method throws an exception
		linkedList.addLast(0);

		// adds the element at the end of the list
		// if the capacity of the Deque instance is restricted and the list is full this
		// method returns false when the element is not added
		linkedList.offerLast(-1);

		// removes and returns the first element from the list
		// throws an exception if the list is empty
		linkedList.removeFirst();

		// removes and returns the last element from the list
		// throws an exception if the list is empty
		linkedList.removeLast();

		// removes and returns the first element from the list
		// returns null if the list is empty
		linkedList.pollFirst();

		// removes and returns the last element from the list
		// returns null if the list is empty
		linkedList.pollLast();

		// returns the first element from the list
		// throws an exception if the list is empty
		linkedList.getFirst();

		// returns the first element from the list
		// returns null if the list is empty
		linkedList.peekFirst();

		// returns the last element from the list
		// throws an exception if the list is empty
		linkedList.getLast();

		// returns the last element from the list
		// returns null if the list is empty
		linkedList.peekLast();

		// returns and removes the first element of the deque
		// throws no such element exception if the list is empty
		linkedList.pop();

		// inserts the specified element to the beginning of the deque
		// this method is similar to addFirst
		linkedList.push(7);

		// returns a descending iterator, the deque elements in reverse sequential order
		Iterator<Integer> it = linkedList.descendingIterator();

		// removes first occurrence from the deque from head to tail
		linkedList.removeFirstOccurrence(3);

		// removes last ocurrence from the deque from head to tail
		linkedList.removeLastOccurrence(4);
	}

	public static void arrayDeque() {
		// Other implementation of the Deque interface
		// This implementation is faster than LinkedListExample when used as a Queue
		// This implementation is faster than Stack when used as a Stack

		// empty constructor
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

		// constructor with initial capacity
		// if the initial capacity is lower than the default capacity(16), the capacity
		// is calculated obtaining the best power of two
		// if the initial capacity is greater than the default capacity that value is
		// used
		ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>(2);

		// constructor with collection parameter
		ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>(arrayDeque);

		arrayDeque1.push(1);
		arrayDeque1.push(2);
		arrayDeque1.push(3);
		arrayDeque1.push(4);
		arrayDeque1.push(5);
		arrayDeque1.push(6);
		arrayDeque1.push(7);
		arrayDeque1.push(8);
		arrayDeque1.push(9);
		arrayDeque1.push(10);
		arrayDeque1.push(11);
		arrayDeque1.push(12);

		System.out.println(arrayDeque1.pop());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		linkedList();
		arrayDeque();
	}

}
