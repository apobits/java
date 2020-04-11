package practice.java.datastructuresandalgorithms;

import java.util.Arrays;

public class QueueByArrayImproved {

    private int[] array;
    private int pollIndex, offerIndex;
    private boolean isOfferIndexBehind;

    public QueueByArrayImproved(int size) {
	array = new int[size];
    }

    public static void main(String[] args) {
	QueueByArrayImproved queue = new QueueByArrayImproved(2);
	queue.offer(1);
	queue.offer(2);
	System.out.println(queue.poll());
	queue.offer(3);
	queue.offer(4);
	queue.offer(5);
	queue.offer(6);
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	queue.offer(7);
	queue.offer(8);
	queue.offer(9);
	queue.offer(10);
	queue.offer(11);
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
    }

    public void offer(int element) {
	if ((isOfferIndexBehind && offerIndex >= pollIndex) || ((offerIndex == array.length) && !isOfferIndexBehind
			&& pollIndex == 0)) {
	    resize();
	} else if (offerIndex == array.length) {
	    offerIndex = 0;
	    isOfferIndexBehind = true;
	}
	array[offerIndex++] = element;
    }

    public int poll() {
	if ((!isOfferIndexBehind && (pollIndex == offerIndex))) {
	    throw new RuntimeException("Empty Queue");
	} else if (isOfferIndexBehind && pollIndex == array.length) {
	    pollIndex = 0;
	    isOfferIndexBehind = false;
	}
	return array[pollIndex++];
    }

    private void resize() {
	int[] newArray = new int[array.length * 2];
	if (pollIndex < array.length) {
	    System.arraycopy(array, pollIndex, newArray, 0, array.length - pollIndex);
	}
	if (offerIndex != array.length) {
	    System.arraycopy(array, 0, newArray, array.length - 1, offerIndex);
	    offerIndex += (array.length - pollIndex);
	}

	pollIndex = 0;
	array = newArray;
	isOfferIndexBehind = false;
    }
}

// _ _ _ _ _ _ _
