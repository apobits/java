/**
 * 
 */
package practice.java.nio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;

;

/**
 * @author apobits@gmail.com
 * @param <T>
 *
 */
public class DailyPracticeExample<T> {

	public static void main(String... args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		numbers.set(0,9);
		System.out.println(numbers);
		
		Optional<Integer> optInt = 	Optional.of(1);
	
	} 
}
