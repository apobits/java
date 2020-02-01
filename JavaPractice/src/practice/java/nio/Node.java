package practice.java.nio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Node {

    private int id;
    private LinkedList<Node> adjacent = new LinkedList<>();
    private HashMap<Integer, Node> nodes = new HashMap<>();

    public Node(int id) {
	this.id = id;
    }

    public static void main(String[] args) {
	var graph = new Node(1);
	graph.addEdge(1, 2);
	graph.addEdge(1, 3);
	graph.addEdge(1, 4);
	graph.addEdge(2, 5);
	graph.addEdge(2, 6);
	graph.addEdge(3, 7);
	graph.addEdge(3, 8);
	graph.addEdge(4, 9);
	graph.addEdge(4, 10);

	System.out.println(graph.breadthFirstSearch(1, 11));
    }

    public Node getNode(int id) {
	var node = nodes.get(id);
	if (node == null) {
	    node = new Node(id);
	    nodes.put(id, node);
	}
	return node;
    }

    public void addEdge(int source, int destination) {
	var sourceNode = getNode(source);
	var destinationNode = getNode(destination);
	sourceNode.adjacent.add(destinationNode);
    }

    public boolean depthFirstSearch(int source, int destination) {
	var visited = new HashSet<Integer>();
	return depthFirstSearch(getNode(source), getNode(destination), visited);

    }

    private boolean depthFirstSearch(Node source, Node destination, HashSet<Integer> visited) {
	System.out.print(source.id);
	if (visited.contains(source.id)) {
	    return false;
	}

	if (source.id == destination.id) {
	    return true;
	}
	visited.add(source.id);

	for (Node node : source.adjacent) {
	    if (depthFirstSearch(node, destination, visited)) {
		return true;
	    }
	}

	return false;
    }

    public boolean breadthFirstSearch(int source, int destination) {

	var visited = new HashSet<Integer>();
	return breadthFirstSearch(getNode(source), getNode(destination), visited);

    }

    private boolean breadthFirstSearch(Node source, Node destination, Set<Integer> visited) {

	var queue = new LinkedList<Node>();
	queue.offer(source);
	while (!queue.isEmpty()) {
	    var node = queue.poll();
	    System.out.print(node.id);
	    if (visited.contains(node.id)) {
		continue;
	    }
	    if (node.id == destination.id) {
		return true;
	    }
	    visited.add(node.id);
	    for (Node nodeEdge : node.adjacent) {
		queue.offer(nodeEdge);
	    }

	}
	return false;

    }

}
