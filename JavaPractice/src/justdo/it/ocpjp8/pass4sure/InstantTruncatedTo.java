/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author aposo
 *
 */
public class InstantTruncatedTo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Instant instant1 = Instant.now();
		Thread.sleep(1000);
		Instant instant2 = Instant.now();
		instant1 = instant1.truncatedTo(ChronoUnit.MINUTES);
		instant2 = instant2.truncatedTo(ChronoUnit.MINUTES);

		if (instant2.isAfter(instant1)) {
			System.out.println("Logged out at " + instant2);
		} else {
			System.out.println("Can't log out");
		}

	}

}
