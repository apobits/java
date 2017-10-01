/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import ortiz.perez.albin.functional_interfaces.MyFunc;

/**
 * @author aposo
 *
 */
public class Test1 {

    static interface IGetDouble {
	double getDouble();
    }

    static interface IWithParam {
	void printSomething(String s);
    }

    static interface IWithParams {
	void printSomething(String a, String b);
    }

    static interface IWithParamsG<T, V> {
	void printSomething(T t, V v);
    }

    static interface IWithParamG<T> {
	void printSomething(T a, T b);
    }

    public static void main(String args[]) {
	Predicate<String> p = (x) -> x.equals(x);// parameter inside parenthesis, parameter type is inferred

	Predicate<String> q = x -> x.equals(x);// when there is only one parameter there is no need to enclose it with parenthesis, parameter type is inferred

	BiPredicate<String, String> r = (x, y) -> x.equals(y);// when there is more than one parameter they must be enclosed with parenthesis

	BiPredicate<String, String> s = (String x, String y) -> x.equals(y);// if you declare the type of one parameter the others parameters type must be declared too

	System.out.println(p.test(new String("Hi")));

	IGetDouble gd = () -> 1;
	System.out.println(gd.getDouble());

	Consumer<String> c = t -> System.out.println(t);
	c.accept("Albin");

	IWithParam iwp = x -> System.out.println(x);
	iwp.printSomething("Danna");

	IWithParams iwps = (a, b) -> System.out.println(a + b);
	iwps.printSomething("a", "b");

	IWithParamsG<String, String> iwpsg = (t, v) -> System.out.println(t + v);
	iwpsg.printSomething("Albin", "Perez");

	IWithParamG<String> iwpg = (t, v) -> System.out.println(t + v);
	iwpg.printSomething("Albin", "Perez");

	MyFunc<String> mf = (t, v) -> t.equals(v);
	System.out.println(mf.func("Albin", "Albin"));

	MyFunc<LambdaExpAnyInstanceMethodReference> mf1 = LambdaExpAnyInstanceMethodReference::compare;
	System.out.println(mf1.func(new LambdaExpAnyInstanceMethodReference(), new LambdaExpAnyInstanceMethodReference()));

    }

}
