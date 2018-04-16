/**
 * 
 */
package ortiz.perez.albin.inheritance;

/**
 * @author apobits@gmail.com
 *
 */
public interface InterfaceA {

    default void doSomethingElseA() {
	System.out.println("A interface doSomethingElseA() method");
    }

    default void doSomething() {
	System.out.println("A interface doSomething() method");
    }

}
