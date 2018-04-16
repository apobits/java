/**
 * 
 */
package ortiz.perez.albin.collection.linkedlist;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class RemoveDuplicates {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node removeDuplicates(Node head) {
		if (head == null)
			return null;
		StringBuilder sb = new StringBuilder();
		sb.append(head.data);
		Node temp = head;
		while (temp.next != null) {
			if (!(sb.toString().contains(String.valueOf(temp.next.data)))) {
				temp = temp.next;
			} else {
				Node temp1 = temp.next.next;
				temp.next = temp1;
			}
			sb.append(" " + temp.data);
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
	}
}
