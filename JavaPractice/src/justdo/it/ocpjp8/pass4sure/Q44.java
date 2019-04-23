/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author aposo
 *
 */
public class Q44 {

	public void loadResourceBundle() {
		ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
//		System.out.println(resource.getObject(1));
	}

	public static void main(String[] args) {

		new Q44().loadResourceBundle();

	}

}
