/**
 * 
 */
package justdo.it.ocpjp8;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author aposo
 *
 */
public class ExecutorServiceExample {

	public static void scheduleExecutorService() throws InterruptedException {
		// Schedule at a fixed rate
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
		ScheduledFuture<?> scheduleFuture = ses.scheduleAtFixedRate(() -> System.out.println("Hi"), 0, 10,
				TimeUnit.SECONDS);

		// Schedule at a specified delay
		ScheduledFuture<?> scheduleFuture1 = ses.scheduleWithFixedDelay(
				() -> System.out.println("Being executed at a fixed delay"), 1, 11, TimeUnit.SECONDS);

		Thread.sleep(60000);

		scheduleFuture.cancel(true);
		scheduleFuture1.cancel(true);

		List<Runnable> tasks = ses.shutdownNow();
		System.out.println(tasks);

	}

	public static void executorService() throws InterruptedException {
		ExecutorService es = Executors.newSingleThreadExecutor();

		Future<?> f = es.submit(() -> {
			while (true) {
				System.out.println(LocalDateTime.now());
			}
		});

		Thread.sleep(10000);

		f.cancel(true);

		es.shutdownNow();
	}

	public static void main(String[] args) throws InterruptedException {

		executorService();
	}

}
