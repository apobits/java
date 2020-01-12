package practice.java.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {
	var cyclicBarrier = new CyclicBarrier(2, () -> System.out.println("Barrier reached"));

	Runnable runnable = () -> {
	    for (int i = 0; i < 5; i++) {
		try {
		    cyclicBarrier.await();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		} catch (BrokenBarrierException e) {
		    e.printStackTrace();
		}
	    }
	};

	var threadOne = new Thread(runnable);
	var threadTwo = new Thread(runnable);

	threadOne.start();
	threadTwo.start();

    }

}
