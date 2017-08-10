/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

import ortiz.perez.albin.functional_interfaces.MyFunc;

/**
 * @author Administrador
 *
 */
public class MyFuncIFTest {

	static boolean tryTest(String a, String b) {
		return a.equals(b);
	}

	public boolean test(MyFunc<String> t, String a, String b) {
		return t.func(a, b);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(new MyFuncIFTest().test(MyFuncIFTest::tryTest, "Albin", "Perez"));

	}

}
