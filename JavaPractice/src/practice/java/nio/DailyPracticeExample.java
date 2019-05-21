/**
 * 
 */
package practice.java.nio;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println(nf.format(15.0));

		NumberFormat nf1 = DecimalFormat.getCurrencyInstance();
		System.out.println(nf1.format(15.0));

	}

}
