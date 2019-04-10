/**
 * 
 */
package practice.java.nio;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {
	
	public static void main(String args[]) throws InterruptedException {

		Lock lock = new ReentrantLock();
		
		lock.tryLock();

	}

}
