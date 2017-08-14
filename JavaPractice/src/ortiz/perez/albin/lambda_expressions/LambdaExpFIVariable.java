/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

/**
 * @author aposo
 *
 */
public class LambdaExpFIVariable {

    public static void doSomething(Consumer<String> c) {
	c.accept("Albin");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Consumer<String> consumer = (t) -> System.out.println(t);

	doSomething(consumer);
    }

}
