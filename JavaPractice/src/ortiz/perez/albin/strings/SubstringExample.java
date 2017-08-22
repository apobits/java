/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author Administrador
 *
 */
public class SubstringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "Hello World";
		System.out.println(a.substring(6));// creates a substring from the
											// specified index 6; it prints
											// World
		System.out.println(a.substring(6, 11));// creates a substring from the
												// specified index 6 until the
												// ending index 11
												// have in mind that the
												// startIndex starts at 0 and
												// the lastIndex finalize at
												// the string.length -1

	}

}
