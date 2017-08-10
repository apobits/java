/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @author aposo
 *
 */
public class UsingLocalVar {

    private String name = "Albin";

    public void doSomething(Consumer<String> p) {

    }

    public void doSomethingElse() {
	String a = "Albin";
	doSomething(t -> System.out.println(a));
    }

    public static void main(String args[]) {
	String lol = "lol";
	new UsingInstanceVar().doSomething(t->{System.out.println("lolol");});
	new UsingLocalVar().doSomethingElse();
    }

}
