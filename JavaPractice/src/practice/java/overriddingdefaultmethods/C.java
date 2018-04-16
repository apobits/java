/**
 * 
 */
package practice.java.overriddingdefaultmethods;

/**
 * @author apobits@gmail.com
 *
 */
public interface C extends A, B {

    @Override
    default void method1() {
	System.out.println("C interface default method1");
    }

}
