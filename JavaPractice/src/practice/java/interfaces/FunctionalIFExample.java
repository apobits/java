/**
 * 
 */
package practice.java.interfaces;

/**
 * @author apobits@gmail.com
 *
 */
public interface FunctionalIFExample {

	public void doSomething();

	// redeclaring Objects methods on interfaces does not make those methods
	// abstract
	public boolean equals(Object obj);

}
