/**
 * 
 */
package ortiz.perez.albin.collection.tree;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Administrador
 *
 */
public class BinaryTreeHeight {

	static TreeSet<Integer> treeHeight = new TreeSet<>();
	static int count = 0;

	static class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static int getHeight(Node root) {
		int rootData = root.data;
		getTreeHeight(root, rootData);
		return treeHeight.last();
	}

	private static void getTreeHeight(Node root, int rootData) {

		if (root.left != null) {
			count++;
			getTreeHeight(root.left, rootData);
		}

		if (rootData == root.data)
			count = 0;

		if (root.right != null) {
			count++;
			getTreeHeight(root.right, rootData);
		}
		if (count != 0){
			treeHeight.add(count);
			count--;
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

}
