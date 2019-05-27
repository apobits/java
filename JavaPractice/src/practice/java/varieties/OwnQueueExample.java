/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class OwnQueueExample {

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

	private Node head;

	private Node tail;

	public void offer(int data) {
		Node node = new Node(data);
		if (tail != null) {
			tail.next = node;
		}
		tail = node;
		if (head == null) {
			head = tail;
		}
	}

	public int poll() throws Exception {
		if (head == null) {
			throw new Exception("NoSuchElemenException");
		}
		int data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}

	public static void main(String[] args) throws Exception {
		OwnQueueExample oqe = new OwnQueueExample();

		oqe.offer(1);
		oqe.offer(2);
		oqe.offer(3);
		oqe.offer(4);

		System.out.println(oqe.poll());
		System.out.println(oqe.poll());
		System.out.println(oqe.poll());
		System.out.println(oqe.poll());

	}

}
