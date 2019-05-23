/**
 * 
 */
package practice.java.varieties;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author apobits@gmail.com
 *
 */
public class OverrideExample {

	class A {

		public void doSomething() throws FileNotFoundException {

		}

		public void doSomethingElse() {

		}
	}

	class B extends A {

		// when you override a method, the checked exceptions that the subclass method
		// declares cannot be more general than those of the superclass method
//		@Override
//		public void doSomething() throws IOException {
//			// TODO Auto-generated method stub
//			super.doSomething();
//		}

		// valid
//		@Override
//		public void doSomething() {
//			
//		}

		// valid
//		@Override
//		public void doSomething() throws FileNotFoundException {
//			// TODO Auto-generated method stub
//			super.doSomething();
//		}

		// invalid, if the superclass method does not throw an exception neither the
		// subclass overridden method
//		@Override
//		public void doSomethingElse() throws IOException {
//			// TODO Auto-generated method stub
//			super.doSomethingElse();
//		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
