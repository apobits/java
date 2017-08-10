/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

/**
 * @author aposo
 *
 */
public class UsingInstanceVar {

    private String name;

    public void doSomething(Consumer<String> p) {

    }

    public void doSomethingElse() {
	doSomething(t -> {System.out.println(this.name);});
    }

    public static void main(String args[]) {
	new UsingInstanceVar().doSomethingElse();
    }

}
