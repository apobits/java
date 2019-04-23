/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author aposo
 *
 */
public class Q9 extends Thread {

	static class Master implements Runnable {

		@Override
		public void run() {
			System.out.println("Master...");
		}

	}

	CyclicBarrier cb;

	public Q9(CyclicBarrier cb) {
		this.cb = cb;
	}

	@Override
	public void run() {
		try {
			cb.await();
			System.out.println("Worker...");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Master master = new Master();
		CyclicBarrier cb = new CyclicBarrier(1, master);
		Q9 q9 = new Q9(cb);
		q9.start();

	}

}
