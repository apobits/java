/**
 * 
 */
package practice.java.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author apobits@gmail.com
 *
 */
public class CalendarExample {

	public static void calendar() {
		// Obtaining a Calendar instance
		Calendar calendar = Calendar.getInstance();

		// Creating a calendar object with the specified time zone
		Calendar calendar1 = Calendar.getInstance(TimeZone.getDefault());

		// Creating a calendar object with the specified locale
		Calendar calendar2 = Calendar.getInstance(Locale.getDefault());

		// Creating a calendar object with the specified time zone and locale
		Calendar calendar3 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());

		// Obtaining a Date object from calendar
		Date date = calendar.getTime();

		// setting Year, Month, Day values individually in Calendar
		calendar.set(Calendar.YEAR, 2018);
		// months go from 0(January) to 11(December)
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.DAY_OF_MONTH, 30);

		// setting Year, Month, Day values at the same time in Calendar
		calendar.set(2019, 10, 30);

		// Setting time values
		calendar.set(Calendar.HOUR, 11);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);

		// setting all values at once
		calendar.set(2019, 10, 30, 10, 59, 59);

		// sets this calendar time with the specified date
		calendar.setTime(date);

		System.out.println("Is year set on this calendar object: " + calendar.isSet(Calendar.YEAR));

		// clears this calendar time to defaults in this case to the epoch time
		calendar.clear();

		System.out.println(calendar.getTime());

	}

	public static void gregorianCalendar() {

		// all others methods were viewed in the Calendar example

		// Default constructor
		GregorianCalendar gregorianCalendar = new GregorianCalendar();

		// Obtaining a Gregorian calendar from a specified ZoneDateTime
		GregorianCalendar gregorianCalendar1 = GregorianCalendar.from(ZonedDateTime.now(ZoneId.systemDefault()));

		// Obtaining the ZoneDateTime used in the Gregorian calendar
		ZonedDateTime zdt = gregorianCalendar1.toZonedDateTime();

		System.out.println("Is 2019 a leap year: " + gregorianCalendar.isLeapYear(2019));

		System.out.println("Calendar type of \n" + gregorianCalendar + "\nis: " + gregorianCalendar.getCalendarType());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		gregorianCalendar();

	}

}
