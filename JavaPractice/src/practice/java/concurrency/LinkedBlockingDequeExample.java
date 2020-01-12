package practice.java.concurrency;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeExample {

    public static void main(String[] args) throws InterruptedException {
	var linkedBlockingDeque = new LinkedBlockingDeque<Integer>();

	//puts elements at the head and tail respectively waiting for space if necessary
	linkedBlockingDeque.putFirst(1);
	linkedBlockingDeque.putLast(5);

	//puts elements at the head and tail respectively, returns true if element was added otherwise false
	linkedBlockingDeque.offerFirst(2);
	linkedBlockingDeque.offerLast(4);

	//retrieves and removes elements from the head and tail respectively waiting for elements to be added if empty
	linkedBlockingDeque.takeFirst();
	linkedBlockingDeque.takeLast();

	//retrieves and removes elements from the head and tail respectively, returns null if deque is empty
	linkedBlockingDeque.pollFirst();
	linkedBlockingDeque.pollLast();
    }

}
