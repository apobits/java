package practice.java.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CyclesInALinkedList {

    public static void main(String[] args) {
	Node head = new Node(1);
	Node next = new Node(2);
	head.next = next;
	Node next1 = new Node(3);
	next.next = next1;
	Node next2 = new Node(4);
	next1.next = next2;
	Node next3 = new Node(5);
	next2.next = next3;
	Node next4 = new Node(6);
	next3.next = next4;
	Node next5 = new Node(7);
	next4.next = next5;
	Node next6 = new Node(8);
	next5.next = next6;
	Node next7 = new Node(9);
	next6.next = next7;
	next7.next = next4;

	assertTrue(hasACycle(head));
    }

    public static boolean hasACycle(Node node) {
	if (node == null) {
	    return false;
	}

	Node fast = node.next;
	Node slow = node;

	while (fast != null && fast.next != null && slow != null) {
	    if (fast == slow) {
		return true;
	    }
	    fast = fast.next.next;
	    slow = slow.next;
	}
	return false;
    }

    private static class Node {
	private int data;
	private Node next;

	public Node(int data) {
	    this.data = data;
	}
    }
}
