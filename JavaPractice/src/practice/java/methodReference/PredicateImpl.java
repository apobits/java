/**
 * 
 */
package practice.java.methodReference;

/**
 * @author Administrador
 *
 */
public class PredicateImpl {

	private int number;

	public boolean compare(PredicateImpl p) {
		return this.number == p.number;
	}

	public boolean compare1(PredicateImpl p, PredicateImpl pp) {
		return p.number == pp.number;
	}

}
