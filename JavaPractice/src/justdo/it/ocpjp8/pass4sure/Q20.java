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
public class Q20 {

	public static void main(String[] args) {

		List<String> sList = Arrays.asList("A", "B", "C", "D");

		String str = sList.stream().reduce("", (t, u) -> t.concat(u));

		System.out.println(str);

	}

}
