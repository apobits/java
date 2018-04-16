/**
 * 
 */
package ortiz.perez.albin.inheritance;

/**
 * @author apobits@gmail.com
 *
 */
// A subclass of an inner class "A.InnerA" has indirect access to private,
// protected, package-private, public fields and methods of the superclass of
// the inner
// class

public class ExtendsInnerA extends A.InnerA {

    public ExtendsInnerA() {
	new A().super();

	System.out.println("ExtendsInnerA class constructor called");
    }

    public static void main(String[] args) {
	ExtendsInnerA a = new ExtendsInnerA();
	// implicit cast
	Object b = new ExtendsInnerA();
	// explicit cast
	ExtendsInnerA c = (ExtendsInnerA) b;
    }

}
