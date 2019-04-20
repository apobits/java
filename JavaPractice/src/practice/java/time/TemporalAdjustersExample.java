/**
 * 
 */
package practice.java.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author aposo
 *
 */
public class TemporalAdjustersExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY)));

		System.out.println(TemporalAdjusters.next(DayOfWeek.THURSDAY).adjustInto(LocalDate.now()));

	}

}
