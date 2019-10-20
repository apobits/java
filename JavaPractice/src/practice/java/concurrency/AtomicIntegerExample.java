/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author apobits@gmail.com
 *
 */
public class AtomicIntegerExample {

	public static void main(String[] args) {

		AtomicInteger ai = new AtomicInteger();
		System.out.println("Incrementing by 1 ai atomically: " + ai.incrementAndGet());
		System.out.println("Incrementing by 1 ai atomically: " + ai.addAndGet(1));
		System.out.println("Obtaining the current value and setting the actual value to 1 atomically: "
				+ ai.getAndSet(1) + " ai value after update: " + ai.get());
		System.out.println(
				"Updating ai value with the specified parameter and IntBinaryOperator function applied atomically: "
						+ ai.accumulateAndGet(2, (t, u) -> {
							System.out.println(u);
							return t + u;
						}));

		System.out.println(ai.updateAndGet((t) -> t + 5));

	}

}
