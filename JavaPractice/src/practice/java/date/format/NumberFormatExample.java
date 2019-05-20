/**
 * 
 */
package practice.java.date.format;

import java.text.NumberFormat;

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
		System.out.println("Currency: " + currencyFormat.format(15));
		System.out.println("Percent: " + percentFormat.format(0.5));

	}

}
