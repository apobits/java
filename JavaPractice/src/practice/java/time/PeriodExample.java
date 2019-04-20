/**
 * 
 */
package practice.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author aposo
 *
 */
public class PeriodExample {

	public static void commonUses() {
		Period p = Period.between(LocalDate.of(2019, Month.APRIL, 17), LocalDate.now());

		System.out.println(p);

		// Period of 1 year 1 month 1 day
		System.out.println("Period of 1 year 1 month 1 day " + Period.of(1, 1, 1));

		// Period of 1 day
		System.out.println("Period of 1 day " + Period.ofDays(1));

		// Period of 1 month
		System.out.println("Period of 1 month " + Period.ofMonths(1));

		// Period of 1 week
		System.out.println("Period of 1 week " + Period.ofWeeks(1));

		// Period of 1 year
		System.out.println("Period of 1 year " + Period.ofYears(1));

		System.out.println(Period.ofMonths(0));
	}

	public static void daylightSavingTimeExample() {
		LocalDateTime localDateTime = LocalDateTime.of(2015, 10, 31, 11, 0);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("US/Eastern"));
		System.out.println("Actual zonedDateTime " + zonedDateTime);
		System.out.println("zonedDateTime plus one day " + zonedDateTime.plus(Period.ofDays(1)));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		daylightSavingTimeExample();
	}

}
