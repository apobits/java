/**
 * 
 */
package practice.java.nio;

import java.util.stream.Stream;

;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		Stream.of(1, 2, 3, 4, 5).map(t -> String.valueOf(t)).forEach(t -> System.out.println(t));

	}

}
