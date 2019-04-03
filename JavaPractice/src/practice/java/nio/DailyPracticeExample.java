/**
 * 
 */
package practice.java.nio;

import java.util.Locale;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static void main(String[] args) {

		System.out.println(Locale.CANADA);

		CyclicBarrier cbBarrier = new CyclicBarrier(2, () -> System.out.println("A"));

		Runnable runnable = () -> {
			try {
				cbBarrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		};

		new Thread(runnable).start();
		new Thread(runnable).start();
	}

}
