/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.stream.Stream;

/**
 * @author aposo
 *
 */
public class Q40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream.of("Java", "Unix", "Linux").filter(t -> t.contains("n")).peek(t -> System.out.println("PEEK: " + t))
				.findAny();

		Stream.of("Java", "Unix", "Linux").filter(t -> t.contains("n")).peek(t -> System.out.println("PEEK: " + t))
				.findFirst();

	}

}
