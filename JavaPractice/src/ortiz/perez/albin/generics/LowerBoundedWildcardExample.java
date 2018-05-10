/**
 * 
 */
package ortiz.perez.albin.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class LowerBoundedWildcardExample {

    public static void doSomething(List<? super Integer> list) {

    }

    public static void doSomethingElse(List<Integer> list) {

    }

    public static void main(String[] args) {

	List<Object> list = Arrays.asList(new Object());

	doSomething(list);

	// The method doSomethingElse(List<Integer>) in the type
	// LowerBoundedWildcardExample is not applicable for the arguments
	// (List<Object>)

	// doSomethingElse(list);

    }

}
