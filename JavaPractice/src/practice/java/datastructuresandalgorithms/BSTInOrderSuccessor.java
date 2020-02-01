package practice.java.datastructuresandalgorithms;

import java.util.Set;
import java.util.TreeSet;

public class BSTInOrderSuccessor {
    private static Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
	var root = new Node(4);
	root.left = new Node(2);
	root.left.parent = root;
	root.left.left = new Node(1);
	root.left.left.parent = root.left;
	root.left.right = new Node(3);
	root.left.right.parent = root.left;

	root.right = new Node(6);
	root.right.parent = root;

	root.right.left = new Node(5);
	root.right.left.parent = root.right;

	root.right.right = new Node(8);
	root.right.right.parent = root.right;
	root.right.right.left = new Node(7);
	root.right.right.left.parent = root.right.right;
	root.right.right.right = new Node(9);
	root.right.right.right.parent = root.right.right;
	inOrderSuccessorRandomNode(root.right.right.left, 2);
	System.out.println(set.isEmpty() ? null : set.iterator().next());
    }

    public static void inOrderSuccessor(Node node, int data) {
	if (node == null) {
	    return;
	}
	inOrderSuccessor(node.left, data);
	if (node.data > data) {
	    set.add(node.data);
	} else {
	    inOrderSuccessor(node.right, data);
	}
    }

    public static void inOrderSuccessorRandomNode(Node node, int data) {
	while (node.parent != null) {
	    node = node.parent;
	}
	inOrderSuccessor(node, data);
    }

    private static class Node {
	private Node left;
	private Node right;
	private Node parent;
	private int data;

	public Node(int data) {
	    this.data = data;
	}
    }
}
