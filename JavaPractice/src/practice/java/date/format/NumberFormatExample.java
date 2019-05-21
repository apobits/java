/**
 * 
 */
package practice.java.date.format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author aposo
 *
 */
public class NumberFormatExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var currencyFormat = NumberFormat.getCurrencyInstance();
		var percentFormat = NumberFormat.getPercentInstance();
		var currencyFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
		var percentFormat1 = DecimalFormat.getCurrencyInstance();
		System.out.println("Currency: " + currencyFormat.format(15));
		System.out.println("Percent: " + percentFormat.format(0.5));

	}

}
