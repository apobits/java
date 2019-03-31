/**
 * 
 */
package practice.java.datetime;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * @author aposo
 *
 */
public class DayOfWeekEnumExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// gets the sunday constant
		DayOfWeek sunday = DayOfWeek.SUNDAY;

		// gets the monday constant from its number representation
		DayOfWeek monday = DayOfWeek.of(2);

		// gets the thursday constant from its string representation
		DayOfWeek thursday = DayOfWeek.valueOf("THURSDAY");

		System.out.println("DayOfWeek.SUNDAY int representation: " + sunday.getValue());

		System.out.println("DayOfWeek.SUNDAY plus 1: " + sunday.plus(1));

		System.out.println("DayOfWeek.SUNDAY name in US locale and narrow representation: "
				+ sunday.getDisplayName(TextStyle.NARROW, Locale.US));

	}

}
