/**
 * 
 */
package practice.java.nio;

import static practice.java.collection.MapExample.practiceHashMap;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;;

/**
 * @author apobits@gmail.com
 * @param <T>
 *
 */
public class DailyPracticeExample<T> {

	public static void main(String[] args) {

		System.out.println(practiceHashMap.replace(10, 30));

		practiceHashMap.replaceAll((t, u) -> {
			System.out.println("Key: " + t + " value: " + u);
			return u;
		});

		System.out.println(practiceHashMap.remove(10));

		System.out.println(practiceHashMap.remove(9, 19));

		Locale usLocale = Locale.US;

		System.out.println(NumberFormat.getCurrencyInstance(usLocale).format(15));
		
		

	}
}
