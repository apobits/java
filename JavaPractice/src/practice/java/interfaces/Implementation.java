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
		// Since ChildInterface extends ParentInterface and is redefining default
		// methodOne, ChildInterface methodOne will
		// be called
		new Implementation().methodOne();

		// Interface static methods can only be accessed through its interface they are
		// not implemented or inherited
		ParentInterface.methodTwo();
		ChildInterface.methodTwo();

		// method undefined in this interface
		// ChildInterface.methodThree();

		// Method defined in this interface
		ParentInterface.methodThree();

		// Method undefined, static methods are not implemented, they belong to their
		// interfaces only
		// new Implementation().methodTree();

		ParentInterface pi = new Implementation();
		pi.methodOne();

		ChildInterface ci = new Implementation();
		ci.methodOne();

	}

}
