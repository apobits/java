/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAccumulator;

/**
 * @author aposo
 *
 */

public class LongAccumulatorExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// Use LongAccumulator instead of AtomicLong when many threads access the same
		// atomic values and the result is
		// only needed until the end and high contention is anticipated
		var longAccumulator = new LongAccumulator((t, u) -> t + u, 0);

		ExecutorService es = Executors.newFixedThreadPool(5);

		Runnable r = () -> longAccumulator.accumulate(1);

		for (int i = 0; i < 5; i++) {
			es.execute(r);
		}

		es.awaitTermination(30, TimeUnit.SECONDS);

		System.out.println(longAccumulator.get());

		es.shutdownNow();

	}

}
