package practice.java.algorithm;

public class Stack {

    private Node head;

    public static void main(String[] args) {
	Stack stack = new Stack();

	stack.push(1);
	stack.push(2);
	stack.push(3);

	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
    }

    public void push(int data) {
	Node node = new Node(data);
	if (head != null) {
	    node.next = head;
	}
	head = node;
    }

    public int peek() {
	return head.data;
    }

    public int pop() {
	int data = head.data;
	head = head.next;
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
