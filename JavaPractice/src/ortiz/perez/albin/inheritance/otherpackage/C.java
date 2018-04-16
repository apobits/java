/**
 * 
 */
package ortiz.perez.albin.inheritance.otherpackage;

import ortiz.perez.albin.inheritance.B;

/**
 * @author apobits@gmail.com
 *
 */
public class C extends B {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	C c = new C();
	// package-private doSomethingDifferent() method from parent class A is not
	// visible as C class is in another package
	// c.doSomethingDifferent();

    }

}
