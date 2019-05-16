/**
 * 
 */
package practice.java.string;

import java.util.stream.IntStream;

/**
 * @author Administrador
 *
 */
public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(String.format("Hello %s %s %s", "Albin", "Perez", "Ortiz"));
		String test = "Test";

		IntStream stream = test.chars();
		stream.forEach(t -> System.out.print(t));

		IntStream stream1 = test.codePoints();
		System.out.println();
		stream1.forEach(t -> System.out.print(t));

		String string1 = new String(new char[] { 'a', 'b' });

		System.out.println(String.join("-", "Hello", "you"));

		System.out.println(string1.repeat(5));

		String word = "\u1F37";
		String word2 = "";
		int codePoint = 00000041;
		System.out.println(Character.toChars(codePoint));

	}

}
