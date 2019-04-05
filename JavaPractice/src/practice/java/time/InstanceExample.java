/**
 * 
 */
package practice.java.time;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author aposo
 *
 */
public class InstanceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Instant instant = Instant.now();

		System.out.println(instant.truncatedTo(ChronoUnit.MINUTES));

	}

}
