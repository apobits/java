/**
 * 
 */
package practice.java.overriddingdefaultmethods;

/**
 * @author apobits@gmail.com
 *
 */
public class Implementor extends ImplementorParent implements A, B {

    public static void main(String[] args) {
	Implementor a = new Implementor();
	// A and B interfaces define same default method but as ImplementorParent
	// defines a method with same signature it overrides the one in conflict from
	// the interfaces
	a.method1();
    }

}
