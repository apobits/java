/**
 * 
 */
package practice.java.overriddingdefaultmethods;

/**
 * @author apobits@gmail.com
 *
 */
public interface B {

    default void method1() {
	System.out.println("B interface default method1");
    }

}
