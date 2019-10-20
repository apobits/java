/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author aposo
 *
 */
public class LongAdderExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// use LongAdder instead of AtomicLong when multiple threads access the same
		// atomic value and the result is only needed until the end and high contention
		// is anticipated
		var longAdder = new LongAdder();
		ExecutorService es = Executors.newFixedThreadPool(5);
		Runnable runnable = () -> longAdder.add(1);
		for (int i = 0; i < 10; i++) {
			es.execute(runnable);
		}
		es.awaitTermination(30, TimeUnit.SECONDS);
		System.out.println(longAdder.sum());

	}

}
