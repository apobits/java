/**
 * 
 */
package practice.java.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
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

	// practice method
	public static void displayCurrentMonth() {
		StringBuilder daysOfWeek = new StringBuilder();
		daysOfWeek.append(DayOfWeek.SUNDAY).append(" ");
		daysOfWeek.append(DayOfWeek.MONDAY).append(" ");
		daysOfWeek.append(DayOfWeek.TUESDAY).append(" ");
		daysOfWeek.append(DayOfWeek.WEDNESDAY).append(" ");
		daysOfWeek.append(DayOfWeek.THURSDAY).append(" ");
		daysOfWeek.append(DayOfWeek.FRIDAY);
		System.out.println(daysOfWeek);

		LocalDate date = LocalDate.now();
		date = date.minusDays(17 - 1);
		Month currentMonth = date.getMonth();
		while (date.getMonth().equals(currentMonth)) {
			switch (date.getDayOfWeek()) {
			case SUNDAY:
				System.out.println(" ".repeat(6));
				System.out.print(date.getDayOfWeek().getValue());
				break;
			case FRIDAY:
				System.out.println();
				break;
			}
			date = date.plusDays(1);
		}
	}

	public static void main(String[] args) {
		displayCurrentMonth();
		System.exit(0);
		parse();
	}

}
