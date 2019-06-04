/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.CompletableFuture;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var completableFuture = getGreeting();
		completableFuture.thenAccept(t -> System.out.println(t));
		IntStream is = IntStream.iterate(0, t -> ++t);
		is.forEach(t -> System.out.println(t));

	}

}
