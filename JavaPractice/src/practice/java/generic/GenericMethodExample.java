/**
 * 
 */
package practice.java.generic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author apobits@gmail.com
 *
 */
public class GenericMethodExample {

	public static <T, S, U> void doSomething(GenericExample<T, S, U> ge) {

	}

	public static <T> T test(T t, T tt) {
		return t;
	}

	public static void main(String args[]) {
		Serializable s = test("", new ArrayList<>());
	}

}
