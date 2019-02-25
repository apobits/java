/**
 * 
 */
package practice.java.varieties;

import java.util.Optional;

/**
 * @author apobits@gmail.com
 *
 */
public class OptionalExample {

	public static void main(String[] args) {

		String nullWord = null;

		// working with Optional class to avoid nullpointer exceptions
		// I still think than creating an object to avoid nullpointerexceptions requires
		// alot of code than simply comparing to null
		Optional<String> opt = Optional.ofNullable(nullWord);

		System.out.println(opt.orElse("No value found"));

	}

}
