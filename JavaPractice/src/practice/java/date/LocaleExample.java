/**
 * 
 */
package practice.java.date;

import java.util.Locale;
import java.util.Locale.Builder;
import java.util.Locale.Category;

/**
 * @author apobits@gmail.com
 *
 */
public class LocaleExample {

	public static void main(String[] args) {

		// Creating a Locale with the specified language code
		Locale locale = new Locale(Locale.ENGLISH.toString());

		// Creating a locale with the specified language and country codes
		Locale locale1 = new Locale(Locale.ENGLISH.toString(), Locale.US.toString());

		// Creating a locale with the specified language, country an variant codes
		Locale locale2 = new Locale(Locale.ENGLISH.toString(), Locale.US.toString(), "co");

		// Using BuilderExample class to create locale
		Builder localeBuilder = new Builder();
		localeBuilder.setLanguage(Locale.ENGLISH.toString());
		Locale locale3 = localeBuilder.build();

		System.out.println(locale);

		System.out.println(locale1);

		System.out.println(locale2);

		System.out.println(locale3);

		System.out.println(Locale.getDefault(Category.DISPLAY));

		Locale.setDefault(Category.FORMAT, new Locale("es"));
		
		System.out.println(Locale.forLanguageTag("sp"));
		

	}

}
