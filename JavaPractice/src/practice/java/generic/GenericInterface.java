/**
 * 
 */
package practice.java.generic;

/**
 * @author Administrador
 *
 */
public interface GenericInterface<T extends Comparable<T>> {

	void test(T t);

	T test1();

}
