package practice.java.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CyclesInALinkedList {

    public static void main(String[] args) {
	var head = new Node(1);
	var next = new Node(2);
	head.next = next;
	var next1 = new Node(3);
	next.next = next1;
	var next2 = new Node(4);
	next1.next = next2;
	var next3 = new Node(5);
	next2.next = next3;
	var next4 = new Node(6);
	next3.next = next4;
	var next5 = new Node(7);
	next4.next = next5;
	var next6 = new Node(8);
	next5.next = next6;
	var next7 = new Node(9);
	next6.next = next7;
	next7.next = next4;

	assertEquals(true, hasACycle(head));
    }

    public static boolean hasACycle(Node node) {
	if (node == null) {
	    return false;
	}

	var fast = node.next;
	var slow = node;

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
