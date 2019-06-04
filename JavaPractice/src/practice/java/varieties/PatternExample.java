/**
 * 
 */
package practice.java.varieties;

import java.util.regex.Pattern;

/**
 * @author apobits@gmail.com
 *
 */
public class PatternExample {

	public static void main(String[] args) {

		var stream = Pattern.compile(" ").splitAsStream("hello there how are you");
		stream.forEach(t -> System.out.println(t));

	}

}
