/**
 * 
 */
package practice.java.datetime;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * @author aposo
 *
 */
public class MonthEnumExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// gets the integer representation of the month
		// 1(January) to 12(December)
		System.out.println(Month.APRIL.getValue());

		// gets the String representation of enum constant
		System.out.println(Month.APRIL);

		// obtaining a month constant with valueOf
		Month april = Month.valueOf("APRIL");
		System.out.println(april);

		// obtaining a month constant with of
		Month march = Month.of(3);
		System.out.println(march);

		// gets the name of the month with the specified style and locale
		System.out.println(march.getDisplayName(TextStyle.FULL, Locale.US));

	}

}
