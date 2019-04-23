/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author aposo
 *
 */
public class Q7 {

	public static void main(String[] args) {

		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1, 0), zone);
		ZonedDateTime zdt2 = zdt.plusHours(2);
		System.out.print(DateTimeFormatter.ofPattern("H:mm - ").format(zdt2));
		System.out.println("difference " + ChronoUnit.HOURS.between(zdt, zdt2));

	}

}
