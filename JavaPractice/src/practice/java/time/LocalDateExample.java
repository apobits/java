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
		daysOfWeek.append(DayOfWeek.MONDAY).append(" ");
		daysOfWeek.append(DayOfWeek.TUESDAY).append(" ");
		daysOfWeek.append(DayOfWeek.WEDNESDAY).append(" ");
		daysOfWeek.append(DayOfWeek.THURSDAY).append(" ");
		daysOfWeek.append(DayOfWeek.FRIDAY).append(" ");
		daysOfWeek.append(DayOfWeek.SATURDAY).append(" ");
		daysOfWeek.append(DayOfWeek.SUNDAY);
		System.out.println(daysOfWeek);

		LocalDate date = LocalDate.of(2016, 2, 1);
		Month currentMonth = date.getMonth();
		boolean start = true;
		while (date.getMonth().equals(currentMonth)) {
			switch (date.getDayOfWeek()) {
			case MONDAY:
				System.out.printf("%6d", date.getDayOfMonth());
				start= false;
				break;
			case TUESDAY:
				if (start) {
					System.out.printf("%15d", date.getDayOfMonth());
				} else {
					System.out.printf("%8d", date.getDayOfMonth());
				}
				start = false;
				break;
			case WEDNESDAY:
				if (start) {
					System.out.printf("%24d", date.getDayOfMonth());
				} else {
					System.out.printf("%10d", date.getDayOfMonth());
				}
				start = false;
				break;
			case THURSDAY:
				if (start) {
					System.out.printf("%33d", date.getDayOfMonth());
				} else {
					System.out.printf("%9d", date.getDayOfMonth());
				}
				start = false;
				break;
			case FRIDAY:
				if (start) {
					System.out.printf("%40d", date.getDayOfMonth());
				} else {
					System.out.printf("%7d", date.getDayOfMonth());
				}
				start = false;
				break;
			case SATURDAY:
				if (start) {
					System.out.printf("%49d", date.getDayOfMonth());
				} else {
					System.out.printf("%9d", date.getDayOfMonth());
				}
				start = false;
				break;
			case SUNDAY:
				if (start) {
					System.out.printf("%47d", date.getDayOfMonth());
				} else {
					System.out.printf("%7d", date.getDayOfMonth());
				}
				start = false;
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
