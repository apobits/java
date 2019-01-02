/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class Queue {

	private int message;

	private boolean waitFlag;

	/**
	 * @return the message
	 */
	synchronized public int getMessage() {
		while (!waitFlag) {
			try {
				notify();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		waitFlag = false;
		return message;
	}

	/**
	 * @param message the message to set
	 */
	synchronized public void setMessage(int message) {
		while (waitFlag) {
			try {
				notify();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		waitFlag = true;
		this.message = message;
	}

}
