import java.io.FileNotFoundException;

/**
 * 
 */

/**
 * @author aposo
 *
 */
public class Test {
	static class Node {
		public Node() {
		}

		public Node(Node next, Node prev, int data) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

		int data;
		Node next;
		Node prev;
	}

	static Node SortedInsert(Node head, int data) {
		if (head == null) {
			Node node = new Node();
			node.data = data;
			return node;
		}

		Node temp = head;
		Node insert = new Node();
		insert.data = data;

		if (temp.data <= data) {
			while (temp.next != null && temp.next.data <= data) {
				temp = temp.next;
			}
			Node right = temp.next;
			temp.next = insert;
			temp.next.next = right;
			temp.next.prev = temp;
			if (temp.next.next != null)
				temp.next.next.prev = temp.next;
		} else {
			insert.next = temp;
			temp.prev = insert;
			return insert;
		}

		return head;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Node node = SortedInsert(null, 1);
		node = SortedInsert(node, 4);
		node = SortedInsert(node, 2);
		node = SortedInsert(node, 3);
		node = SortedInsert(node, 7);
		node = SortedInsert(node, 6);
		node = SortedInsert(node, 9);
		node = SortedInsert(node, 10);

	}

}
