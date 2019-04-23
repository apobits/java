/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.stream.IntStream;

/**
 * @author aposo
 *
 */
public class Q23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IntStream str = IntStream.of(1, 2, 3, 4);

		Double d = str.average().getAsDouble();

		System.out.println("Average = " + d);

	}

}
