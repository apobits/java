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

		// default initial capacity is 11
		PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>((t, u) -> t - u);

		// Specifying the initial capacity
		// when adding an element if the number of elements in the queue are equal to
		// the capacity
		// the capacity will be increased by double + 2 if the capacity is lesser than
		// 64, otherwise it will be incremented by half
		PriorityQueue<Integer> priorityQueue3 = new PriorityQueue<>(5);

		priorityQueue3.offer(1);
		priorityQueue3.offer(2);
		priorityQueue3.offer(3);
		priorityQueue3.offer(4);
		priorityQueue3.offer(5);
		priorityQueue3.offer(6);
		priorityQueue3.offer(7);
		priorityQueue3.offer(8);

		// Methods with log time complexity O(log(n))
		priorityQueue.add(1);
		priorityQueue.add(2);
		priorityQueue.add(3);
		priorityQueue.remove();
		priorityQueue.poll();
		priorityQueue.offer(1);

		// Methods with linear time complexity O(n)
		priorityQueue.contains(1);
		priorityQueue.remove(1);

		// Methods with constant time O(1)
		priorityQueue.peek();
		priorityQueue.element();
		priorityQueue.size();

		// the methods offered are the same defined in the queue interface
	}

	public static void main(String[] args) {
//		linkedList();
		priorityQueue();
	}

}
