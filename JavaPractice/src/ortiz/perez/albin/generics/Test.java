/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author Administrador
 *
 */
public class Test<U extends B> {

	public static <T extends B> void test1(T t) {
	}

	public void doSomething(Test<? extends CC> test) {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test1(new CC());

		Test<B> test = new Test<>();

		test.doSomething(new Test<CCC>());

	}

}
