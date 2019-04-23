/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

/**
 * @author aposo
 *
 */
public class Q46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.print("L1 ");
		};

		new Thread(r).start();

		new Thread(() -> {
			System.out.print("L2 ");
		}).start();
		System.out.print("L3 ");

	}

}
