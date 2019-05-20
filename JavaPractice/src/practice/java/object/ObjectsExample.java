/**
 * 
 */
package practice.java.object;

import java.util.Objects;

/**
 * @author aposo
 *
 */
public class ObjectsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "";

		// throws a null pointer exception if the argument is null
		Objects.requireNonNull(name);

		// if name argument is null returns the supplier's result
		Objects.requireNonNullElseGet(name, () -> "Replacement");

	}

}
