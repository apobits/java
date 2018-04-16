/**
 * 
 */
package ortiz.perez.albin.calendar;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author Administrador
 *
 */
public class GregorianCalendarExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	GregorianCalendar gCalendar1 = new GregorianCalendar();// empty
							       // constructor
	GregorianCalendar gCalendar2 = new GregorianCalendar(Locale.getDefault());// constructor
										  // with
										  // locale
										  // specified

	GregorianCalendar gCalendar3 = new GregorianCalendar(TimeZone.getDefault());// constructor
										    // with
										    // time
										    // zone
										    // specified

	GregorianCalendar gCalendar4 = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());// constructor
													 // with
													 // locale
													 // and
													 // time
													 // zone
													 // specified

	GregorianCalendar gCalendar5 = new GregorianCalendar(2017, 11, 9, 17, 56);// constructor
										  // with
										  // year
										  // month
										  // day
										  // hour
										  // minutes
										  // specified

	GregorianCalendar gCalendar6 = new GregorianCalendar(2017, 11, 9, 17, 56, 59);// constructor
										      // with
										      // year
										      // month
										      // day
										      // hour
										      // minutes
										      // seconds
										      // specified

	GregorianCalendar gCalendar7 = new GregorianCalendar(2017, 11, 9);// constructor
									  // with
									  // year
									  // month
									  // days
									  // specified

	System.out.println("default time zone " + TimeZone.getDefault());

	System.out.println("default locale " + Locale.getDefault());

	System.out.println("gCalendar1 " + gCalendar1.getTime());
	System.out.println("gCalendar2 " + gCalendar2.getTime());
	System.out.println("gCalendar3 " + gCalendar3.getTime());
	System.out.println("gCalendar4 " + gCalendar4.getTime());
	System.out.println("gCalendar5 " + gCalendar5.getTime());
	System.out.println("gCalendar6 " + gCalendar6.getTime());
	System.out.println("gCalendar7 " + gCalendar7.getTime());

    }

}
