/**
 * 
 */
package practice.java.overriddingdefaultmethods;

/**
 * @author apobits@gmail.com
 *
 */
public interface A {

    default void method1() {
	System.out.println("A interface default method1");
    }

}
