/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author aposo
 *
 */
public class Q38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("zzzz", Locale.US);
		System.out.println(sdf.format(new Date()));

	}

}
