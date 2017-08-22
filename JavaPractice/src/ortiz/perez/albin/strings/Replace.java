/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author Administrador
 *
 */
public class Replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "Hello World";

		System.out.println(a.replace('o', '0'));// replaces 'o' with '0' in the
												// whole string
												// it creates a new string, the
												// original string stays
												// unmodified as strings are
												// immutable

		System.out.println(a.replace("World", "you"));// replaces the char
														// sequence "World" with
														// the char sequence
														// "you"

		System.out.println(a.replaceAll("o", "O"));// uses a regular expression
													// to replace everything
													// that matches in the
													// substring with the
													// replacement string

		System.out.println(a.replaceFirst("o", "O"));// uses a regular
														// expression to replace
														// the first occurrence
														// that matches in the
														// substring with the
														// replacement string

	}

}
