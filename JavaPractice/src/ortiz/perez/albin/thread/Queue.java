/**
 * 
 */
package ortiz.perez.albin.thread;

/**
 * @author aposo
 *
 */
public class Queue {

	private int number;

	private boolean waitFlag = false;

	synchronized public void put(int i) {
		while (waitFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number = i;
		System.out.println("Put :" + number);
		waitFlag = true;
		notify();
	}

	synchronized public int get() {
		while (!waitFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get :" + number);
		waitFlag = false;
		notify();
		return number;
	}

}
