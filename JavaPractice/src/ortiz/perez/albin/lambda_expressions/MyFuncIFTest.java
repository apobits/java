/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import ortiz.perez.albin.functional_interfaces.MyFunc;
import ortiz.perez.albin.functional_interfaces.MyFunc2;

/**
 * @author Administrador
 *
 */
public class MyFuncIFTest {

    int i = 0;

    public MyFuncIFTest(int i) {
	this.i = i;
    }

    boolean tryTest(MyFuncIFTest a) {
	return this.i == a.i;
    }

    boolean tryTest1(String a, String b) {
	return a == b;
    }

    public <T> boolean test(MyFunc<T> t, T a, T b) {
	return t.func(a, b);
    }

    public boolean test1(MyFunc2 f, String a, String b) {
	return f.func(a, b);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	System.out.println(new MyFuncIFTest(10).test(MyFuncIFTest::tryTest, new MyFuncIFTest(1), new MyFuncIFTest(2)));

	System.out.println(new MyFuncIFTest(11).test1(new MyFuncIFTest(1)::tryTest1, new String("A"), new String("B")));

    }

}
