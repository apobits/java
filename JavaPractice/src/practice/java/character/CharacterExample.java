/**
 * 
 */
package practice.java.character;

/**
 * @author apobits@gmail.com
 *
 */
public class CharacterExample {

// escape sequence \\u can be used outside single and double quotes
	public static void main(String\u005b\u005d args) {

		// Instantiating a character object
		Character character = Character.valueOf('A');
		System.out.println("'A' character: " + character);

		System.out.println(character + " is high surrogate: " + Character.isHighSurrogate(character.charValue()));
		System.out.println(character + " is lower surrogate: " + Character.isLowSurrogate(character.charValue()));

		// using unicode escape sequences
		char\u005b\u005d x = \u007b 1, 2, 3 \u007d;

		// using normal characters
		char[] y = { 1, 2, 3 };

		// unicode escape sequences are processed before the code is parsed
		System.out.println(" \u0022 + "lol" + \u0022 ");

		System.out.println("Unicode \\u0041 is \u0041");

		// code points
		System.out.println("U+0041");

		System.out.println("1 Is Java identifier part: " + Character.isJavaIdentifierPart('1'));

		System.out.println("_ Is Java identifier start: " + Character.isJavaIdentifierStart('_'));
	}

}
