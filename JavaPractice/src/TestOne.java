import java.util.Scanner;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class TestOne {

	static class Node {
		public Node() {
		}

		public Node(Node left, Node right, int data) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}

		int data;
		Node left;
		Node right;
	}

	static void topView(Node root) {
		if (root == null)
			return;
		Node left = root;
		Node right = root;
		System.out.print(root.data + " ");
		while ((left = left.left) != null)
			System.out.print(left.data + " ");
		while ((right = right.right) != null)
			System.out.print(right.data + " ");
	}

	public static void main(String[] args) {


	}

}
