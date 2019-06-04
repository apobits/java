/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.ExecutionException;

/**
 * @author aposo
 *
 */
public class FutureTaskExample {

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		var futureTask = new java.util.concurrent.FutureTask<>(() -> "Executed");

		new Thread(futureTask).start();

		System.out.println(futureTask.get());

	}

}
