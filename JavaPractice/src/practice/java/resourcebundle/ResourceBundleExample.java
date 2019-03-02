/**
 * 
 */
package practice.java.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author apobits@gmail.com
 *
 */
public class ResourceBundleExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ResourceBundle resourceBundle = ResourceBundle.getBundle("practice.java.resourcebundle.global",
				Locale.forLanguageTag("en"));

		ResourceBundle resourceBundle1 = ResourceBundle.getBundle("practice.java.resourcebundle.global",
				Locale.forLanguageTag("sp"));

		ResourceBundle resourceBundle3 = ResourceBundle.getBundle("practice.java.resourcebundle.Global",
				Locale.forLanguageTag("en"));

		ResourceBundle resourceBundle4 = ResourceBundle.getBundle("practice.java.resourcebundle.Global",
				Locale.forLanguageTag("sp"));

		System.out.println(resourceBundle.getString("architect"));

		System.out.println(resourceBundle1.getString("architect"));

		System.out.println(resourceBundle3.getString("architect"));

		System.out.println(resourceBundle4.getString("architect"));

	}

}
