/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author aposo
 *
 */
public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> codes = Arrays.asList(10, 20);
		UnaryOperator<Double> uo = s -> s + 10.0;
//		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));

	}

}
