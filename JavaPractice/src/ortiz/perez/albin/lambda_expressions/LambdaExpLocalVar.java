/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

/**
 * @author aposo
 *
 */
public class LambdaExpLocalVar {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int x = 1;// once x is used inside lambda expression it becomes effectively final(variable capture)

	Consumer<Integer> c = t -> {
	    //x++; Causes x to be not final or effectively final
	    t = t + x;
	    System.out.println(t);
	};

	c.accept(2);

	// x=4; Causes x to be not final or effectively final
    }

}
