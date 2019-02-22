/**
 * 
 */
package practice.java.nio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	private static List<Integer> numbers;

	public DailyPracticeExample() {
		load();
	}

	private synchronized void load() {
		if (numbers == null) {
			numbers = new ArrayList<>();
		}
	}

	public static void main(String[] args) {

		Thread thread = new Thread(() -> {
			new DailyPracticeExample();
		});

		thread.start();
		while (true)
			System.out.println(DailyPracticeExample.numbers);
	}

}
