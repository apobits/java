/**
 * 
 */
package ortiz.perez.albin.stringbuffer;

/**
 * @author Administrador
 *
 */
public class Replace {

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello World");
		System.out.println("before replace " + sb);
		System.out.println(sb.replace(6, 11, "Albin"));// it removes the chars
														// from the start to end
														// indexes and then
														// inserts the string at
														// the star index
		System.out.println("after replace " + sb);

		System.out.println(sb.substring(6));// returns a substring from the
											// specified index
		System.out.println(sb.substring(0, 5));// returns a substring from the
												// specified index to the end
												// index
		
		System.out.println(sb.offsetByCodePoints(5, 2));// check it later

	}

}
