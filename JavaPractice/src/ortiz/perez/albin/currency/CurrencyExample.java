package ortiz.perez.albin.currency;

import java.util.Currency;
import java.util.Locale;

public class CurrencyExample {

    public static void main(String args[]) {
	Currency c = Currency.getInstance(Locale.getDefault());// Currency class

	System.out.println(c.getCurrencyCode());// currency code

	System.out.println(c.getSymbol());// currency symbol
    }

}
