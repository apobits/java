package practice.java.datastructuresandalgorithms;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueByArray {

    private Integer[] numbers;
    private int offerIndex, pollIndex;

    public QueueByArray(int size) {
	numbers = new Integer[size];
    }

    public static void main(String[] args) {
	var queue = new QueueByArray(2);
	queue.offer(1);
	queue.offer(2);
	queue.offer(3);
	System.out.println(queue.poll());
	queue.offer(4);
	queue.offer(5);
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());

    }

    public void offer(int number) {
	if (offerIndex == numbers.length) {
	    if (numbers[0] != null) {
		resize();
	    } else {
		offerIndex = 0;
	    }
	}
	numbers[offerIndex++] = number;
    }

    public int poll() {
	if ((pollIndex == numbers.length && numbers[0] == null) || (pollIndex < numbers.length
			&& numbers[pollIndex] == null)) {
	    throw new NoSuchElementException();
	}
	if (pollIndex == numbers.length) {
	    pollIndex = 0;
	}
	var result = numbers[pollIndex];
	numbers[pollIndex++] = null;
	return result;
    }

    private void resize() {
	numbers = Arrays.copyOf(numbers, numbers.length * 2);
    }

}