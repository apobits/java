/**
 * 
 */
package practice.java.interfaces;

/**
 * @author aposo
 *
 */
public interface OtherInterface {

	default void methodOne() {
		System.out.println("In methodOne of OtherInterface");
	}

}
