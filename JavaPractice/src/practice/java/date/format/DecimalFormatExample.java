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
public class DecimalFormatExample {

	public static void main(String[] args) {

		NumberFormat df = DecimalFormat.getCurrencyInstance(Locale.getDefault());

	}

}
