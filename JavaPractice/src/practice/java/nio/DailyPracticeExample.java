/**
 * 
 */
package practice.java.nio;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

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
	}

}
