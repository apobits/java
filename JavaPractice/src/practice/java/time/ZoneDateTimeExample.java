/**
 * 
 */
package practice.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author aposo
 *
 */
public class ZoneDateTimeExample {

	public static void daylightSavingTimeExample() {
		LocalDateTime ldt = LocalDateTime.of(LocalDate.of(2015, Month.NOVEMBER, 1), LocalTime.of(2, 0));
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("US/Eastern"));

		LocalDateTime ldt1 = LocalDateTime.of(LocalDate.of(2015, Month.NOVEMBER, 1), LocalTime.of(1, 0));
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt1, ZoneId.of("US/Eastern"));

		System.out.println("Hours between zoned date times: " + ChronoUnit.HOURS.between(zdt1, zdt));

		System.out.println("Hours between local date times: " + ChronoUnit.HOURS.between(ldt, ldt1));

		System.out.println(ldt.format(DateTimeFormatter.BASIC_ISO_DATE));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		daylightSavingTimeExample();
		System.out.println(ZonedDateTime.parse("2019-04-23T03:18:59.01Z", DateTimeFormatter.ISO_DATE_TIME));
	}

}
