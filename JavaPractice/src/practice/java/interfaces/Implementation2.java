/**
 * 
 */
package practice.java.interfaces;

/**
 * @author aposo
 *
 */
public class Implementation2 implements ParentInterface, OtherInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Implementation2().methodOne();

	}

	// Overriding methodOne from ParentInterface
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		ParentInterface.super.methodOne();
	}

}
