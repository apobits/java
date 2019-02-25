/**
 * 
 */
package practice.java.control.date;

import java.util.Date;

/**
 * @author apobits@gmail.com
 *
 */
public class DateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Uses the default constructor to create a date object
		Date date1 = new Date();

		// Uses a constructor that receives a date in terms of milliseconds since
		// the standard base time(the epoch)Jan 1 of 1970 00:00:00
		Date date2 = new Date(123556789);

		System.out.println(date1 + " in milliseconds " + date1.getTime());

		System.out.println(date1 + " is before than " + date2 + " " + date1.before(date2));

		System.out.println(date1 + " is after than " + date2 + " " + date1.after(date2));

	}

}
