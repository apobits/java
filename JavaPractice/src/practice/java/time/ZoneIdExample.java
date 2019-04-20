/**
 * 
 */
package practice.java.time;

import java.time.ZoneId;

/**
 * @author aposo
 *
 */
public class ZoneIdExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("America/Phoenix");

		System.out.println(zoneId);

		System.out.println(ZoneId.SHORT_IDS);

	}

}
