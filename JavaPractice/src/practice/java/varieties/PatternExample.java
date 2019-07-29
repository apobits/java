/**
 * 
 */
package practice.java.varieties;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author apobits@gmail.com
 *
 */
public class PatternExample {

	private static String convertToHexadecimal(int number) {
		var values = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		for (int i = 0; i < values.length; i++) {
			if (number / 16 == 0) {
				values[i] = number % 16;
				break;
			} else {
				values[i] = number % 16;
			}
			number = number / 16;
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int x : values) {

			if (x == -1) {
				break;
			}

			if (x > 9) {
				switch (x) {
				case 10:
					stringBuilder.append("A");
					break;
				case 11:
					stringBuilder.append("B");
					break;
				case 12:
					stringBuilder.append("C");
					break;
				case 13:
					stringBuilder.append("D");
					break;
				case 14:
					stringBuilder.append("E");
					break;
				case 15:
					stringBuilder.append("F");
					break;
				}
			}

			if (x > -1 && x < 10) {
				stringBuilder.append(x);
			}

		}

		return stringBuilder.reverse().toString();
	}

	public static void main(String[] args) {

		System.out.println(convertToHexadecimal(33));

		System.out.println("\u0021");

		var stream = Pattern.compile(" ").splitAsStream("hello there how are you");
		stream.forEach(t -> System.out.println(t));

		String regex = "^[A-Za-z]+[1-23-45-67-89]+[A-Za-z]+$";
		regex = "\\x{21}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("#");

		System.out.println(matcher.matches());

	}

}
