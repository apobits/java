/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author aposo
 *
 */
public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");

		Predicate<String> test = s -> {
			int i = 0;
			boolean result = s.contains("pen");
			System.out.print((i++) + s + " : ");
			return result;
		};

		str.stream().filter(test).findFirst().ifPresent(System.out::print);

	}

}
