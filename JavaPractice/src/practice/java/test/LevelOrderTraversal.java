/**
 * 
 */
package practice.java.test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author apobits@gmail.com
 *
 */
public class LevelOrderTraversal {

	static class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
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

	public static void levelOrder(Node root) {

		int count = -1;
		Map<Integer, Set<Integer>> levels = new HashMap<>();
		levelOrderLogic(root, levels, count);
		levels.forEach((t, r) -> r.forEach(s -> System.out.print(s + " ")));
	}

	private static void levelOrderLogic(Node root, Map<Integer, Set<Integer>> levels, int count) {
		if (root != null) {
			count++;
			putElement(root, levels, count);
			levelOrderLogic(root.left, levels, count);
			levelOrderLogic(root.right, levels, count);
			count--;
		}
	}

	private static void putElement(Node node, Map<Integer, Set<Integer>> levels, int count) {
		if (levels.get(count) != null) {
			levels.get(count).add(node.data);
		} else {
			Set<Integer> levelData = new LinkedHashSet<>();
			levelData.add(node.data);
			levels.put(count, levelData);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		levelOrder(root);

	}
}
