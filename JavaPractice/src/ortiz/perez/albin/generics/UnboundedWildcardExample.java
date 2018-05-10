/**
 * 
 */
package ortiz.perez.albin.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public class UnboundedWildcardExample {

    // The method doSomething(List<Object>) in the type UnboundedWildcardExample is
    // not applicable for the arguments (List<Integer>)
//    public static void doSomething(List<Object> list) {
//	for (Object object : list) {
//	    System.out.println(object);
//	}
//    }

    public static void doSomething(List<?> list) {
	for (Object object : list) {
	    System.out.println(object);
	}
    }

    public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	doSomething(list);

    }

}
