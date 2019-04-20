/**
 * 
 */
package practice.java.time;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author aposo
 *
 */
public class InstantExample {

	public static void parse() {
		Instant instant = Instant.parse("2015-06-25T16:43:30.00z");
		System.out.println(instant);
	}

	public static void truncatedTo() {
		Instant instant = Instant.now();
		System.out.println(instant.truncatedTo(ChronoUnit.MINUTES));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		parse();
	}

}
