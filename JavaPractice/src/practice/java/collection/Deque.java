/**
 * 
 */
package practice.java.collection;

import java.util.LinkedList;

/**
 * @author apobits@gmail.com
 *
 */
public class Deque {

	public void linkedList() {
		// LinkedList implements the Deque interface
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
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
