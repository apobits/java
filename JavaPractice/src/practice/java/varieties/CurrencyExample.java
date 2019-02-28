/**
 * 
 */
package practice.java.varieties;

import java.util.Currency;
import java.util.Locale;

/**
 * @author apobits@gmail.com
 *
 */
public class CurrencyExample {

	public static void main(String[] args) {

		// Creates a currency with the specified locale
		Currency currency = Currency.getInstance(Locale.US);

		// Creates a currency with the specified code
		Currency currency1 = Currency.getInstance("COP");

		System.out.println("Display name: " + currency1.getDisplayName());

		System.out.println("Currency code: " + currency1.getCurrencyCode());

		System.out.println("Default fraction digits: " + currency1.getDefaultFractionDigits());

		System.out.println("Numeric code: " + currency1.getNumericCode());

		System.out.println("Symbol: " + currency1.getSymbol());

		Currency.getAvailableCurrencies().forEach(t -> System.out.println(t));

	}

}
