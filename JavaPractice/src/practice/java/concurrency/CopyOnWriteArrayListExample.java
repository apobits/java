/**
 * 
 */
package practice.java.concurrency;

import java.util.Arrays;
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

	public static void addAll(List<Integer> c) {
		list.addAll(c);
	}

	public static int getSize() {
		return list.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			for (int i = 0; i < 10; i++)
				System.out.println(getSize());
		});
		es.execute(() -> list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)));
		
		es.shutdown();

	}

}
