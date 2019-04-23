/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;

/**
 * @author aposo
 *
 */
public class Q25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		System.out.println(listVal.stream().filter(t -> t.length() > 3).count());

	}

}
