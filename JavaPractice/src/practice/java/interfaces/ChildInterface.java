/**
 * 
 */
package practice.java.interfaces;

/**
 * @author aposo
 *
 */
public interface ChildInterface extends ParentInterface {

	default void methodOne() {
		System.out.println("In methodOne of ChildInterface");
	}
	
	static void methodTwo() {
		System.out.println("In methodTwo of ChildInterface");
	}

}
