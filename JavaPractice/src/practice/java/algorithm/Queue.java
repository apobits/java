package practice.java.algorithm;

public class Queue {

    private Node head;
    private Node tail;

    public static void main(String[] args) {
	var queue = new Queue();
	queue.offer(1);
	queue.offer(2);
	queue.offer(3);
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
    }

    public void offer(int data) {
	Node node = new Node(data);
	if (head == null) {
	    head = node;
	    tail = node;
	} else {
	    tail.next = node;
	    tail = tail.next;
	}

    }

    public int poll() {
	var data = head.data;
	head = head.next;
	if (head == null) {
	    tail = null;
	}
	return data;
    }

    public int peek() {
	return head.data;
    }

    private class Node {
	private int data;
	private Node next;

	public Node(int data) {
	    this.data = data;
	}
    }

}
