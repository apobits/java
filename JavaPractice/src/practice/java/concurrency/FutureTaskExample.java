/**
 *
 */
package practice.java.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

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

	var futureTask = new java.util.concurrent.FutureTask<>(() -> executeHeavyTask());

	new Thread(futureTask).start();

	//some other logic can be done before requesting the result to the futureTask

	System.out.println(futureTask.get());

    }

    public static String executeHeavyTask() {
	StringBuilder heavyTask = new StringBuilder();
	for (int i = 0; i < 10; i++) {
	    heavyTask.append(i);
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
	return heavyTask.toString();
    }

}
