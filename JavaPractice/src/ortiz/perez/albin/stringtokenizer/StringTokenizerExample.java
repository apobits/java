/**
 * 
 */
package ortiz.perez.albin.stringtokenizer;

import java.util.StringTokenizer;

/**
 * @author Administrador
 *
 */
public class StringTokenizerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String x = "Hola=hello,como=how,estas=are you";

		// delimiters = ,
		StringTokenizer t = new StringTokenizer(x, "=,");
		while (t.hasMoreTokens()) {
			System.out.print(t.nextToken() + "  ");
			if (t.hasMoreTokens()) {
				System.out.print(t.nextToken());
			}
			System.out.println();
		}

	}

}
