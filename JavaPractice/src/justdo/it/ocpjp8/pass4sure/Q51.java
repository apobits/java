/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author aposo
 *
 */
public class Q51 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final List<String> list = new CopyOnWriteArrayList<>();

		final AtomicInteger ai = new AtomicInteger(0);

		final CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.println(list));

		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000 * ai.incrementAndGet());
					list.add("X");
					barrier.await();
				} catch (Exception e) {
				}
			}
		};

		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}

}
