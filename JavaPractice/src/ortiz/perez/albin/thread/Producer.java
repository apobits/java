/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class Producer implements Runnable {

	private Queue queue;

	public Producer(Queue queue) {
		this.queue = queue;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			queue.put(i++);
		}
	}

}
