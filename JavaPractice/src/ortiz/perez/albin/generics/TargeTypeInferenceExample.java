/**
 * 
 */
package ortiz.perez.albin.generics;

import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class TargeTypeInferenceExample {

    public static <T> List<T> doSomething() {
	return null;
    }

    public static void main(String[] args) {
	List<String> x = TargeTypeInferenceExample.doSomething();// as target type List<String> compiler infers the
								 // generic type parameter return by the method
								 // doSomething is String

	List<String> y = TargeTypeInferenceExample.<String>doSomething();// using type witness <String on method
									 // doSomething>

    }

}
