/**
 *
 */
package practice.java.concurrency;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author aposo
 *
 */
public class CopyOnWriteArrayListExample {

    private static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();

    /**
     * @param args
     */
    public static void main(String[] args) {

	System.out.println("CopyOnWriteArrayList: " + list);

	list.addAll(Arrays.asList(1, 2, 3));

	var it1 = list.iterator();

	System.out.println("CopyOnWriteArrayList: " + list);

	list.addAll(Arrays.asList(4, 5, 6));

	System.out.println("CopyOnWriteArrayList: " + list);

	list.add(7);

	var it2 = list.iterator();

	System.out.println("CopyOnWriteArrayList: " + list);

	System.out.println("Iterator 1: ");
	it1.forEachRemaining((t) -> System.out.print(t + " "));

	System.out.println("\nIterator 2: ");
	it2.forEachRemaining(t -> System.out.print(t + " "));
    }

}
