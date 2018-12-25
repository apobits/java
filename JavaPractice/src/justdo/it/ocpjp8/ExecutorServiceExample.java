/**
 * 
 */
package justdo.it.ocpjp8;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author aposo
 *
 */
public class ExecutorServiceExample {

	public static void scheduleExecutorService() throws InterruptedException {
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
		ScheduledFuture<?> schedulerFuture = ses.scheduleAtFixedRate(() -> System.out.println("Hi"), 0, 10,
				TimeUnit.SECONDS);
		ses.schedule(() -> schedulerFuture.cancel(true), 30, TimeUnit.SECONDS);
		ses.schedule(() -> ses.shutdown(), 40, TimeUnit.SECONDS);

	}

	public static void main(String[] args) throws InterruptedException {

		scheduleExecutorService();

	}

}
