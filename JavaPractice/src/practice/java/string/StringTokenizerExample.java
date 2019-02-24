/**
 * 
 */
package practice.java.string;

import java.util.StringTokenizer;

/**
 * @author apobits@gmail.com
 *
 */
public class StringTokenizerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringTokenizer stringTokenizer = new StringTokenizer("Hello=hola,how=como,are you=estas", "=,");
		StringTokenizer stringTokenizer2 = new StringTokenizer("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");

		// using tokens
		while (stringTokenizer.hasMoreTokens()) {
			System.out.print(stringTokenizer.nextToken() + " ");
		}
		System.out.println();
		// using elements
		while (stringTokenizer2.hasMoreElements()) {
			System.out.print(((String) stringTokenizer2.nextElement()).toLowerCase() + " ");
		}
	}

}
