/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class QueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Queue queue = new Queue();

		Producer producer = new Producer(queue);

		Consumer consumer = new Consumer(queue);

		producer.thread.join();

		consumer.thread.join();

	}

}
