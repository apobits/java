/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aposo
 *
 */
public class Q37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<StringBuilder> names = new ArrayList<>();

		names.add(new StringBuilder("Tom"));
		names.add(new StringBuilder("Joe"));

		names.stream().forEach(s -> s.append("Hello"));

		names.forEach(t -> {
			t.insert(3, ",");
			System.out.println(t);
		});

	}

}
