/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author aposo
 *
 */
public class Q54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List fontCatalog = new ArrayList();

		fontCatalog.add("Algerian");
		fontCatalog.add("Cambria");
		fontCatalog.add("Lucida Bright");

		Map<String, List<String>> category = new HashMap<>();

		Map<String, List<String>> category1 = new HashMap<String, List<String>>();

		category.put("firstCategory", fontCatalog);

		category1.put("firstCategory", fontCatalog);

	}

}
