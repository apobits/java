/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class Consumer implements Runnable {

	private Queue queue;

	public Consumer(Queue queue) {
		this.queue = queue;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		while (true) {
			queue.get();
		}

	}

}
