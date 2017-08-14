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

    private String name = "Albin";
    
    private String lastName ="Perez";

    public void doSomething(Consumer<String> p) {
	p.accept(name);
    }

    public void doSomethingElse() {
	doSomething(t -> {System.out.println(t+" "+lastName);});
    }

    public static void main(String args[]) {
	new UsingInstanceVar().doSomethingElse();
    }

}
