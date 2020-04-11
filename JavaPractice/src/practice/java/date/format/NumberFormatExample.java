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
	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	NumberFormat percentFormat = NumberFormat.getPercentInstance();
	NumberFormat currencyFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
	NumberFormat percentFormat1 = DecimalFormat.getCurrencyInstance();
	System.out.println("Currency: " + currencyFormat.format(15));
	System.out.println("Percent: " + percentFormat.format(0.5));

    }

}
