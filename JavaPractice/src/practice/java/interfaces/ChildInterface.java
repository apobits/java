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
		helper();
	}

	static void methodTwo() {
		System.out.println("In methodTwo of ChildInterface");
		helper();
	}

	private static void helper() {
		System.out.println();
	}

}
