/**
 * 
 */
package ortiz.perez.albin.collection.tree;

import java.util.HashSet;

/**
 * @author Administrador
 *
 */
public class TreeTopView {

	static void topView(Node root) {
		HashSet<Integer> set = new HashSet<>();
		if (root != null) {
			set.add(root.data);
			if (root.left != null)
				printTopView(root.left, true, set);
			if (root.right != null)
				printTopView(root.right, false, set);
		}
		set.forEach(n -> System.out.print(n + " "));
	}

	static void printTopView(Node node, boolean left, HashSet<Integer> set) {
		set.add(node.data);
			if (node.left != null)
				printTopView(node.left, true, set);

			if (node.right != null)
				printTopView(node.right, false, set);
		}
		return;
	}

	// private static Node createBinaryTree(Node parent, Node left, Node right)
	// {
	// if (parent == null)
	// return null;
	// parent.left = left;
	// parent.right = right;
	// return parent;
	//
	// }

	public static void main(String[] args) {
		Node left = new Node(null, null, 2);
		Node right = new Node(null, null, 3);
		Node left11 = new Node(null, null, 4);
		Node right11 = new Node(null, null, 6);
		Node left12 = new Node(null, null, 5);
		Node right12 = new Node(null, null, 7);
		Node root = new Node(left, right, 1);
		root.left.left = left11;
		root.left.right = right11;
		root.right.left = left12;
		root.right.right = right12;
		topView(root);

	}

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

}
