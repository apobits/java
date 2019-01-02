/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class Producer implements Runnable {

	private Queue queue;

	protected Thread thread;

	public Producer(Queue queue) {
		this.queue = queue;
		thread = new Thread(this, "Producer");
		thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			queue.setMessage(i++);
		}
	}
}
