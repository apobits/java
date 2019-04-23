/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author aposo
 *
 */
public class Q35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> qwords = Arrays.asList("why ","what ","when ");
		BinaryOperator<String> operator = ((t,u)->t.concat(u));
		String sen = qwords.stream().reduce("Word: ", operator);
		System.out.println(sen);
	}

}
