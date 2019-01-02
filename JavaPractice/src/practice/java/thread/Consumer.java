/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class Consumer implements Runnable {

	private Queue queue;

	protected Thread thread;

	public Consumer(Queue queue) {
		this.queue = queue;
		thread = new Thread(this, "Consumer");
		thread.start();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(queue.getMessage());
		}
	}
}
