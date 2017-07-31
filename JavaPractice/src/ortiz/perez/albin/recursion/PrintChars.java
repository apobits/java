/**
 * 
 */
package ortiz.perez.albin.recursion;

/**
 * @author aposo
 *
 */
public class PrintChars {

	public void printCharacters(String name) {
		if (name.length() == 0)
			return;
		else {
			printCharacters(name.substring(0, name.length() - 1));
			System.out.println(name.charAt(name.length() - 1));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new PrintChars().printCharacters("albin");

	}

}
