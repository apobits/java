/**
 * 
 */
package practice.java.inheritance;

/**
 * @author aposo
 *
 */
public class InheritanceExample {

	public static B getB() {
		return new B();
	}

	public static A getA() {
		return new A();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A a = getB();

		B b = (B) getA();

	}

}
