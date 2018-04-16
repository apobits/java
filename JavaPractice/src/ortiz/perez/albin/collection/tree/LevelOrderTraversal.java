/**
 * 
 */
package ortiz.perez.albin.collection.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ortiz.perez.albin.collection.tree.BinaryTreeHeight.Node;

/**
 * @author Administrador
 *
 */
public class LevelOrderTraversal {

	static Map<Integer, List<Integer>> levelOrdTra = new HashMap<>();
	static int count = 1;

	static void levelOrder(BinaryTreeHeight.Node root) {
		int treeHeight = BinaryTreeHeight.getHeight(root);
		for (int i = 0; i <= treeHeight; i++) {
			List<Integer> temp = new ArrayList<>();
			levelOrdTra.put(i, temp);
		}
		List<Integer> rootList = new ArrayList<>();
		rootList.add(root.data);
		levelOrdTra.put(0, rootList);

		levelOrderT(root);
		for (int i = 0; i <= treeHeight; i++) {
			levelOrdTra.get(i).forEach(t -> System.out.print(t + " "));
		}
	}

	private static void levelOrderT(Node root) {

		if (root.left != null) {
			levelOrdTra.get(count).add(root.left.data);
			count++;
			levelOrderT(root.left);
		}

		if (root.right != null) {
			levelOrdTra.get(count).add(root.right.data);
			count++;
			levelOrderT(root.right);
		}

		if (count != 0) {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}

}
