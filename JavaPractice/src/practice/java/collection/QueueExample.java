/**
 * 
 */
package practice.java.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @author apobits@gmail.com
 *
 */
public class QueueExample {

	public static void linkedList() {

		// LinkedList implements Deque interface
		LinkedList<Integer> linkedListQueue = new LinkedList<>();

		linkedListQueue.add(1);
		linkedListQueue.add(2);
		linkedListQueue.add(3);

		// adds the element to the end of the list
		linkedListQueue.add(5);

		// adds the element to the tail(end) of the list
		linkedListQueue.offer(4);

		System.out.println("queue: " + linkedListQueue);

		// returns the head(first) element but does not remove it
		System.out.println("peek: " + linkedListQueue.peek());

		// returns the head(first) element but does not remove it
		System.out.println("element: " + linkedListQueue.element());

		// returns and removes the head(first) element
		linkedListQueue.remove();
		System.out.println("after remove: " + linkedListQueue);

		// returns and removes the head(first) element
		linkedListQueue.poll();
		System.out.println("after poll: " + linkedListQueue);

		linkedListQueue.forEach(t -> System.out.println(t));

	}

	public static void priorityQueue() {
		// queue that orders the elements based on the natural order of the elements or
		// the comparator used at creation time
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>((t, u) -> t - u);

		// the methods offered are the same defined in the queue interface
	}

	public static void main(String[] args) {
		linkedList();
	}

}
