/**
 * 
 */
package practice.java.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * @author aposo
 *
 */
public class LocalDateExample {

	public static void formattingException() {
		LocalDate localDate = LocalDate.of(2019, 1, 1);
		System.out.println(localDate.format(DateTimeFormatter.ISO_DATE_TIME));
	}

	public static void with() {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.with(ChronoField.DAY_OF_WEEK, 1));
	}

	public static void parse() {
		LocalDate localDate = LocalDate.parse("2019-04-19", DateTimeFormatter.ISO_DATE);
		System.out.println(localDate);
	}

	public static void main(String[] args) {
		parse();
	}

}
