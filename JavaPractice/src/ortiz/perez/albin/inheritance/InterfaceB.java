/**
 * 
 */
package ortiz.perez.albin.inheritance;

/**
 * @author apobits@gmail.com
 *
 */
public interface InterfaceB {

    default void doSomethingElseB() {
	System.out.println("B interface doSomethingElseB() method");
    }

    default void doSomething() {
	System.out.println("B interface doSomething() method");
    }

}
