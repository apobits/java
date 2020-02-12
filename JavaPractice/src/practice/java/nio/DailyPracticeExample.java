/**
 *
 */
package practice.java.nio;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author apobits@gmail.com
 *
 *
 */

public class DailyPracticeExample {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
	Runnable runnable = () -> doSomething();
	var t1 = new Thread(runnable);
	var t2 = new Thread(runnable);
	t1.start();
	t2.start();
    }

    public static void doSomething() {
	try {
	    if (lock.tryLock()) {
		System.out.println("Lock acquired");
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    } else {
		System.out.println("Lock already in use");
	    }
	} finally {
	    if (lock.getHoldCount() > 0) {
		lock.unlock();
	    }
	}
    }
}

