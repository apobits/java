/**
 * 
 */
package practice.java.executor;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author apobits@gmail.com
 *
 */
public class ExecutorExample {

	public static void executorService() throws InterruptedException {

		// ExecutorService that will reuse threads for tasks and will eliminate threads
		// that have been idle for more than 60 seconds
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(() -> System.out.println(LocalTime.now()));

		// ExecutorService shutdown
		es.awaitTermination(10, TimeUnit.SECONDS);
		es.shutdownNow();
		System.out.println("ExecutorService server is shutdown?: " + es.isShutdown());

		// ExecutorService is terminated, returns true only if the ExecutorService is
		// shutdown and all the task have been completed
		System.out.println("ExecutorService is terminated?: " + es.isTerminated());
	}

	public static void scheduledExecutorService() throws InterruptedException {
		ScheduledExecutorService sExecutorService = Executors.newSingleThreadScheduledExecutor();
		sExecutorService.scheduleAtFixedRate(() -> System.out.println(LocalTime.now()), 2, 5, TimeUnit.SECONDS);
		Thread.sleep(20000);
		sExecutorService.shutdownNow();
	}

	public static void main(String[] args) throws InterruptedException {
		scheduledExecutorService();
		System.exit(1);
		executorService();
	}

}
