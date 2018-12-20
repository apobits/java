/**
 * 
 */
package practice.java.nestedClasses;

/**
 * @author apobits@gmail.com
 *
 */
public class NestedStaticClass {

	private int a;

	static class NestedClass {

		public void doSomething() {
			System.out.println("In something method of static nested class");
			// Static nested class cannot access non static members of the enclosing class
			// System.out.println(a); uncomment to see error
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// static nested class are seldom use
		new NestedStaticClass.NestedClass().doSomething();

	}

}
