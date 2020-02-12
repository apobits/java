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

	B b = new B();
	System.out.println(b.getTwoPlusOne());
	System.out.println(b.getOne());

	// class cast exception error
	//		B b = (B) getA();

    }

}
