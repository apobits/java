/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

/**
 * @author aposo
 *
 */
public class Q57 {

	static interface Greeter {
		public String greet(String name);
	}

	public static void main(String[] args) {

		Greeter g = (t) -> t + " Welcome!";

		System.out.println(g.greet("Kathy"));
	}

}
