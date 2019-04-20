/**
 * 
 */
package practice.java.time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author aposo
 *
 */
public class DurationExample {

	public static void daylightSavingTimeExample() {
		LocalDateTime localDateTime = LocalDateTime.of(2015, 10, 31, 11, 0);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("US/Eastern"));
		System.out.println("Actual zonedDateTime " + zonedDateTime);
		System.out.println("zonedDateTime plus one day " + zonedDateTime.plus(Duration.ofDays(1)));
	}

	public static void between() {
		LocalDateTime localDateTime1 = LocalDateTime.of(2019, 4, 18, 0, 0);
		LocalDateTime localDateTime2 = LocalDateTime.now();
		Duration duration = Duration.between(localDateTime1, localDateTime2);
		System.out.println("Duration between " + localDateTime1 + " and " + localDateTime2 + " = " + duration);
	}

	public static void of() {
		System.out.println("Duation of milliseconds " + Duration.ofMillis(1100));
		System.out.println("Duration of seconds " + Duration.ofSeconds(61));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		of();
	}

}
