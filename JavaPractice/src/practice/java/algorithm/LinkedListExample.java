package practice.java.algorithm;

public class LinkedListExample {

    private Node head;
    private Node tail;

    public static void main(String[] args) {
	LinkedListExample linkedList = new LinkedListExample();
	linkedList.add(1);
	linkedList.add(2);
	linkedList.add(3);
	System.out.println(linkedList.removeLast());
    }

    public void add(int data) {
	Node node = new Node(data);
	if (head == null) {
	    head = node;
	    tail = node;
	} else {
	    tail.next = node;
	    tail = tail.next;
	}
    }

    public int removeFirst() {
	int data = head.data;
	head = head.next;
	return data;
    }

    public int removeLast() {
	int data = tail.data;
	Node newTail = head;
	while (newTail.next != tail) {
	    newTail = newTail.next;
	}
	tail = newTail;
	tail.next = null;
	return data;
    }

    private class Node {
	private int data;
	private Node next;

	public Node(int data) {
	    this.data = data;
	}
    }

}
