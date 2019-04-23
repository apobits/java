/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aposo
 *
 */
public class Q29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

//		map.compute("1", (k,v)->(v==null)?k*k:0);
		map.compute("2", (k, v) -> (v == null) ? 2 * 2 : 0);

		System.out.println(map.get("1") + " " + map.get("2"));
	}

}
