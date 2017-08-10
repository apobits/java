/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

/**
 * @author aposo
 *
 */
public class MethodReferenceTest {

    public static void execute(Consumer<String> t, String word) {
	t.accept(word);
    }

    public static <T> void consumerSimulation(T t) {

	System.out.println(t);

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	MethodReferenceTest.execute(MethodReferenceTest::consumerSimulation, "Albin Perez");

    }

}
