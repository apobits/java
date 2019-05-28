/**
 * 
 */
package practice.java.varieties;

/**
 * @author aposo
 *
 */
public class OwnStackExample {

	private class Node {

		private int data;

		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public void setNext(Node node) {
			this.next = node;
		}
	}

	private Node top;

	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}

	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
	
	public static void main(String args[]) {
		OwnStackExample stack = new OwnStackExample();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
