/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author aposo
 *
 */
public class Q55 {

	static interface IdGenerator {
		int getNextId();
	}

	static class Generator implements IdGenerator {
		private AtomicInteger ai = new AtomicInteger(0);

		@Override
		public int getNextId() {
			return ai.incrementAndGet();
		}

	}

	public static void main(String[] args) {
		Generator generator = new Generator();
		Runnable r = () -> System.out.println(generator.getNextId());

		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();

	}

}
