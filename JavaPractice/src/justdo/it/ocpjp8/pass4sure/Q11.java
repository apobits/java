/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.function.Supplier;

/**
 * @author aposo
 *
 */
public class Q11 {

	static class Bird {
		public void fly() {
			System.out.println("Can fly");
		}
	}

	static class Penguin extends Bird {
		@Override
		public void fly() {
			System.out.println("Cannot fly");
		}
	}

	public static void fly(Supplier<Bird> bird) {
		bird.get().fly();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		fly(() -> new Bird());
		fly(Penguin::new);

	}

}
