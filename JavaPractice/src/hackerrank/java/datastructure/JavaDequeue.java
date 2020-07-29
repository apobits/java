package hackerrank.java.datastructure;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class JavaDequeue {

    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    int size = scanner.nextInt();
	    int subarrayLength = scanner.nextInt();
	    long start = System.currentTimeMillis();
	    LinkedList<Integer> queue = new LinkedList<>();
	    TreeSet<Integer> resultSet = new TreeSet<>(Comparator.reverseOrder());
	    for (int i = 0; i < size; i++) {
		boolean flag = true;
		queue.offer(scanner.nextInt());
		if (queue.size() > 1 && queue.peekFirst().equals(queue.peekLast())) {
		    queue.poll();
		    flag = false;
		}
		if (i >= (subarrayLength - 1)) {
		    resultSet.add(queue.size());
		    if (flag) {
			queue.poll();
		    }
		}
	    }
	    System.out.println(resultSet.first());
	    System.out.println("Task executed in: " + (System.currentTimeMillis() - start));
	}
    }
}
