/**
 * 
 */
package ortiz.perez.albin.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class LowerBoundedWildcardExample {

	public static void doSomething(List<? super B> list) {

	}

	public static void doSomethingElse(List<Integer> list) {

	}

	public static void main(String[] args) {

		List<A> list = Arrays.asList(new A());

		List<Integer> numberList = new ArrayList<>();

		doSomething(list);

		doSomethingElse(numberList);

		// The method doSomethingElse(List<Integer>) in the type
		// LowerBoundedWildcardExample is not applicable for the arguments
		// (List<Object>)

		// doSomethingElse(list);

	}

}
