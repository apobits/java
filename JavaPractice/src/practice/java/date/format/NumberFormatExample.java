/**
 * 
 */
package practice.java.date.format;

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
		NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
		NumberFormat.getCurrencyInstance();

	}

}
