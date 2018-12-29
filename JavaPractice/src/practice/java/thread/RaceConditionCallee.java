/**
 * 
 */
package practice.java.thread;

/**
 * @author aposo
 *
 */
public class RaceConditionCallee implements Runnable {

	RaceConditionCallMe callMe;

	String message;

	Thread thread;

	public RaceConditionCallee(RaceConditionCallMe callMe, String message) {

		this.callMe = callMe;
		this.message = message;
		thread = new Thread(this);
		thread.start();

	}

	@Override
	public void run() {
//		synchronized (callMe) {
//			callMe.printMessage(message);
//		}
		callMe.printMessage(message);
	}

}
