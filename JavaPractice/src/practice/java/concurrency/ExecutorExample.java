package practice.java.concurrency;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
	schedule();
    }

    public static void schedule() throws InterruptedException, ExecutionException {
	ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
	ScheduledFuture<?> scheduledFuture = scheduledExecutorService
			.schedule(() -> System.out.println("Believe in yourself"), 5, TimeUnit.SECONDS);
	System.out.println(scheduledFuture.isDone());

	var scheduleFuture2 = scheduledExecutorService.schedule(() -> "Make it happen!!!", 2, TimeUnit.SECONDS);
	System.out.println(scheduleFuture2.get());
	scheduledExecutorService.shutdown();
    }

    public static void scheduleAtFixedRate() {
	//fixed rate will be precise as it does not count the execution time
	var scheduleExecutorService = Executors.newScheduledThreadPool(3);
	scheduleExecutorService
			.scheduleAtFixedRate(() -> System.out.println("Believe in yourself"), 2, 3, TimeUnit.SECONDS);
    }

    public static void scheduleWithFixedDelay() {
	//fixed delay will be affected by the execution time
	var scheduleExecutorService = Executors.newSingleThreadScheduledExecutor();
	scheduleExecutorService.scheduleWithFixedDelay(() -> System.out.println("Believe in yourself"), 2, 3,
			TimeUnit.SECONDS);
    }
}
