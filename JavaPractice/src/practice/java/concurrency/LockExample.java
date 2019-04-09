/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author aposo
 *
 */
public class LockExample {

	private Lock lock = new ReentrantLock();

	public Lock getLock() {
		return lock;
	}

	public static void main(String[] args) {
		LockExample lockExample = new LockExample();
		System.out.println(lockExample.getLock().tryLock());
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(() -> System.out.println(lockExample.getLock().tryLock()));

	}

}
