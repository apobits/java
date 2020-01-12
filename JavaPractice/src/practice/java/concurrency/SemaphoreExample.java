package practice.java.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    //semaphores are used to prevent deadlocks and for resource pools
    private static Semaphore semaphore = new Semaphore(1);

    public static void print(String message) {
	try {
	    semaphore.acquire();
	    System.out.println(message);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    public static void release() {
	semaphore.release();
    }

    public static void main(String[] args) throws InterruptedException {
	var threadOne = new Thread(() -> print("Hello"));
	var threadTwo = new Thread(() -> print("Bye"));
	threadOne.start();
	Thread.sleep(1000);
	threadTwo.start();

	System.out.println("Releasing permits");
	release();

    }
}
