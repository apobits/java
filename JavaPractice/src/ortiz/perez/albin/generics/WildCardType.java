/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class WildCardType<T extends C> {

	private T t;

	public WildCardType(T t) {
		this.t = t;
	}

	public void doSomething(WildCardType<? extends D> x) {// allows to define and access an upperbounded type lower than
															// C(D, E) class defined in class declaration
		x.t.somethingD();
	}

}
