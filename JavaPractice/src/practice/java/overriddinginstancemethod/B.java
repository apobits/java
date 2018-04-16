/**
 * 
 */
package practice.java.overriddinginstancemethod;

/**
 * @author apobits@gmail.com
 *
 */
public class B extends A {

    @Override
    protected void method1() {
	System.out.println("B class method1");
    }

    public static void main(String args[]) {
	A a = new B();
	// accessing A class method1 overridden in B class
	a.method1();
    }

}
