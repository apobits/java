/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author aposo
 *
 */
public class Q31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AtomicInteger[] var = new AtomicInteger[5];
		for (int i = 0; i < 5; i++) {
			var[i] = new AtomicInteger();
		}

		for (int i = 0; i < var.length; i++) {
			var[i].incrementAndGet();
			if (i == 2) {
				var[i].compareAndSet(2, 4);
			}
			System.out.print(var[i] + " ");
		}

	}

}
