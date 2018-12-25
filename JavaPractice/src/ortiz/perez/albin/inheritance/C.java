/**
 * 
 */
package ortiz.perez.albin.inheritance;

/**
 * @author apobits@gmail.com
 *
 */
public class C extends B {

	public C() {
		System.out.println("C class constructor called");
	}

	public C(int a, String b, char c) {
		super(a, b, c);
	}

	public C(C c) {
		super(c);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.b);

		C c1 = new C(1, "Hello ", 'u');

		C c2 = new C(c1);
		
		A a = c2;

		System.out.println(a.b+a.c);
		System.out.println(c2.b + c2.c);
	}

}
