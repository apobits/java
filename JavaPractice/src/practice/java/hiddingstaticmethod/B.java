/**
 * 
 */
package practice.java.hiddingstaticmethod;

/**
 * @author apobits@gmail.com
 *
 */
public class B extends A {

    public static void method1() {
	System.out.println("B class static method1");
    }

    public static void main(String[] args) {
	// accessing B class static method1 that hides A class static method1
	B.method1();
	// accessing A class static mehtod1
	A.method1();
	A a = new B();
	// accessing A Class static method1, if method1 wasn't static it would be
	// overridden
	// accessing a static method should be done by the class type referencing the
	// static method example A.method1(); here it is accessed by the instance
	// variable just for the sake of the exercise
	a.method1();
    }

}
