/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author Administrador
 *
 */
public class ValueOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// String.valueOf return the string representation of the object,
		// primitive types, arrays passed as argument

		System.out.println(String.valueOf(true));

		System.out.println(String.valueOf('A'));

		System.out.println(String.valueOf(new char[] { 'a', 'b' }));// for char
																	// arrays it
																	// returns
																	// the human
																	// readable
																	// representation

		System.out.println(String.valueOf(new int[] { 1, 2, 3 }));// for arrays
																	// different
																	// than
																	// chars it
																	// returns a
																	// value
																	// indicating
																	// that is
																	// an array
																	// of some
																	// type
		System.out.println(String.valueOf(1));

	}

}
