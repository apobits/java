/**
 * 
 */
package ortiz.perez.albin.inheritance;

/**
 * @author apobits@gmail.com
 *
 */

public class MultipleInheritanceOfType implements InterfaceA, InterfaceB {

    /**
     * @param args
     */
    public static void main(String[] args) {
	MultipleInheritanceOfType m = new MultipleInheritanceOfType();

	// MultipleInheritanceOfImplementation not allowed in Java through extends but
	// this special case presents on
	// default methods from interfaces

	// Multiple inheritance of default method from interface A
	m.doSomethingElseA();
	// Multiple inheritance of default method from interface B
	m.doSomethingElseB();

    }

    // as interface A and B declare the same default method the implementing class
    // has to override one of them
    // thus not having visibility of neither of those methods from the interfaces
    @Override
    public void doSomething() {
	// TODO Auto-generated method stub
	InterfaceB.super.doSomething();
    }

}
