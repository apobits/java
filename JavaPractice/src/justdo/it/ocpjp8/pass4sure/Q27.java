/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

/**
 * @author aposo
 *
 */
public class Q27 {

	static interface Vehicle {
		public void ride(int speed);
	}

	public static void main(String[] args) {
		Vehicle v = (int t) -> System.out.println("Fly at " + t);

		v.ride(100);
	}

}
