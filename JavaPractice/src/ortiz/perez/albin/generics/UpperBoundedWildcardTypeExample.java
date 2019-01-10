/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author apobits@gmail.com
 *
 */
public class UpperBoundedWildcardTypeExample {

	class Test<T> {

		public void testMethod(T t) {
			((B) t).compareTo("");
		}
	}

	public void doSomething(Test<? extends A> obj) {
		obj.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UpperBoundedWildcardTypeExample x = new UpperBoundedWildcardTypeExample();
		Test<B> obj = x.new Test<>();
		obj.testMethod(new B());
		x.doSomething(obj);

	}

}
