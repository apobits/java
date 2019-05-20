/**
 * 
 */
package practice.java.inheritance;

/**
 * @author aposo
 *
 */
public class B extends A {

	private int two = 2;

	public int getTwoPlusOne() {
		return two + getOne();
	}

	public int getOne() {
		return super.getOne();
	}

}
