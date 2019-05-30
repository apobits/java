/**
 * 
 */
package practice.java.generic;

/**
 * @author apobits@gmail.com
 *
 */
public class GenericSubtypingExample {

	private static interface I<T> {

	}

	private static class A<T> {

		public void test(T t) {

		}

	}

	private static class B<T> extends A<T> {

	}

	private static class C<T, S> extends A<T> implements I<T> {

	}

	public static void main() {
		A<String> a = new B<String>();

		I<Integer> i = new C<Integer, String>();

		A<Number> aa = new A<>();
		aa.test(Double.valueOf(3.0));
	}

}
