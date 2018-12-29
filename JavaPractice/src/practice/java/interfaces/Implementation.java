/**
 * 
 */
package practice.java.interfaces;

/**
 * @author aposo
 *
 */
public class Implementation implements ChildInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// As default methodOne() is in both interfaces, the interface that
		// takes precedence is ChildInterface the one that is implementing directly
		new Implementation().methodOne();

		// Interface static methods can only be accessed through its interface they are
		// not implemented or inherited
		ParentInterface.methodTwo();
		ChildInterface.methodTwo();
	}

}
