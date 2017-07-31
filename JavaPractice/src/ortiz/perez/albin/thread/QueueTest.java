/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		Producer p = new Producer(queue);
		
		Consumer c = new Consumer(queue);

	}

}
