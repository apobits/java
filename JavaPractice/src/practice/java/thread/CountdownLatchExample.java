package practice.java.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class CountdownLatchExample {

    public static void main(String[] args) {
	//countdown latch causes the threads who call await on it to wait before its countdown reaches 0

	var countdownLatch = new CountDownLatch(2);

	Runnable runnable = () -> {
	    try {
		countdownLatch.await();
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	    System.out.println(Thread.currentThread().getName());
	};

	var executor = Executors.newFixedThreadPool(2);
	executor.execute(runnable);
	executor.execute(runnable);

	Stream.iterate(0, t -> t < 2, t -> ++t).forEach(t -> {
	    System.out.println("Counting down " + t);
	    countdownLatch.countDown();
	});

	executor.shutdown();
    }

}
