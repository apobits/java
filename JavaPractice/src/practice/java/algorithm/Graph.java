package practice.java.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class Graph {

    private static Map<Integer, Node> nodes = new HashMap<>();

    public static void main(String[] args) {
	Node graph = new Node(1);

	graph.addEdge(1, 2);
	graph.addEdge(1, 3);
	graph.addEdge(1, 4);
	graph.addEdge(2, 5);
	graph.addEdge(2, 6);
	graph.addEdge(3, 7);
	graph.addEdge(3, 8);
	graph.addEdge(4, 9);
	graph.addEdge(4, 10);
	graph.addEdge(6, 9);

	System.out.println(graph.shortestPathLength(1, 9));

    }

    private static class Node {
	private int id;
	private java.util.LinkedList<Node> adjacent = new java.util.LinkedList<>();

	public Node(int id) {
	    this.id = id;
	}

	public Node getNode(int id) {
	    Node node = nodes.get(id);
	    if (node == null) {
		node = new Node(id);
		nodes.put(id, node);
	    }
	    return node;
	}

	public void addEdge(int source, int dest) {
	    Node sourceNode = getNode(source);
	    Node destNode = getNode(dest);
	    sourceNode.adjacent.add(destNode);
	}

	public boolean hasPathDFS(int source, int dest) {
	    Node sourceNode = getNode(source);
	    Node destNode = getNode(dest);
	    HashSet<Integer> visited = new HashSet<>();
	    return hasPathDFS(sourceNode, destNode, visited);
	}

	private boolean hasPathDFS(Node source, Node dest, HashSet<Integer> visited) {
	    if (visited.contains(source.id)) {
		return false;
	    }
	    visited.add(source.id);

	    if (source.id == dest.id) {
		return true;
	    }

	    for (Node node : source.adjacent) {
		if (hasPathDFS(node, dest, visited)) {
		    return true;
		}
	    }
	    return false;
	}

	public boolean hasPathBFS(int source, int dest) {
	    return hasPathBFS(getNode(source), getNode(dest));
	}

	private boolean hasPathBFS(Node source, Node dest) {
	    java.util.LinkedList<Node> nodes = new java.util.LinkedList<>();
	    HashSet<Integer> visited = new HashSet<>();
	    nodes.add(source);
	    while (!nodes.isEmpty()) {
		Node node = nodes.remove();
		if (node.id == dest.id) {
		    return true;
		}
		if (visited.contains(node.id)) {
		    continue;
		}
		visited.add(node.id);
		for (Node node1 : node.adjacent) {
		    nodes.add(node1);
		}
	    }
	    return false;
	}

	public int shortestPathLength(int source, int dest) {
	    Node sourceNode = getNode(source);
	    LinkedList<Node> queue = new LinkedList<Node>();
	    HashSet<Integer> visited = new HashSet<Integer>();
	    queue.offer(sourceNode);
	    NodeHelper starterNode = new NodeHelper(sourceNode.id, null, null);
	    while (!queue.isEmpty()) {
		Node node = queue.poll();
		if (node.id == dest) {
		    break;
		}
		if (visited.contains(node.id)) {
		    break;
		} else {
		    visited.add(node.id);
		}
		queue.addAll(node.adjacent);
	    }

	    int count = 0;

	    return count == 0 ? -1 : count;
	}
    }

    private static class NodeHelper {
	private int id;
	private NodeHelper next, prev;

	public NodeHelper(int id, NodeHelper next, NodeHelper prev) {
	    this.id = id;
	    this.next = next;
	    this.prev = prev;
	}
    }
}
