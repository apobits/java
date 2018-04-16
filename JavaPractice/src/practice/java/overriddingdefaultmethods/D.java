/**
 * 
 */
package practice.java.overriddingdefaultmethods;

/**
 * @author apobits@gmail.com
 *
 */
public interface D extends A {

    @Override
    public default void method1() {
	System.out.println("D interface default method1");
    }

}
