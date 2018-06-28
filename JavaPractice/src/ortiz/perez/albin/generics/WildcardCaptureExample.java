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
public class WildcardCaptureExample {

    // The method set(int, capture#1-of ?) in the type List<capture#1-of ?> is not
    // applicable for the arguments (int, capture#2-of ?)
    // public void doSomething(List<?> l) {
    // l.set(0, l.get(0));
    // }

    // original method using the helper method
    public static void doSomething(List<?> l) {
	wildcardCaptureHelper(l);
    }

    // Helper method to capture the wildcard
    private static <T> void wildcardCaptureHelper(List<T> l) {
	l.set(0, l.get(0));
    }

    public static void main(String[] args) {

	List<Integer> l = Arrays.asList(1, 2, 3);
	doSomething(l);
    }

}
