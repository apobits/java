/**
 * 
 */
package practice.java.interfaces;

/**
 * @author aposo
 *
 */
public abstract interface ParentInterface {
	// implicitly public static final
	String name = "";

	default void methodOne() {
		methodFour();
		System.out.println("In methodOne of ParentInterface");
	}

	static void methodTwo() {
		methodFive();
		System.out.println("In methodTwo of ParentInterface");
	}

	static void methodThree() {
		System.out.println("In methodThree of ParentInterface");
	}

	private void methodFour() {

	}

	private static void methodFive() {

	}

	default void methodSix() {

	}

}
