/**
 * 
 */
package ortiz.perez.albin.inheritance;

/**
 * @author Administrador
 *
 */
public class A {

	class InnerA {

		public InnerA() {
			System.out.println("InnerA class constructor called");
		}

		public void doSomething() {
			System.out.println(a);
		}
	}

	// private fields are not inherited
	private int a;

	// public fields are inherited for all subclasses not matter what package the
	// subclass is in
	public String b;

	// package-private fields are only inherited for subclasses that are in the same
	// package as the parent class
	char c;

	public A() {
		System.out.println("A class constructor called");
	}

	public A(A a) {
		this.a = a.a;
		this.b = a.b;
		this.c = a.c;
	}

	public A(int a, String b, char c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("A class constructor called");
	}

	// public methods are inherited by all subclasses no matter what package they
	// are in
	public void doSomething() {

	}

	// private methods are no inherited
	private void doSomethingElse() {

	}

	// package-private methods are only inherited by subclasses in the same package
	// as its parent class
	void doSomethingDifferent() {

	}

}
