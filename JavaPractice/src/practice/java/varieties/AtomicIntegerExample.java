/**
 * 
 */
package practice.java.varieties;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author apobits@gmail.com
 *
 */
public class AtomicIntegerExample {

	public static void main(String[] args) {

		AtomicInteger ai = new AtomicInteger();
		System.out.println(ai.incrementAndGet());
		System.out.println(ai);

	}

}
