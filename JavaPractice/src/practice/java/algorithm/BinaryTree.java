package practice.java.algorithm;

import ortiz.perez.albin.collection.tree.BinaryTreeHeight;

import java.util.*;

public class BinaryTree {

    static TreeSet<Integer> treeHeight = new TreeSet<>();
    private static int count;
    private Node top;
    private Map<Integer, TreeSet<Integer>> levels = new HashMap<>();

    public static void main(String[] args) {
	BinaryTree binaryTree = new BinaryTree();
	binaryTree.insert(4);
	binaryTree.insert(2);
	binaryTree.insert(1);
	binaryTree.insert(3);
	binaryTree.insert(6);
	binaryTree.insert(5);
	binaryTree.insert(8);
	binaryTree.insert(7);
	binaryTree.insert(9);

	BinaryTree binaryTree2 = new BinaryTree();
	binaryTree2.insert(4);
	binaryTree2.insert(2);
	binaryTree2.insert(1);
	binaryTree2.insert(3);
	binaryTree2.insert(6);
	binaryTree2.insert(5);
	binaryTree2.insert(8);
	binaryTree2.insert(7);
	binaryTree2.insert(9);
	binaryTree.printPostOrder();
    }

    public static boolean checkInOrder(Node node1, Node node2) {
	LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
	LinkedList<Integer> linkedList2 = new LinkedList<Integer>();

	traverseInOrder(node1, linkedList1);
	traverseInOrder(node2, linkedList2);

	return linkedList1.equals(linkedList2);

    }

    private static void traverseInOrder(Node node, LinkedList<Integer> saved) {
	if (node == null) {
	    return;
	}
	traverseInOrder(node.left, saved);
	saved.add(node.data);
	traverseInOrder(node.right, saved);
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
	if (count != 0) {
	    treeHeight.add(count);
	    count--;
	}
    }

    public void printInOrder() {
	printInOrder(top);
    }

    private void printInOrder(Node node) {
	if (node == null) {
	    return;
	}
	printInOrder(node.left);
	System.out.println(node.data);
	printInOrder(node.right);

    }

    public void printPreOrder() {
	printPreOrder(top);
    }

    private void printPreOrder(Node node) {
	if (node == null) {
	    return;
	}
	System.out.println(node.data);
	printPreOrder(node.left);
	printPreOrder(node.right);
    }

    public void printPostOrder() {
	printPostOrder(top);
    }

    private void printPostOrder(Node node) {
	if (node == null) {
	    return;
	}
	printPostOrder(node.left);
	printPostOrder(node.right);
	System.out.println(node.data);
    }

    public void insert(int data) {
	top = insert(top, data);
    }

    private Node insert(Node node, int data) {
	if (node == null) {
	    return new Node(data);
	}

	if (node.data > data) {
	    node.left = insert(node.left, data);
	} else {
	    node.right = insert(node.right, data);
	}

	return node;
    }

    public boolean isBinarySearchTree() {
	return isBinarySearchTree(top, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node node, int min, int max) {
	if (node == null) {
	    return true;
	}
	if (node.data < min || node.data > max) {
	    return false;
	}
	return isBinarySearchTree(node.left, min, node.data - 1) && isBinarySearchTree(node.right, node.data + 1, max);

    }

    private static class Node {
	private int data;
	private Node left;
	private Node right;

	public Node(int data) {
	    this.data = data;
	}
    }
}
