/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author apobits@gmail.com
 *
 */
public class GenericMethodExample {

    public static <T> void doSomething(T t) {
	System.out.println(t);
    }

    public static void main(String[] args) {

	// without type inference
	GenericMethodExample.<String>doSomething("Hello");

	// with type inference
	GenericMethodExample.doSomething("Hello");
    }

}
