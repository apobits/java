/**
 * 
 */
package practice.java.date.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author aposo
 *
 */
public class DateFormatExample {

	public static void main(String[] args) {

		// date format with default formatting style and locale
		DateFormat df1 = DateFormat.getDateInstance();

		// Getting a date format from default style and US locale
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
		System.out.println(df.format(new Date()));

		SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");

		System.out.println(sdf.format(new Date()));
		
	}

}
