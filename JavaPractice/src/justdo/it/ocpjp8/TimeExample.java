/**
 * 
 */
package justdo.it.ocpjp8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author aposo
 *
 */
public class TimeExample {

	public static void period() {
		System.out.println(Period.between(LocalDate.now(), LocalDate.of(2018, 12, 24)));
	}

	public static void duration() {
		System.out.println(ZonedDateTime.now().plus(Duration.of(1, ChronoUnit.SECONDS)));
	}

	public static void main(String[] args) {
		System.out.println(DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDate.now()));
		System.out.println(LocalDate.now());
		duration();

	}

}
