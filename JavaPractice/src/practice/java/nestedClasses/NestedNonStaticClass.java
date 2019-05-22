/**
 * 
 */
package practice.java.nestedClasses;

/**
 * @author apobits@gmail.com
 *
 */
public class NestedNonStaticClass {

	private int a;

	public void doSomething() {
		new NestedClass().doSomething();
		// enclosing class have no visibility of the members of the nested class
		// System.out.println(b);//b can not be resolved to a variable
	}

	class NestedClass {

		// static fields must be declared final and resolved at compile time
		static final int c = 1;

		private int b;

		public void doSomething() {
			// Nested non static classes or inner classes have visibility of the members of
			// the enclosing class
			System.out.println(a);
		}

		// static methods are not allowed in inner classes
//		public static void notAllowed() {
//			
//		}
	}

	public static void main(String[] args) {

		new NestedNonStaticClass().doSomething();

		new NestedNonStaticClass().new NestedClass().doSomething();

	}

}
