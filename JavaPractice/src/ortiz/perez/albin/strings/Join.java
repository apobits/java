/**
 * 
 */
package ortiz.perez.albin.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrador
 *
 */
public class Join {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(String.join(" ", "Hello", "World"));// receives n
																// parameters of
																// type
																// CharSequence

		List<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("Word");

		System.out.println(String.join(", ", words));// receives an iterable
														// object

	}

}
