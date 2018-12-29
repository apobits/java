/**
 * 
 */
package practice.java.interfaces;

/**
 * @author aposo
 *
 */
public interface ParentInterface {

	default void methodOne() {
		System.out.println("In methodOne of ParentInterface");
	}

	static void methodTwo() {
		System.out.println("In methodTwo of ParentInterface");
	}

}
