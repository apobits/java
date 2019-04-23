/**
 * 
 */
package practice.java.nio;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static void main(String[] args) {
		LocalDateTime ld1 = null;
		ZonedDateTime zd1 = null;
		LocalDateTime ld2 = null;
		ZonedDateTime zd2 = null;

		long x = 0l;

		ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
		zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
		ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
		zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
		x = ChronoUnit.HOURS.between(zd1, zd2);
		System.out.println(x);

		ld1 = LocalDateTime.of(2015, Month.MARCH, 8, 2, 0);
		zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
		ld2 = LocalDateTime.of(2015, Month.MARCH, 8, 3, 0);
		zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
		x = ChronoUnit.HOURS.between(zd1, zd2);
		System.out.println(x);
	}
}
