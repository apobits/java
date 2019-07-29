/**
 * 
 */
package practice.java.varieties;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author aposo
 *
 */
public class RegularExpressionExample {

	// unicode points with hex
	public static void hexadecimalRegex() {
		String regex = "\\x{21}";// 21 hex = 33 dec = u0021 unicode = !
		System.out.println("!".matches(regex));

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("!");

		System.out.println(matcher.matches());

	}

	public static void utf16() {
		// hex \xhh - unicode \\uhhhh - octal \Oo \Ooo \Oooo

		String unicodeRegex = "\\u0021"; // !
		String hexRegex = "\\x21";// !
		String octalRegex = "\\041";// !

		System.out.println("!".matches(octalRegex));
	}

	public static void characters() {
		String regex = "\\x{8}";
		System.out.println("$".matches(regex));
	}

	public static void quotation() {
		System.out.println("(asdf)".matches("\\Q(asdf)\\E"));

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n".matches("\\n"));
	}

}
