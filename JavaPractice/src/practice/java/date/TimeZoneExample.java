/**
 * 
 */
package practice.java.date;

import java.util.TimeZone;

/**
 * @author apobits@gmail.com
 *
 */
public class TimeZoneExample {

	public static void timeZone() {

		// Obtaining default time zone
		TimeZone timeZone = TimeZone.getDefault();

		// obtaining all time zone ids
		for (String id : TimeZone.getAvailableIDs()) {
			System.out.println(id);
		}

		// printing time zone
		System.out.println(timeZone);

	}

	public static void simpleTimeZone() {
		// Practice later with time zones

//		SimpleTimeZone simpleTimeZone = new SimpleTimeZone(rawOffset, ID);
//
//		SimpleTimeZone simpleTimeZone = new SimpleTimeZone(rawOffset, ID, startMonth, startDay, startDayOfWeek,
//				startTime, endMonth, endDay, endDayOfWeek, endTime);
//
//		SimpleTimeZone simpleTimeZone = new SimpleTimeZone(rawOffset, ID, startMonth, startDay, startDayOfWeek,
//				startTime, endMonth, endDay, endDayOfWeek, endTime, dstSavings);
//
//		SimpleTimeZone simpleTimeZone = new SimpleTimeZone(rawOffset, ID, startMonth, startDay, startDayOfWeek,
//				startTime, startTimeMode, endMonth, endDay, endDayOfWeek, endTime, endTimeMode, dstSavings);
	}

	public static void main(String[] args) {

	}

}
