/**
 * 
 */
package ortiz.perez.albin.collection.priorityqueue;

import java.util.PriorityQueue;

/**
 * @author Administrador
 *
 */
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(1);
		priorityQueue.add(2);
		priorityQueue.add(3);

		System.out.println(priorityQueue.peek());

		System.out.println(priorityQueue);

	}

}
