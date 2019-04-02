/**
 * 
 */
package practice.java.nio;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.TimeZone;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		LocalDate adjustedDate = localDate.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("localDate: " + localDate);
		System.out.println(localDate + " with first day of month " + adjustedDate);
		System.out.println(localDate + " day of month 1 " + localDate.with(ChronoField.DAY_OF_MONTH, 1));
		System.out.println(localDate + " day of week " + localDate.getDayOfWeek());
		System.out.println(YearMonth.now().isLeapYear());
		System.out.println(MonthDay.now());
		System.out.println(Year.now());

		System.out.println("LocalDateTime " + LocalDateTime.now());

		System.out.println("LocalTime " + LocalTime.now());
		System.out.println("ZoneDateTime " + ZonedDateTime.now());
		System.out.println("OffsetDateTime " + OffsetDateTime.now());
		System.out.println("OffsetTime " + OffsetTime.now());
		
		System.out.println(Instant.now());
	}

}
