/**
 * 
 */
package practice.java.collection;

import java.util.LinkedList;

/**
 * @author apobits@gmail.com
 *
 */
public class QueueExample {

	public static void linkedList() {

		// LinkedList implements Deque interface
		LinkedList<Integer> linkedListQueue = new LinkedList<>();

		// adds the element to the end of the list
		linkedListQueue.add(5);

		// adds the element to the tail(end) of the list
		linkedListQueue.offer(4);

		// returns the head(first) element but does not remove it
		linkedListQueue.peek();

		// returns the head(first) element but does not remove it
		linkedListQueue.element();

		// returns and removes the head(first) element
		linkedListQueue.remove();

		// returns and removes the head(first) element
		linkedListQueue.poll();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
