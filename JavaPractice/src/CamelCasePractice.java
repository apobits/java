/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class CamelCasePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String camelCaseWord = "camelCaseWord";

		// return the number of words contained in the camel case variable
		String[] words = camelCaseWord.split("[A-Z]");

		System.out.println(words.length);

	}

}
