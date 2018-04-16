/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

/**
 * @author apobits@gmail.com
 *
 */
public class InstanceMethodReference {

    public static <T> void consume(Consumer<T> c, T t) {
	c.accept(t);
    }

    public <T> void consumerImp(T t) {
	System.out.println(t);
    }

    public static void main(String[] args) {
	InstanceMethodReference imr = new InstanceMethodReference();
	consume(imr::consumerImp, "Albin");

    }

}
