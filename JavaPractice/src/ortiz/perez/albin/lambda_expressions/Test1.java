/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author aposo
 *
 */
public class Test1 {

    public static void main(String args[]) {
	Predicate<String> p = (x) -> x.equals(x);// parameter inside parenthesis, parameter type is inferred

	Predicate<String> q = x -> x.equals(x);// when there is only one parameter there is no need to enclose it with parenthesis, parameter type is inferred

	BiPredicate<String, String> r = (x, y) -> x.equals(y);// when there is more than one parameter they must be enclosed with parenthesis
	
	BiPredicate<String, String> s = (String x, String y) -> x.equals(y);//if you declare the type of one parameter the others parameters type must be declared to

	System.out.println(p.test(new String("Hi")));
    }

}
