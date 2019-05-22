/**
 * 
 */
package practice.java.nestedClasses;

/**
 * @author apobits@gmail.com
 *
 */
public class LocalInnerClassExample {

	public void doSomething() {
		int a = 0;
		// a=1; enclosing variables must be final or effectively final
		// Local inner class
		class LocalIC {
			public void print() {
				System.out.println(a);
			}
		}

		new LocalIC().print();
	}

	public static void main(String[] args) {
		new LocalInnerClassExample().doSomething();

	}

}
