/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

/**
 * @author apobits@gmail.com
 *
 */
public class ConstructorMethodReference<T> {

    public ConstructorMethodReference(T t) {
	System.out.println(t);
    }

    public static <T> void consume(Consumer<T> c, T t) {
	c.accept(t);
    }

    public static void main(String[] args) {
	consume(ConstructorMethodReference::new, "Albin");
    }

}
