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
public class Q49 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Instant loginTime = Instant.now();
		Thread.sleep(1000);
		Instant logoutTime = Instant.now();

		loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);

		if (logoutTime.isAfter(loginTime)) {
			System.out.println("Logout at: " + logoutTime);
		} else {
			System.out.println("Can't logout");
		}
	}

}
