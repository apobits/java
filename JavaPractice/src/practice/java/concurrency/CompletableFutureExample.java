/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

/**
 * @author aposo
 *
 */
public class CompletableFutureExample {

	public static String greet() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Hello there";
	}

	public static CompletableFuture<String> getGreeting() {
		return CompletableFuture.supplyAsync(() -> CompletableFutureExample.greet());
	}
	
	public static CompletableFuture<String> getGreetingTwo() {
		return CompletableFuture.supplyAsync(() -> greet());
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws ExecutionException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		var completableFuture3 = getGreeting().thenCombine(getGreetingTwo(),(t,u)->CompletableFuture.supplyAsync(()->t+u));

		completableFuture3.thenAccept(t -> {
			try {
				System.out.println(t.get());
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Thread.sleep(5000);
		IntStream is = IntStream.iterate(0, t -> {try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return ++t;});
		is.forEach(t -> System.out.println(t));

	}

}
