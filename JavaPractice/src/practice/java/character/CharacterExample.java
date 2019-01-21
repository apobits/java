/**
 * 
 */
package practice.java.character;

/**
 * @author apobits@gmail.com
 *
 */
public class CharacterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Character character = new Character('M');
		System.out.println(Character.isUpperCase(character));
		System.out.println(Character.forDigit(3, 10));
		System.out.println(Character.isDigit(character));
		System.out.println(Character.digit('2', 10));
		System.out.println(Character.codePointAt("abc", 0));
		System.out.println((char) 97);
		//unicode value
		System.out.println('\u05F0');
		//ascii value
		System.out.println((char) 64);
		System.out.println(Character.isLowSurrogate('\uFFFF'));
		// maximum value of a character stored in 16 bits, values beyond 10FFFF are
		// supplemental characters and they are stored in 32bits(char array of two
		// elements)
		System.out.println(Character.isHighSurrogate('\uFFFF'));
		// 2 chars containing the supplemental character
		System.out.println(Character.charCount(200000));
		// code point representing a supplemental character that is store on a char
		// array because is passed FFFF
		System.out.println(Character.toChars((200000)));

	}

}
