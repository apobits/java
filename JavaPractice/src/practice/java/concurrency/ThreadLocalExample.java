/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author aposo
 *
 */
public class ThreadLocalExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// each first time a thread calls get/set method of ThreadLocal, the thread is
		// assigned its own copy of the variable
		ThreadLocal<StringBuilder> sb = ThreadLocal.withInitial(() -> new StringBuilder());

		ExecutorService es = Executors.newFixedThreadPool(5);

		Runnable r = () -> sb.get().append(Thread.currentThread().getName());

		es.execute(r);
		es.execute(r);
		es.execute(r);
		es.execute(r);
		es.execute(r);

		Thread.sleep(5000);
		System.out.println(sb.get());

	}

}
