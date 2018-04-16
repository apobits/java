/**
 * 
 */
package ortiz.perez.albin.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Administrador
 *
 */
public class ResourceBundleExample {

    public static void main(String[] args) {
	ResourceBundle resourceBundleEN = ResourceBundle.getBundle("ortiz.perez.albin.resourcebundle.message", Locale.ENGLISH);
	ResourceBundle resourceBundleES = ResourceBundle.getBundle("ortiz.perez.albin.resourcebundle.message", Locale.forLanguageTag("es"));
	ResourceBundle resourceBundleLEN = ResourceBundle.getBundle("ortiz.perez.albin.resourcebundle.Message", Locale.ENGLISH);
	ResourceBundle resourceBundleLES = ResourceBundle.getBundle("ortiz.perez.albin.resourcebundle.Message", Locale.forLanguageTag("es"));

	System.out.println(resourceBundleEN.getString("architect"));
	System.out.println(resourceBundleES.getString("architect"));
	System.out.println(resourceBundleLEN.getString("architect"));
	System.out.println(resourceBundleLES.getString("architect"));

    }

}
